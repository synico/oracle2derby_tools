package com.avn.dataload.model.emdi;

public class DsrSalesOrderSubset1Key {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.DSR_SALES_ORDER_SUBSET1.LINE_ITEM_NBR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String lineItemNbr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.DSR_SALES_ORDER_SUBSET1.SCN
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String scn;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.DSR_SALES_ORDER_SUBSET1.LINE_ITEM_NBR
     *
     * @return the value of EMDI.DSR_SALES_ORDER_SUBSET1.LINE_ITEM_NBR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getLineItemNbr() {
        return lineItemNbr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.DSR_SALES_ORDER_SUBSET1.LINE_ITEM_NBR
     *
     * @param lineItemNbr the value for EMDI.DSR_SALES_ORDER_SUBSET1.LINE_ITEM_NBR
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLineItemNbr(String lineItemNbr) {
        this.lineItemNbr = lineItemNbr == null ? null : lineItemNbr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.DSR_SALES_ORDER_SUBSET1.SCN
     *
     * @return the value of EMDI.DSR_SALES_ORDER_SUBSET1.SCN
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getScn() {
        return scn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.DSR_SALES_ORDER_SUBSET1.SCN
     *
     * @param scn the value for EMDI.DSR_SALES_ORDER_SUBSET1.SCN
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setScn(String scn) {
        this.scn = scn == null ? null : scn.trim();
    }
}