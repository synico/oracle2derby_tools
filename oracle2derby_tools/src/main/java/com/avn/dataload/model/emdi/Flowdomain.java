package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Flowdomain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLOWDOMAIN.FLOWDOMAIN_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal flowdomainId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLOWDOMAIN.IDENTIFIER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String identifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLOWDOMAIN.PRIORITY
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLOWDOMAIN.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLOWDOMAIN.FLOWDOMAIN_ID
     *
     * @return the value of EMDI.FLOWDOMAIN.FLOWDOMAIN_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getFlowdomainId() {
        return flowdomainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLOWDOMAIN.FLOWDOMAIN_ID
     *
     * @param flowdomainId the value for EMDI.FLOWDOMAIN.FLOWDOMAIN_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setFlowdomainId(BigDecimal flowdomainId) {
        this.flowdomainId = flowdomainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLOWDOMAIN.IDENTIFIER
     *
     * @return the value of EMDI.FLOWDOMAIN.IDENTIFIER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLOWDOMAIN.IDENTIFIER
     *
     * @param identifier the value for EMDI.FLOWDOMAIN.IDENTIFIER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLOWDOMAIN.PRIORITY
     *
     * @return the value of EMDI.FLOWDOMAIN.PRIORITY
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLOWDOMAIN.PRIORITY
     *
     * @param priority the value for EMDI.FLOWDOMAIN.PRIORITY
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLOWDOMAIN.OPTCOUNTER
     *
     * @return the value of EMDI.FLOWDOMAIN.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLOWDOMAIN.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.FLOWDOMAIN.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}