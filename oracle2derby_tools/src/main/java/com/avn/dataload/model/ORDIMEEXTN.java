package com.avn.dataload.model;

public class ORDIMEEXTN {


    private java.math.BigDecimal ORDERITEMS_ID;
    
    public void setORDERITEMS_ID(java.math.BigDecimal ORDERITEMS_ID) {
        this.ORDERITEMS_ID = ORDERITEMS_ID;
    }
    
    public java.math.BigDecimal getORDERITEMS_ID() {
        return this.ORDERITEMS_ID;
    }
      

    private java.sql.Timestamp REQUESTEDSHIPTIME;
    
    public void setREQUESTEDSHIPTIME(java.sql.Timestamp REQUESTEDSHIPTIME) {
        this.REQUESTEDSHIPTIME = REQUESTEDSHIPTIME;
    }
    
    public java.sql.Timestamp getREQUESTEDSHIPTIME() {
        return this.REQUESTEDSHIPTIME;
    }
      

    private java.lang.String SHIPASCOMPLETE;
    
    public void setSHIPASCOMPLETE(java.lang.String SHIPASCOMPLETE) {
        this.SHIPASCOMPLETE = SHIPASCOMPLETE;
    }
    
    public java.lang.String getSHIPASCOMPLETE() {
        return this.SHIPASCOMPLETE;
    }
      

    private java.lang.String COMMENTS1;
    
    public void setCOMMENTS1(java.lang.String COMMENTS1) {
        this.COMMENTS1 = COMMENTS1;
    }
    
    public java.lang.String getCOMMENTS1() {
        return this.COMMENTS1;
    }
      

    private java.lang.String COMMENTS2;
    
    public void setCOMMENTS2(java.lang.String COMMENTS2) {
        this.COMMENTS2 = COMMENTS2;
    }
    
    public java.lang.String getCOMMENTS2() {
        return this.COMMENTS2;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String FIELD2;
    
    public void setFIELD2(java.lang.String FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.lang.String getFIELD2() {
        return this.FIELD2;
    }
      

    private java.lang.String FIELD3;
    
    public void setFIELD3(java.lang.String FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.lang.String getFIELD3() {
        return this.FIELD3;
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
        result.append("ORDERITEMS_ID: " + getORDERITEMS_ID() + "||");
        result.append("REQUESTEDSHIPTIME: " + getREQUESTEDSHIPTIME() + "||");
        result.append("SHIPASCOMPLETE: " + getSHIPASCOMPLETE() + "||");
        result.append("COMMENTS1: " + getCOMMENTS1() + "||");
        result.append("COMMENTS2: " + getCOMMENTS2() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}