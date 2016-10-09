package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class FfmcentdsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FFMCENTDS.FFMCENTER_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal ffmcenterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FFMCENTDS.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal languageId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FFMCENTDS.FFMCENTER_ID
     *
     * @return the value of EMDI.FFMCENTDS.FFMCENTER_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getFfmcenterId() {
        return ffmcenterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FFMCENTDS.FFMCENTER_ID
     *
     * @param ffmcenterId the value for EMDI.FFMCENTDS.FFMCENTER_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setFfmcenterId(BigDecimal ffmcenterId) {
        this.ffmcenterId = ffmcenterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FFMCENTDS.LANGUAGE_ID
     *
     * @return the value of EMDI.FFMCENTDS.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getLanguageId() {
        return languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FFMCENTDS.LANGUAGE_ID
     *
     * @param languageId the value for EMDI.FFMCENTDS.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLanguageId(BigDecimal languageId) {
        this.languageId = languageId;
    }
}