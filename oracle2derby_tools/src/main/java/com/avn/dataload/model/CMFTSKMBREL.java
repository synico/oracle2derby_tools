package com.avn.dataload.model;

public class CMFTSKMBREL {


    private java.math.BigDecimal CMFTASK_ID;
    
    public void setCMFTASK_ID(java.math.BigDecimal CMFTASK_ID) {
        this.CMFTASK_ID = CMFTASK_ID;
    }
    
    public java.math.BigDecimal getCMFTASK_ID() {
        return this.CMFTASK_ID;
    }
      

    private java.math.BigDecimal MEMBER_ID;
    
    public void setMEMBER_ID(java.math.BigDecimal MEMBER_ID) {
        this.MEMBER_ID = MEMBER_ID;
    }
    
    public java.math.BigDecimal getMEMBER_ID() {
        return this.MEMBER_ID;
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
        result.append("CMFTASK_ID: " + getCMFTASK_ID() + "||");
        result.append("MEMBER_ID: " + getMEMBER_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}