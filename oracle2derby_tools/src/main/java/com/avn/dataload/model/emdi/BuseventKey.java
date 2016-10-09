package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class BuseventKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.BUSEVENT.BUSEVENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal buseventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.BUSEVENT.SEQUENCE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal sequence;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.BUSEVENT.BUSEVENT_ID
     *
     * @return the value of EMDI.BUSEVENT.BUSEVENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getBuseventId() {
        return buseventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.BUSEVENT.BUSEVENT_ID
     *
     * @param buseventId the value for EMDI.BUSEVENT.BUSEVENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setBuseventId(BigDecimal buseventId) {
        this.buseventId = buseventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.BUSEVENT.SEQUENCE
     *
     * @return the value of EMDI.BUSEVENT.SEQUENCE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getSequence() {
        return sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.BUSEVENT.SEQUENCE
     *
     * @param sequence the value for EMDI.BUSEVENT.SEQUENCE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setSequence(BigDecimal sequence) {
        this.sequence = sequence;
    }
}