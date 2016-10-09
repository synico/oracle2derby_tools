package com.avn.dataload.model.emdi;

public class CountcodeKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.COUNTCODE.PRODUCTVENDOR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String productvendor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.COUNTCODE.COUNTRYABBR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String countryabbr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.COUNTCODE.PRODUCTVENDOR
     *
     * @return the value of EMDI.COUNTCODE.PRODUCTVENDOR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getProductvendor() {
        return productvendor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.COUNTCODE.PRODUCTVENDOR
     *
     * @param productvendor the value for EMDI.COUNTCODE.PRODUCTVENDOR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setProductvendor(String productvendor) {
        this.productvendor = productvendor == null ? null : productvendor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.COUNTCODE.COUNTRYABBR
     *
     * @return the value of EMDI.COUNTCODE.COUNTRYABBR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getCountryabbr() {
        return countryabbr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.COUNTCODE.COUNTRYABBR
     *
     * @param countryabbr the value for EMDI.COUNTCODE.COUNTRYABBR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setCountryabbr(String countryabbr) {
        this.countryabbr = countryabbr == null ? null : countryabbr.trim();
    }
}