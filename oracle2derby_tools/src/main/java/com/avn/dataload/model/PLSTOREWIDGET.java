package com.avn.dataload.model;

public class PLSTOREWIDGET {


    private java.math.BigDecimal PLSTOREWIDGET_ID;
    
    public void setPLSTOREWIDGET_ID(java.math.BigDecimal PLSTOREWIDGET_ID) {
        this.PLSTOREWIDGET_ID = PLSTOREWIDGET_ID;
    }
    
    public java.math.BigDecimal getPLSTOREWIDGET_ID() {
        return this.PLSTOREWIDGET_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal PLWIDGETDEF_ID;
    
    public void setPLWIDGETDEF_ID(java.math.BigDecimal PLWIDGETDEF_ID) {
        this.PLWIDGETDEF_ID = PLWIDGETDEF_ID;
    }
    
    public java.math.BigDecimal getPLWIDGETDEF_ID() {
        return this.PLWIDGETDEF_ID;
    }
      

    private java.math.BigDecimal STATE;
    
    public void setSTATE(java.math.BigDecimal STATE) {
        this.STATE = STATE;
    }
    
    public java.math.BigDecimal getSTATE() {
        return this.STATE;
    }
      

    private java.sql.Clob DEFINITIONXML;
    
    public void setDEFINITIONXML(java.sql.Clob DEFINITIONXML) {
        this.DEFINITIONXML = DEFINITIONXML;
    }
    
    public java.sql.Clob getDEFINITIONXML() {
        return this.DEFINITIONXML;
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
        result.append("PLSTOREWIDGET_ID: " + getPLSTOREWIDGET_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("PLWIDGETDEF_ID: " + getPLWIDGETDEF_ID() + "||");
        result.append("STATE: " + getSTATE() + "||");
        result.append("DEFINITIONXML: " + getDEFINITIONXML() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}