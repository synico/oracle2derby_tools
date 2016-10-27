package com.avn.dataload.model;

public class ACACTION {


    private java.math.BigDecimal ACACTION_ID;
    
    public void setACACTION_ID(java.math.BigDecimal ACACTION_ID) {
        this.ACACTION_ID = ACACTION_ID;
    }
    
    public java.math.BigDecimal getACACTION_ID() {
        return this.ACACTION_ID;
    }
      

    private java.lang.String ACTION;
    
    public void setACTION(java.lang.String ACTION) {
        this.ACTION = ACTION;
    }
    
    public java.lang.String getACTION() {
        return this.ACTION;
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
        result.append("ACACTION_ID: " + getACACTION_ID() + "||");
        result.append("ACTION: " + getACTION() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}