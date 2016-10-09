package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Dmemspotdef {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.DMEMSPOTDEF.DMEMSPOTDEF_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal dmemspotdefId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.DMEMSPOTDEF.EMSPOT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal emspotId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.DMEMSPOTDEF.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal storeentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.DMEMSPOTDEF.CONTENTTYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String contenttype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.DMEMSPOTDEF.CONTENT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.DMEMSPOTDEF.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.DMEMSPOTDEF.SEQUENCE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal sequence;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.DMEMSPOTDEF.DMEMSPOTDEF_ID
     *
     * @return the value of EMDI.DMEMSPOTDEF.DMEMSPOTDEF_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getDmemspotdefId() {
        return dmemspotdefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.DMEMSPOTDEF.DMEMSPOTDEF_ID
     *
     * @param dmemspotdefId the value for EMDI.DMEMSPOTDEF.DMEMSPOTDEF_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDmemspotdefId(BigDecimal dmemspotdefId) {
        this.dmemspotdefId = dmemspotdefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.DMEMSPOTDEF.EMSPOT_ID
     *
     * @return the value of EMDI.DMEMSPOTDEF.EMSPOT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getEmspotId() {
        return emspotId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.DMEMSPOTDEF.EMSPOT_ID
     *
     * @param emspotId the value for EMDI.DMEMSPOTDEF.EMSPOT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setEmspotId(BigDecimal emspotId) {
        this.emspotId = emspotId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.DMEMSPOTDEF.STOREENT_ID
     *
     * @return the value of EMDI.DMEMSPOTDEF.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getStoreentId() {
        return storeentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.DMEMSPOTDEF.STOREENT_ID
     *
     * @param storeentId the value for EMDI.DMEMSPOTDEF.STOREENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStoreentId(BigDecimal storeentId) {
        this.storeentId = storeentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.DMEMSPOTDEF.CONTENTTYPE
     *
     * @return the value of EMDI.DMEMSPOTDEF.CONTENTTYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getContenttype() {
        return contenttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.DMEMSPOTDEF.CONTENTTYPE
     *
     * @param contenttype the value for EMDI.DMEMSPOTDEF.CONTENTTYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setContenttype(String contenttype) {
        this.contenttype = contenttype == null ? null : contenttype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.DMEMSPOTDEF.CONTENT
     *
     * @return the value of EMDI.DMEMSPOTDEF.CONTENT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.DMEMSPOTDEF.CONTENT
     *
     * @param content the value for EMDI.DMEMSPOTDEF.CONTENT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.DMEMSPOTDEF.OPTCOUNTER
     *
     * @return the value of EMDI.DMEMSPOTDEF.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.DMEMSPOTDEF.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.DMEMSPOTDEF.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.DMEMSPOTDEF.SEQUENCE
     *
     * @return the value of EMDI.DMEMSPOTDEF.SEQUENCE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getSequence() {
        return sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.DMEMSPOTDEF.SEQUENCE
     *
     * @param sequence the value for EMDI.DMEMSPOTDEF.SEQUENCE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setSequence(BigDecimal sequence) {
        this.sequence = sequence;
    }
}