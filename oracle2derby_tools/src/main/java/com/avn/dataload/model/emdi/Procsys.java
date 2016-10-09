package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Procsys {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PROCSYS.PROCSYSNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String procsysname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PROCSYS.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String field1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PROCSYS.FIELD2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String field2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PROCSYS.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PROCSYS.PROCSYSNAME
     *
     * @return the value of EMDI.PROCSYS.PROCSYSNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getProcsysname() {
        return procsysname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PROCSYS.PROCSYSNAME
     *
     * @param procsysname the value for EMDI.PROCSYS.PROCSYSNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setProcsysname(String procsysname) {
        this.procsysname = procsysname == null ? null : procsysname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PROCSYS.FIELD1
     *
     * @return the value of EMDI.PROCSYS.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getField1() {
        return field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PROCSYS.FIELD1
     *
     * @param field1 the value for EMDI.PROCSYS.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PROCSYS.FIELD2
     *
     * @return the value of EMDI.PROCSYS.FIELD2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getField2() {
        return field2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PROCSYS.FIELD2
     *
     * @param field2 the value for EMDI.PROCSYS.FIELD2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PROCSYS.OPTCOUNTER
     *
     * @return the value of EMDI.PROCSYS.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PROCSYS.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.PROCSYS.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}