package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class DmelestatsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.DMELESTATS.DMELEMENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal dmelementId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.DMELESTATS.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal storeentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.DMELESTATS.DMELEMENT_ID
     *
     * @return the value of EMDI.DMELESTATS.DMELEMENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getDmelementId() {
        return dmelementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.DMELESTATS.DMELEMENT_ID
     *
     * @param dmelementId the value for EMDI.DMELESTATS.DMELEMENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDmelementId(BigDecimal dmelementId) {
        this.dmelementId = dmelementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.DMELESTATS.STOREENT_ID
     *
     * @return the value of EMDI.DMELESTATS.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getStoreentId() {
        return storeentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.DMELESTATS.STOREENT_ID
     *
     * @param storeentId the value for EMDI.DMELESTATS.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStoreentId(BigDecimal storeentId) {
        this.storeentId = storeentId;
    }
}