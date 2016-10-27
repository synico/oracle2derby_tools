package com.avn.dataload.model;

public class EMLRPTEVTS {


    private java.math.BigDecimal USERS_ID;
    
    public void setUSERS_ID(java.math.BigDecimal USERS_ID) {
        this.USERS_ID = USERS_ID;
    }
    
    public java.math.BigDecimal getUSERS_ID() {
        return this.USERS_ID;
    }
      

    private java.math.BigDecimal EMLPROMO_ID;
    
    public void setEMLPROMO_ID(java.math.BigDecimal EMLPROMO_ID) {
        this.EMLPROMO_ID = EMLPROMO_ID;
    }
    
    public java.math.BigDecimal getEMLPROMO_ID() {
        return this.EMLPROMO_ID;
    }
      

    private java.sql.Timestamp OPENED;
    
    public void setOPENED(java.sql.Timestamp OPENED) {
        this.OPENED = OPENED;
    }
    
    public java.sql.Timestamp getOPENED() {
        return this.OPENED;
    }
      

    private java.sql.Timestamp CLICKED;
    
    public void setCLICKED(java.sql.Timestamp CLICKED) {
        this.CLICKED = CLICKED;
    }
    
    public java.sql.Timestamp getCLICKED() {
        return this.CLICKED;
    }
      

    private java.sql.Timestamp BOUNCED;
    
    public void setBOUNCED(java.sql.Timestamp BOUNCED) {
        this.BOUNCED = BOUNCED;
    }
    
    public java.sql.Timestamp getBOUNCED() {
        return this.BOUNCED;
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
        result.append("USERS_ID: " + getUSERS_ID() + "||");
        result.append("EMLPROMO_ID: " + getEMLPROMO_ID() + "||");
        result.append("OPENED: " + getOPENED() + "||");
        result.append("CLICKED: " + getCLICKED() + "||");
        result.append("BOUNCED: " + getBOUNCED() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}