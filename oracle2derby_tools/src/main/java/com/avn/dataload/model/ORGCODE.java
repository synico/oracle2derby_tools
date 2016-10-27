package com.avn.dataload.model;

public class ORGCODE {


    private java.math.BigDecimal ORGCODE_ID;
    
    public void setORGCODE_ID(java.math.BigDecimal ORGCODE_ID) {
        this.ORGCODE_ID = ORGCODE_ID;
    }
    
    public java.math.BigDecimal getORGCODE_ID() {
        return this.ORGCODE_ID;
    }
      

    private java.math.BigDecimal ORGENTITY_ID;
    
    public void setORGENTITY_ID(java.math.BigDecimal ORGENTITY_ID) {
        this.ORGENTITY_ID = ORGENTITY_ID;
    }
    
    public java.math.BigDecimal getORGENTITY_ID() {
        return this.ORGENTITY_ID;
    }
      

    private java.lang.String CODETYPE;
    
    public void setCODETYPE(java.lang.String CODETYPE) {
        this.CODETYPE = CODETYPE;
    }
    
    public java.lang.String getCODETYPE() {
        return this.CODETYPE;
    }
      

    private java.lang.String CODE;
    
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }
    
    public java.lang.String getCODE() {
        return this.CODE;
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
        result.append("ORGCODE_ID: " + getORGCODE_ID() + "||");
        result.append("ORGENTITY_ID: " + getORGENTITY_ID() + "||");
        result.append("CODETYPE: " + getCODETYPE() + "||");
        result.append("CODE: " + getCODE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}