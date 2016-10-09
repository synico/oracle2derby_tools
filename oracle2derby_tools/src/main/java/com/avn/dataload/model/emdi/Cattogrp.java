package com.avn.dataload.model.emdi;

import java.math.BigDecimal;
import java.util.Date;

public class Cattogrp extends CattogrpKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATTOGRP.LASTUPDATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private Date lastupdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATTOGRP.SEQUENCE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal sequence;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATTOGRP.CATALOG_ID_LINK
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal catalogIdLink;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATTOGRP.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATTOGRP.LASTUPDATE
     *
     * @return the value of EMDI.CATTOGRP.LASTUPDATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public Date getLastupdate() {
        return lastupdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATTOGRP.LASTUPDATE
     *
     * @param lastupdate the value for EMDI.CATTOGRP.LASTUPDATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATTOGRP.SEQUENCE
     *
     * @return the value of EMDI.CATTOGRP.SEQUENCE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getSequence() {
        return sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATTOGRP.SEQUENCE
     *
     * @param sequence the value for EMDI.CATTOGRP.SEQUENCE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setSequence(BigDecimal sequence) {
        this.sequence = sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATTOGRP.CATALOG_ID_LINK
     *
     * @return the value of EMDI.CATTOGRP.CATALOG_ID_LINK
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getCatalogIdLink() {
        return catalogIdLink;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATTOGRP.CATALOG_ID_LINK
     *
     * @param catalogIdLink the value for EMDI.CATTOGRP.CATALOG_ID_LINK
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setCatalogIdLink(BigDecimal catalogIdLink) {
        this.catalogIdLink = catalogIdLink;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATTOGRP.OPTCOUNTER
     *
     * @return the value of EMDI.CATTOGRP.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATTOGRP.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.CATTOGRP.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}