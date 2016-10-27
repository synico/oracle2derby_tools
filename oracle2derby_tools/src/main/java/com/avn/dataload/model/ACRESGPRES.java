package com.avn.dataload.model;

public class ACRESGPRES {


    private java.math.BigDecimal ACRESGRP_ID;
    
    public void setACRESGRP_ID(java.math.BigDecimal ACRESGRP_ID) {
        this.ACRESGRP_ID = ACRESGRP_ID;
    }
    
    public java.math.BigDecimal getACRESGRP_ID() {
        return this.ACRESGRP_ID;
    }
      

    private java.math.BigDecimal ACRESCGRY_ID;
    
    public void setACRESCGRY_ID(java.math.BigDecimal ACRESCGRY_ID) {
        this.ACRESCGRY_ID = ACRESCGRY_ID;
    }
    
    public java.math.BigDecimal getACRESCGRY_ID() {
        return this.ACRESCGRY_ID;
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
        result.append("ACRESGRP_ID: " + getACRESGRP_ID() + "||");
        result.append("ACRESCGRY_ID: " + getACRESCGRY_ID() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}