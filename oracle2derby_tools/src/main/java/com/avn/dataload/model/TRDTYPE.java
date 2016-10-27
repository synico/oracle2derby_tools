package com.avn.dataload.model;

public class TRDTYPE {


    private java.math.BigDecimal TRDTYPE_ID;
    
    public void setTRDTYPE_ID(java.math.BigDecimal TRDTYPE_ID) {
        this.TRDTYPE_ID = TRDTYPE_ID;
    }
    
    public java.math.BigDecimal getTRDTYPE_ID() {
        return this.TRDTYPE_ID;
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
        result.append("TRDTYPE_ID: " + getTRDTYPE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}