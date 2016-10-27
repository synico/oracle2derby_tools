package com.avn.dataload.model;

public class CMWSSCHEMA {


    private java.math.BigDecimal CMWSSCHEMA_ID;
    
    public void setCMWSSCHEMA_ID(java.math.BigDecimal CMWSSCHEMA_ID) {
        this.CMWSSCHEMA_ID = CMWSSCHEMA_ID;
    }
    
    public java.math.BigDecimal getCMWSSCHEMA_ID() {
        return this.CMWSSCHEMA_ID;
    }
      

    private java.lang.String BASESCHEMA;
    
    public void setBASESCHEMA(java.lang.String BASESCHEMA) {
        this.BASESCHEMA = BASESCHEMA;
    }
    
    public java.lang.String getBASESCHEMA() {
        return this.BASESCHEMA;
    }
      

    private java.lang.String WRITESCHEMA;
    
    public void setWRITESCHEMA(java.lang.String WRITESCHEMA) {
        this.WRITESCHEMA = WRITESCHEMA;
    }
    
    public java.lang.String getWRITESCHEMA() {
        return this.WRITESCHEMA;
    }
      

    private java.lang.String READSCHEMA;
    
    public void setREADSCHEMA(java.lang.String READSCHEMA) {
        this.READSCHEMA = READSCHEMA;
    }
    
    public java.lang.String getREADSCHEMA() {
        return this.READSCHEMA;
    }
      

    private java.lang.String WORKSPACE;
    
    public void setWORKSPACE(java.lang.String WORKSPACE) {
        this.WORKSPACE = WORKSPACE;
    }
    
    public java.lang.String getWORKSPACE() {
        return this.WORKSPACE;
    }
      

    private java.math.BigDecimal ALLOCATED;
    
    public void setALLOCATED(java.math.BigDecimal ALLOCATED) {
        this.ALLOCATED = ALLOCATED;
    }
    
    public java.math.BigDecimal getALLOCATED() {
        return this.ALLOCATED;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.math.BigDecimal SYNCREQUIRED;
    
    public void setSYNCREQUIRED(java.math.BigDecimal SYNCREQUIRED) {
        this.SYNCREQUIRED = SYNCREQUIRED;
    }
    
    public java.math.BigDecimal getSYNCREQUIRED() {
        return this.SYNCREQUIRED;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("CMWSSCHEMA_ID: " + getCMWSSCHEMA_ID() + "||");
        result.append("BASESCHEMA: " + getBASESCHEMA() + "||");
        result.append("WRITESCHEMA: " + getWRITESCHEMA() + "||");
        result.append("READSCHEMA: " + getREADSCHEMA() + "||");
        result.append("WORKSPACE: " + getWORKSPACE() + "||");
        result.append("ALLOCATED: " + getALLOCATED() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("SYNCREQUIRED: " + getSYNCREQUIRED() + "||");
        return result.toString();
    }
    
}