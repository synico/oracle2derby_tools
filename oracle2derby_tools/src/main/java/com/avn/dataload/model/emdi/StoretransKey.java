package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class StoretransKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STORETRANS.TRANSPORT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal transportId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STORETRANS.STORE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal storeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STORETRANS.TRANSPORT_ID
     *
     * @return the value of EMDI.STORETRANS.TRANSPORT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getTransportId() {
        return transportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STORETRANS.TRANSPORT_ID
     *
     * @param transportId the value for EMDI.STORETRANS.TRANSPORT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setTransportId(BigDecimal transportId) {
        this.transportId = transportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STORETRANS.STORE_ID
     *
     * @return the value of EMDI.STORETRANS.STORE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STORETRANS.STORE_ID
     *
     * @param storeId the value for EMDI.STORETRANS.STORE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStoreId(BigDecimal storeId) {
        this.storeId = storeId;
    }
}