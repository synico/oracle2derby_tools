package com.avn.dataload.model;

public class CURCONVERT {


    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.lang.String FROMCURR;
    
    public void setFROMCURR(java.lang.String FROMCURR) {
        this.FROMCURR = FROMCURR;
    }
    
    public java.lang.String getFROMCURR() {
        return this.FROMCURR;
    }
      

    private java.lang.String TOCURR;
    
    public void setTOCURR(java.lang.String TOCURR) {
        this.TOCURR = TOCURR;
    }
    
    public java.lang.String getTOCURR() {
        return this.TOCURR;
    }
      

    private java.math.BigDecimal FACTOR;
    
    public void setFACTOR(java.math.BigDecimal FACTOR) {
        this.FACTOR = FACTOR;
    }
    
    public java.math.BigDecimal getFACTOR() {
        return this.FACTOR;
    }
      

    private java.lang.String MULTIPLYORDIVIDE;
    
    public void setMULTIPLYORDIVIDE(java.lang.String MULTIPLYORDIVIDE) {
        this.MULTIPLYORDIVIDE = MULTIPLYORDIVIDE;
    }
    
    public java.lang.String getMULTIPLYORDIVIDE() {
        return this.MULTIPLYORDIVIDE;
    }
      

    private java.lang.String BIDIRECTIONAL;
    
    public void setBIDIRECTIONAL(java.lang.String BIDIRECTIONAL) {
        this.BIDIRECTIONAL = BIDIRECTIONAL;
    }
    
    public java.lang.String getBIDIRECTIONAL() {
        return this.BIDIRECTIONAL;
    }
      

    private java.lang.String UPDATABLE;
    
    public void setUPDATABLE(java.lang.String UPDATABLE) {
        this.UPDATABLE = UPDATABLE;
    }
    
    public java.lang.String getUPDATABLE() {
        return this.UPDATABLE;
    }
      

    private java.math.BigDecimal CURCONVERT_ID;
    
    public void setCURCONVERT_ID(java.math.BigDecimal CURCONVERT_ID) {
        this.CURCONVERT_ID = CURCONVERT_ID;
    }
    
    public java.math.BigDecimal getCURCONVERT_ID() {
        return this.CURCONVERT_ID;
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
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("FROMCURR: " + getFROMCURR() + "||");
        result.append("TOCURR: " + getTOCURR() + "||");
        result.append("FACTOR: " + getFACTOR() + "||");
        result.append("MULTIPLYORDIVIDE: " + getMULTIPLYORDIVIDE() + "||");
        result.append("BIDIRECTIONAL: " + getBIDIRECTIONAL() + "||");
        result.append("UPDATABLE: " + getUPDATABLE() + "||");
        result.append("CURCONVERT_ID: " + getCURCONVERT_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}