package com.avn.dataload.model;

public class PLCYACCLCK {


    private java.math.BigDecimal PLCYACCLCK_ID;
    
    public void setPLCYACCLCK_ID(java.math.BigDecimal PLCYACCLCK_ID) {
        this.PLCYACCLCK_ID = PLCYACCLCK_ID;
    }
    
    public java.math.BigDecimal getPLCYACCLCK_ID() {
        return this.PLCYACCLCK_ID;
    }
      

    private java.math.BigDecimal LOCKOUTTHRESHOLD;
    
    public void setLOCKOUTTHRESHOLD(java.math.BigDecimal LOCKOUTTHRESHOLD) {
        this.LOCKOUTTHRESHOLD = LOCKOUTTHRESHOLD;
    }
    
    public java.math.BigDecimal getLOCKOUTTHRESHOLD() {
        return this.LOCKOUTTHRESHOLD;
    }
      

    private java.math.BigDecimal WAITTIME;
    
    public void setWAITTIME(java.math.BigDecimal WAITTIME) {
        this.WAITTIME = WAITTIME;
    }
    
    public java.math.BigDecimal getWAITTIME() {
        return this.WAITTIME;
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
        result.append("PLCYACCLCK_ID: " + getPLCYACCLCK_ID() + "||");
        result.append("LOCKOUTTHRESHOLD: " + getLOCKOUTTHRESHOLD() + "||");
        result.append("WAITTIME: " + getWAITTIME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}