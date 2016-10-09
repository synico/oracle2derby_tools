package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class BuschndescKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.BUSCHNDESC.BUSCHN_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal buschnId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.BUSCHNDESC.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal languageId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.BUSCHNDESC.BUSCHN_ID
     *
     * @return the value of EMDI.BUSCHNDESC.BUSCHN_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getBuschnId() {
        return buschnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.BUSCHNDESC.BUSCHN_ID
     *
     * @param buschnId the value for EMDI.BUSCHNDESC.BUSCHN_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setBuschnId(BigDecimal buschnId) {
        this.buschnId = buschnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.BUSCHNDESC.LANGUAGE_ID
     *
     * @return the value of EMDI.BUSCHNDESC.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getLanguageId() {
        return languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.BUSCHNDESC.LANGUAGE_ID
     *
     * @param languageId the value for EMDI.BUSCHNDESC.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLanguageId(BigDecimal languageId) {
        this.languageId = languageId;
    }
}