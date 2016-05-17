/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r.converter3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author izumi
 */
public class RConverter3 {

    /**
     * 日付フォーマット用オブジェクト
     */
    private static final DateFormat DATE_FORMAT
            = new SimpleDateFormat("yyyy/MM/dd");

    private static String rFileName = "";

    /**
     * R社タイムシート変換ツール実行メイン処理
     *
     * @param args
     */
    public static void main(String[] args) {

        try {
            // R社データを読み込みスタッフ毎のタイムシート元情報オブジェクトを作成する
            // ファイルパス取得
            Path path = getPaht();
            rFileName = path.getFileName().toString();
            System.out.println(rFileName + "からデータを取得します。");

            // スタッフデータ格納リスト
            List<Staff> staffs = readRdata(path);
            if (staffs == null || staffs.isEmpty()) {
                System.out.println("データ取得に失敗しました");
                System.out.println(
                        rFileName + "が正しいデータか確認してください");
                return;
            }

            // 作成したスタッフデータ格納リストから、csvを作成する
            String fileName = rFileName.replace("txt", "csv");
            createCSV(staffs, fileName);
            System.out.println(fileName + "の作成が完了しました♪");
        } catch (IOException | ParseException ex) {
            Logger.getLogger(
                    RConverter3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * R社のタイムシートを読み込み、スタッフオブジェクトのリストを作成する
     *
     * @param path
     * @return
     * @throws ParseException
     * @throws IOException
     */
    private static List<Staff> readRdata(Path path)
            throws ParseException, IOException {
        List<Staff> staffs = new ArrayList<>();
        try (BufferedReader reader
                = Files.newBufferedReader(path, Charset.forName("Shift-Jis"))) {
            String line = reader.readLine();
            Staff staff = null;
            while (line != null) {
                String[] datas = line.split("\t");
                if ("H".equals(datas[0])) {
                    // ヘッダの処理
                    if (staff != null) {
                        staffs.add(staff);
                    }
                    staff = makeStaffObj(datas);
                } else if ("D".equals(datas[0])) {
                    // データの処理
                    if (staff == null) {
                        return null;
                    }
                    staff.addDaily(makeDailyObj(datas));
                }
                line = reader.readLine();
            }
        }
        return staffs;
    }

    /**
     * TCHhamadaで始まるファイルパスを取得する 複数存在する場合は、ファイル名を降順でソートし、最初のファイルを取得する
     *
     * @return ファイルパス
     */
    private static Path getPaht() throws IOException {
        // ファイルのパスを取得する
        return Files.list(Paths.get("./" + File.separator))
                .sorted(Comparator.reverseOrder()).filter(path -> path.toString()
                .startsWith("." + File.separator + "TCHhamada")).findFirst()
                .get();
    }

    /**
     * 作成したスタッフデータ格納リストから、csvを作成する
     *
     * @param staffs
     * @param fileName
     * @throws UnsupportedEncodingException
     * @throws FileNotFoundException
     */
    private static void createCSV(List<Staff> staffs, String fileName)
            throws UnsupportedEncodingException, FileNotFoundException {
        // 作成したスタッフデータ格納リストから、csvを作成する
        File file = new File("." + fileName);
        try (PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream(fileName), "Shift-Jis"))) {
            staffs.stream().forEach((Staff staff) -> {
                StringJoiner joiner = new StringJoiner(",");
                joiner.add(staff.getStaffName());
                joiner.add(convertMinToHM(staff.getTotalManMonth()));
                joiner.add(convertMinToHM(staff.getTotalInContract()));
                joiner.add(convertMinToHM(staff.getTotalOutContractIn()));
                joiner.add(convertMinToHM(staff.getTotalOutContractOut()));
                joiner.add(convertMinToHM(staff.getTotalLateNightWork()));
                joiner.add(convertMinToHM(staff.getTotalHolidayWork()));
                joiner.add(convertMinToHM(staff.getTotalYearRest()));
                writer.write(joiner.toString() + "\r\n");
            });
        }
    }

    /**
     * 分をh:mmに変換する
     *
     * @param minute
     * @return
     */
    private static String convertMinToHM(int minute) {
        int h = minute / 60;
        int m = minute % 60;
        String mm = m < 10 ? "0" + m : Integer.toString(m);
        return h + ":" + mm;
    }

    /**
     * スタッフオブジェクトを生成する
     *
     * @param datas
     * @return
     */
    private static Staff makeStaffObj(String[] datas) {
        Staff staff;
        staff = new Staff();
        staff.setEStaffNo(datas[1]);
        staff.setContractPeriodFrom(datas[2]);
        staff.setContractPeriodTo(datas[3]);
        staff.setStaffCd(datas[4]);
        staff.setStaffName(datas[5]);
        staff.setClientCd(datas[6]);
        staff.setClientName(datas[7]);
        staff.setJobCd(datas[8]);
        staff.setContractTargetCd(datas[9]);
        staff.setWorkWeekdays(getWeeks(datas));
        staff.setContractTime(convertTimeToMinute(datas[19]));
        staff.setWorkTimeFrom(convertTimeToMinute(datas[20]));
        staff.setWorkTimeTo(convertTimeToMinute(datas[21]));
        staff.setRestTime1(Integer.parseInt(datas[23]));
        return staff;
    }

    /**
     * 日別情報(Daily)オブジェクトを生成する
     *
     * @param datas
     * @return
     * @throws ParseException
     */
    private static Daily makeDailyObj(String[] datas) throws ParseException {
        Daily daily = new Daily();
        daily.setDate(DATE_FORMAT.parse(datas[1]));
        if (datas.length > 2) {
            switch (datas.length) {
                case 16:
                    daily.setYearRest(convertTimeToMinute(datas[15]));
                case 15:
                    daily.setHolidayWork(convertTimeToMinute(datas[14]));
                case 14:
                    daily.setLateNightWork(convertTimeToMinute(datas[13]));
                case 13:
                    daily.setOutContractOut(convertTimeToMinute(datas[12]));
                case 12:
                    daily.setOutContractIn(convertTimeToMinute(datas[11]));
                case 11:
                    daily.setInContract(convertTimeToMinute(datas[10]));
                case 10:
                    daily.setActualWork(convertTimeToMinute(datas[9]));
                default:
                    daily.setStatus(datas[2]);
                    daily.setWorkStart(convertTimeToMinute(datas[3]));
                    daily.setWorkEnd(convertTimeToMinute(datas[4]));
                    daily.setRest(convertTimeToMinute(datas[5]));
                    daily.setLateNightRest(convertTimeToMinute(datas[6]));
                    daily.setRemarks(datas[7]);
                    daily.setAdvancesPaid(datas[8]);
                    break;
            }
        }
        return daily;
    }

    /**
     * hh:mm型の時間を分に変換する
     *
     * @param data
     * @return 分
     */
    private static int convertTimeToMinute(String data) {
        String[] hmArray = data.split(":");
        if (hmArray.length != 2) {
            return 0;
        }
        int time = Integer.parseInt(hmArray[0]) * 60
                + Integer.parseInt(hmArray[1]);
        return time;
    }

    /**
     * ヘッダ行データから勤務曜日の配列を取り出す
     *
     * @param datas
     * @return
     */
    private static String[] getWeeks(String[] datas) {
        String[] weeks = {
            datas[10],
            datas[11],
            datas[12],
            datas[13],
            datas[14],
            datas[15],
            datas[16]
        };
        return weeks;
    }

}
