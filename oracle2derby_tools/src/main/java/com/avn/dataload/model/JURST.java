package com.avn.dataload.model;

public class JURST {


    private java.math.BigDecimal JURST_ID;
    
    public void setJURST_ID(java.math.BigDecimal JURST_ID) {
        this.JURST_ID = JURST_ID;
    }
    
    public java.math.BigDecimal getJURST_ID() {
        return this.JURST_ID;
    }
      

    private java.lang.String COUNTRY;
    
    public void setCOUNTRY(java.lang.String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }
    
    public java.lang.String getCOUNTRY() {
        return this.COUNTRY;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.lang.String CODE;
    
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }
    
    public java.lang.String getCODE() {
        return this.CODE;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.math.BigDecimal SUBCLASS;
    
    public void setSUBCLASS(java.math.BigDecimal SUBCLASS) {
        this.SUBCLASS = SUBCLASS;
    }
    
    public java.math.BigDecimal getSUBCLASS() {
        return this.SUBCLASS;
    }
      

    private java.lang.String CITY;
    
    public void setCITY(java.lang.String CITY) {
        this.CITY = CITY;
    }
    
    public java.lang.String getCITY() {
        return this.CITY;
    }
      

    private java.lang.String STATE;
    
    public void setSTATE(java.lang.String STATE) {
        this.STATE = STATE;
    }
    
    public java.lang.String getSTATE() {
        return this.STATE;
    }
      

    private java.lang.String STATEABBR;
    
    public void setSTATEABBR(java.lang.String STATEABBR) {
        this.STATEABBR = STATEABBR;
    }
    
    public java.lang.String getSTATEABBR() {
        return this.STATEABBR;
    }
      

    private java.lang.String COUNTRYABBR;
    
    public void setCOUNTRYABBR(java.lang.String COUNTRYABBR) {
        this.COUNTRYABBR = COUNTRYABBR;
    }
    
    public java.lang.String getCOUNTRYABBR() {
        return this.COUNTRYABBR;
    }
      

    private java.lang.String DISTRICT;
    
    public void setDISTRICT(java.lang.String DISTRICT) {
        this.DISTRICT = DISTRICT;
    }
    
    public java.lang.String getDISTRICT() {
        return this.DISTRICT;
    }
      

    private java.lang.String COUNTY;
    
    public void setCOUNTY(java.lang.String COUNTY) {
        this.COUNTY = COUNTY;
    }
    
    public java.lang.String getCOUNTY() {
        return this.COUNTY;
    }
      

    private java.lang.String ZIPCODESTART;
    
    public void setZIPCODESTART(java.lang.String ZIPCODESTART) {
        this.ZIPCODESTART = ZIPCODESTART;
    }
    
    public java.lang.String getZIPCODESTART() {
        return this.ZIPCODESTART;
    }
      

    private java.lang.String ZIPCODEEND;
    
    public void setZIPCODEEND(java.lang.String ZIPCODEEND) {
        this.ZIPCODEEND = ZIPCODEEND;
    }
    
    public java.lang.String getZIPCODEEND() {
        return this.ZIPCODEEND;
    }
      

    private java.lang.String GEOCODE;
    
    public void setGEOCODE(java.lang.String GEOCODE) {
        this.GEOCODE = GEOCODE;
    }
    
    public java.lang.String getGEOCODE() {
        return this.GEOCODE;
    }
      

    private java.math.BigDecimal MARKFORDELETE;
    
    public void setMARKFORDELETE(java.math.BigDecimal MARKFORDELETE) {
        this.MARKFORDELETE = MARKFORDELETE;
    }
    
    public java.math.BigDecimal getMARKFORDELETE() {
        return this.MARKFORDELETE;
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
        result.append("JURST_ID: " + getJURST_ID() + "||");
        result.append("COUNTRY: " + getCOUNTRY() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("CODE: " + getCODE() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("SUBCLASS: " + getSUBCLASS() + "||");
        result.append("CITY: " + getCITY() + "||");
        result.append("STATE: " + getSTATE() + "||");
        result.append("STATEABBR: " + getSTATEABBR() + "||");
        result.append("COUNTRYABBR: " + getCOUNTRYABBR() + "||");
        result.append("DISTRICT: " + getDISTRICT() + "||");
        result.append("COUNTY: " + getCOUNTY() + "||");
        result.append("ZIPCODESTART: " + getZIPCODESTART() + "||");
        result.append("ZIPCODEEND: " + getZIPCODEEND() + "||");
        result.append("GEOCODE: " + getGEOCODE() + "||");
        result.append("MARKFORDELETE: " + getMARKFORDELETE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}