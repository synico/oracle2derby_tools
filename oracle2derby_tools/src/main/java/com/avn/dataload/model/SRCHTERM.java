package com.avn.dataload.model;

public class SRCHTERM {


    private java.math.BigDecimal SRCHTERMASSOC_ID;
    
    public void setSRCHTERMASSOC_ID(java.math.BigDecimal SRCHTERMASSOC_ID) {
        this.SRCHTERMASSOC_ID = SRCHTERMASSOC_ID;
    }
    
    public java.math.BigDecimal getSRCHTERMASSOC_ID() {
        return this.SRCHTERMASSOC_ID;
    }
      

    private java.math.BigDecimal TYPE;
    
    public void setTYPE(java.math.BigDecimal TYPE) {
        this.TYPE = TYPE;
    }
    
    public java.math.BigDecimal getTYPE() {
        return this.TYPE;
    }
      

    private java.lang.String TERM;
    
    public void setTERM(java.lang.String TERM) {
        this.TERM = TERM;
    }
    
    public java.lang.String getTERM() {
        return this.TERM;
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
        result.append("SRCHTERMASSOC_ID: " + getSRCHTERMASSOC_ID() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("TERM: " + getTERM() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}