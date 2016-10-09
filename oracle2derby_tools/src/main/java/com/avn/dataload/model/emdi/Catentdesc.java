package com.avn.dataload.model.emdi;

import java.math.BigDecimal;
import java.util.Date;

public class Catentdesc extends CatentdescKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTDESC.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTDESC.SHORTDESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String shortdescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTDESC.LONGDESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String longdescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTDESC.THUMBNAIL
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String thumbnail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTDESC.AUXDESCRIPTION1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String auxdescription1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTDESC.FULLIMAGE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String fullimage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTDESC.AUXDESCRIPTION2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String auxdescription2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTDESC.XMLDETAIL
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String xmldetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTDESC.AVAILABLE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal available;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTDESC.PUBLISHED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal published;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTDESC.AVAILABILITYDATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private Date availabilitydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTDESC.KEYWORD
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String keyword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.CATENTDESC.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTDESC.NAME
     *
     * @return the value of EMDI.CATENTDESC.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTDESC.NAME
     *
     * @param name the value for EMDI.CATENTDESC.NAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTDESC.SHORTDESCRIPTION
     *
     * @return the value of EMDI.CATENTDESC.SHORTDESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getShortdescription() {
        return shortdescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTDESC.SHORTDESCRIPTION
     *
     * @param shortdescription the value for EMDI.CATENTDESC.SHORTDESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setShortdescription(String shortdescription) {
        this.shortdescription = shortdescription == null ? null : shortdescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTDESC.LONGDESCRIPTION
     *
     * @return the value of EMDI.CATENTDESC.LONGDESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getLongdescription() {
        return longdescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTDESC.LONGDESCRIPTION
     *
     * @param longdescription the value for EMDI.CATENTDESC.LONGDESCRIPTION
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setLongdescription(String longdescription) {
        this.longdescription = longdescription == null ? null : longdescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTDESC.THUMBNAIL
     *
     * @return the value of EMDI.CATENTDESC.THUMBNAIL
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTDESC.THUMBNAIL
     *
     * @param thumbnail the value for EMDI.CATENTDESC.THUMBNAIL
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTDESC.AUXDESCRIPTION1
     *
     * @return the value of EMDI.CATENTDESC.AUXDESCRIPTION1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getAuxdescription1() {
        return auxdescription1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTDESC.AUXDESCRIPTION1
     *
     * @param auxdescription1 the value for EMDI.CATENTDESC.AUXDESCRIPTION1
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setAuxdescription1(String auxdescription1) {
        this.auxdescription1 = auxdescription1 == null ? null : auxdescription1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTDESC.FULLIMAGE
     *
     * @return the value of EMDI.CATENTDESC.FULLIMAGE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getFullimage() {
        return fullimage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTDESC.FULLIMAGE
     *
     * @param fullimage the value for EMDI.CATENTDESC.FULLIMAGE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setFullimage(String fullimage) {
        this.fullimage = fullimage == null ? null : fullimage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTDESC.AUXDESCRIPTION2
     *
     * @return the value of EMDI.CATENTDESC.AUXDESCRIPTION2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getAuxdescription2() {
        return auxdescription2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTDESC.AUXDESCRIPTION2
     *
     * @param auxdescription2 the value for EMDI.CATENTDESC.AUXDESCRIPTION2
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setAuxdescription2(String auxdescription2) {
        this.auxdescription2 = auxdescription2 == null ? null : auxdescription2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTDESC.XMLDETAIL
     *
     * @return the value of EMDI.CATENTDESC.XMLDETAIL
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getXmldetail() {
        return xmldetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTDESC.XMLDETAIL
     *
     * @param xmldetail the value for EMDI.CATENTDESC.XMLDETAIL
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setXmldetail(String xmldetail) {
        this.xmldetail = xmldetail == null ? null : xmldetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTDESC.AVAILABLE
     *
     * @return the value of EMDI.CATENTDESC.AVAILABLE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getAvailable() {
        return available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTDESC.AVAILABLE
     *
     * @param available the value for EMDI.CATENTDESC.AVAILABLE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setAvailable(BigDecimal available) {
        this.available = available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTDESC.PUBLISHED
     *
     * @return the value of EMDI.CATENTDESC.PUBLISHED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getPublished() {
        return published;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTDESC.PUBLISHED
     *
     * @param published the value for EMDI.CATENTDESC.PUBLISHED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPublished(BigDecimal published) {
        this.published = published;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTDESC.AVAILABILITYDATE
     *
     * @return the value of EMDI.CATENTDESC.AVAILABILITYDATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public Date getAvailabilitydate() {
        return availabilitydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTDESC.AVAILABILITYDATE
     *
     * @param availabilitydate the value for EMDI.CATENTDESC.AVAILABILITYDATE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setAvailabilitydate(Date availabilitydate) {
        this.availabilitydate = availabilitydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTDESC.KEYWORD
     *
     * @return the value of EMDI.CATENTDESC.KEYWORD
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTDESC.KEYWORD
     *
     * @param keyword the value for EMDI.CATENTDESC.KEYWORD
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.CATENTDESC.OPTCOUNTER
     *
     * @return the value of EMDI.CATENTDESC.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.CATENTDESC.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.CATENTDESC.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}