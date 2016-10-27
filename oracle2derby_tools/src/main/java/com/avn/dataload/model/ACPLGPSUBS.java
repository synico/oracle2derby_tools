package com.avn.dataload.model;

public class ACPLGPSUBS {


    private java.math.BigDecimal ACPOLGRP_ID;
    
    public void setACPOLGRP_ID(java.math.BigDecimal ACPOLGRP_ID) {
        this.ACPOLGRP_ID = ACPOLGRP_ID;
    }
    
    public java.math.BigDecimal getACPOLGRP_ID() {
        return this.ACPOLGRP_ID;
    }
      

    private java.math.BigDecimal ORGENTITY_ID;
    
    public void setORGENTITY_ID(java.math.BigDecimal ORGENTITY_ID) {
        this.ORGENTITY_ID = ORGENTITY_ID;
    }
    
    public java.math.BigDecimal getORGENTITY_ID() {
        return this.ORGENTITY_ID;
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
        result.append("ACPOLGRP_ID: " + getACPOLGRP_ID() + "||");
        result.append("ORGENTITY_ID: " + getORGENTITY_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}