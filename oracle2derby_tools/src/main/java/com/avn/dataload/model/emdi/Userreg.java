package com.avn.dataload.model.emdi;

import java.math.BigDecimal;
import java.util.Date;

public class Userreg {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.USERS_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal usersId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.STATUS
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.PLCYACCT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal plcyacctId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.LOGONID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String logonid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.PASSWORDEXPIRED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal passwordexpired;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.CHALLENGEQUESTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String challengequestion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.CHALLENGEANSWER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String challengeanswer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.TIMEOUT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal timeout;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.PASSWORDRETRIES
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal passwordretries;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.SALT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String salt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.PASSWORDCREATION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private Date passwordcreation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.PASSWORDINVALID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private Date passwordinvalid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.USERREG.LOGONPASSWORD
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private byte[] logonpassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.USERS_ID
     *
     * @return the value of EMDI.USERREG.USERS_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getUsersId() {
        return usersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.USERS_ID
     *
     * @param usersId the value for EMDI.USERREG.USERS_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setUsersId(BigDecimal usersId) {
        this.usersId = usersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.STATUS
     *
     * @return the value of EMDI.USERREG.STATUS
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.STATUS
     *
     * @param status the value for EMDI.USERREG.STATUS
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.PLCYACCT_ID
     *
     * @return the value of EMDI.USERREG.PLCYACCT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getPlcyacctId() {
        return plcyacctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.PLCYACCT_ID
     *
     * @param plcyacctId the value for EMDI.USERREG.PLCYACCT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPlcyacctId(BigDecimal plcyacctId) {
        this.plcyacctId = plcyacctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.LOGONID
     *
     * @return the value of EMDI.USERREG.LOGONID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getLogonid() {
        return logonid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.LOGONID
     *
     * @param logonid the value for EMDI.USERREG.LOGONID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLogonid(String logonid) {
        this.logonid = logonid == null ? null : logonid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.PASSWORDEXPIRED
     *
     * @return the value of EMDI.USERREG.PASSWORDEXPIRED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getPasswordexpired() {
        return passwordexpired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.PASSWORDEXPIRED
     *
     * @param passwordexpired the value for EMDI.USERREG.PASSWORDEXPIRED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPasswordexpired(BigDecimal passwordexpired) {
        this.passwordexpired = passwordexpired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.CHALLENGEQUESTION
     *
     * @return the value of EMDI.USERREG.CHALLENGEQUESTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getChallengequestion() {
        return challengequestion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.CHALLENGEQUESTION
     *
     * @param challengequestion the value for EMDI.USERREG.CHALLENGEQUESTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setChallengequestion(String challengequestion) {
        this.challengequestion = challengequestion == null ? null : challengequestion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.CHALLENGEANSWER
     *
     * @return the value of EMDI.USERREG.CHALLENGEANSWER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getChallengeanswer() {
        return challengeanswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.CHALLENGEANSWER
     *
     * @param challengeanswer the value for EMDI.USERREG.CHALLENGEANSWER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setChallengeanswer(String challengeanswer) {
        this.challengeanswer = challengeanswer == null ? null : challengeanswer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.TIMEOUT
     *
     * @return the value of EMDI.USERREG.TIMEOUT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getTimeout() {
        return timeout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.TIMEOUT
     *
     * @param timeout the value for EMDI.USERREG.TIMEOUT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setTimeout(BigDecimal timeout) {
        this.timeout = timeout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.PASSWORDRETRIES
     *
     * @return the value of EMDI.USERREG.PASSWORDRETRIES
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getPasswordretries() {
        return passwordretries;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.PASSWORDRETRIES
     *
     * @param passwordretries the value for EMDI.USERREG.PASSWORDRETRIES
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPasswordretries(BigDecimal passwordretries) {
        this.passwordretries = passwordretries;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.SALT
     *
     * @return the value of EMDI.USERREG.SALT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.SALT
     *
     * @param salt the value for EMDI.USERREG.SALT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.PASSWORDCREATION
     *
     * @return the value of EMDI.USERREG.PASSWORDCREATION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public Date getPasswordcreation() {
        return passwordcreation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.PASSWORDCREATION
     *
     * @param passwordcreation the value for EMDI.USERREG.PASSWORDCREATION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPasswordcreation(Date passwordcreation) {
        this.passwordcreation = passwordcreation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.PASSWORDINVALID
     *
     * @return the value of EMDI.USERREG.PASSWORDINVALID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public Date getPasswordinvalid() {
        return passwordinvalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.PASSWORDINVALID
     *
     * @param passwordinvalid the value for EMDI.USERREG.PASSWORDINVALID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPasswordinvalid(Date passwordinvalid) {
        this.passwordinvalid = passwordinvalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.OPTCOUNTER
     *
     * @return the value of EMDI.USERREG.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.USERREG.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.USERREG.LOGONPASSWORD
     *
     * @return the value of EMDI.USERREG.LOGONPASSWORD
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public byte[] getLogonpassword() {
        return logonpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.USERREG.LOGONPASSWORD
     *
     * @param logonpassword the value for EMDI.USERREG.LOGONPASSWORD
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLogonpassword(byte[] logonpassword) {
        this.logonpassword = logonpassword;
    }
}