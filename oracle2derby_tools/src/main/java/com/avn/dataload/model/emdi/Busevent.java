package com.avn.dataload.model.emdi;

import java.math.BigDecimal;
import java.util.Date;

public class Busevent extends BuseventKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.BUSEVENT.CREATETSTMP
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private Date createtstmp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.BUSEVENT.EVENTDATA
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String eventdata;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.BUSEVENT.CHECKED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal checked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.BUSEVENT.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.BUSEVENT.EVENT_SEARCHKEY
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String eventSearchkey;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.BUSEVENT.CREATETSTMP
     *
     * @return the value of EMDI.BUSEVENT.CREATETSTMP
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public Date getCreatetstmp() {
        return createtstmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.BUSEVENT.CREATETSTMP
     *
     * @param createtstmp the value for EMDI.BUSEVENT.CREATETSTMP
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setCreatetstmp(Date createtstmp) {
        this.createtstmp = createtstmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.BUSEVENT.EVENTDATA
     *
     * @return the value of EMDI.BUSEVENT.EVENTDATA
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getEventdata() {
        return eventdata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.BUSEVENT.EVENTDATA
     *
     * @param eventdata the value for EMDI.BUSEVENT.EVENTDATA
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setEventdata(String eventdata) {
        this.eventdata = eventdata == null ? null : eventdata.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.BUSEVENT.CHECKED
     *
     * @return the value of EMDI.BUSEVENT.CHECKED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getChecked() {
        return checked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.BUSEVENT.CHECKED
     *
     * @param checked the value for EMDI.BUSEVENT.CHECKED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setChecked(BigDecimal checked) {
        this.checked = checked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.BUSEVENT.OPTCOUNTER
     *
     * @return the value of EMDI.BUSEVENT.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.BUSEVENT.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.BUSEVENT.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.BUSEVENT.EVENT_SEARCHKEY
     *
     * @return the value of EMDI.BUSEVENT.EVENT_SEARCHKEY
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getEventSearchkey() {
        return eventSearchkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.BUSEVENT.EVENT_SEARCHKEY
     *
     * @param eventSearchkey the value for EMDI.BUSEVENT.EVENT_SEARCHKEY
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setEventSearchkey(String eventSearchkey) {
        this.eventSearchkey = eventSearchkey == null ? null : eventSearchkey.trim();
    }
}