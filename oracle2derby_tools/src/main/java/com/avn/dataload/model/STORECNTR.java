package com.avn.dataload.model;

public class STORECNTR {


    private java.math.BigDecimal CONTRACT_ID;
    
    public void setCONTRACT_ID(java.math.BigDecimal CONTRACT_ID) {
        this.CONTRACT_ID = CONTRACT_ID;
    }
    
    public java.math.BigDecimal getCONTRACT_ID() {
        return this.CONTRACT_ID;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
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
        result.append("CONTRACT_ID: " + getCONTRACT_ID() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}