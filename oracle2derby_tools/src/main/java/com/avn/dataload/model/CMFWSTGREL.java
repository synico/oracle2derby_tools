package com.avn.dataload.model;

public class CMFWSTGREL {


    private java.math.BigDecimal CMFWKSPC_ID;
    
    public void setCMFWKSPC_ID(java.math.BigDecimal CMFWKSPC_ID) {
        this.CMFWKSPC_ID = CMFWKSPC_ID;
    }
    
    public java.math.BigDecimal getCMFWKSPC_ID() {
        return this.CMFWKSPC_ID;
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
        result.append("CMFWKSPC_ID: " + getCMFWKSPC_ID() + "||");
        result.append("CMFTASKGRP_ID: " + getCMFTASKGRP_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}