package com.avn.dataload.model;

public class CMFTGTSKREL {


    private java.math.BigDecimal CMFTASK_ID;
    
    public void setCMFTASK_ID(java.math.BigDecimal CMFTASK_ID) {
        this.CMFTASK_ID = CMFTASK_ID;
    }
    
    public java.math.BigDecimal getCMFTASK_ID() {
        return this.CMFTASK_ID;
    }
      

    private java.math.BigDecimal CMFTASKGRP_ID;
    
    public void setCMFTASKGRP_ID(java.math.BigDecimal CMFTASKGRP_ID) {
        this.CMFTASKGRP_ID = CMFTASKGRP_ID;
    }
    
    public java.math.BigDecimal getCMFTASKGRP_ID() {
        return this.CMFTASKGRP_ID;
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
        result.append("CMFTASKGRP_ID: " + getCMFTASKGRP_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}