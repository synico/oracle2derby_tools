package com.avn.dataload.model;

public class DMEMSPOTSTATS {


    private java.math.BigDecimal DMACTIVITY_ID;
    
    public void setDMACTIVITY_ID(java.math.BigDecimal DMACTIVITY_ID) {
        this.DMACTIVITY_ID = DMACTIVITY_ID;
    }
    
    public java.math.BigDecimal getDMACTIVITY_ID() {
        return this.DMACTIVITY_ID;
    }
      

    private java.math.BigDecimal EMSPOT_ID;
    
    public void setEMSPOT_ID(java.math.BigDecimal EMSPOT_ID) {
        this.EMSPOT_ID = EMSPOT_ID;
    }
    
    public java.math.BigDecimal getEMSPOT_ID() {
        return this.EMSPOT_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal VIEWS;
    
    public void setVIEWS(java.math.BigDecimal VIEWS) {
        this.VIEWS = VIEWS;
    }
    
    public java.math.BigDecimal getVIEWS() {
        return this.VIEWS;
    }
      

    private java.math.BigDecimal CLICKS;
    
    public void setCLICKS(java.math.BigDecimal CLICKS) {
        this.CLICKS = CLICKS;
    }
    
    public java.math.BigDecimal getCLICKS() {
        return this.CLICKS;
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
        result.append("EMSPOT_ID: " + getEMSPOT_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("VIEWS: " + getVIEWS() + "||");
        result.append("CLICKS: " + getCLICKS() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}