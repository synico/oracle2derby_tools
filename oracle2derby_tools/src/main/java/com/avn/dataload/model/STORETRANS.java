package com.avn.dataload.model;

public class STORETRANS {


    private java.math.BigDecimal TRANSPORT_ID;
    
    public void setTRANSPORT_ID(java.math.BigDecimal TRANSPORT_ID) {
        this.TRANSPORT_ID = TRANSPORT_ID;
    }
    
    public java.math.BigDecimal getTRANSPORT_ID() {
        return this.TRANSPORT_ID;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
    }
      

    private java.math.BigDecimal ACTIVE;
    
    public void setACTIVE(java.math.BigDecimal ACTIVE) {
        this.ACTIVE = ACTIVE;
    }
    
    public java.math.BigDecimal getACTIVE() {
        return this.ACTIVE;
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
        result.append("TRANSPORT_ID: " + getTRANSPORT_ID() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("ACTIVE: " + getACTIVE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}