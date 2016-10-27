package com.avn.dataload.model;

public class XUSERSUBSCRIPTION {


    private java.lang.String LOGON_ID;
    
    public void setLOGON_ID(java.lang.String LOGON_ID) {
        this.LOGON_ID = LOGON_ID;
    }
    
    public java.lang.String getLOGON_ID() {
        return this.LOGON_ID;
    }
      

    private java.math.BigDecimal SUBSCRIPTION_ID;
    
    public void setSUBSCRIPTION_ID(java.math.BigDecimal SUBSCRIPTION_ID) {
        this.SUBSCRIPTION_ID = SUBSCRIPTION_ID;
    }
    
    public java.math.BigDecimal getSUBSCRIPTION_ID() {
        return this.SUBSCRIPTION_ID;
    }
      

    private java.lang.String SUBSCRIBED;
    
    public void setSUBSCRIBED(java.lang.String SUBSCRIBED) {
        this.SUBSCRIBED = SUBSCRIBED;
    }
    
    public java.lang.String getSUBSCRIBED() {
        return this.SUBSCRIBED;
    }
      

    private java.lang.String SYNCSTATUS;
    
    public void setSYNCSTATUS(java.lang.String SYNCSTATUS) {
        this.SYNCSTATUS = SYNCSTATUS;
    }
    
    public java.lang.String getSYNCSTATUS() {
        return this.SYNCSTATUS;
    }
      

    private java.sql.Timestamp TIME_CREATED;
    
    public void setTIME_CREATED(java.sql.Timestamp TIME_CREATED) {
        this.TIME_CREATED = TIME_CREATED;
    }
    
    public java.sql.Timestamp getTIME_CREATED() {
        return this.TIME_CREATED;
    }
      

    private java.sql.Timestamp TIME_SUBSCRIBED;
    
    public void setTIME_SUBSCRIBED(java.sql.Timestamp TIME_SUBSCRIBED) {
        this.TIME_SUBSCRIBED = TIME_SUBSCRIBED;
    }
    
    public java.sql.Timestamp getTIME_SUBSCRIBED() {
        return this.TIME_SUBSCRIBED;
    }
      

    private java.sql.Timestamp TIME_UNSUBSCRIBED;
    
    public void setTIME_UNSUBSCRIBED(java.sql.Timestamp TIME_UNSUBSCRIBED) {
        this.TIME_UNSUBSCRIBED = TIME_UNSUBSCRIBED;
    }
    
    public java.sql.Timestamp getTIME_UNSUBSCRIBED() {
        return this.TIME_UNSUBSCRIBED;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
    }
      

    private java.sql.Timestamp LASTUPDATED;
    
    public void setLASTUPDATED(java.sql.Timestamp LASTUPDATED) {
        this.LASTUPDATED = LASTUPDATED;
    }
    
    public java.sql.Timestamp getLASTUPDATED() {
        return this.LASTUPDATED;
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
      

    private java.lang.String FIELD4;
    
    public void setFIELD4(java.lang.String FIELD4) {
        this.FIELD4 = FIELD4;
    }
    
    public java.lang.String getFIELD4() {
        return this.FIELD4;
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
        result.append("LOGON_ID: " + getLOGON_ID() + "||");
        result.append("SUBSCRIPTION_ID: " + getSUBSCRIPTION_ID() + "||");
        result.append("SUBSCRIBED: " + getSUBSCRIBED() + "||");
        result.append("SYNCSTATUS: " + getSYNCSTATUS() + "||");
        result.append("TIME_CREATED: " + getTIME_CREATED() + "||");
        result.append("TIME_SUBSCRIBED: " + getTIME_SUBSCRIBED() + "||");
        result.append("TIME_UNSUBSCRIBED: " + getTIME_UNSUBSCRIBED() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("LASTUPDATED: " + getLASTUPDATED() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("FIELD4: " + getFIELD4() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}