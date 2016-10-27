package com.avn.dataload.model;

public class PRELEMENTATTR {


    private java.math.BigDecimal PRELEMENT_ID;
    
    public void setPRELEMENT_ID(java.math.BigDecimal PRELEMENT_ID) {
        this.PRELEMENT_ID = PRELEMENT_ID;
    }
    
    public java.math.BigDecimal getPRELEMENT_ID() {
        return this.PRELEMENT_ID;
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
        result.append("PRELEMENT_ID: " + getPRELEMENT_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("VALUE: " + getVALUE() + "||");
        result.append("PROPERTIES: " + getPROPERTIES() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}