package com.avn.dataload.model;

public class ACRESACT {


    private java.math.BigDecimal ACRESCGRY_ID;
    
    public void setACRESCGRY_ID(java.math.BigDecimal ACRESCGRY_ID) {
        this.ACRESCGRY_ID = ACRESCGRY_ID;
    }
    
    public java.math.BigDecimal getACRESCGRY_ID() {
        return this.ACRESCGRY_ID;
    }
      

    private java.math.BigDecimal ACACTION_ID;
    
    public void setACACTION_ID(java.math.BigDecimal ACACTION_ID) {
        this.ACACTION_ID = ACACTION_ID;
    }
    
    public java.math.BigDecimal getACACTION_ID() {
        return this.ACACTION_ID;
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
        result.append("ACRESCGRY_ID: " + getACRESCGRY_ID() + "||");
        result.append("ACACTION_ID: " + getACACTION_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}