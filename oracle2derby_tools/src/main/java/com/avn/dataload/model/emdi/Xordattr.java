package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Xordattr {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XORDATTR.ORDATTR_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal ordattrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XORDATTR.ORDERS_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal ordersId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XORDATTR.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XORDATTR.VALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XORDATTR.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XORDATTR.ORDATTR_ID
     *
     * @return the value of EMDI.XORDATTR.ORDATTR_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOrdattrId() {
        return ordattrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XORDATTR.ORDATTR_ID
     *
     * @param ordattrId the value for EMDI.XORDATTR.ORDATTR_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOrdattrId(BigDecimal ordattrId) {
        this.ordattrId = ordattrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XORDATTR.ORDERS_ID
     *
     * @return the value of EMDI.XORDATTR.ORDERS_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOrdersId() {
        return ordersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XORDATTR.ORDERS_ID
     *
     * @param ordersId the value for EMDI.XORDATTR.ORDERS_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOrdersId(BigDecimal ordersId) {
        this.ordersId = ordersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XORDATTR.NAME
     *
     * @return the value of EMDI.XORDATTR.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XORDATTR.NAME
     *
     * @param name the value for EMDI.XORDATTR.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XORDATTR.VALUE
     *
     * @return the value of EMDI.XORDATTR.VALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XORDATTR.VALUE
     *
     * @param value the value for EMDI.XORDATTR.VALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XORDATTR.OPTCOUNTER
     *
     * @return the value of EMDI.XORDATTR.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XORDATTR.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.XORDATTR.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}