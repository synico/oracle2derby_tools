package com.avn.dataload.model;

public class SRCHCONFEXT {


    private java.math.BigDecimal SRCHCONFEXT_ID;
    
    public void setSRCHCONFEXT_ID(java.math.BigDecimal SRCHCONFEXT_ID) {
        this.SRCHCONFEXT_ID = SRCHCONFEXT_ID;
    }
    
    public java.math.BigDecimal getSRCHCONFEXT_ID() {
        return this.SRCHCONFEXT_ID;
    }
      

    private java.lang.String INDEXTYPE;
    
    public void setINDEXTYPE(java.lang.String INDEXTYPE) {
        this.INDEXTYPE = INDEXTYPE;
    }
    
    public java.lang.String getINDEXTYPE() {
        return this.INDEXTYPE;
    }
      

    private java.lang.String INDEXSCOPE;
    
    public void setINDEXSCOPE(java.lang.String INDEXSCOPE) {
        this.INDEXSCOPE = INDEXSCOPE;
    }
    
    public java.lang.String getINDEXSCOPE() {
        return this.INDEXSCOPE;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String INDEXSUBTYPE;
    
    public void setINDEXSUBTYPE(java.lang.String INDEXSUBTYPE) {
        this.INDEXSUBTYPE = INDEXSUBTYPE;
    }
    
    public java.lang.String getINDEXSUBTYPE() {
        return this.INDEXSUBTYPE;
    }
      

    private java.lang.String CONFIG;
    
    public void setCONFIG(java.lang.String CONFIG) {
        this.CONFIG = CONFIG;
    }
    
    public java.lang.String getCONFIG() {
        return this.CONFIG;
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
        result.append("SRCHCONFEXT_ID: " + getSRCHCONFEXT_ID() + "||");
        result.append("INDEXTYPE: " + getINDEXTYPE() + "||");
        result.append("INDEXSCOPE: " + getINDEXSCOPE() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("INDEXSUBTYPE: " + getINDEXSUBTYPE() + "||");
        result.append("CONFIG: " + getCONFIG() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}