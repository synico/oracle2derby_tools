package com.avn.dataload.model;

public class COUNTCODE {


    private java.lang.String PRODUCTVENDOR;
    
    public void setPRODUCTVENDOR(java.lang.String PRODUCTVENDOR) {
        this.PRODUCTVENDOR = PRODUCTVENDOR;
    }
    
    public java.lang.String getPRODUCTVENDOR() {
        return this.PRODUCTVENDOR;
    }
      

    private java.lang.String COUNTRYABBR;
    
    public void setCOUNTRYABBR(java.lang.String COUNTRYABBR) {
        this.COUNTRYABBR = COUNTRYABBR;
    }
    
    public java.lang.String getCOUNTRYABBR() {
        return this.COUNTRYABBR;
    }
      

    private java.lang.String COUNTRYCODE;
    
    public void setCOUNTRYCODE(java.lang.String COUNTRYCODE) {
        this.COUNTRYCODE = COUNTRYCODE;
    }
    
    public java.lang.String getCOUNTRYCODE() {
        return this.COUNTRYCODE;
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
        result.append("PRODUCTVENDOR: " + getPRODUCTVENDOR() + "||");
        result.append("COUNTRYABBR: " + getCOUNTRYABBR() + "||");
        result.append("COUNTRYCODE: " + getCOUNTRYCODE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}