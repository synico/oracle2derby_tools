package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Catentryattr extends CatentryattrKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTRYATTR.USAGE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String usage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTRYATTR.SEQUENCE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal sequence;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTRYATTR.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal field1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTRYATTR.FIELD2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal field2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTRYATTR.FIELD3
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String field3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTRYATTR.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTRYATTR.USAGE
     *
     * @return the value of EMDI.CATENTRYATTR.USAGE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getUsage() {
        return usage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTRYATTR.USAGE
     *
     * @param usage the value for EMDI.CATENTRYATTR.USAGE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setUsage(String usage) {
        this.usage = usage == null ? null : usage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTRYATTR.SEQUENCE
     *
     * @return the value of EMDI.CATENTRYATTR.SEQUENCE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getSequence() {
        return sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTRYATTR.SEQUENCE
     *
     * @param sequence the value for EMDI.CATENTRYATTR.SEQUENCE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setSequence(BigDecimal sequence) {
        this.sequence = sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTRYATTR.FIELD1
     *
     * @return the value of EMDI.CATENTRYATTR.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getField1() {
        return field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTRYATTR.FIELD1
     *
     * @param field1 the value for EMDI.CATENTRYATTR.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setField1(BigDecimal field1) {
        this.field1 = field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTRYATTR.FIELD2
     *
     * @return the value of EMDI.CATENTRYATTR.FIELD2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getField2() {
        return field2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTRYATTR.FIELD2
     *
     * @param field2 the value for EMDI.CATENTRYATTR.FIELD2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setField2(BigDecimal field2) {
        this.field2 = field2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTRYATTR.FIELD3
     *
     * @return the value of EMDI.CATENTRYATTR.FIELD3
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getField3() {
        return field3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTRYATTR.FIELD3
     *
     * @param field3 the value for EMDI.CATENTRYATTR.FIELD3
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTRYATTR.OPTCOUNTER
     *
     * @return the value of EMDI.CATENTRYATTR.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTRYATTR.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.CATENTRYATTR.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}