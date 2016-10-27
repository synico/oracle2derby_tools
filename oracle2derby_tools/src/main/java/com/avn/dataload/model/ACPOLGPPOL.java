package com.avn.dataload.model;

public class ACPOLGPPOL {


    private java.math.BigDecimal ACPOLICY_ID;
    
    public void setACPOLICY_ID(java.math.BigDecimal ACPOLICY_ID) {
        this.ACPOLICY_ID = ACPOLICY_ID;
    }
    
    public java.math.BigDecimal getACPOLICY_ID() {
        return this.ACPOLICY_ID;
    }
      

    private java.math.BigDecimal ACPOLGRP_ID;
    
    public void setACPOLGRP_ID(java.math.BigDecimal ACPOLGRP_ID) {
        this.ACPOLGRP_ID = ACPOLGRP_ID;
    }
    
    public java.math.BigDecimal getACPOLGRP_ID() {
        return this.ACPOLGRP_ID;
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
        result.append("ACPOLICY_ID: " + getACPOLICY_ID() + "||");
        result.append("ACPOLGRP_ID: " + getACPOLGRP_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}