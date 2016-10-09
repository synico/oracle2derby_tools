package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Flow {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLOW.FLOW_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal flowId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLOW.FLOWTYPE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal flowtypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLOW.COMPOSITEFLOW
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal compositeflow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLOW.ATTRIBUTE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String attribute;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLOW.IDENTIFIER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String identifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLOW.PRIORITY
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.FLOW.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLOW.FLOW_ID
     *
     * @return the value of EMDI.FLOW.FLOW_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getFlowId() {
        return flowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLOW.FLOW_ID
     *
     * @param flowId the value for EMDI.FLOW.FLOW_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setFlowId(BigDecimal flowId) {
        this.flowId = flowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLOW.FLOWTYPE_ID
     *
     * @return the value of EMDI.FLOW.FLOWTYPE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getFlowtypeId() {
        return flowtypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLOW.FLOWTYPE_ID
     *
     * @param flowtypeId the value for EMDI.FLOW.FLOWTYPE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setFlowtypeId(BigDecimal flowtypeId) {
        this.flowtypeId = flowtypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLOW.COMPOSITEFLOW
     *
     * @return the value of EMDI.FLOW.COMPOSITEFLOW
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getCompositeflow() {
        return compositeflow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLOW.COMPOSITEFLOW
     *
     * @param compositeflow the value for EMDI.FLOW.COMPOSITEFLOW
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setCompositeflow(BigDecimal compositeflow) {
        this.compositeflow = compositeflow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLOW.ATTRIBUTE
     *
     * @return the value of EMDI.FLOW.ATTRIBUTE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLOW.ATTRIBUTE
     *
     * @param attribute the value for EMDI.FLOW.ATTRIBUTE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLOW.IDENTIFIER
     *
     * @return the value of EMDI.FLOW.IDENTIFIER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLOW.IDENTIFIER
     *
     * @param identifier the value for EMDI.FLOW.IDENTIFIER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLOW.PRIORITY
     *
     * @return the value of EMDI.FLOW.PRIORITY
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLOW.PRIORITY
     *
     * @param priority the value for EMDI.FLOW.PRIORITY
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.FLOW.OPTCOUNTER
     *
     * @return the value of EMDI.FLOW.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.FLOW.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.FLOW.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}