package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Numbrusg {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.NUMBRUSG.NUMBRUSG_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal numbrusgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.NUMBRUSG.CODE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.NUMBRUSG.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.NUMBRUSG.NUMBRUSG_ID
     *
     * @return the value of EMDI.NUMBRUSG.NUMBRUSG_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getNumbrusgId() {
        return numbrusgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.NUMBRUSG.NUMBRUSG_ID
     *
     * @param numbrusgId the value for EMDI.NUMBRUSG.NUMBRUSG_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setNumbrusgId(BigDecimal numbrusgId) {
        this.numbrusgId = numbrusgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.NUMBRUSG.CODE
     *
     * @return the value of EMDI.NUMBRUSG.CODE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.NUMBRUSG.CODE
     *
     * @param code the value for EMDI.NUMBRUSG.CODE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.NUMBRUSG.OPTCOUNTER
     *
     * @return the value of EMDI.NUMBRUSG.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.NUMBRUSG.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.NUMBRUSG.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}