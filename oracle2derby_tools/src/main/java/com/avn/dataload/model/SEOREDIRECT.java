package com.avn.dataload.model;

public class SEOREDIRECT {


    private java.math.BigDecimal SEOREDIRECT_ID;
    
    public void setSEOREDIRECT_ID(java.math.BigDecimal SEOREDIRECT_ID) {
        this.SEOREDIRECT_ID = SEOREDIRECT_ID;
    }
    
    public java.math.BigDecimal getSEOREDIRECT_ID() {
        return this.SEOREDIRECT_ID;
    }
      

    private java.math.BigDecimal SEOURLKWD_ID_NEW;
    
    public void setSEOURLKWD_ID_NEW(java.math.BigDecimal SEOURLKWD_ID_NEW) {
        this.SEOURLKWD_ID_NEW = SEOURLKWD_ID_NEW;
    }
    
    public java.math.BigDecimal getSEOURLKWD_ID_NEW() {
        return this.SEOURLKWD_ID_NEW;
    }
      

    private java.math.BigDecimal SEOURLKWD_ID_ORIG;
    
    public void setSEOURLKWD_ID_ORIG(java.math.BigDecimal SEOURLKWD_ID_ORIG) {
        this.SEOURLKWD_ID_ORIG = SEOURLKWD_ID_ORIG;
    }
    
    public java.math.BigDecimal getSEOURLKWD_ID_ORIG() {
        return this.SEOURLKWD_ID_ORIG;
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
        result.append("SEOREDIRECT_ID: " + getSEOREDIRECT_ID() + "||");
        result.append("SEOURLKWD_ID_NEW: " + getSEOURLKWD_ID_NEW() + "||");
        result.append("SEOURLKWD_ID_ORIG: " + getSEOURLKWD_ID_ORIG() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}