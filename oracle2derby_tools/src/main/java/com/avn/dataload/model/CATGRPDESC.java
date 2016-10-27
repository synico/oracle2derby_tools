package com.avn.dataload.model;

public class CATGRPDESC {


    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.math.BigDecimal CATGROUP_ID;
    
    public void setCATGROUP_ID(java.math.BigDecimal CATGROUP_ID) {
        this.CATGROUP_ID = CATGROUP_ID;
    }
    
    public java.math.BigDecimal getCATGROUP_ID() {
        return this.CATGROUP_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String SHORTDESCRIPTION;
    
    public void setSHORTDESCRIPTION(java.lang.String SHORTDESCRIPTION) {
        this.SHORTDESCRIPTION = SHORTDESCRIPTION;
    }
    
    public java.lang.String getSHORTDESCRIPTION() {
        return this.SHORTDESCRIPTION;
    }
      

    private java.lang.String LONGDESCRIPTION;
    
    public void setLONGDESCRIPTION(java.lang.String LONGDESCRIPTION) {
        this.LONGDESCRIPTION = LONGDESCRIPTION;
    }
    
    public java.lang.String getLONGDESCRIPTION() {
        return this.LONGDESCRIPTION;
    }
      

    private java.lang.String THUMBNAIL;
    
    public void setTHUMBNAIL(java.lang.String THUMBNAIL) {
        this.THUMBNAIL = THUMBNAIL;
    }
    
    public java.lang.String getTHUMBNAIL() {
        return this.THUMBNAIL;
    }
      

    private java.lang.String FULLIMAGE;
    
    public void setFULLIMAGE(java.lang.String FULLIMAGE) {
        this.FULLIMAGE = FULLIMAGE;
    }
    
    public java.lang.String getFULLIMAGE() {
        return this.FULLIMAGE;
    }
      

    private java.math.BigDecimal PUBLISHED;
    
    public void setPUBLISHED(java.math.BigDecimal PUBLISHED) {
        this.PUBLISHED = PUBLISHED;
    }
    
    public java.math.BigDecimal getPUBLISHED() {
        return this.PUBLISHED;
    }
      

    private java.lang.String DISPLAY;
    
    public void setDISPLAY(java.lang.String DISPLAY) {
        this.DISPLAY = DISPLAY;
    }
    
    public java.lang.String getDISPLAY() {
        return this.DISPLAY;
    }
      

    private java.lang.String KEYWORD;
    
    public void setKEYWORD(java.lang.String KEYWORD) {
        this.KEYWORD = KEYWORD;
    }
    
    public java.lang.String getKEYWORD() {
        return this.KEYWORD;
    }
      

    private java.lang.String NOTE;
    
    public void setNOTE(java.lang.String NOTE) {
        this.NOTE = NOTE;
    }
    
    public java.lang.String getNOTE() {
        return this.NOTE;
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
        result.append("CATGROUP_ID: " + getCATGROUP_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("SHORTDESCRIPTION: " + getSHORTDESCRIPTION() + "||");
        result.append("LONGDESCRIPTION: " + getLONGDESCRIPTION() + "||");
        result.append("THUMBNAIL: " + getTHUMBNAIL() + "||");
        result.append("FULLIMAGE: " + getFULLIMAGE() + "||");
        result.append("PUBLISHED: " + getPUBLISHED() + "||");
        result.append("DISPLAY: " + getDISPLAY() + "||");
        result.append("KEYWORD: " + getKEYWORD() + "||");
        result.append("NOTE: " + getNOTE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}