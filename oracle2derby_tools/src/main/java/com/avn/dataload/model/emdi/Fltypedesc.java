package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Fltypedesc extends FltypedescKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLTYPEDESC.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLTYPEDESC.LONGDESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String longdescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLTYPEDESC.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLTYPEDESC.DESCRIPTION
     *
     * @return the value of EMDI.FLTYPEDESC.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLTYPEDESC.DESCRIPTION
     *
     * @param description the value for EMDI.FLTYPEDESC.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLTYPEDESC.LONGDESCRIPTION
     *
     * @return the value of EMDI.FLTYPEDESC.LONGDESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getLongdescription() {
        return longdescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLTYPEDESC.LONGDESCRIPTION
     *
     * @param longdescription the value for EMDI.FLTYPEDESC.LONGDESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLongdescription(String longdescription) {
        this.longdescription = longdescription == null ? null : longdescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLTYPEDESC.OPTCOUNTER
     *
     * @return the value of EMDI.FLTYPEDESC.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLTYPEDESC.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.FLTYPEDESC.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}