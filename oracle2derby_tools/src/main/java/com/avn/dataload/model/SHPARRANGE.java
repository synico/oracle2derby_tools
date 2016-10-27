package com.avn.dataload.model;

public class SHPARRANGE {


    private java.math.BigDecimal SHPARRANGE_ID;
    
    public void setSHPARRANGE_ID(java.math.BigDecimal SHPARRANGE_ID) {
        this.SHPARRANGE_ID = SHPARRANGE_ID;
    }
    
    public java.math.BigDecimal getSHPARRANGE_ID() {
        return this.SHPARRANGE_ID;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
    }
      

    private java.math.BigDecimal FFMCENTER_ID;
    
    public void setFFMCENTER_ID(java.math.BigDecimal FFMCENTER_ID) {
        this.FFMCENTER_ID = FFMCENTER_ID;
    }
    
    public java.math.BigDecimal getFFMCENTER_ID() {
        return this.FFMCENTER_ID;
    }
      

    private java.math.BigDecimal SHIPMODE_ID;
    
    public void setSHIPMODE_ID(java.math.BigDecimal SHIPMODE_ID) {
        this.SHIPMODE_ID = SHIPMODE_ID;
    }
    
    public java.math.BigDecimal getSHIPMODE_ID() {
        return this.SHIPMODE_ID;
    }
      

    private java.sql.Timestamp STARTDATE;
    
    public void setSTARTDATE(java.sql.Timestamp STARTDATE) {
        this.STARTDATE = STARTDATE;
    }
    
    public java.sql.Timestamp getSTARTDATE() {
        return this.STARTDATE;
    }
      

    private java.sql.Timestamp ENDDATE;
    
    public void setENDDATE(java.sql.Timestamp ENDDATE) {
        this.ENDDATE = ENDDATE;
    }
    
    public java.sql.Timestamp getENDDATE() {
        return this.ENDDATE;
    }
      

    private java.lang.String TRACKINGNUMBER;
    
    public void setTRACKINGNUMBER(java.lang.String TRACKINGNUMBER) {
        this.TRACKINGNUMBER = TRACKINGNUMBER;
    }
    
    public java.lang.String getTRACKINGNUMBER() {
        return this.TRACKINGNUMBER;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.math.BigDecimal PRECEDENCE;
    
    public void setPRECEDENCE(java.math.BigDecimal PRECEDENCE) {
        this.PRECEDENCE = PRECEDENCE;
    }
    
    public java.math.BigDecimal getPRECEDENCE() {
        return this.PRECEDENCE;
    }
      

    private java.math.BigDecimal FIELD2;
    
    public void setFIELD2(java.math.BigDecimal FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.math.BigDecimal getFIELD2() {
        return this.FIELD2;
    }
      

    private java.math.BigDecimal FLAGS;
    
    public void setFLAGS(java.math.BigDecimal FLAGS) {
        this.FLAGS = FLAGS;
    }
    
    public java.math.BigDecimal getFLAGS() {
        return this.FLAGS;
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
        result.append("SHPARRANGE_ID: " + getSHPARRANGE_ID() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("FFMCENTER_ID: " + getFFMCENTER_ID() + "||");
        result.append("SHIPMODE_ID: " + getSHIPMODE_ID() + "||");
        result.append("STARTDATE: " + getSTARTDATE() + "||");
        result.append("ENDDATE: " + getENDDATE() + "||");
        result.append("TRACKINGNUMBER: " + getTRACKINGNUMBER() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("PRECEDENCE: " + getPRECEDENCE() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FLAGS: " + getFLAGS() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}