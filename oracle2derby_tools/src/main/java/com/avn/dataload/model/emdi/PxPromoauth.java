package com.avn.dataload.model.emdi;

import java.math.BigDecimal;
import java.util.Date;

public class PxPromoauth {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.PX_PROMOTION_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal pxPromotionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.COMMENTS
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String comments;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.PROMOTIONTYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String promotiontype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.DAILYSTARTTIME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private Date dailystarttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.DAILYENDTIME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private Date dailyendtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.WEEKDAY_SUN
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal weekdaySun;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.WEEKDAY_MON
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal weekdayMon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.WEEKDAY_TUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal weekdayTue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.WEEKDAY_WED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal weekdayWed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.WEEKDAY_THU
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal weekdayThu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.WEEKDAY_FRI
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal weekdayFri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.WEEKDAY_SAT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal weekdaySat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.CTLPARAM
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String ctlparam;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.PX_PROMOAUTH.ADMINSTVENAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String adminstvename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.PX_PROMOTION_ID
     *
     * @return the value of EMDI.PX_PROMOAUTH.PX_PROMOTION_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getPxPromotionId() {
        return pxPromotionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.PX_PROMOTION_ID
     *
     * @param pxPromotionId the value for EMDI.PX_PROMOAUTH.PX_PROMOTION_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPxPromotionId(BigDecimal pxPromotionId) {
        this.pxPromotionId = pxPromotionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.COMMENTS
     *
     * @return the value of EMDI.PX_PROMOAUTH.COMMENTS
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.COMMENTS
     *
     * @param comments the value for EMDI.PX_PROMOAUTH.COMMENTS
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.PROMOTIONTYPE
     *
     * @return the value of EMDI.PX_PROMOAUTH.PROMOTIONTYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getPromotiontype() {
        return promotiontype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.PROMOTIONTYPE
     *
     * @param promotiontype the value for EMDI.PX_PROMOAUTH.PROMOTIONTYPE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPromotiontype(String promotiontype) {
        this.promotiontype = promotiontype == null ? null : promotiontype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.DAILYSTARTTIME
     *
     * @return the value of EMDI.PX_PROMOAUTH.DAILYSTARTTIME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public Date getDailystarttime() {
        return dailystarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.DAILYSTARTTIME
     *
     * @param dailystarttime the value for EMDI.PX_PROMOAUTH.DAILYSTARTTIME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDailystarttime(Date dailystarttime) {
        this.dailystarttime = dailystarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.DAILYENDTIME
     *
     * @return the value of EMDI.PX_PROMOAUTH.DAILYENDTIME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public Date getDailyendtime() {
        return dailyendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.DAILYENDTIME
     *
     * @param dailyendtime the value for EMDI.PX_PROMOAUTH.DAILYENDTIME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setDailyendtime(Date dailyendtime) {
        this.dailyendtime = dailyendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_SUN
     *
     * @return the value of EMDI.PX_PROMOAUTH.WEEKDAY_SUN
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getWeekdaySun() {
        return weekdaySun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_SUN
     *
     * @param weekdaySun the value for EMDI.PX_PROMOAUTH.WEEKDAY_SUN
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setWeekdaySun(BigDecimal weekdaySun) {
        this.weekdaySun = weekdaySun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_MON
     *
     * @return the value of EMDI.PX_PROMOAUTH.WEEKDAY_MON
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getWeekdayMon() {
        return weekdayMon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_MON
     *
     * @param weekdayMon the value for EMDI.PX_PROMOAUTH.WEEKDAY_MON
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setWeekdayMon(BigDecimal weekdayMon) {
        this.weekdayMon = weekdayMon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_TUE
     *
     * @return the value of EMDI.PX_PROMOAUTH.WEEKDAY_TUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getWeekdayTue() {
        return weekdayTue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_TUE
     *
     * @param weekdayTue the value for EMDI.PX_PROMOAUTH.WEEKDAY_TUE
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setWeekdayTue(BigDecimal weekdayTue) {
        this.weekdayTue = weekdayTue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_WED
     *
     * @return the value of EMDI.PX_PROMOAUTH.WEEKDAY_WED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getWeekdayWed() {
        return weekdayWed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_WED
     *
     * @param weekdayWed the value for EMDI.PX_PROMOAUTH.WEEKDAY_WED
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setWeekdayWed(BigDecimal weekdayWed) {
        this.weekdayWed = weekdayWed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_THU
     *
     * @return the value of EMDI.PX_PROMOAUTH.WEEKDAY_THU
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getWeekdayThu() {
        return weekdayThu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_THU
     *
     * @param weekdayThu the value for EMDI.PX_PROMOAUTH.WEEKDAY_THU
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setWeekdayThu(BigDecimal weekdayThu) {
        this.weekdayThu = weekdayThu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_FRI
     *
     * @return the value of EMDI.PX_PROMOAUTH.WEEKDAY_FRI
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getWeekdayFri() {
        return weekdayFri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_FRI
     *
     * @param weekdayFri the value for EMDI.PX_PROMOAUTH.WEEKDAY_FRI
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setWeekdayFri(BigDecimal weekdayFri) {
        this.weekdayFri = weekdayFri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_SAT
     *
     * @return the value of EMDI.PX_PROMOAUTH.WEEKDAY_SAT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getWeekdaySat() {
        return weekdaySat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.WEEKDAY_SAT
     *
     * @param weekdaySat the value for EMDI.PX_PROMOAUTH.WEEKDAY_SAT
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setWeekdaySat(BigDecimal weekdaySat) {
        this.weekdaySat = weekdaySat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.CTLPARAM
     *
     * @return the value of EMDI.PX_PROMOAUTH.CTLPARAM
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getCtlparam() {
        return ctlparam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.CTLPARAM
     *
     * @param ctlparam the value for EMDI.PX_PROMOAUTH.CTLPARAM
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setCtlparam(String ctlparam) {
        this.ctlparam = ctlparam == null ? null : ctlparam.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.OPTCOUNTER
     *
     * @return the value of EMDI.PX_PROMOAUTH.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.PX_PROMOAUTH.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.PX_PROMOAUTH.ADMINSTVENAME
     *
     * @return the value of EMDI.PX_PROMOAUTH.ADMINSTVENAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getAdminstvename() {
        return adminstvename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.PX_PROMOAUTH.ADMINSTVENAME
     *
     * @param adminstvename the value for EMDI.PX_PROMOAUTH.ADMINSTVENAME
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setAdminstvename(String adminstvename) {
        this.adminstvename = adminstvename == null ? null : adminstvename.trim();
    }
}