package com.avn.dataload.model.emdi;

import java.math.BigDecimal;
import java.util.Date;

public class Dmuserbhvr extends DmuserbhvrKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.DMUSERBHVR.LASTUPDATED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private Date lastupdated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.DMUSERBHVR.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.DMUSERBHVR.LASTUPDATED
     *
     * @return the value of EMDI.DMUSERBHVR.LASTUPDATED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public Date getLastupdated() {
        return lastupdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.DMUSERBHVR.LASTUPDATED
     *
     * @param lastupdated the value for EMDI.DMUSERBHVR.LASTUPDATED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLastupdated(Date lastupdated) {
        this.lastupdated = lastupdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.DMUSERBHVR.OPTCOUNTER
     *
     * @return the value of EMDI.DMUSERBHVR.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.DMUSERBHVR.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.DMUSERBHVR.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}