package com.avn.dataload.model;

public class COLLTYPE {


    private java.math.BigDecimal COLLTYPE_ID;
    
    public void setCOLLTYPE_ID(java.math.BigDecimal COLLTYPE_ID) {
        this.COLLTYPE_ID = COLLTYPE_ID;
    }
    
    public java.math.BigDecimal getCOLLTYPE_ID() {
        return this.COLLTYPE_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
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
        result.append("COLLTYPE_ID: " + getCOLLTYPE_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}