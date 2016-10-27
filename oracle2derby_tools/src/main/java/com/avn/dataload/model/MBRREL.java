package com.avn.dataload.model;

public class MBRREL {


    private java.math.BigDecimal DESCENDANT_ID;
    
    public void setDESCENDANT_ID(java.math.BigDecimal DESCENDANT_ID) {
        this.DESCENDANT_ID = DESCENDANT_ID;
    }
    
    public java.math.BigDecimal getDESCENDANT_ID() {
        return this.DESCENDANT_ID;
    }
      

    private java.math.BigDecimal ANCESTOR_ID;
    
    public void setANCESTOR_ID(java.math.BigDecimal ANCESTOR_ID) {
        this.ANCESTOR_ID = ANCESTOR_ID;
    }
    
    public java.math.BigDecimal getANCESTOR_ID() {
        return this.ANCESTOR_ID;
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
        result.append("DESCENDANT_ID: " + getDESCENDANT_ID() + "||");
        result.append("ANCESTOR_ID: " + getANCESTOR_ID() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}