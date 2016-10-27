package com.avn.dataload.model;

public class EMLPROMO {


    private java.math.BigDecimal EMLPROMO_ID;
    
    public void setEMLPROMO_ID(java.math.BigDecimal EMLPROMO_ID) {
        this.EMLPROMO_ID = EMLPROMO_ID;
    }
    
    public java.math.BigDecimal getEMLPROMO_ID() {
        return this.EMLPROMO_ID;
    }
      

    private java.math.BigDecimal STATUS;
    
    public void setSTATUS(java.math.BigDecimal STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.math.BigDecimal getSTATUS() {
        return this.STATUS;
    }
      

    private java.lang.String MODIFIEDBY;
    
    public void setMODIFIEDBY(java.lang.String MODIFIEDBY) {
        this.MODIFIEDBY = MODIFIEDBY;
    }
    
    public java.lang.String getMODIFIEDBY() {
        return this.MODIFIEDBY;
    }
      

    private java.sql.Timestamp MODDATE;
    
    public void setMODDATE(java.sql.Timestamp MODDATE) {
        this.MODDATE = MODDATE;
    }
    
    public java.sql.Timestamp getMODDATE() {
        return this.MODDATE;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.math.BigDecimal EMLMSG_ID;
    
    public void setEMLMSG_ID(java.math.BigDecimal EMLMSG_ID) {
        this.EMLMSG_ID = EMLMSG_ID;
    }
    
    public java.math.BigDecimal getEMLMSG_ID() {
        return this.EMLMSG_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal SCCJOBREFNUM;
    
    public void setSCCJOBREFNUM(java.math.BigDecimal SCCJOBREFNUM) {
        this.SCCJOBREFNUM = SCCJOBREFNUM;
    }
    
    public java.math.BigDecimal getSCCJOBREFNUM() {
        return this.SCCJOBREFNUM;
    }
      

    private java.lang.String REPLYTO;
    
    public void setREPLYTO(java.lang.String REPLYTO) {
        this.REPLYTO = REPLYTO;
    }
    
    public java.lang.String getREPLYTO() {
        return this.REPLYTO;
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
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("MODIFIEDBY: " + getMODIFIEDBY() + "||");
        result.append("MODDATE: " + getMODDATE() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("EMLMSG_ID: " + getEMLMSG_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("SCCJOBREFNUM: " + getSCCJOBREFNUM() + "||");
        result.append("REPLYTO: " + getREPLYTO() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}