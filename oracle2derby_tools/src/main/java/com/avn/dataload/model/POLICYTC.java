package com.avn.dataload.model;

public class POLICYTC {


    private java.math.BigDecimal TERMCOND_ID;
    
    public void setTERMCOND_ID(java.math.BigDecimal TERMCOND_ID) {
        this.TERMCOND_ID = TERMCOND_ID;
    }
    
    public java.math.BigDecimal getTERMCOND_ID() {
        return this.TERMCOND_ID;
    }
      

    private java.math.BigDecimal POLICY_ID;
    
    public void setPOLICY_ID(java.math.BigDecimal POLICY_ID) {
        this.POLICY_ID = POLICY_ID;
    }
    
    public java.math.BigDecimal getPOLICY_ID() {
        return this.POLICY_ID;
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
        result.append("TERMCOND_ID: " + getTERMCOND_ID() + "||");
        result.append("POLICY_ID: " + getPOLICY_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}