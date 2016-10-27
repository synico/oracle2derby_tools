package com.avn.dataload.model;

public class STQOTCFG {


    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal RETIREFLAG;
    
    public void setRETIREFLAG(java.math.BigDecimal RETIREFLAG) {
        this.RETIREFLAG = RETIREFLAG;
    }
    
    public java.math.BigDecimal getRETIREFLAG() {
        return this.RETIREFLAG;
    }
      

    private java.math.BigDecimal CSREXPIREPERIOD;
    
    public void setCSREXPIREPERIOD(java.math.BigDecimal CSREXPIREPERIOD) {
        this.CSREXPIREPERIOD = CSREXPIREPERIOD;
    }
    
    public java.math.BigDecimal getCSREXPIREPERIOD() {
        return this.CSREXPIREPERIOD;
    }
      

    private java.math.BigDecimal CSSEXPIREPERIOD;
    
    public void setCSSEXPIREPERIOD(java.math.BigDecimal CSSEXPIREPERIOD) {
        this.CSSEXPIREPERIOD = CSSEXPIREPERIOD;
    }
    
    public java.math.BigDecimal getCSSEXPIREPERIOD() {
        return this.CSSEXPIREPERIOD;
    }
      

    private java.math.BigDecimal EXPIREPERIOD;
    
    public void setEXPIREPERIOD(java.math.BigDecimal EXPIREPERIOD) {
        this.EXPIREPERIOD = EXPIREPERIOD;
    }
    
    public java.math.BigDecimal getEXPIREPERIOD() {
        return this.EXPIREPERIOD;
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
        result.append("RETIREFLAG: " + getRETIREFLAG() + "||");
        result.append("CSREXPIREPERIOD: " + getCSREXPIREPERIOD() + "||");
        result.append("CSSEXPIREPERIOD: " + getCSSEXPIREPERIOD() + "||");
        result.append("EXPIREPERIOD: " + getEXPIREPERIOD() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}