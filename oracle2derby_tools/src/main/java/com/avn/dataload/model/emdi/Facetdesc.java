package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Facetdesc extends FacetdescKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FACETDESC.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FACETDESC.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FACETDESC.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal field1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FACETDESC.FIELD2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String field2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FACETDESC.FIELD3
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String field3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FACETDESC.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FACETDESC.NAME
     *
     * @return the value of EMDI.FACETDESC.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FACETDESC.NAME
     *
     * @param name the value for EMDI.FACETDESC.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FACETDESC.DESCRIPTION
     *
     * @return the value of EMDI.FACETDESC.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FACETDESC.DESCRIPTION
     *
     * @param description the value for EMDI.FACETDESC.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FACETDESC.FIELD1
     *
     * @return the value of EMDI.FACETDESC.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getField1() {
        return field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FACETDESC.FIELD1
     *
     * @param field1 the value for EMDI.FACETDESC.FIELD1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setField1(BigDecimal field1) {
        this.field1 = field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FACETDESC.FIELD2
     *
     * @return the value of EMDI.FACETDESC.FIELD2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getField2() {
        return field2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FACETDESC.FIELD2
     *
     * @param field2 the value for EMDI.FACETDESC.FIELD2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FACETDESC.FIELD3
     *
     * @return the value of EMDI.FACETDESC.FIELD3
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getField3() {
        return field3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FACETDESC.FIELD3
     *
     * @param field3 the value for EMDI.FACETDESC.FIELD3
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FACETDESC.OPTCOUNTER
     *
     * @return the value of EMDI.FACETDESC.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FACETDESC.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.FACETDESC.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}