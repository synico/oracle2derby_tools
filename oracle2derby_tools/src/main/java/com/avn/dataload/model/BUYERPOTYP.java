package com.avn.dataload.model;

public class BUYERPOTYP {


    private java.math.BigDecimal BUYERPOTYP_ID;
    
    public void setBUYERPOTYP_ID(java.math.BigDecimal BUYERPOTYP_ID) {
        this.BUYERPOTYP_ID = BUYERPOTYP_ID;
    }
    
    public java.math.BigDecimal getBUYERPOTYP_ID() {
        return this.BUYERPOTYP_ID;
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
        result.append("BUYERPOTYP_ID: " + getBUYERPOTYP_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}