package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Storlangds extends StorlangdsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STORLANGDS.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STORLANGDS.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STORLANGDS.DESCRIPTION
     *
     * @return the value of EMDI.STORLANGDS.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STORLANGDS.DESCRIPTION
     *
     * @param description the value for EMDI.STORLANGDS.DESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STORLANGDS.OPTCOUNTER
     *
     * @return the value of EMDI.STORLANGDS.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STORLANGDS.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.STORLANGDS.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}