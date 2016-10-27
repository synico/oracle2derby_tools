package com.avn.dataload.model;

public class MBRGRPUSG {


    private java.math.BigDecimal MBRGRPTYPE_ID;
    
    public void setMBRGRPTYPE_ID(java.math.BigDecimal MBRGRPTYPE_ID) {
        this.MBRGRPTYPE_ID = MBRGRPTYPE_ID;
    }
    
    public java.math.BigDecimal getMBRGRPTYPE_ID() {
        return this.MBRGRPTYPE_ID;
    }
      

    private java.math.BigDecimal MBRGRP_ID;
    
    public void setMBRGRP_ID(java.math.BigDecimal MBRGRP_ID) {
        this.MBRGRP_ID = MBRGRP_ID;
    }
    
    public java.math.BigDecimal getMBRGRP_ID() {
        return this.MBRGRP_ID;
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
        result.append("MBRGRPTYPE_ID: " + getMBRGRPTYPE_ID() + "||");
        result.append("MBRGRP_ID: " + getMBRGRP_ID() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}