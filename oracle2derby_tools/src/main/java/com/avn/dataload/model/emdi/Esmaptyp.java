package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Esmaptyp {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ESMAPTYP.ESMAPTYP_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal esmaptypId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ESMAPTYP.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ESMAPTYP.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ESMAPTYP.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ESMAPTYP.ESMAPTYP_ID
     *
     * @return the value of EMDI.ESMAPTYP.ESMAPTYP_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getEsmaptypId() {
        return esmaptypId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ESMAPTYP.ESMAPTYP_ID
     *
     * @param esmaptypId the value for EMDI.ESMAPTYP.ESMAPTYP_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setEsmaptypId(BigDecimal esmaptypId) {
        this.esmaptypId = esmaptypId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ESMAPTYP.NAME
     *
     * @return the value of EMDI.ESMAPTYP.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ESMAPTYP.NAME
     *
     * @param name the value for EMDI.ESMAPTYP.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ESMAPTYP.DESCRIPTION
     *
     * @return the value of EMDI.ESMAPTYP.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ESMAPTYP.DESCRIPTION
     *
     * @param description the value for EMDI.ESMAPTYP.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ESMAPTYP.OPTCOUNTER
     *
     * @return the value of EMDI.ESMAPTYP.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ESMAPTYP.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.ESMAPTYP.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}