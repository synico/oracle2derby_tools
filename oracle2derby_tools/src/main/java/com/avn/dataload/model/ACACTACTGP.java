package com.avn.dataload.model;

public class ACACTACTGP {


    private java.math.BigDecimal ACACTGRP_ID;
    
    public void setACACTGRP_ID(java.math.BigDecimal ACACTGRP_ID) {
        this.ACACTGRP_ID = ACACTGRP_ID;
    }
    
    public java.math.BigDecimal getACACTGRP_ID() {
        return this.ACACTGRP_ID;
    }
      

    private java.math.BigDecimal ACACTION_ID;
    
    public void setACACTION_ID(java.math.BigDecimal ACACTION_ID) {
        this.ACACTION_ID = ACACTION_ID;
    }
    
    public java.math.BigDecimal getACACTION_ID() {
        return this.ACACTION_ID;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
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
        result.append("ACACTGRP_ID: " + getACACTGRP_ID() + "||");
        result.append("ACACTION_ID: " + getACACTION_ID() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}