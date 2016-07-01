/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r.converter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author izumi
 */
public class Staff {

    /**
     * e-staffing契約No
     */
    private String eStaffNo;
    /**
     * 契約期間開始日
     */
    private String contractPeriodFrom;
    /**
     * 契約期間終了日
     */
    private String contractPeriodTo;
    /**
     * スタッフコード
     */
    private String staffCd;
    /**
     * スタッフ氏名
     */
    private String staffName;
    /**
     * 契約企業コード
     */
    private String clientCd;
    /**
     * 就業先企業名
     */
    private String clientName;
    /**
     * Jobコード
     */
    private String jobCd;
    /**
     * 契約先コード
     */
    private String contractTargetCd;
    /**
     * 勤務日
     */
    private String[] workWeekdays;
    /**
     * 契約時間
     */
    private int contractTime;
    /**
     * 勤務時間開始
     */
    private int workTimeFrom;
    /**
     * 勤務時間終了
     */
    private int workTimeTo;
    /**
     * 休憩時間1
     */
    private int restTime1;
    /**
     * 休憩時間2
     */
    private int restTime2;
    /**
     * 休憩時間3
     */
    private int restTime3;
    /**
     * その他就業条件
     */
    private String otherCriteria;
    /**
     * 日別情報リスト
     */
    private List<Daily> dailyInfoList;
    /**
     * 総工数
     */
    private int totalManMonth;
    /**
     * 総工数(契約内)
     */
    private int totalInContract;
    /**
     * 総工数(法定内契約外)
     */
    private int totalOutContractIn;
    /**
     * 総工数(法定外契約外)
     */
    private int totalOutContractOut;
    /**
     * 総工数(深夜勤務)
     */
    private int totalLateNightWork;
    /**
     * 総工数(休日労働)
     */
    private int totalHolidayWork;
    /**
     * 総工数(年休時間)
     */
    private int totalYearRest;

    /**
     * @return the eStaffNo
     */
    public String getEStaffNo() {
        return eStaffNo;
    }

    /**
     * @param eStaffNo the eStaffNo to set
     */
    public void setEStaffNo(String eStaffNo) {
        this.eStaffNo = eStaffNo;
    }

    /**
     * @return the contractPeriodFrom
     */
    public String getContractPeriodFrom() {
        return contractPeriodFrom;
    }

    /**
     * @param contractPeriodFrom the contractPeriodFrom to set
     */
    public void setContractPeriodFrom(String contractPeriodFrom) {
        this.contractPeriodFrom = contractPeriodFrom;
    }

    /**
     * @return the contractPeriodTo
     */
    public String getContractPeriodTo() {
        return contractPeriodTo;
    }

    /**
     * @param contractPeriodTo the contractPeriodTo to set
     */
    public void setContractPeriodTo(String contractPeriodTo) {
        this.contractPeriodTo = contractPeriodTo;
    }

    /**
     * @return the staffCd
     */
    public String getStaffCd() {
        return staffCd;
    }

    /**
     * @param staffCd the staffCd to set
     */
    public void setStaffCd(String staffCd) {
        this.staffCd = staffCd;
    }

    /**
     * @return the staffName
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * @param staffName the staffName to set
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /**
     * @return the clientCd
     */
    public String getClinet() {
        return clientCd;
    }

    /**
     * @param clientCd the clientCd to set
     */
    public void setClientCd(String clientCd) {
        this.clientCd = clientCd;
    }

    /**
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName the clientName to set
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * @return the eStaffNo
     */
    public String geteStaffNo() {
        return eStaffNo;
    }

    /**
     * @param eStaffNo the eStaffNo to set
     */
    public void seteStaffNo(String eStaffNo) {
        this.eStaffNo = eStaffNo;
    }

    /**
     * @return the jobCd
     */
    public String getJobCd() {
        return jobCd;
    }

    /**
     * @param jobCd the jobCd to set
     */
    public void setJobCd(String jobCd) {
        this.jobCd = jobCd;
    }

    /**
     * @return the contractTargetCd
     */
    public String getContractTargetCd() {
        return contractTargetCd;
    }

    /**
     * @param contractTargetCd the contractTargetCd to set
     */
    public void setContractTargetCd(String contractTargetCd) {
        this.contractTargetCd = contractTargetCd;
    }

    /**
     * @return the WorkWeekdays
     */
    public String[] getWorkWeekdays() {
        return workWeekdays;
    }

    /**
     * @param WorkWeekdays the WorkWeekdays to set
     */
    public void setWorkWeekdays(String[] WorkWeekdays) {
        this.workWeekdays = WorkWeekdays;
    }

    /**
     * @return the contractTime
     */
    public int getContractTime() {
        return contractTime;
    }

    /**
     * @param contractTime the contractTime to set
     */
    public void setContractTime(int contractTime) {
        this.contractTime = contractTime;
    }

