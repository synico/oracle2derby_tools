package com.avn.dataload.model;

public class TRDDESC {


    private java.math.BigDecimal TRADING_ID;
    
    public void setTRADING_ID(java.math.BigDecimal TRADING_ID) {
        this.TRADING_ID = TRADING_ID;
    }
    
    public java.math.BigDecimal getTRADING_ID() {
        return this.TRADING_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String LONGDESCRIPTION;
    
    public void setLONGDESCRIPTION(java.lang.String LONGDESCRIPTION) {
        this.LONGDESCRIPTION = LONGDESCRIPTION;
    }
    
    public java.lang.String getLONGDESCRIPTION() {
        return this.LONGDESCRIPTION;
    }
      

    private java.sql.Timestamp TIMECREATED;
    
    public void setTIMECREATED(java.sql.Timestamp TIMECREATED) {
        this.TIMECREATED = TIMECREATED;
    }
    
    public java.sql.Timestamp getTIMECREATED() {
        return this.TIMECREATED;
    }
      

    private java.sql.Timestamp TIMEUPDATED;
    
    public void setTIMEUPDATED(java.sql.Timestamp TIMEUPDATED) {
        this.TIMEUPDATED = TIMEUPDATED;
    }
    
    public java.sql.Timestamp getTIMEUPDATED() {
        return this.TIMEUPDATED;
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
        result.append("TRADING_ID: " + getTRADING_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("LONGDESCRIPTION: " + getLONGDESCRIPTION() + "||");
        result.append("TIMECREATED: " + getTIMECREATED() + "||");
        result.append("TIMEUPDATED: " + getTIMEUPDATED() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}