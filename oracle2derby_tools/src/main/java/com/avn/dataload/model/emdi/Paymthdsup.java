package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Paymthdsup extends PaymthdsupKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PAYMTHDSUP.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String field1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PAYMTHDSUP.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PAYMTHDSUP.FIELD1
     *
     * @return the value of EMDI.PAYMTHDSUP.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getField1() {
        return field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PAYMTHDSUP.FIELD1
     *
     * @param field1 the value for EMDI.PAYMTHDSUP.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PAYMTHDSUP.OPTCOUNTER
     *
     * @return the value of EMDI.PAYMTHDSUP.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PAYMTHDSUP.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.PAYMTHDSUP.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}