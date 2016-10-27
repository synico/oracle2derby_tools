package com.avn.dataload.model;

public class CMFILEDIR {


    private java.math.BigDecimal CMFILEDIR_ID;
    
    public void setCMFILEDIR_ID(java.math.BigDecimal CMFILEDIR_ID) {
        this.CMFILEDIR_ID = CMFILEDIR_ID;
    }
    
    public java.math.BigDecimal getCMFILEDIR_ID() {
        return this.CMFILEDIR_ID;
    }
      

    private java.math.BigDecimal CMFILEDIR_PARENT;
    
    public void setCMFILEDIR_PARENT(java.math.BigDecimal CMFILEDIR_PARENT) {
        this.CMFILEDIR_PARENT = CMFILEDIR_PARENT;
    }
    
    public java.math.BigDecimal getCMFILEDIR_PARENT() {
        return this.CMFILEDIR_PARENT;
    }
      

    private java.lang.String IDENTIFIER;
    
    public void setIDENTIFIER(java.lang.String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
    
    public java.lang.String getIDENTIFIER() {
        return this.IDENTIFIER;
    }
      

    private java.lang.String DISPLAYNAME;
    
    public void setDISPLAYNAME(java.lang.String DISPLAYNAME) {
        this.DISPLAYNAME = DISPLAYNAME;
    }
    
    public java.lang.String getDISPLAYNAME() {
        return this.DISPLAYNAME;
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
        result.append("CMFILEDIR_ID: " + getCMFILEDIR_ID() + "||");
        result.append("CMFILEDIR_PARENT: " + getCMFILEDIR_PARENT() + "||");
        result.append("IDENTIFIER: " + getIDENTIFIER() + "||");
        result.append("DISPLAYNAME: " + getDISPLAYNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}