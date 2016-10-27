package com.avn.dataload.model;

public class TCSUBTYPE {


    private java.lang.String TCSUBTYPE_ID;
    
    public void setTCSUBTYPE_ID(java.lang.String TCSUBTYPE_ID) {
        this.TCSUBTYPE_ID = TCSUBTYPE_ID;
    }
    
    public java.lang.String getTCSUBTYPE_ID() {
        return this.TCSUBTYPE_ID;
    }
      

    private java.lang.String TCTYPE_ID;
    
    public void setTCTYPE_ID(java.lang.String TCTYPE_ID) {
        this.TCTYPE_ID = TCTYPE_ID;
    }
    
    public java.lang.String getTCTYPE_ID() {
        return this.TCTYPE_ID;
    }
      

    private java.lang.String ACCESSBEANNAME;
    
    public void setACCESSBEANNAME(java.lang.String ACCESSBEANNAME) {
        this.ACCESSBEANNAME = ACCESSBEANNAME;
    }
    
    public java.lang.String getACCESSBEANNAME() {
        return this.ACCESSBEANNAME;
    }
      

    private java.lang.String DEPLOYCOMMAND;
    
    public void setDEPLOYCOMMAND(java.lang.String DEPLOYCOMMAND) {
        this.DEPLOYCOMMAND = DEPLOYCOMMAND;
    }
    
    public java.lang.String getDEPLOYCOMMAND() {
        return this.DEPLOYCOMMAND;
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
        result.append("TCSUBTYPE_ID: " + getTCSUBTYPE_ID() + "||");
        result.append("TCTYPE_ID: " + getTCTYPE_ID() + "||");
        result.append("ACCESSBEANNAME: " + getACCESSBEANNAME() + "||");
        result.append("DEPLOYCOMMAND: " + getDEPLOYCOMMAND() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}