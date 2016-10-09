package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Member {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.MEMBER.MEMBER_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.MEMBER.TYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.MEMBER.STATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.MEMBER.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.MEMBER.MEMBER_ID
     *
     * @return the value of EMDI.MEMBER.MEMBER_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.MEMBER.MEMBER_ID
     *
     * @param memberId the value for EMDI.MEMBER.MEMBER_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setMemberId(BigDecimal memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.MEMBER.TYPE
     *
     * @return the value of EMDI.MEMBER.TYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.MEMBER.TYPE
     *
     * @param type the value for EMDI.MEMBER.TYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.MEMBER.STATE
     *
     * @return the value of EMDI.MEMBER.STATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.MEMBER.STATE
     *
     * @param state the value for EMDI.MEMBER.STATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setState(BigDecimal state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.MEMBER.OPTCOUNTER
     *
     * @return the value of EMDI.MEMBER.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.MEMBER.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.MEMBER.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}