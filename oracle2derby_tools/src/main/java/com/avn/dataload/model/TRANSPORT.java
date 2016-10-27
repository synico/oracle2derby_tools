package com.avn.dataload.model;

public class TRANSPORT {


    private java.math.BigDecimal TRANSPORT_ID;
    
    public void setTRANSPORT_ID(java.math.BigDecimal TRANSPORT_ID) {
        this.TRANSPORT_ID = TRANSPORT_ID;
    }
    
    public java.math.BigDecimal getTRANSPORT_ID() {
        return this.TRANSPORT_ID;
    }
      

    private java.math.BigDecimal TIMEOUT;
    
    public void setTIMEOUT(java.math.BigDecimal TIMEOUT) {
        this.TIMEOUT = TIMEOUT;
    }
    
    public java.math.BigDecimal getTIMEOUT() {
        return this.TIMEOUT;
    }
      

    private java.lang.String IMPLEMENTED;
    
    public void setIMPLEMENTED(java.lang.String IMPLEMENTED) {
        this.IMPLEMENTED = IMPLEMENTED;
    }
    
    public java.lang.String getIMPLEMENTED() {
        return this.IMPLEMENTED;
    }
      

    private java.lang.String ADDRESSABLE;
    
    public void setADDRESSABLE(java.lang.String ADDRESSABLE) {
        this.ADDRESSABLE = ADDRESSABLE;
    }
    
    public java.lang.String getADDRESSABLE() {
        return this.ADDRESSABLE;
    }
      

    private java.lang.String CODE;
    
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }
    
    public java.lang.String getCODE() {
        return this.CODE;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
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
        result.append("TRANSPORT_ID: " + getTRANSPORT_ID() + "||");
        result.append("TIMEOUT: " + getTIMEOUT() + "||");
        result.append("IMPLEMENTED: " + getIMPLEMENTED() + "||");
        result.append("ADDRESSABLE: " + getADDRESSABLE() + "||");
        result.append("CODE: " + getCODE() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}