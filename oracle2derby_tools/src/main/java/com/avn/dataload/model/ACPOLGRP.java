package com.avn.dataload.model;

public class ACPOLGRP {


    private java.math.BigDecimal ACPOLGRP_ID;
    
    public void setACPOLGRP_ID(java.math.BigDecimal ACPOLGRP_ID) {
        this.ACPOLGRP_ID = ACPOLGRP_ID;
    }
    
    public java.math.BigDecimal getACPOLGRP_ID() {
        return this.ACPOLGRP_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
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
        result.append("ACPOLGRP_ID: " + getACPOLGRP_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("MEMBER_ID: " + getMEMBER_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}