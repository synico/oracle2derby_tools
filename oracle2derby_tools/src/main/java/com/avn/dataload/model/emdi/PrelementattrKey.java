package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class PrelementattrKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PRELEMENTATTR.PRELEMENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal prelementId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PRELEMENTATTR.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PRELEMENTATTR.VALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String value;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PRELEMENTATTR.PRELEMENT_ID
     *
     * @return the value of EMDI.PRELEMENTATTR.PRELEMENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getPrelementId() {
        return prelementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PRELEMENTATTR.PRELEMENT_ID
     *
     * @param prelementId the value for EMDI.PRELEMENTATTR.PRELEMENT_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPrelementId(BigDecimal prelementId) {
        this.prelementId = prelementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PRELEMENTATTR.NAME
     *
     * @return the value of EMDI.PRELEMENTATTR.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PRELEMENTATTR.NAME
     *
     * @param name the value for EMDI.PRELEMENTATTR.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PRELEMENTATTR.VALUE
     *
     * @return the value of EMDI.PRELEMENTATTR.VALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PRELEMENTATTR.VALUE
     *
     * @param value the value for EMDI.PRELEMENTATTR.VALUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}