package com.avn.dataload.model;

public class BUSCHN {


    private java.math.BigDecimal BUSCHN_ID;
    
    public void setBUSCHN_ID(java.math.BigDecimal BUSCHN_ID) {
        this.BUSCHN_ID = BUSCHN_ID;
    }
    
    public java.math.BigDecimal getBUSCHN_ID() {
        return this.BUSCHN_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String STATE;
    
    public void setSTATE(java.lang.String STATE) {
        this.STATE = STATE;
    }
    
    public java.lang.String getSTATE() {
        return this.STATE;
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
        result.append("BUSCHN_ID: " + getBUSCHN_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("STATE: " + getSTATE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}