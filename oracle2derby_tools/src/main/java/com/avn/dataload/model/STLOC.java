package com.avn.dataload.model;

public class STLOC {


    private java.math.BigDecimal STLOC_ID;
    
    public void setSTLOC_ID(java.math.BigDecimal STLOC_ID) {
        this.STLOC_ID = STLOC_ID;
    }
    
    public java.math.BigDecimal getSTLOC_ID() {
        return this.STLOC_ID;
    }
      

    private java.lang.String IDENTIFIER;
    
    public void setIDENTIFIER(java.lang.String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
    
    public java.lang.String getIDENTIFIER() {
        return this.IDENTIFIER;
    }
      

    private java.lang.String PHONE;
    
    public void setPHONE(java.lang.String PHONE) {
        this.PHONE = PHONE;
    }
    
    public java.lang.String getPHONE() {
        return this.PHONE;
    }
      

    private java.lang.String FAX;
    
    public void setFAX(java.lang.String FAX) {
        this.FAX = FAX;
    }
    
    public java.lang.String getFAX() {
        return this.FAX;
    }
      

    private java.lang.String ADDRESS1;
    
    public void setADDRESS1(java.lang.String ADDRESS1) {
        this.ADDRESS1 = ADDRESS1;
    }
    
    public java.lang.String getADDRESS1() {
        return this.ADDRESS1;
    }
      

    private java.lang.String ADDRESS2;
    
    public void setADDRESS2(java.lang.String ADDRESS2) {
        this.ADDRESS2 = ADDRESS2;
    }
    
    public java.lang.String getADDRESS2() {
        return this.ADDRESS2;
    }
      

    private java.lang.String ADDRESS3;
    
    public void setADDRESS3(java.lang.String ADDRESS3) {
        this.ADDRESS3 = ADDRESS3;
    }
    
    public java.lang.String getADDRESS3() {
        return this.ADDRESS3;
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
      

    private java.lang.String COUNTRY;
    
    public void setCOUNTRY(java.lang.String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }
    
    public java.lang.String getCOUNTRY() {
        return this.COUNTRY;
    }
      

    private java.lang.String ZIPCODE;
    
    public void setZIPCODE(java.lang.String ZIPCODE) {
        this.ZIPCODE = ZIPCODE;
    }
    
    public java.lang.String getZIPCODE() {
        return this.ZIPCODE;
    }
      

    private java.math.BigDecimal ACTIVE;
    
    public void setACTIVE(java.math.BigDecimal ACTIVE) {
        this.ACTIVE = ACTIVE;
    }
    
    public java.math.BigDecimal getACTIVE() {
        return this.ACTIVE;
    }
      

    private java.math.BigDecimal LATITUDE;
    
    public void setLATITUDE(java.math.BigDecimal LATITUDE) {
        this.LATITUDE = LATITUDE;
    }
    
    public java.math.BigDecimal getLATITUDE() {
        return this.LATITUDE;
    }
      

    private java.math.BigDecimal LONGITUDE;
    
    public void setLONGITUDE(java.math.BigDecimal LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }
    
    public java.math.BigDecimal getLONGITUDE() {
        return this.LONGITUDE;
    }
      

    private java.math.BigDecimal GEONODE_ID;
    
    public void setGEONODE_ID(java.math.BigDecimal GEONODE_ID) {
        this.GEONODE_ID = GEONODE_ID;
    }
    
    public java.math.BigDecimal getGEONODE_ID() {
        return this.GEONODE_ID;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("STLOC_ID: " + getSTLOC_ID() + "||");
        result.append("IDENTIFIER: " + getIDENTIFIER() + "||");
        result.append("PHONE: " + getPHONE() + "||");
        result.append("FAX: " + getFAX() + "||");
        result.append("ADDRESS1: " + getADDRESS1() + "||");
        result.append("ADDRESS2: " + getADDRESS2() + "||");
        result.append("ADDRESS3: " + getADDRESS3() + "||");
        result.append("CITY: " + getCITY() + "||");
        result.append("STATE: " + getSTATE() + "||");
        result.append("COUNTRY: " + getCOUNTRY() + "||");
        result.append("ZIPCODE: " + getZIPCODE() + "||");
        result.append("ACTIVE: " + getACTIVE() + "||");
        result.append("LATITUDE: " + getLATITUDE() + "||");
        result.append("LONGITUDE: " + getLONGITUDE() + "||");
        result.append("GEONODE_ID: " + getGEONODE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        return result.toString();
    }
    
}