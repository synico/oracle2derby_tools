package com.avn.dataload.model;

public class CMDREG {


    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.lang.String INTERFACENAME;
    
    public void setINTERFACENAME(java.lang.String INTERFACENAME) {
        this.INTERFACENAME = INTERFACENAME;
    }
    
    public java.lang.String getINTERFACENAME() {
        return this.INTERFACENAME;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String CLASSNAME;
    
    public void setCLASSNAME(java.lang.String CLASSNAME) {
        this.CLASSNAME = CLASSNAME;
    }
    
    public java.lang.String getCLASSNAME() {
        return this.CLASSNAME;
    }
      

    private java.lang.String PROPERTIES;
    
    public void setPROPERTIES(java.lang.String PROPERTIES) {
        this.PROPERTIES = PROPERTIES;
    }
    
    public java.lang.String getPROPERTIES() {
        return this.PROPERTIES;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
    }
      

    private java.lang.String TARGET;
    
    public void setTARGET(java.lang.String TARGET) {
        this.TARGET = TARGET;
    }
    
    public java.lang.String getTARGET() {
        return this.TARGET;
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
        result.append("INTERFACENAME: " + getINTERFACENAME() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("CLASSNAME: " + getCLASSNAME() + "||");
        result.append("PROPERTIES: " + getPROPERTIES() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("TARGET: " + getTARGET() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}