package com.avn.dataload.model;

public class CNTRSTORE {


    private java.math.BigDecimal CONTRACT_ID;
    
    public void setCONTRACT_ID(java.math.BigDecimal CONTRACT_ID) {
        this.CONTRACT_ID = CONTRACT_ID;
    }
    
    public java.math.BigDecimal getCONTRACT_ID() {
        return this.CONTRACT_ID;
    }
      

    private java.sql.Clob STOREXML;
    
    public void setSTOREXML(java.sql.Clob STOREXML) {
        this.STOREXML = STOREXML;
    }
    
    public java.sql.Clob getSTOREXML() {
        return this.STOREXML;
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
        result.append("CONTRACT_ID: " + getCONTRACT_ID() + "||");
        result.append("STOREXML: " + getSTOREXML() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}