    /**
     * @return the workTimeFrom
     */
    public int getWorkTimeFrom() {
        return workTimeFrom;
    }

    /**
     * @param workTimeFrom the workTimeFrom to set
     */
    public void setWorkTimeFrom(int workTimeFrom) {
        this.workTimeFrom = workTimeFrom;
    }

    /**
     * @return the workTimeTo
     */
    public int getWorkTimeTo() {
        return workTimeTo;
    }

    /**
     * @param workTimeTo the workTimeTo to set
     */
    public void setWorkTimeTo(int workTimeTo) {
        this.workTimeTo = workTimeTo;
    }

    /**
     * @return the restTime1
     */
    public int getRestTime1() {
        return restTime1;
    }

    /**
     * @param restTime1 the restTime1 to set
     */
    public void setRestTime1(int restTime1) {
        this.restTime1 = restTime1;
    }

    /**
     * @return the restTime2
     */
    public int getRestTime2() {
        return restTime2;
    }

    /**
     * @param restTime2 the restTime2 to set
     */
    public void setRestTime2(int restTime2) {
        this.restTime2 = restTime2;
    }

    /**
     * @return the restTime3
     */
    public int getRestTime3() {
        return restTime3;
    }

    /**
     * @param restTime3 the restTime3 to set
     */
    public void setRestTime3(int restTime3) {
        this.restTime3 = restTime3;
    }

    /**
     * @return the otherCriteria
     */
    public String getOtherCriteria() {
        return otherCriteria;
    }

    /**
     * @param otherCriteria the otherCriteria to set
     */
    public void setOtherCriteria(String otherCriteria) {
        this.otherCriteria = otherCriteria;
    }

    /**
     * @return the clientCd
     */
    public String getClientCd() {
        return clientCd;
    }

    /**
     * @return the dailyInfoList
     */
    public List<Daily> getDailyInfoList() {
        return dailyInfoList;
    }

    /**
     * @param daily the daily to add
     */
    public void addDaily(Daily daily) {
        if (this.dailyInfoList == null) {
            this.dailyInfoList = new ArrayList<>();
        }
        this.dailyInfoList.add(daily);
        // 総工数
        this.totalManMonth += daily.getActualWork();
        // 契約内
        this.totalInContract
                += daily.getInContract() - daily.getLateNightRest();
        // 法定内契約外
        this.totalOutContractIn += daily.getOutContractIn();
        // 法定外契約外
        this.totalOutContractOut += daily.getOutContractOut()
                - daily.getLateNightWork();
        // 深夜残業
        this.totalLateNightWork += daily.getLateNightWork();
        // 休日労働
        if (daily.getHolidayWork() > 0) {
            this.totalHolidayWork += daily.getHolidayWork()
                    - daily.getLateNightWork();
        }
        // 年休時間
        this.totalYearRest += daily.getYearRest();
    }

    /**
     * @return the totalManMonth
     */
    public int getTotalManMonth() {
        return totalManMonth;
    }

    /**
     * @return the totalInContract
     */
    public int getTotalInContract() {
        return totalInContract;
    }

    /**
     * @return the totalOutContractIn
     */
    public int getTotalOutContractIn() {
        return totalOutContractIn;
    }

    /**
     * @return the totalOutContractOut
     */
    public int getTotalOutContractOut() {
        return totalOutContractOut;
    }

    /**
     * @return the totalLateNightWork
     */
    public int getTotalLateNightWork() {
        return totalLateNightWork;
    }

    /**
     * @return the totalHolidayWork
     */
    public int getTotalHolidayWork() {
        return totalHolidayWork;
    }

    /**
     * @return the totalYearRest
     */
    public int getTotalYearRest() {
        return totalYearRest;
    }

    @Override
    public String toString() {
        return "Staff{" + "eStaffNo=" + eStaffNo + ", contractPeriodFrom=" + contractPeriodFrom + ", contractPeriodTo=" + contractPeriodTo + ", staffCd=" + staffCd + ", staffName=" + staffName + ", clientCd=" + clientCd + ", clientName=" + clientName + ", jobCd=" + jobCd + ", contractTargetCd=" + contractTargetCd + ", workWeekdays=" + Arrays.toString(workWeekdays) + ", contractTime=" + contractTime + ", workTimeFrom=" + workTimeFrom + ", workTimeTo=" + workTimeTo + ", restTime1=" + restTime1 + ", restTime2=" + restTime2 + ", restTime3=" + restTime3 + ", otherCriteria=" + otherCriteria + ", dailyInfoList=" + dailyInfoList + ", totalManMonth=" + totalManMonth + ", totalInContract=" + totalInContract + ", totalOutContractIn=" + totalOutContractIn + ", totalOutContractOut=" + totalOutContractOut + ", totalLateNightWork=" + totalLateNightWork + ", totalHolidayWork=" + totalHolidayWork + ", totalYearRest=" + totalYearRest + '}';
    }

}
