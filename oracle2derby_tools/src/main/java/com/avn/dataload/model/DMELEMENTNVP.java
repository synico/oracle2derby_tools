package com.avn.dataload.model;

public class DMELEMENTNVP {


    private java.math.BigDecimal DMELEMENT_ID;
    
    public void setDMELEMENT_ID(java.math.BigDecimal DMELEMENT_ID) {
        this.DMELEMENT_ID = DMELEMENT_ID;
    }
    
    public java.math.BigDecimal getDMELEMENT_ID() {
        return this.DMELEMENT_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String VALUE;
    
    public void setVALUE(java.lang.String VALUE) {
        this.VALUE = VALUE;
    }
    
    public java.lang.String getVALUE() {
        return this.VALUE;
    }
      

    private java.math.BigDecimal TRIGGERMATCH;
    
    public void setTRIGGERMATCH(java.math.BigDecimal TRIGGERMATCH) {
        this.TRIGGERMATCH = TRIGGERMATCH;
    }
    
    public java.math.BigDecimal getTRIGGERMATCH() {
        return this.TRIGGERMATCH;
    }
      

    private java.lang.String PROPERTIES;
    
    public void setPROPERTIES(java.lang.String PROPERTIES) {
        this.PROPERTIES = PROPERTIES;
    }
    
    public java.lang.String getPROPERTIES() {
        return this.PROPERTIES;
    }
      

    private java.math.BigDecimal SEQUENCE;
    
    public void setSEQUENCE(java.math.BigDecimal SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }
    
    public java.math.BigDecimal getSEQUENCE() {
        return this.SEQUENCE;
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
        result.append("DMELEMENT_ID: " + getDMELEMENT_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("VALUE: " + getVALUE() + "||");
        result.append("TRIGGERMATCH: " + getTRIGGERMATCH() + "||");
        result.append("PROPERTIES: " + getPROPERTIES() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}