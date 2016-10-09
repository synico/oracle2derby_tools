package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class CtxdataKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CTXDATA.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CTXDATA.ACTIVITY_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal activityId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CTXDATA.NAME
     *
     * @return the value of EMDI.CTXDATA.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CTXDATA.NAME
     *
     * @param name the value for EMDI.CTXDATA.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CTXDATA.ACTIVITY_ID
     *
     * @return the value of EMDI.CTXDATA.ACTIVITY_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CTXDATA.ACTIVITY_ID
     *
     * @param activityId the value for EMDI.CTXDATA.ACTIVITY_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setActivityId(BigDecimal activityId) {
        this.activityId = activityId;
    }
}