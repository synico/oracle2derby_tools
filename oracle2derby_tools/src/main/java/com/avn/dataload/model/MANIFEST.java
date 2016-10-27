package com.avn.dataload.model;

public class MANIFEST {


    private java.math.BigDecimal MANIFEST_ID;
    
    public void setMANIFEST_ID(java.math.BigDecimal MANIFEST_ID) {
        this.MANIFEST_ID = MANIFEST_ID;
    }
    
    public java.math.BigDecimal getMANIFEST_ID() {
        return this.MANIFEST_ID;
    }
      

    private java.math.BigDecimal ORDRELEASENUM;
    
    public void setORDRELEASENUM(java.math.BigDecimal ORDRELEASENUM) {
        this.ORDRELEASENUM = ORDRELEASENUM;
    }
    
    public java.math.BigDecimal getORDRELEASENUM() {
        return this.ORDRELEASENUM;
    }
      

    private java.lang.String WEIGHTMEASURE;
    
    public void setWEIGHTMEASURE(java.lang.String WEIGHTMEASURE) {
        this.WEIGHTMEASURE = WEIGHTMEASURE;
    }
    
    public java.lang.String getWEIGHTMEASURE() {
        return this.WEIGHTMEASURE;
    }
      

    private java.lang.String SETCCURR;
    
    public void setSETCCURR(java.lang.String SETCCURR) {
        this.SETCCURR = SETCCURR;
    }
    
    public java.lang.String getSETCCURR() {
        return this.SETCCURR;
    }
      

    private java.math.BigDecimal SHIPMODE_ID;
    
    public void setSHIPMODE_ID(java.math.BigDecimal SHIPMODE_ID) {
        this.SHIPMODE_ID = SHIPMODE_ID;
    }
    
    public java.math.BigDecimal getSHIPMODE_ID() {
        return this.SHIPMODE_ID;
    }
      

    private java.math.BigDecimal WEIGHT;
    
    public void setWEIGHT(java.math.BigDecimal WEIGHT) {
        this.WEIGHT = WEIGHT;
    }
    
    public java.math.BigDecimal getWEIGHT() {
        return this.WEIGHT;
    }
      

    private java.lang.String MANIFESTSTATUS;
    
    public void setMANIFESTSTATUS(java.lang.String MANIFESTSTATUS) {
        this.MANIFESTSTATUS = MANIFESTSTATUS;
    }
    
    public java.lang.String getMANIFESTSTATUS() {
        return this.MANIFESTSTATUS;
    }
      

    private java.math.BigDecimal SHIPPINGCOSTS;
    
    public void setSHIPPINGCOSTS(java.math.BigDecimal SHIPPINGCOSTS) {
        this.SHIPPINGCOSTS = SHIPPINGCOSTS;
    }
    
    public java.math.BigDecimal getSHIPPINGCOSTS() {
        return this.SHIPPINGCOSTS;
    }
      

    private java.sql.Timestamp DATESHIPPED;
    
    public void setDATESHIPPED(java.sql.Timestamp DATESHIPPED) {
        this.DATESHIPPED = DATESHIPPED;
    }
    
    public java.sql.Timestamp getDATESHIPPED() {
        return this.DATESHIPPED;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
    }
      

    private java.lang.String PACKAGEID;
    
    public void setPACKAGEID(java.lang.String PACKAGEID) {
        this.PACKAGEID = PACKAGEID;
    }
    
    public java.lang.String getPACKAGEID() {
        return this.PACKAGEID;
    }
      

    private java.lang.String TRACKINGID;
    
    public void setTRACKINGID(java.lang.String TRACKINGID) {
        this.TRACKINGID = TRACKINGID;
    }
    
    public java.lang.String getTRACKINGID() {
        return this.TRACKINGID;
    }
      

    private java.lang.String PICKUPRECORDID;
    
    public void setPICKUPRECORDID(java.lang.String PICKUPRECORDID) {
        this.PICKUPRECORDID = PICKUPRECORDID;
    }
    
    public java.lang.String getPICKUPRECORDID() {
        return this.PICKUPRECORDID;
    }
      

    private java.math.BigDecimal ORDERS_ID;
    
    public void setORDERS_ID(java.math.BigDecimal ORDERS_ID) {
        this.ORDERS_ID = ORDERS_ID;
    }
    
    public java.math.BigDecimal getORDERS_ID() {
        return this.ORDERS_ID;
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
        result.append("MANIFEST_ID: " + getMANIFEST_ID() + "||");
        result.append("ORDRELEASENUM: " + getORDRELEASENUM() + "||");
        result.append("WEIGHTMEASURE: " + getWEIGHTMEASURE() + "||");
        result.append("SETCCURR: " + getSETCCURR() + "||");
        result.append("SHIPMODE_ID: " + getSHIPMODE_ID() + "||");
        result.append("WEIGHT: " + getWEIGHT() + "||");
        result.append("MANIFESTSTATUS: " + getMANIFESTSTATUS() + "||");
        result.append("SHIPPINGCOSTS: " + getSHIPPINGCOSTS() + "||");
        result.append("DATESHIPPED: " + getDATESHIPPED() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("PACKAGEID: " + getPACKAGEID() + "||");
        result.append("TRACKINGID: " + getTRACKINGID() + "||");
        result.append("PICKUPRECORDID: " + getPICKUPRECORDID() + "||");
        result.append("ORDERS_ID: " + getORDERS_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}