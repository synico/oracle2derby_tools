package com.avn.dataload.model;

public class XINVOICE {


    private java.math.BigDecimal XINVOICE_ID;
    
    public void setXINVOICE_ID(java.math.BigDecimal XINVOICE_ID) {
        this.XINVOICE_ID = XINVOICE_ID;
    }
    
    public java.math.BigDecimal getXINVOICE_ID() {
        return this.XINVOICE_ID;
    }
      

    private java.sql.Timestamp XINVOICE_DATE;
    
    public void setXINVOICE_DATE(java.sql.Timestamp XINVOICE_DATE) {
        this.XINVOICE_DATE = XINVOICE_DATE;
    }
    
    public java.sql.Timestamp getXINVOICE_DATE() {
        return this.XINVOICE_DATE;
    }
      

    private java.math.BigDecimal XINVOICE_AMT;
    
    public void setXINVOICE_AMT(java.math.BigDecimal XINVOICE_AMT) {
        this.XINVOICE_AMT = XINVOICE_AMT;
    }
    
    public java.math.BigDecimal getXINVOICE_AMT() {
        return this.XINVOICE_AMT;
    }
      

    private java.math.BigDecimal ORDERS_ID;
    
    public void setORDERS_ID(java.math.BigDecimal ORDERS_ID) {
        this.ORDERS_ID = ORDERS_ID;
    }
    
    public java.math.BigDecimal getORDERS_ID() {
        return this.ORDERS_ID;
    }
      

    private java.math.BigDecimal ORDRELEASENUM;
    
    public void setORDRELEASENUM(java.math.BigDecimal ORDRELEASENUM) {
        this.ORDRELEASENUM = ORDRELEASENUM;
    }
    
    public java.math.BigDecimal getORDRELEASENUM() {
        return this.ORDRELEASENUM;
    }
      

    private java.lang.String STATUS;
    
    public void setSTATUS(java.lang.String STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.lang.String getSTATUS() {
        return this.STATUS;
    }
      

    private java.math.BigDecimal FIELD1;
    
    public void setFIELD1(java.math.BigDecimal FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.math.BigDecimal getFIELD1() {
        return this.FIELD1;
    }
      

    private java.math.BigDecimal FIELD2;
    
    public void setFIELD2(java.math.BigDecimal FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.math.BigDecimal getFIELD2() {
        return this.FIELD2;
    }
      

    private java.lang.String FIELD3;
    
    public void setFIELD3(java.lang.String FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.lang.String getFIELD3() {
        return this.FIELD3;
    }
      

    private java.sql.Timestamp FIELD4;
    
    public void setFIELD4(java.sql.Timestamp FIELD4) {
        this.FIELD4 = FIELD4;
    }
    
    public java.sql.Timestamp getFIELD4() {
        return this.FIELD4;
    }
      

    private java.lang.String FIELD5;
    
    public void setFIELD5(java.lang.String FIELD5) {
        this.FIELD5 = FIELD5;
    }
    
    public java.lang.String getFIELD5() {
        return this.FIELD5;
    }
      

    private java.lang.String FIELD6;
    
    public void setFIELD6(java.lang.String FIELD6) {
        this.FIELD6 = FIELD6;
    }
    
    public java.lang.String getFIELD6() {
        return this.FIELD6;
    }
      

    private java.lang.String EMAIL_FLAG;
    
    public void setEMAIL_FLAG(java.lang.String EMAIL_FLAG) {
        this.EMAIL_FLAG = EMAIL_FLAG;
    }
    
    public java.lang.String getEMAIL_FLAG() {
        return this.EMAIL_FLAG;
    }
      

    private java.sql.Timestamp EMAIL_SENT_TIME;
    
    public void setEMAIL_SENT_TIME(java.sql.Timestamp EMAIL_SENT_TIME) {
        this.EMAIL_SENT_TIME = EMAIL_SENT_TIME;
    }
    
    public java.sql.Timestamp getEMAIL_SENT_TIME() {
        return this.EMAIL_SENT_TIME;
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
        result.append("XINVOICE_ID: " + getXINVOICE_ID() + "||");
        result.append("XINVOICE_DATE: " + getXINVOICE_DATE() + "||");
        result.append("XINVOICE_AMT: " + getXINVOICE_AMT() + "||");
        result.append("ORDERS_ID: " + getORDERS_ID() + "||");
        result.append("ORDRELEASENUM: " + getORDRELEASENUM() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("FIELD4: " + getFIELD4() + "||");
        result.append("FIELD5: " + getFIELD5() + "||");
        result.append("FIELD6: " + getFIELD6() + "||");
        result.append("EMAIL_FLAG: " + getEMAIL_FLAG() + "||");
        result.append("EMAIL_SENT_TIME: " + getEMAIL_SENT_TIME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}