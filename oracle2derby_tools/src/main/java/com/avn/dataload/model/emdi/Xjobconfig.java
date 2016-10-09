package com.avn.dataload.model.emdi;

import java.math.BigDecimal;
import java.util.Date;

public class Xjobconfig {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XJOBCONFIG.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal storeentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XJOBCONFIG.JOBIDENTIFIER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String jobidentifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XJOBCONFIG.CONFIGNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String configname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XJOBCONFIG.DATEVALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private Date datevalue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XJOBCONFIG.STRINGVALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String stringvalue;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XJOBCONFIG.STOREENT_ID
     *
     * @return the value of EMDI.XJOBCONFIG.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getStoreentId() {
        return storeentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XJOBCONFIG.STOREENT_ID
     *
     * @param storeentId the value for EMDI.XJOBCONFIG.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStoreentId(BigDecimal storeentId) {
        this.storeentId = storeentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XJOBCONFIG.JOBIDENTIFIER
     *
     * @return the value of EMDI.XJOBCONFIG.JOBIDENTIFIER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getJobidentifier() {
        return jobidentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XJOBCONFIG.JOBIDENTIFIER
     *
     * @param jobidentifier the value for EMDI.XJOBCONFIG.JOBIDENTIFIER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setJobidentifier(String jobidentifier) {
        this.jobidentifier = jobidentifier == null ? null : jobidentifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XJOBCONFIG.CONFIGNAME
     *
     * @return the value of EMDI.XJOBCONFIG.CONFIGNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getConfigname() {
        return configname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XJOBCONFIG.CONFIGNAME
     *
     * @param configname the value for EMDI.XJOBCONFIG.CONFIGNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setConfigname(String configname) {
        this.configname = configname == null ? null : configname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XJOBCONFIG.DATEVALUE
     *
     * @return the value of EMDI.XJOBCONFIG.DATEVALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public Date getDatevalue() {
        return datevalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XJOBCONFIG.DATEVALUE
     *
     * @param datevalue the value for EMDI.XJOBCONFIG.DATEVALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDatevalue(Date datevalue) {
        this.datevalue = datevalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XJOBCONFIG.STRINGVALUE
     *
     * @return the value of EMDI.XJOBCONFIG.STRINGVALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getStringvalue() {
        return stringvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XJOBCONFIG.STRINGVALUE
     *
     * @param stringvalue the value for EMDI.XJOBCONFIG.STRINGVALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStringvalue(String stringvalue) {
        this.stringvalue = stringvalue == null ? null : stringvalue.trim();
    }
}