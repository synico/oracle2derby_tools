package com.avn.dataload.model;

public class EMLCFG {


    private java.math.BigDecimal EMLCFG_ID;
    
    public void setEMLCFG_ID(java.math.BigDecimal EMLCFG_ID) {
        this.EMLCFG_ID = EMLCFG_ID;
    }
    
    public java.math.BigDecimal getEMLCFG_ID() {
        return this.EMLCFG_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.math.BigDecimal TYPE;
    
    public void setTYPE(java.math.BigDecimal TYPE) {
        this.TYPE = TYPE;
    }
    
    public java.math.BigDecimal getTYPE() {
        return this.TYPE;
    }
      

    private java.lang.String HOST;
    
    public void setHOST(java.lang.String HOST) {
        this.HOST = HOST;
    }
    
    public java.lang.String getHOST() {
        return this.HOST;
    }
      

    private java.math.BigDecimal TIME;
    
    public void setTIME(java.math.BigDecimal TIME) {
        this.TIME = TIME;
    }
    
    public java.math.BigDecimal getTIME() {
        return this.TIME;
    }
      

    private java.lang.String EMLSERVER;
    
    public void setEMLSERVER(java.lang.String EMLSERVER) {
        this.EMLSERVER = EMLSERVER;
    }
    
    public java.lang.String getEMLSERVER() {
        return this.EMLSERVER;
    }
      

    private java.lang.String ACCOUNT;
    
    public void setACCOUNT(java.lang.String ACCOUNT) {
        this.ACCOUNT = ACCOUNT;
    }
    
    public java.lang.String getACCOUNT() {
        return this.ACCOUNT;
    }
      

    private java.math.BigDecimal PORT;
    
    public void setPORT(java.math.BigDecimal PORT) {
        this.PORT = PORT;
    }
    
    public java.math.BigDecimal getPORT() {
        return this.PORT;
    }
      

    private byte[] PASSWORD;
    
    public void setPASSWORD(byte[] PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
    
    public byte[] getPASSWORD() {
        return this.PASSWORD;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.lang.String ADDRESS;
    
    public void setADDRESS(java.lang.String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }
    
    public java.lang.String getADDRESS() {
        return this.ADDRESS;
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
        result.append("EMLCFG_ID: " + getEMLCFG_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("HOST: " + getHOST() + "||");
        result.append("TIME: " + getTIME() + "||");
        result.append("EMLSERVER: " + getEMLSERVER() + "||");
        result.append("ACCOUNT: " + getACCOUNT() + "||");
        result.append("PORT: " + getPORT() + "||");
        result.append("PASSWORD: " + getPASSWORD() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("ADDRESS: " + getADDRESS() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}