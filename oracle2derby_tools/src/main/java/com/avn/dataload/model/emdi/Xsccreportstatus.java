package com.avn.dataload.model.emdi;

import java.math.BigDecimal;
import java.util.Date;

public class Xsccreportstatus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XSCCREPORTSTATUS.REPORT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal reportId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XSCCREPORTSTATUS.LASTREPORTSENDTIME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private Date lastreportsendtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XSCCREPORTSTATUS.REPORTSENDSTATUS
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String reportsendstatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XSCCREPORTSTATUS.LASTREPORTGENERATEDTIME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private Date lastreportgeneratedtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XSCCREPORTSTATUS.REPORTNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String reportname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XSCCREPORTSTATUS.REPORTLOC
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String reportloc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XSCCREPORTSTATUS.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XSCCREPORTSTATUS.REPORT_ID
     *
     * @return the value of EMDI.XSCCREPORTSTATUS.REPORT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getReportId() {
        return reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XSCCREPORTSTATUS.REPORT_ID
     *
     * @param reportId the value for EMDI.XSCCREPORTSTATUS.REPORT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setReportId(BigDecimal reportId) {
        this.reportId = reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XSCCREPORTSTATUS.LASTREPORTSENDTIME
     *
     * @return the value of EMDI.XSCCREPORTSTATUS.LASTREPORTSENDTIME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public Date getLastreportsendtime() {
        return lastreportsendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XSCCREPORTSTATUS.LASTREPORTSENDTIME
     *
     * @param lastreportsendtime the value for EMDI.XSCCREPORTSTATUS.LASTREPORTSENDTIME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLastreportsendtime(Date lastreportsendtime) {
        this.lastreportsendtime = lastreportsendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XSCCREPORTSTATUS.REPORTSENDSTATUS
     *
     * @return the value of EMDI.XSCCREPORTSTATUS.REPORTSENDSTATUS
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getReportsendstatus() {
        return reportsendstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XSCCREPORTSTATUS.REPORTSENDSTATUS
     *
     * @param reportsendstatus the value for EMDI.XSCCREPORTSTATUS.REPORTSENDSTATUS
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setReportsendstatus(String reportsendstatus) {
        this.reportsendstatus = reportsendstatus == null ? null : reportsendstatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XSCCREPORTSTATUS.LASTREPORTGENERATEDTIME
     *
     * @return the value of EMDI.XSCCREPORTSTATUS.LASTREPORTGENERATEDTIME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public Date getLastreportgeneratedtime() {
        return lastreportgeneratedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XSCCREPORTSTATUS.LASTREPORTGENERATEDTIME
     *
     * @param lastreportgeneratedtime the value for EMDI.XSCCREPORTSTATUS.LASTREPORTGENERATEDTIME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLastreportgeneratedtime(Date lastreportgeneratedtime) {
        this.lastreportgeneratedtime = lastreportgeneratedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XSCCREPORTSTATUS.REPORTNAME
     *
     * @return the value of EMDI.XSCCREPORTSTATUS.REPORTNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getReportname() {
        return reportname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XSCCREPORTSTATUS.REPORTNAME
     *
     * @param reportname the value for EMDI.XSCCREPORTSTATUS.REPORTNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setReportname(String reportname) {
        this.reportname = reportname == null ? null : reportname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XSCCREPORTSTATUS.REPORTLOC
     *
     * @return the value of EMDI.XSCCREPORTSTATUS.REPORTLOC
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getReportloc() {
        return reportloc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XSCCREPORTSTATUS.REPORTLOC
     *
     * @param reportloc the value for EMDI.XSCCREPORTSTATUS.REPORTLOC
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setReportloc(String reportloc) {
        this.reportloc = reportloc == null ? null : reportloc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XSCCREPORTSTATUS.OPTCOUNTER
     *
     * @return the value of EMDI.XSCCREPORTSTATUS.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XSCCREPORTSTATUS.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.XSCCREPORTSTATUS.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}