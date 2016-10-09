package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Curformat extends CurformatKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CURFORMAT.ROUNDINGMULTIPLE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal roundingmultiple;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CURFORMAT.ROUNDINGMETHOD
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String roundingmethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CURFORMAT.DECIMALPLACES
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal decimalplaces;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CURFORMAT.MINAPPROVEAMOUNT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal minapproveamount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CURFORMAT.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CURFORMAT.ROUNDINGMULTIPLE
     *
     * @return the value of EMDI.CURFORMAT.ROUNDINGMULTIPLE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getRoundingmultiple() {
        return roundingmultiple;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CURFORMAT.ROUNDINGMULTIPLE
     *
     * @param roundingmultiple the value for EMDI.CURFORMAT.ROUNDINGMULTIPLE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setRoundingmultiple(BigDecimal roundingmultiple) {
        this.roundingmultiple = roundingmultiple;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CURFORMAT.ROUNDINGMETHOD
     *
     * @return the value of EMDI.CURFORMAT.ROUNDINGMETHOD
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getRoundingmethod() {
        return roundingmethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CURFORMAT.ROUNDINGMETHOD
     *
     * @param roundingmethod the value for EMDI.CURFORMAT.ROUNDINGMETHOD
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setRoundingmethod(String roundingmethod) {
        this.roundingmethod = roundingmethod == null ? null : roundingmethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CURFORMAT.DECIMALPLACES
     *
     * @return the value of EMDI.CURFORMAT.DECIMALPLACES
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getDecimalplaces() {
        return decimalplaces;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CURFORMAT.DECIMALPLACES
     *
     * @param decimalplaces the value for EMDI.CURFORMAT.DECIMALPLACES
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDecimalplaces(BigDecimal decimalplaces) {
        this.decimalplaces = decimalplaces;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CURFORMAT.MINAPPROVEAMOUNT
     *
     * @return the value of EMDI.CURFORMAT.MINAPPROVEAMOUNT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getMinapproveamount() {
        return minapproveamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CURFORMAT.MINAPPROVEAMOUNT
     *
     * @param minapproveamount the value for EMDI.CURFORMAT.MINAPPROVEAMOUNT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setMinapproveamount(BigDecimal minapproveamount) {
        this.minapproveamount = minapproveamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CURFORMAT.OPTCOUNTER
     *
     * @return the value of EMDI.CURFORMAT.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CURFORMAT.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.CURFORMAT.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}