package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class OfferpriceKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.OFFERPRICE.CURRENCY
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String currency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.OFFERPRICE.OFFER_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal offerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.OFFERPRICE.CURRENCY
     *
     * @return the value of EMDI.OFFERPRICE.CURRENCY
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.OFFERPRICE.CURRENCY
     *
     * @param currency the value for EMDI.OFFERPRICE.CURRENCY
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.OFFERPRICE.OFFER_ID
     *
     * @return the value of EMDI.OFFERPRICE.OFFER_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOfferId() {
        return offerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.OFFERPRICE.OFFER_ID
     *
     * @param offerId the value for EMDI.OFFERPRICE.OFFER_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOfferId(BigDecimal offerId) {
        this.offerId = offerId;
    }
}