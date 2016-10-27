package com.avn.dataload.model;

public class STATEPROV {


    private java.lang.String STATEPROVABBR;
    
    public void setSTATEPROVABBR(java.lang.String STATEPROVABBR) {
        this.STATEPROVABBR = STATEPROVABBR;
    }
    
    public java.lang.String getSTATEPROVABBR() {
        return this.STATEPROVABBR;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String COUNTRYABBR;
    
    public void setCOUNTRYABBR(java.lang.String COUNTRYABBR) {
        this.COUNTRYABBR = COUNTRYABBR;
    }
    
    public java.lang.String getCOUNTRYABBR() {
        return this.COUNTRYABBR;
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
        result.append("STATEPROVABBR: " + getSTATEPROVABBR() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("COUNTRYABBR: " + getCOUNTRYABBR() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}