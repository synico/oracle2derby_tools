package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Ordpayinfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ORDPAYINFO.ORDPAYINFO_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal ordpayinfoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ORDPAYINFO.ORDERS_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal ordersId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ORDPAYINFO.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ORDPAYINFO.VALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.ORDPAYINFO.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ORDPAYINFO.ORDPAYINFO_ID
     *
     * @return the value of EMDI.ORDPAYINFO.ORDPAYINFO_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOrdpayinfoId() {
        return ordpayinfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ORDPAYINFO.ORDPAYINFO_ID
     *
     * @param ordpayinfoId the value for EMDI.ORDPAYINFO.ORDPAYINFO_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOrdpayinfoId(BigDecimal ordpayinfoId) {
        this.ordpayinfoId = ordpayinfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ORDPAYINFO.ORDERS_ID
     *
     * @return the value of EMDI.ORDPAYINFO.ORDERS_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOrdersId() {
        return ordersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ORDPAYINFO.ORDERS_ID
     *
     * @param ordersId the value for EMDI.ORDPAYINFO.ORDERS_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOrdersId(BigDecimal ordersId) {
        this.ordersId = ordersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ORDPAYINFO.NAME
     *
     * @return the value of EMDI.ORDPAYINFO.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ORDPAYINFO.NAME
     *
     * @param name the value for EMDI.ORDPAYINFO.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ORDPAYINFO.VALUE
     *
     * @return the value of EMDI.ORDPAYINFO.VALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ORDPAYINFO.VALUE
     *
     * @param value the value for EMDI.ORDPAYINFO.VALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.ORDPAYINFO.OPTCOUNTER
     *
     * @return the value of EMDI.ORDPAYINFO.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.ORDPAYINFO.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.ORDPAYINFO.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}