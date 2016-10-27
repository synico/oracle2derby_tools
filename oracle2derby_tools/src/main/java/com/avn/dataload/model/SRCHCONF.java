package com.avn.dataload.model;

public class SRCHCONF {


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
      

    private java.lang.String LANGUAGES;
    
    public void setLANGUAGES(java.lang.String LANGUAGES) {
        this.LANGUAGES = LANGUAGES;
    }
    
    public java.lang.String getLANGUAGES() {
        return this.LANGUAGES;
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
        result.append("INDEXTYPE: " + getINDEXTYPE() + "||");
        result.append("INDEXSCOPE: " + getINDEXSCOPE() + "||");
        result.append("LANGUAGES: " + getLANGUAGES() + "||");
        result.append("CONFIG: " + getCONFIG() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}