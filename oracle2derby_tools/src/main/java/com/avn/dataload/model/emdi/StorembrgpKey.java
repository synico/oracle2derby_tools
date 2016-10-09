package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class StorembrgpKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STOREMBRGP.STORE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal storeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STOREMBRGP.MBRGRP_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal mbrgrpId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STOREMBRGP.STORE_ID
     *
     * @return the value of EMDI.STOREMBRGP.STORE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STOREMBRGP.STORE_ID
     *
     * @param storeId the value for EMDI.STOREMBRGP.STORE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStoreId(BigDecimal storeId) {
        this.storeId = storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STOREMBRGP.MBRGRP_ID
     *
     * @return the value of EMDI.STOREMBRGP.MBRGRP_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getMbrgrpId() {
        return mbrgrpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STOREMBRGP.MBRGRP_ID
     *
     * @param mbrgrpId the value for EMDI.STOREMBRGP.MBRGRP_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setMbrgrpId(BigDecimal mbrgrpId) {
        this.mbrgrpId = mbrgrpId;
    }
}