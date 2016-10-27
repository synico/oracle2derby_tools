package com.avn.dataload.model;

public class ACPOLICY {


    private java.math.BigDecimal ACPOLICY_ID;
    
    public void setACPOLICY_ID(java.math.BigDecimal ACPOLICY_ID) {
        this.ACPOLICY_ID = ACPOLICY_ID;
    }
    
    public java.math.BigDecimal getACPOLICY_ID() {
        return this.ACPOLICY_ID;
    }
      

    private java.lang.String POLICYNAME;
    
    public void setPOLICYNAME(java.lang.String POLICYNAME) {
        this.POLICYNAME = POLICYNAME;
    }
    
    public java.lang.String getPOLICYNAME() {
        return this.POLICYNAME;
    }
      

    private java.math.BigDecimal ACRELGRP_ID;
    
    public void setACRELGRP_ID(java.math.BigDecimal ACRELGRP_ID) {
        this.ACRELGRP_ID = ACRELGRP_ID;
    }
    
    public java.math.BigDecimal getACRELGRP_ID() {
        return this.ACRELGRP_ID;
    }
      

    private java.math.BigDecimal ACACTGRP_ID;
    
    public void setACACTGRP_ID(java.math.BigDecimal ACACTGRP_ID) {
        this.ACACTGRP_ID = ACACTGRP_ID;
    }
    
    public java.math.BigDecimal getACACTGRP_ID() {
        return this.ACACTGRP_ID;
    }
      

    private java.math.BigDecimal ACRESGRP_ID;
    
    public void setACRESGRP_ID(java.math.BigDecimal ACRESGRP_ID) {
        this.ACRESGRP_ID = ACRESGRP_ID;
    }
    
    public java.math.BigDecimal getACRESGRP_ID() {
        return this.ACRESGRP_ID;
    }
      

    private java.math.BigDecimal ACRELATION_ID;
    
    public void setACRELATION_ID(java.math.BigDecimal ACRELATION_ID) {
        this.ACRELATION_ID = ACRELATION_ID;
    }
    
    public java.math.BigDecimal getACRELATION_ID() {
        return this.ACRELATION_ID;
    }
      

    private java.math.BigDecimal POLICYTYPE;
    
    public void setPOLICYTYPE(java.math.BigDecimal POLICYTYPE) {
        this.POLICYTYPE = POLICYTYPE;
    }
    
    public java.math.BigDecimal getPOLICYTYPE() {
        return this.POLICYTYPE;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.math.BigDecimal MBRGRP_ID;
    
    public void setMBRGRP_ID(java.math.BigDecimal MBRGRP_ID) {
        this.MBRGRP_ID = MBRGRP_ID;
    }
    
    public java.math.BigDecimal getMBRGRP_ID() {
        return this.MBRGRP_ID;
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
        result.append("ACPOLICY_ID: " + getACPOLICY_ID() + "||");
        result.append("POLICYNAME: " + getPOLICYNAME() + "||");
        result.append("ACRELGRP_ID: " + getACRELGRP_ID() + "||");
        result.append("ACACTGRP_ID: " + getACACTGRP_ID() + "||");
        result.append("ACRESGRP_ID: " + getACRESGRP_ID() + "||");
        result.append("ACRELATION_ID: " + getACRELATION_ID() + "||");
        result.append("POLICYTYPE: " + getPOLICYTYPE() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("MBRGRP_ID: " + getMBRGRP_ID() + "||");
        result.append("MEMBER_ID: " + getMEMBER_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}