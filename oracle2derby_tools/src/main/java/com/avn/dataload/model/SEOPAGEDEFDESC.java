package com.avn.dataload.model;

public class SEOPAGEDEFDESC {


    private java.math.BigDecimal SEOPAGEDEF_ID;
    
    public void setSEOPAGEDEF_ID(java.math.BigDecimal SEOPAGEDEF_ID) {
        this.SEOPAGEDEF_ID = SEOPAGEDEF_ID;
    }
    
    public java.math.BigDecimal getSEOPAGEDEF_ID() {
        return this.SEOPAGEDEF_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String TITLE;
    
    public void setTITLE(java.lang.String TITLE) {
        this.TITLE = TITLE;
    }
    
    public java.lang.String getTITLE() {
        return this.TITLE;
    }
      

    private java.lang.String META_DESC;
    
    public void setMETA_DESC(java.lang.String META_DESC) {
        this.META_DESC = META_DESC;
    }
    
    public java.lang.String getMETA_DESC() {
        return this.META_DESC;
    }
      

    private java.lang.String META_KEYWORD;
    
    public void setMETA_KEYWORD(java.lang.String META_KEYWORD) {
        this.META_KEYWORD = META_KEYWORD;
    }
    
    public java.lang.String getMETA_KEYWORD() {
        return this.META_KEYWORD;
    }
      

    private java.lang.String IMAGE_ALT_DESC;
    
    public void setIMAGE_ALT_DESC(java.lang.String IMAGE_ALT_DESC) {
        this.IMAGE_ALT_DESC = IMAGE_ALT_DESC;
    }
    
    public java.lang.String getIMAGE_ALT_DESC() {
        return this.IMAGE_ALT_DESC;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
    }
      

    private java.sql.Timestamp CREATEDTIME;
    
    public void setCREATEDTIME(java.sql.Timestamp CREATEDTIME) {
        this.CREATEDTIME = CREATEDTIME;
    }
    
    public java.sql.Timestamp getCREATEDTIME() {
        return this.CREATEDTIME;
    }
      

    private java.math.BigDecimal FIELD1;
    
    public void setFIELD1(java.math.BigDecimal FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.math.BigDecimal getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String FIELD2;
    
    public void setFIELD2(java.lang.String FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.lang.String getFIELD2() {
        return this.FIELD2;
    }
      

    private java.lang.String FIELD3;
    
    public void setFIELD3(java.lang.String FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.lang.String getFIELD3() {
        return this.FIELD3;
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
        result.append("SEOPAGEDEF_ID: " + getSEOPAGEDEF_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("TITLE: " + getTITLE() + "||");
        result.append("META_DESC: " + getMETA_DESC() + "||");
        result.append("META_KEYWORD: " + getMETA_KEYWORD() + "||");
        result.append("IMAGE_ALT_DESC: " + getIMAGE_ALT_DESC() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("CREATEDTIME: " + getCREATEDTIME() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}