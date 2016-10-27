package com.avn.dataload.model;

public class FLSTATEGP {


    private java.math.BigDecimal FLSTATEGP_ID;
    
    public void setFLSTATEGP_ID(java.math.BigDecimal FLSTATEGP_ID) {
        this.FLSTATEGP_ID = FLSTATEGP_ID;
    }
    
    public java.math.BigDecimal getFLSTATEGP_ID() {
        return this.FLSTATEGP_ID;
    }
      

    private java.lang.String IDENTIFIER;
    
    public void setIDENTIFIER(java.lang.String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
    
    public java.lang.String getIDENTIFIER() {
        return this.IDENTIFIER;
    }
      

    private java.math.BigDecimal FLOWTYPE_ID;
    
    public void setFLOWTYPE_ID(java.math.BigDecimal FLOWTYPE_ID) {
        this.FLOWTYPE_ID = FLOWTYPE_ID;
    }
    
    public java.math.BigDecimal getFLOWTYPE_ID() {
        return this.FLOWTYPE_ID;
    }
      

    private java.math.BigDecimal MANDATORYSTATEGP;
    
    public void setMANDATORYSTATEGP(java.math.BigDecimal MANDATORYSTATEGP) {
        this.MANDATORYSTATEGP = MANDATORYSTATEGP;
    }
    
    public java.math.BigDecimal getMANDATORYSTATEGP() {
        return this.MANDATORYSTATEGP;
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
        result.append("FLSTATEGP_ID: " + getFLSTATEGP_ID() + "||");
        result.append("IDENTIFIER: " + getIDENTIFIER() + "||");
        result.append("FLOWTYPE_ID: " + getFLOWTYPE_ID() + "||");
        result.append("MANDATORYSTATEGP: " + getMANDATORYSTATEGP() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}