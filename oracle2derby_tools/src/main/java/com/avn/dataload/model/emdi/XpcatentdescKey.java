package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class XpcatentdescKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XPCATENTDESC.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal languageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XPCATENTDESC.CATENTRY_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal catentryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XPCATENTDESC.LANGUAGE_ID
     *
     * @return the value of EMDI.XPCATENTDESC.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getLanguageId() {
        return languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XPCATENTDESC.LANGUAGE_ID
     *
     * @param languageId the value for EMDI.XPCATENTDESC.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLanguageId(BigDecimal languageId) {
        this.languageId = languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XPCATENTDESC.CATENTRY_ID
     *
     * @return the value of EMDI.XPCATENTDESC.CATENTRY_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getCatentryId() {
        return catentryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XPCATENTDESC.CATENTRY_ID
     *
     * @param catentryId the value for EMDI.XPCATENTDESC.CATENTRY_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setCatentryId(BigDecimal catentryId) {
        this.catentryId = catentryId;
    }
}