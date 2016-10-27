package com.avn.dataload.model;

public class EMLMSG {


    private java.math.BigDecimal EMLMSG_ID;
    
    public void setEMLMSG_ID(java.math.BigDecimal EMLMSG_ID) {
        this.EMLMSG_ID = EMLMSG_ID;
    }
    
    public java.math.BigDecimal getEMLMSG_ID() {
        return this.EMLMSG_ID;
    }
      

    private java.lang.String JSPPATH;
    
    public void setJSPPATH(java.lang.String JSPPATH) {
        this.JSPPATH = JSPPATH;
    }
    
    public java.lang.String getJSPPATH() {
        return this.JSPPATH;
    }
      

    private java.lang.String PROPERTYFILE;
    
    public void setPROPERTYFILE(java.lang.String PROPERTYFILE) {
        this.PROPERTYFILE = PROPERTYFILE;
    }
    
    public java.lang.String getPROPERTYFILE() {
        return this.PROPERTYFILE;
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
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.math.BigDecimal STATUS;
    
    public void setSTATUS(java.math.BigDecimal STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.math.BigDecimal getSTATUS() {
        return this.STATUS;
    }
      

    private java.math.BigDecimal EMLBODYTYPE;
    
    public void setEMLBODYTYPE(java.math.BigDecimal EMLBODYTYPE) {
        this.EMLBODYTYPE = EMLBODYTYPE;
    }
    
    public java.math.BigDecimal getEMLBODYTYPE() {
        return this.EMLBODYTYPE;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("EMLMSG_ID: " + getEMLMSG_ID() + "||");
        result.append("JSPPATH: " + getJSPPATH() + "||");
        result.append("PROPERTYFILE: " + getPROPERTYFILE() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("EMLBODYTYPE: " + getEMLBODYTYPE() + "||");
        return result.toString();
    }
    
}