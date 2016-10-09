package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Statecode extends StatecodeKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STATECODE.STATEPROVCODE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String stateprovcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STATECODE.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STATECODE.STATEPROVCODE
     *
     * @return the value of EMDI.STATECODE.STATEPROVCODE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getStateprovcode() {
        return stateprovcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STATECODE.STATEPROVCODE
     *
     * @param stateprovcode the value for EMDI.STATECODE.STATEPROVCODE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStateprovcode(String stateprovcode) {
        this.stateprovcode = stateprovcode == null ? null : stateprovcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STATECODE.OPTCOUNTER
     *
     * @return the value of EMDI.STATECODE.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STATECODE.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.STATECODE.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}