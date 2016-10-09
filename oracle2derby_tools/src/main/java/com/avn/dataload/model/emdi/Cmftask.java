package com.avn.dataload.model.emdi;

import java.math.BigDecimal;
import java.util.Date;

public class Cmftask {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CMFTASK.CMFTASK_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal cmftaskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CMFTASK.IDENTIFIER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String identifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CMFTASK.USAGE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal usage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CMFTASK.DUEDATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private Date duedate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CMFTASK.COMPLETEDATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private Date completedate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CMFTASK.STATUS
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CMFTASK.TEMPLATETYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal templatetype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CMFTASK.TYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CMFTASK.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CMFTASK.CMFTASK_ID
     *
     * @return the value of EMDI.CMFTASK.CMFTASK_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getCmftaskId() {
        return cmftaskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CMFTASK.CMFTASK_ID
     *
     * @param cmftaskId the value for EMDI.CMFTASK.CMFTASK_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setCmftaskId(BigDecimal cmftaskId) {
        this.cmftaskId = cmftaskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CMFTASK.IDENTIFIER
     *
     * @return the value of EMDI.CMFTASK.IDENTIFIER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CMFTASK.IDENTIFIER
     *
     * @param identifier the value for EMDI.CMFTASK.IDENTIFIER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CMFTASK.USAGE
     *
     * @return the value of EMDI.CMFTASK.USAGE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getUsage() {
        return usage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CMFTASK.USAGE
     *
     * @param usage the value for EMDI.CMFTASK.USAGE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setUsage(BigDecimal usage) {
        this.usage = usage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CMFTASK.DUEDATE
     *
     * @return the value of EMDI.CMFTASK.DUEDATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public Date getDuedate() {
        return duedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CMFTASK.DUEDATE
     *
     * @param duedate the value for EMDI.CMFTASK.DUEDATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CMFTASK.COMPLETEDATE
     *
     * @return the value of EMDI.CMFTASK.COMPLETEDATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public Date getCompletedate() {
        return completedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CMFTASK.COMPLETEDATE
     *
     * @param completedate the value for EMDI.CMFTASK.COMPLETEDATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setCompletedate(Date completedate) {
        this.completedate = completedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CMFTASK.STATUS
     *
     * @return the value of EMDI.CMFTASK.STATUS
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CMFTASK.STATUS
     *
     * @param status the value for EMDI.CMFTASK.STATUS
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CMFTASK.TEMPLATETYPE
     *
     * @return the value of EMDI.CMFTASK.TEMPLATETYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getTemplatetype() {
        return templatetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CMFTASK.TEMPLATETYPE
     *
     * @param templatetype the value for EMDI.CMFTASK.TEMPLATETYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setTemplatetype(BigDecimal templatetype) {
        this.templatetype = templatetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CMFTASK.TYPE
     *
     * @return the value of EMDI.CMFTASK.TYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CMFTASK.TYPE
     *
     * @param type the value for EMDI.CMFTASK.TYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setType(BigDecimal type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CMFTASK.OPTCOUNTER
     *
     * @return the value of EMDI.CMFTASK.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CMFTASK.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.CMFTASK.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}