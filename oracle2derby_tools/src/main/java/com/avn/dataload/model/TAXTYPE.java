package com.avn.dataload.model;

public class TAXTYPE {


    private java.math.BigDecimal TAXTYPE_ID;
    
    public void setTAXTYPE_ID(java.math.BigDecimal TAXTYPE_ID) {
        this.TAXTYPE_ID = TAXTYPE_ID;
    }
    
    public java.math.BigDecimal getTAXTYPE_ID() {
        return this.TAXTYPE_ID;
    }
      

    private java.math.BigDecimal TXCDSCHEME_ID;
    
    public void setTXCDSCHEME_ID(java.math.BigDecimal TXCDSCHEME_ID) {
        this.TXCDSCHEME_ID = TXCDSCHEME_ID;
    }
    
    public java.math.BigDecimal getTXCDSCHEME_ID() {
        return this.TXCDSCHEME_ID;
    }
      

    private java.math.BigDecimal SEQUENCE;
    
    public void setSEQUENCE(java.math.BigDecimal SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }
    
    public java.math.BigDecimal getSEQUENCE() {
        return this.SEQUENCE;
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
        result.append("TAXTYPE_ID: " + getTAXTYPE_ID() + "||");
        result.append("TXCDSCHEME_ID: " + getTXCDSCHEME_ID() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}