package com.avn.dataload.model;

public class FLINSTANCE {


    private java.math.BigDecimal FLOW_ID;
    
    public void setFLOW_ID(java.math.BigDecimal FLOW_ID) {
        this.FLOW_ID = FLOW_ID;
    }
    
    public java.math.BigDecimal getFLOW_ID() {
        return this.FLOW_ID;
    }
      

    private java.math.BigDecimal FLOWTYPE_ID;
    
    public void setFLOWTYPE_ID(java.math.BigDecimal FLOWTYPE_ID) {
        this.FLOWTYPE_ID = FLOWTYPE_ID;
    }
    
    public java.math.BigDecimal getFLOWTYPE_ID() {
        return this.FLOWTYPE_ID;
    }
      

    private java.math.BigDecimal ENTITY_ID;
    
    public void setENTITY_ID(java.math.BigDecimal ENTITY_ID) {
        this.ENTITY_ID = ENTITY_ID;
    }
    
    public java.math.BigDecimal getENTITY_ID() {
        return this.ENTITY_ID;
    }
      

    private java.math.BigDecimal CURSTATEIDENTIFIER;
    
    public void setCURSTATEIDENTIFIER(java.math.BigDecimal CURSTATEIDENTIFIER) {
        this.CURSTATEIDENTIFIER = CURSTATEIDENTIFIER;
    }
    
    public java.math.BigDecimal getCURSTATEIDENTIFIER() {
        return this.CURSTATEIDENTIFIER;
    }
      

    private java.lang.String FLOWSTAGES;
    
    public void setFLOWSTAGES(java.lang.String FLOWSTAGES) {
        this.FLOWSTAGES = FLOWSTAGES;
    }
    
    public java.lang.String getFLOWSTAGES() {
        return this.FLOWSTAGES;
    }
      

    private java.math.BigDecimal CURRSTAGEINDEX;
    
    public void setCURRSTAGEINDEX(java.math.BigDecimal CURRSTAGEINDEX) {
        this.CURRSTAGEINDEX = CURRSTAGEINDEX;
    }
    
    public java.math.BigDecimal getCURRSTAGEINDEX() {
        return this.CURRSTAGEINDEX;
    }
      

    private java.sql.Timestamp LASTUPDATETIME;
    
    public void setLASTUPDATETIME(java.sql.Timestamp LASTUPDATETIME) {
        this.LASTUPDATETIME = LASTUPDATETIME;
    }
    
    public java.sql.Timestamp getLASTUPDATETIME() {
        return this.LASTUPDATETIME;
    }
      

    private java.lang.String FLOWCONTEXT;
    
    public void setFLOWCONTEXT(java.lang.String FLOWCONTEXT) {
        this.FLOWCONTEXT = FLOWCONTEXT;
    }
    
    public java.lang.String getFLOWCONTEXT() {
        return this.FLOWCONTEXT;
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
        result.append("FLOW_ID: " + getFLOW_ID() + "||");
        result.append("FLOWTYPE_ID: " + getFLOWTYPE_ID() + "||");
        result.append("ENTITY_ID: " + getENTITY_ID() + "||");
        result.append("CURSTATEIDENTIFIER: " + getCURSTATEIDENTIFIER() + "||");
        result.append("FLOWSTAGES: " + getFLOWSTAGES() + "||");
        result.append("CURRSTAGEINDEX: " + getCURRSTAGEINDEX() + "||");
        result.append("LASTUPDATETIME: " + getLASTUPDATETIME() + "||");
        result.append("FLOWCONTEXT: " + getFLOWCONTEXT() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}