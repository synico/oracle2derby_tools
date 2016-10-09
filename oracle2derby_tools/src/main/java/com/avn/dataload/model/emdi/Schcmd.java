package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Schcmd {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.SCHCMD.SCHCMD_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal schcmdId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.SCHCMD.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal storeentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.SCHCMD.PATHINFO
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String pathinfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.SCHCMD.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.SCHCMD.SCHCMD_ID
     *
     * @return the value of EMDI.SCHCMD.SCHCMD_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getSchcmdId() {
        return schcmdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.SCHCMD.SCHCMD_ID
     *
     * @param schcmdId the value for EMDI.SCHCMD.SCHCMD_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setSchcmdId(BigDecimal schcmdId) {
        this.schcmdId = schcmdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.SCHCMD.STOREENT_ID
     *
     * @return the value of EMDI.SCHCMD.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getStoreentId() {
        return storeentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.SCHCMD.STOREENT_ID
     *
     * @param storeentId the value for EMDI.SCHCMD.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStoreentId(BigDecimal storeentId) {
        this.storeentId = storeentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.SCHCMD.PATHINFO
     *
     * @return the value of EMDI.SCHCMD.PATHINFO
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getPathinfo() {
        return pathinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.SCHCMD.PATHINFO
     *
     * @param pathinfo the value for EMDI.SCHCMD.PATHINFO
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPathinfo(String pathinfo) {
        this.pathinfo = pathinfo == null ? null : pathinfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.SCHCMD.OPTCOUNTER
     *
     * @return the value of EMDI.SCHCMD.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.SCHCMD.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.SCHCMD.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}