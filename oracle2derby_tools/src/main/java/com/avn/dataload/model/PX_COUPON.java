package com.avn.dataload.model;

public class PX_COUPON {


    private java.math.BigDecimal PX_COUPON_ID;
    
    public void setPX_COUPON_ID(java.math.BigDecimal PX_COUPON_ID) {
        this.PX_COUPON_ID = PX_COUPON_ID;
    }
    
    public java.math.BigDecimal getPX_COUPON_ID() {
        return this.PX_COUPON_ID;
    }
      

    private java.math.BigDecimal USERS_ID;
    
    public void setUSERS_ID(java.math.BigDecimal USERS_ID) {
        this.USERS_ID = USERS_ID;
    }
    
    public java.math.BigDecimal getUSERS_ID() {
        return this.USERS_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal VERSION;
    
    public void setVERSION(java.math.BigDecimal VERSION) {
        this.VERSION = VERSION;
    }
    
    public java.math.BigDecimal getVERSION() {
        return this.VERSION;
    }
      

    private java.sql.Timestamp EFFECTIVE;
    
    public void setEFFECTIVE(java.sql.Timestamp EFFECTIVE) {
        this.EFFECTIVE = EFFECTIVE;
    }
    
    public java.sql.Timestamp getEFFECTIVE() {
        return this.EFFECTIVE;
    }
      

    private java.sql.Timestamp EXPIRE;
    
    public void setEXPIRE(java.sql.Timestamp EXPIRE) {
        this.EXPIRE = EXPIRE;
    }
    
    public java.sql.Timestamp getEXPIRE() {
        return this.EXPIRE;
    }
      

    private java.math.BigDecimal STATUS;
    
    public void setSTATUS(java.math.BigDecimal STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.math.BigDecimal getSTATUS() {
        return this.STATUS;
    }
      

    private java.math.BigDecimal ORDERS_ID;
    
    public void setORDERS_ID(java.math.BigDecimal ORDERS_ID) {
        this.ORDERS_ID = ORDERS_ID;
    }
    
    public java.math.BigDecimal getORDERS_ID() {
        return this.ORDERS_ID;
    }
      

    private java.lang.String GUESTID;
    
    public void setGUESTID(java.lang.String GUESTID) {
        this.GUESTID = GUESTID;
    }
    
    public java.lang.String getGUESTID() {
        return this.GUESTID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String CODE;
    
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }
    
    public java.lang.String getCODE() {
        return this.CODE;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("PX_COUPON_ID: " + getPX_COUPON_ID() + "||");
        result.append("USERS_ID: " + getUSERS_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("VERSION: " + getVERSION() + "||");
        result.append("EFFECTIVE: " + getEFFECTIVE() + "||");
        result.append("EXPIRE: " + getEXPIRE() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("ORDERS_ID: " + getORDERS_ID() + "||");
        result.append("GUESTID: " + getGUESTID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("CODE: " + getCODE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}