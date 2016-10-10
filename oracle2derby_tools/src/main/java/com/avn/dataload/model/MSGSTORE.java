package com.avn.dataload.model;

import java.math.BigDecimal;
import java.util.Date;

public class MSGSTORE {
    

    private java.math.BigDecimal MSGID;
    
    public void setMSGID(java.math.BigDecimal MSGID) {
        this.MSGID = MSGID;
    }
    
    public java.math.BigDecimal getMSGID() {
        return this.MSGID;
    }
      

    private java.math.BigDecimal MESSAGEINDEX;
    
    public void setMESSAGEINDEX(java.math.BigDecimal MESSAGEINDEX) {
        this.MESSAGEINDEX = MESSAGEINDEX;
    }
    
    public java.math.BigDecimal getMESSAGEINDEX() {
        return this.MESSAGEINDEX;
    }
      

    private java.sql.Blob MESSAGE;
    
    public void setMESSAGE(java.sql.Blob MESSAGE) {
        this.MESSAGE = MESSAGE;
    }
    
    public java.sql.Blob getMESSAGE() {
        return this.MESSAGE;
    }
      

    private java.math.BigDecimal RETRIES;
    
    public void setRETRIES(java.math.BigDecimal RETRIES) {
        this.RETRIES = RETRIES;
    }
    
    public java.math.BigDecimal getRETRIES() {
        return this.RETRIES;
    }
      

    private java.sql.Timestamp EXPIRY;
    
    public void setEXPIRY(java.sql.Timestamp EXPIRY) {
        this.EXPIRY = EXPIRY;
    }
    
    public java.sql.Timestamp getEXPIRY() {
        return this.EXPIRY;
    }
      

    private java.math.BigDecimal TRANSPORT_ID;
    
    public void setTRANSPORT_ID(java.math.BigDecimal TRANSPORT_ID) {
        this.TRANSPORT_ID = TRANSPORT_ID;
    }
    
    public java.math.BigDecimal getTRANSPORT_ID() {
        return this.TRANSPORT_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      
    
}