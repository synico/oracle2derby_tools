package com.avn.dataload.model;

public class TFALGOTYPE {


    private java.math.BigDecimal TFALGOTYPE_ID;
    
    public void setTFALGOTYPE_ID(java.math.BigDecimal TFALGOTYPE_ID) {
        this.TFALGOTYPE_ID = TFALGOTYPE_ID;
    }
    
    public java.math.BigDecimal getTFALGOTYPE_ID() {
        return this.TFALGOTYPE_ID;
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
        result.append("TFALGOTYPE_ID: " + getTFALGOTYPE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}