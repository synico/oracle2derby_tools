package com.avn.dataload.model;

public class POLICYTYPE {


    private java.lang.String POLICYTYPE_ID;
    
    public void setPOLICYTYPE_ID(java.lang.String POLICYTYPE_ID) {
        this.POLICYTYPE_ID = POLICYTYPE_ID;
    }
    
    public java.lang.String getPOLICYTYPE_ID() {
        return this.POLICYTYPE_ID;
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
        result.append("POLICYTYPE_ID: " + getPOLICYTYPE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}