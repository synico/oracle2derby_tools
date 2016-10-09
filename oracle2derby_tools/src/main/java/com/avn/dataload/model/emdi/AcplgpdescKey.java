package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class AcplgpdescKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ACPLGPDESC.ACPOLGRP_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal acpolgrpId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ACPLGPDESC.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal languageId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ACPLGPDESC.ACPOLGRP_ID
     *
     * @return the value of EMDI.ACPLGPDESC.ACPOLGRP_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getAcpolgrpId() {
        return acpolgrpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ACPLGPDESC.ACPOLGRP_ID
     *
     * @param acpolgrpId the value for EMDI.ACPLGPDESC.ACPOLGRP_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setAcpolgrpId(BigDecimal acpolgrpId) {
        this.acpolgrpId = acpolgrpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ACPLGPDESC.LANGUAGE_ID
     *
     * @return the value of EMDI.ACPLGPDESC.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getLanguageId() {
        return languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ACPLGPDESC.LANGUAGE_ID
     *
     * @param languageId the value for EMDI.ACPLGPDESC.LANGUAGE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLanguageId(BigDecimal languageId) {
        this.languageId = languageId;
    }
}