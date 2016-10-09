package com.avn.dataload.model.emdi;

public class StatecodeKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STATECODE.PRODUCTVENDOR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String productvendor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.STATECODE.STATEPROVABBR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String stateprovabbr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STATECODE.PRODUCTVENDOR
     *
     * @return the value of EMDI.STATECODE.PRODUCTVENDOR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getProductvendor() {
        return productvendor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STATECODE.PRODUCTVENDOR
     *
     * @param productvendor the value for EMDI.STATECODE.PRODUCTVENDOR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setProductvendor(String productvendor) {
        this.productvendor = productvendor == null ? null : productvendor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.STATECODE.STATEPROVABBR
     *
     * @return the value of EMDI.STATECODE.STATEPROVABBR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getStateprovabbr() {
        return stateprovabbr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.STATECODE.STATEPROVABBR
     *
     * @param stateprovabbr the value for EMDI.STATECODE.STATEPROVABBR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setStateprovabbr(String stateprovabbr) {
        this.stateprovabbr = stateprovabbr == null ? null : stateprovabbr.trim();
    }
}