package com.avn.dataload.model;

public class STATECODE {


    private java.lang.String PRODUCTVENDOR;
    
    public void setPRODUCTVENDOR(java.lang.String PRODUCTVENDOR) {
        this.PRODUCTVENDOR = PRODUCTVENDOR;
    }
    
    public java.lang.String getPRODUCTVENDOR() {
        return this.PRODUCTVENDOR;
    }
      

    private java.lang.String STATEPROVABBR;
    
    public void setSTATEPROVABBR(java.lang.String STATEPROVABBR) {
        this.STATEPROVABBR = STATEPROVABBR;
    }
    
    public java.lang.String getSTATEPROVABBR() {
        return this.STATEPROVABBR;
    }
      

    private java.lang.String STATEPROVCODE;
    
    public void setSTATEPROVCODE(java.lang.String STATEPROVCODE) {
        this.STATEPROVCODE = STATEPROVCODE;
    }
    
    public java.lang.String getSTATEPROVCODE() {
        return this.STATEPROVCODE;
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
        result.append("STATEPROVABBR: " + getSTATEPROVABBR() + "||");
        result.append("STATEPROVCODE: " + getSTATEPROVCODE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}