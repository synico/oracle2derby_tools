package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Mbrgrpmbr extends MbrgrpmbrKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.MBRGRPMBR.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String field1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.MBRGRPMBR.CUSTOMERID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String customerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.MBRGRPMBR.EXCLUDE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String exclude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.MBRGRPMBR.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.MBRGRPMBR.FIELD1
     *
     * @return the value of EMDI.MBRGRPMBR.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getField1() {
        return field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.MBRGRPMBR.FIELD1
     *
     * @param field1 the value for EMDI.MBRGRPMBR.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.MBRGRPMBR.CUSTOMERID
     *
     * @return the value of EMDI.MBRGRPMBR.CUSTOMERID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.MBRGRPMBR.CUSTOMERID
     *
     * @param customerid the value for EMDI.MBRGRPMBR.CUSTOMERID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.MBRGRPMBR.EXCLUDE
     *
     * @return the value of EMDI.MBRGRPMBR.EXCLUDE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getExclude() {
        return exclude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.MBRGRPMBR.EXCLUDE
     *
     * @param exclude the value for EMDI.MBRGRPMBR.EXCLUDE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setExclude(String exclude) {
        this.exclude = exclude == null ? null : exclude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.MBRGRPMBR.OPTCOUNTER
     *
     * @return the value of EMDI.MBRGRPMBR.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.MBRGRPMBR.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.MBRGRPMBR.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}