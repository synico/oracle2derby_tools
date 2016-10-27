package com.avn.dataload.model;

public class LANGUAGE {


    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String LOCALENAME;
    
    public void setLOCALENAME(java.lang.String LOCALENAME) {
        this.LOCALENAME = LOCALENAME;
    }
    
    public java.lang.String getLOCALENAME() {
        return this.LOCALENAME;
    }
      

    private java.lang.String LANGUAGE;
    
    public void setLANGUAGE(java.lang.String LANGUAGE) {
        this.LANGUAGE = LANGUAGE;
    }
    
    public java.lang.String getLANGUAGE() {
        return this.LANGUAGE;
    }
      

    private java.lang.String COUNTRY;
    
    public void setCOUNTRY(java.lang.String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }
    
    public java.lang.String getCOUNTRY() {
        return this.COUNTRY;
    }
      

    private java.lang.String VARIANT;
    
    public void setVARIANT(java.lang.String VARIANT) {
        this.VARIANT = VARIANT;
    }
    
    public java.lang.String getVARIANT() {
        return this.VARIANT;
    }
      

    private java.lang.String ENCODING;
    
    public void setENCODING(java.lang.String ENCODING) {
        this.ENCODING = ENCODING;
    }
    
    public java.lang.String getENCODING() {
        return this.ENCODING;
    }
      

    private java.lang.String MIMECHARSET;
    
    public void setMIMECHARSET(java.lang.String MIMECHARSET) {
        this.MIMECHARSET = MIMECHARSET;
    }
    
    public java.lang.String getMIMECHARSET() {
        return this.MIMECHARSET;
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
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("LOCALENAME: " + getLOCALENAME() + "||");
        result.append("LANGUAGE: " + getLANGUAGE() + "||");
        result.append("COUNTRY: " + getCOUNTRY() + "||");
        result.append("VARIANT: " + getVARIANT() + "||");
        result.append("ENCODING: " + getENCODING() + "||");
        result.append("MIMECHARSET: " + getMIMECHARSET() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}