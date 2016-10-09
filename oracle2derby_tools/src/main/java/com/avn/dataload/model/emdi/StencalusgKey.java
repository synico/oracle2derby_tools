package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class StencalusgKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STENCALUSG.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal storeentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STENCALUSG.CALUSAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal calusageId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STENCALUSG.STOREENT_ID
     *
     * @return the value of EMDI.STENCALUSG.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getStoreentId() {
        return storeentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STENCALUSG.STOREENT_ID
     *
     * @param storeentId the value for EMDI.STENCALUSG.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStoreentId(BigDecimal storeentId) {
        this.storeentId = storeentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STENCALUSG.CALUSAGE_ID
     *
     * @return the value of EMDI.STENCALUSG.CALUSAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getCalusageId() {
        return calusageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STENCALUSG.CALUSAGE_ID
     *
     * @param calusageId the value for EMDI.STENCALUSG.CALUSAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setCalusageId(BigDecimal calusageId) {
        this.calusageId = calusageId;
    }
}