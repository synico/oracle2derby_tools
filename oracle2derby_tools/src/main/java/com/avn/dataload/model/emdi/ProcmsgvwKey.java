package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class ProcmsgvwKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PROCMSGVW.MSGNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String msgname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PROCMSGVW.PROCPROTCL_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal procprotclId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PROCMSGVW.ORGENTITY_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal orgentityId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PROCMSGVW.MSGNAME
     *
     * @return the value of EMDI.PROCMSGVW.MSGNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getMsgname() {
        return msgname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PROCMSGVW.MSGNAME
     *
     * @param msgname the value for EMDI.PROCMSGVW.MSGNAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setMsgname(String msgname) {
        this.msgname = msgname == null ? null : msgname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PROCMSGVW.PROCPROTCL_ID
     *
     * @return the value of EMDI.PROCMSGVW.PROCPROTCL_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getProcprotclId() {
        return procprotclId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PROCMSGVW.PROCPROTCL_ID
     *
     * @param procprotclId the value for EMDI.PROCMSGVW.PROCPROTCL_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setProcprotclId(BigDecimal procprotclId) {
        this.procprotclId = procprotclId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PROCMSGVW.ORGENTITY_ID
     *
     * @return the value of EMDI.PROCMSGVW.ORGENTITY_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOrgentityId() {
        return orgentityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PROCMSGVW.ORGENTITY_ID
     *
     * @param orgentityId the value for EMDI.PROCMSGVW.ORGENTITY_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOrgentityId(BigDecimal orgentityId) {
        this.orgentityId = orgentityId;
    }
}