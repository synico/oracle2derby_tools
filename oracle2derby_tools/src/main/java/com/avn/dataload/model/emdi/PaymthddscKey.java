package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class PaymthddscKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PAYMTHDDSC.PAYMTHD_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal paymthdId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PAYMTHDDSC.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal languageId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PAYMTHDDSC.PAYMTHD_ID
     *
     * @return the value of EMDI.PAYMTHDDSC.PAYMTHD_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getPaymthdId() {
        return paymthdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PAYMTHDDSC.PAYMTHD_ID
     *
     * @param paymthdId the value for EMDI.PAYMTHDDSC.PAYMTHD_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPaymthdId(BigDecimal paymthdId) {
        this.paymthdId = paymthdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PAYMTHDDSC.LANGUAGE_ID
     *
     * @return the value of EMDI.PAYMTHDDSC.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getLanguageId() {
        return languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PAYMTHDDSC.LANGUAGE_ID
     *
     * @param languageId the value for EMDI.PAYMTHDDSC.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLanguageId(BigDecimal languageId) {
        this.languageId = languageId;
    }
}