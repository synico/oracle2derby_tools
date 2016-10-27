package com.avn.dataload.model;

public class SRCHTERMASSOC {


    private java.math.BigDecimal SRCHTERMASSOC_ID;
    
    public void setSRCHTERMASSOC_ID(java.math.BigDecimal SRCHTERMASSOC_ID) {
        this.SRCHTERMASSOC_ID = SRCHTERMASSOC_ID;
    }
    
    public java.math.BigDecimal getSRCHTERMASSOC_ID() {
        return this.SRCHTERMASSOC_ID;
    }
      

    private java.math.BigDecimal ASSOCIATIONTYPE;
    
    public void setASSOCIATIONTYPE(java.math.BigDecimal ASSOCIATIONTYPE) {
        this.ASSOCIATIONTYPE = ASSOCIATIONTYPE;
    }
    
    public java.math.BigDecimal getASSOCIATIONTYPE() {
        return this.ASSOCIATIONTYPE;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.math.BigDecimal STATUS;
    
    public void setSTATUS(java.math.BigDecimal STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.math.BigDecimal getSTATUS() {
        return this.STATUS;
    }
      

    private java.lang.String SCOPE;
    
    public void setSCOPE(java.lang.String SCOPE) {
        this.SCOPE = SCOPE;
    }
    
    public java.lang.String getSCOPE() {
        return this.SCOPE;
    }
      

    private java.lang.String TYPE;
    
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }
    
    public java.lang.String getTYPE() {
        return this.TYPE;
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
        result.append("ASSOCIATIONTYPE: " + getASSOCIATIONTYPE() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("SCOPE: " + getSCOPE() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}