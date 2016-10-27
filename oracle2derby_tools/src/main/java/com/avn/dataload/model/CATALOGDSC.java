package com.avn.dataload.model;

public class CATALOGDSC {


    private java.math.BigDecimal CATALOG_ID;
    
    public void setCATALOG_ID(java.math.BigDecimal CATALOG_ID) {
        this.CATALOG_ID = CATALOG_ID;
    }
    
    public java.math.BigDecimal getCATALOG_ID() {
        return this.CATALOG_ID;
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
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("CATALOG_ID: " + getCATALOG_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("SHORTDESCRIPTION: " + getSHORTDESCRIPTION() + "||");
        result.append("LONGDESCRIPTION: " + getLONGDESCRIPTION() + "||");
        result.append("THUMBNAIL: " + getTHUMBNAIL() + "||");
        result.append("FULLIMAGE: " + getFULLIMAGE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}