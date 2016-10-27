package com.avn.dataload.model;

public class XINVLOG {


    private java.lang.String SAPMATERIALID;
    
    public void setSAPMATERIALID(java.lang.String SAPMATERIALID) {
        this.SAPMATERIALID = SAPMATERIALID;
    }
    
    public java.lang.String getSAPMATERIALID() {
        return this.SAPMATERIALID;
    }
      

    private java.lang.String PROCESSED;
    
    public void setPROCESSED(java.lang.String PROCESSED) {
        this.PROCESSED = PROCESSED;
    }
    
    public java.lang.String getPROCESSED() {
        return this.PROCESSED;
    }
      

    private java.lang.String LASTUPDATE;
    
    public void setLASTUPDATE(java.lang.String LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.lang.String getLASTUPDATE() {
        return this.LASTUPDATE;
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
        result.append("SAPMATERIALID: " + getSAPMATERIALID() + "||");
        result.append("PROCESSED: " + getPROCESSED() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}