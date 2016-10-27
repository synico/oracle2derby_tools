package com.avn.dataload.model;

public class EMLRCPTS {


    private java.math.BigDecimal EMLPROMO_ID;
    
    public void setEMLPROMO_ID(java.math.BigDecimal EMLPROMO_ID) {
        this.EMLPROMO_ID = EMLPROMO_ID;
    }
    
    public java.math.BigDecimal getEMLPROMO_ID() {
        return this.EMLPROMO_ID;
    }
      

    private java.math.BigDecimal COUNT;
    
    public void setCOUNT(java.math.BigDecimal COUNT) {
        this.COUNT = COUNT;
    }
    
    public java.math.BigDecimal getCOUNT() {
        return this.COUNT;
    }
      

    private java.sql.Clob RECIPIENTS;
    
    public void setRECIPIENTS(java.sql.Clob RECIPIENTS) {
        this.RECIPIENTS = RECIPIENTS;
    }
    
    public java.sql.Clob getRECIPIENTS() {
        return this.RECIPIENTS;
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
        result.append("EMLPROMO_ID: " + getEMLPROMO_ID() + "||");
        result.append("COUNT: " + getCOUNT() + "||");
        result.append("RECIPIENTS: " + getRECIPIENTS() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}