package com.avn.dataload.model;

public class DMACTATTR {


    private java.math.BigDecimal DMACTIVITY_ID;
    
    public void setDMACTIVITY_ID(java.math.BigDecimal DMACTIVITY_ID) {
        this.DMACTIVITY_ID = DMACTIVITY_ID;
    }
    
    public java.math.BigDecimal getDMACTIVITY_ID() {
        return this.DMACTIVITY_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.sql.Timestamp PROCESSED;
    
    public void setPROCESSED(java.sql.Timestamp PROCESSED) {
        this.PROCESSED = PROCESSED;
    }
    
    public java.sql.Timestamp getPROCESSED() {
        return this.PROCESSED;
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
        result.append("DMACTIVITY_ID: " + getDMACTIVITY_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("PROCESSED: " + getPROCESSED() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}