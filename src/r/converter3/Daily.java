/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r.converter3;

import java.util.Date;

/**
 *
 * @author izumi
 */
public class Daily {

    /**
     * 日付
     */
    private Date date;
    /**
     * 状態(区分)
     */
    private String status;
    /**
     * 勤務開始時間
     */
    private int workStart;
    /**
     * 勤務終了時間
     */
    private int workEnd;
    /**
     * 休憩時間
     */
    private int rest;
    /**
     * 深夜休憩時間
     */
    private int lateNightRest;
    /**
     * 備考
     */
    private String remarks;
    /**
     * 立替金
     */
    private String advancesPaid;
    /**
     * 実労働
     */
    private int actualWork;
    /**
     * 契約内
     */
    private int inContract;
    /**
     * 法廷内契約外
     */
    private int outContractIn;
    /**
     * 法定外契約外
     */
    private int outContractOut;
    /**
     * 深夜勤務
     */
    private int lateNightWork;
    /**
     * 休日労働
     */
    private int holidayWork;
    /**
     * 年休時間
     */
    private int yearRest;

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the workStart
     */
    public int getWorkStart() {
        return workStart;
    }

    /**
     * @param workStart the workStart to set
     */
    public void setWorkStart(int workStart) {
        this.workStart = workStart;
    }

    /**
     * @return the workEnd
     */
    public int getWorkEnd() {
        return workEnd;
    }

    /**
     * @param workEnd the workEnd to set
     */
    public void setWorkEnd(int workEnd) {
        this.workEnd = workEnd;
    }

    /**
     * @return the rest
     */
    public int getRest() {
        return rest;
    }

    /**
     * @param rest the rest to set
     */
    public void setRest(int rest) {
        this.rest = rest;
    }

    /**
     * @return the lateNightRest
     */
    public int getLateNightRest() {
        return lateNightRest;
    }

    /**
     * @param lateNightRest the lateNightRest to set
     */
    public void setLateNightRest(int lateNightRest) {
        this.lateNightRest = lateNightRest;
    }

    /**
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return the advancesPaid
     */
    public String getAdvancesPaid() {
        return advancesPaid;
    }

    /**
     * @param advancesPaid the advancesPaid to set
     */
    public void setAdvancesPaid(String advancesPaid) {
        this.advancesPaid = advancesPaid;
    }

    /**
     * @return the actualWork
     */
    public int getActualWork() {
        return actualWork;
    }

    /**
     * @param actualWork the actualWork to set
     */
    public void setActualWork(int actualWork) {
        this.actualWork = actualWork;
    }

    /**
     * @return the inContract
     */
    public int getInContract() {
        return inContract;
    }

    /**
     * @param inContract the inContract to set
     */
    public void setInContract(int inContract) {
        this.inContract = inContract;
    }

    /**
     * @return the outContractIn
     */
    public int getOutContractIn() {
        return outContractIn;
    }

    /**
     * @param outContractIn the outContractIn to set
     */
    public void setOutContractIn(int outContractIn) {
        this.outContractIn = outContractIn;
    }

    /**
     * @return the outContractOut
     */
    public int getOutContractOut() {
        return outContractOut;
    }

    /**
     * @param outContractOut the outContractOut to set
     */
    public void setOutContractOut(int outContractOut) {
        this.outContractOut = outContractOut;
    }

    /**
     * @return the lateNightWork
     */
    public int getLateNightWork() {
        return lateNightWork;
    }

    /**
     * @param lateNightWork the lateNightWork to set
     */
    public void setLateNightWork(int lateNightWork) {
        this.lateNightWork = lateNightWork;
    }

    /**
     * @return the holidayWork
     */
    public int getHolidayWork() {
        return holidayWork;
    }

    /**
     * @param holidayWork the holidayWork to set
     */
    public void setHolidayWork(int holidayWork) {
        this.holidayWork = holidayWork;
    }

    /**
     * @return the yearRest
     */
    public int getYearRest() {
        return yearRest;
    }

    /**
     * @param yearRest the yearRest to set
     */
    public void setYearRest(int yearRest) {
        this.yearRest = yearRest;
    }

    @Override
    public String toString() {
        return "Daily{" + "date=" + date + ", status=" + status + ", workStart=" + workStart + ", workEnd=" + workEnd + ", rest=" + rest + ", lateNightRest=" + lateNightRest + ", remarks=" + remarks + ", advancesPaid=" + advancesPaid + ", actualWork=" + actualWork + ", inContract=" + inContract + ", outContractIn=" + outContractIn + ", outContractOut=" + outContractOut + ", lateNightWork=" + lateNightWork + ", holidayWork=" + holidayWork + ", yearRest=" + yearRest + '}';
    }
}
