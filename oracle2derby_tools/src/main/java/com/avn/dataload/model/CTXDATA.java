package com.avn.dataload.model;

public class CTXDATA {


    private java.math.BigDecimal ACTIVITY_ID;
    
    public void setACTIVITY_ID(java.math.BigDecimal ACTIVITY_ID) {
        this.ACTIVITY_ID = ACTIVITY_ID;
    }
    
    public java.math.BigDecimal getACTIVITY_ID() {
        return this.ACTIVITY_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String SERVALUE;
    
    public void setSERVALUE(java.lang.String SERVALUE) {
        this.SERVALUE = SERVALUE;
    }
    
    public java.lang.String getSERVALUE() {
        return this.SERVALUE;
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
        result.append("ACTIVITY_ID: " + getACTIVITY_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("SERVALUE: " + getSERVALUE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}