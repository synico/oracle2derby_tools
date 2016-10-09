package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Cpendorder extends CpendorderKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CPENDORDER.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal storeentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CPENDORDER.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal field1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CPENDORDER.FIELD2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String field2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CPENDORDER.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CPENDORDER.STOREENT_ID
     *
     * @return the value of EMDI.CPENDORDER.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getStoreentId() {
        return storeentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CPENDORDER.STOREENT_ID
     *
     * @param storeentId the value for EMDI.CPENDORDER.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStoreentId(BigDecimal storeentId) {
        this.storeentId = storeentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CPENDORDER.FIELD1
     *
     * @return the value of EMDI.CPENDORDER.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getField1() {
        return field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CPENDORDER.FIELD1
     *
     * @param field1 the value for EMDI.CPENDORDER.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setField1(BigDecimal field1) {
        this.field1 = field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CPENDORDER.FIELD2
     *
     * @return the value of EMDI.CPENDORDER.FIELD2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getField2() {
        return field2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CPENDORDER.FIELD2
     *
     * @param field2 the value for EMDI.CPENDORDER.FIELD2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CPENDORDER.OPTCOUNTER
     *
     * @return the value of EMDI.CPENDORDER.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CPENDORDER.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.CPENDORDER.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}