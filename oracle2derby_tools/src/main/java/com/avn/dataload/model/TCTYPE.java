package com.avn.dataload.model;

public class TCTYPE {


    private java.lang.String TCTYPE_ID;
    
    public void setTCTYPE_ID(java.lang.String TCTYPE_ID) {
        this.TCTYPE_ID = TCTYPE_ID;
    }
    
    public java.lang.String getTCTYPE_ID() {
        return this.TCTYPE_ID;
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
        result.append("TCTYPE_ID: " + getTCTYPE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}