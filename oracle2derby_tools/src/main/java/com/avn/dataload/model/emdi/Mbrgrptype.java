package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Mbrgrptype {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.MBRGRPTYPE.MBRGRPTYPE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal mbrgrptypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.MBRGRPTYPE.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.MBRGRPTYPE.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.MBRGRPTYPE.PROPERTIES
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String properties;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.MBRGRPTYPE.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.MBRGRPTYPE.MBRGRPTYPE_ID
     *
     * @return the value of EMDI.MBRGRPTYPE.MBRGRPTYPE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getMbrgrptypeId() {
        return mbrgrptypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.MBRGRPTYPE.MBRGRPTYPE_ID
     *
     * @param mbrgrptypeId the value for EMDI.MBRGRPTYPE.MBRGRPTYPE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setMbrgrptypeId(BigDecimal mbrgrptypeId) {
        this.mbrgrptypeId = mbrgrptypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.MBRGRPTYPE.DESCRIPTION
     *
     * @return the value of EMDI.MBRGRPTYPE.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.MBRGRPTYPE.DESCRIPTION
     *
     * @param description the value for EMDI.MBRGRPTYPE.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.MBRGRPTYPE.NAME
     *
     * @return the value of EMDI.MBRGRPTYPE.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.MBRGRPTYPE.NAME
     *
     * @param name the value for EMDI.MBRGRPTYPE.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.MBRGRPTYPE.PROPERTIES
     *
     * @return the value of EMDI.MBRGRPTYPE.PROPERTIES
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getProperties() {
        return properties;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.MBRGRPTYPE.PROPERTIES
     *
     * @param properties the value for EMDI.MBRGRPTYPE.PROPERTIES
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setProperties(String properties) {
        this.properties = properties == null ? null : properties.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.MBRGRPTYPE.OPTCOUNTER
     *
     * @return the value of EMDI.MBRGRPTYPE.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.MBRGRPTYPE.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.MBRGRPTYPE.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}