package com.avn.dataload.model;

public class FLSTGPDSC {


    private java.math.BigDecimal FLSTATEGP_ID;
    
    public void setFLSTATEGP_ID(java.math.BigDecimal FLSTATEGP_ID) {
        this.FLSTATEGP_ID = FLSTATEGP_ID;
    }
    
    public java.math.BigDecimal getFLSTATEGP_ID() {
        return this.FLSTATEGP_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
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
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}