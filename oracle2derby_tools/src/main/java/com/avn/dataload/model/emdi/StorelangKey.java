package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class StorelangKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STORELANG.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal languageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STORELANG.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal storeentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STORELANG.LANGUAGE_ID
     *
     * @return the value of EMDI.STORELANG.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getLanguageId() {
        return languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STORELANG.LANGUAGE_ID
     *
     * @param languageId the value for EMDI.STORELANG.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLanguageId(BigDecimal languageId) {
        this.languageId = languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STORELANG.STOREENT_ID
     *
     * @return the value of EMDI.STORELANG.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getStoreentId() {
        return storeentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STORELANG.STOREENT_ID
     *
     * @param storeentId the value for EMDI.STORELANG.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStoreentId(BigDecimal storeentId) {
        this.storeentId = storeentId;
    }
}