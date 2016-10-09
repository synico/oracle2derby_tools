package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Acreldesc extends AcreldescKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ACRELDESC.DISPLAYNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String displayname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ACRELDESC.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ACRELDESC.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ACRELDESC.DISPLAYNAME
     *
     * @return the value of EMDI.ACRELDESC.DISPLAYNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getDisplayname() {
        return displayname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ACRELDESC.DISPLAYNAME
     *
     * @param displayname the value for EMDI.ACRELDESC.DISPLAYNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDisplayname(String displayname) {
        this.displayname = displayname == null ? null : displayname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ACRELDESC.DESCRIPTION
     *
     * @return the value of EMDI.ACRELDESC.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ACRELDESC.DESCRIPTION
     *
     * @param description the value for EMDI.ACRELDESC.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ACRELDESC.OPTCOUNTER
     *
     * @return the value of EMDI.ACRELDESC.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ACRELDESC.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.ACRELDESC.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}