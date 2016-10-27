package com.avn.dataload.model;

public class CMFTASK {


    private java.math.BigDecimal CMFTASK_ID;
    
    public void setCMFTASK_ID(java.math.BigDecimal CMFTASK_ID) {
        this.CMFTASK_ID = CMFTASK_ID;
    }
    
    public java.math.BigDecimal getCMFTASK_ID() {
        return this.CMFTASK_ID;
    }
      

    private java.lang.String IDENTIFIER;
    
    public void setIDENTIFIER(java.lang.String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
    
    public java.lang.String getIDENTIFIER() {
        return this.IDENTIFIER;
    }
      

    private java.math.BigDecimal USAGE;
    
    public void setUSAGE(java.math.BigDecimal USAGE) {
        this.USAGE = USAGE;
    }
    
    public java.math.BigDecimal getUSAGE() {
        return this.USAGE;
    }
      

    private java.sql.Timestamp DUEDATE;
    
    public void setDUEDATE(java.sql.Timestamp DUEDATE) {
        this.DUEDATE = DUEDATE;
    }
    
    public java.sql.Timestamp getDUEDATE() {
        return this.DUEDATE;
    }
      

    private java.sql.Timestamp COMPLETEDATE;
    
    public void setCOMPLETEDATE(java.sql.Timestamp COMPLETEDATE) {
        this.COMPLETEDATE = COMPLETEDATE;
    }
    
    public java.sql.Timestamp getCOMPLETEDATE() {
        return this.COMPLETEDATE;
    }
      

    private java.math.BigDecimal STATUS;
    
    public void setSTATUS(java.math.BigDecimal STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.math.BigDecimal getSTATUS() {
        return this.STATUS;
    }
      

    private java.math.BigDecimal TEMPLATETYPE;
    
    public void setTEMPLATETYPE(java.math.BigDecimal TEMPLATETYPE) {
        this.TEMPLATETYPE = TEMPLATETYPE;
    }
    
    public java.math.BigDecimal getTEMPLATETYPE() {
        return this.TEMPLATETYPE;
    }
      

    private java.math.BigDecimal TYPE;
    
    public void setTYPE(java.math.BigDecimal TYPE) {
        this.TYPE = TYPE;
    }
    
    public java.math.BigDecimal getTYPE() {
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
        result.append("CMFTASK_ID: " + getCMFTASK_ID() + "||");
        result.append("IDENTIFIER: " + getIDENTIFIER() + "||");
        result.append("USAGE: " + getUSAGE() + "||");
        result.append("DUEDATE: " + getDUEDATE() + "||");
        result.append("COMPLETEDATE: " + getCOMPLETEDATE() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("TEMPLATETYPE: " + getTEMPLATETYPE() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}