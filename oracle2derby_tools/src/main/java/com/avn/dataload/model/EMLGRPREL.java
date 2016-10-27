package com.avn.dataload.model;

public class EMLGRPREL {


    private java.math.BigDecimal MBRGRP_ID;
    
    public void setMBRGRP_ID(java.math.BigDecimal MBRGRP_ID) {
        this.MBRGRP_ID = MBRGRP_ID;
    }
    
    public java.math.BigDecimal getMBRGRP_ID() {
        return this.MBRGRP_ID;
    }
      

    private java.math.BigDecimal EMLPROMO_ID;
    
    public void setEMLPROMO_ID(java.math.BigDecimal EMLPROMO_ID) {
        this.EMLPROMO_ID = EMLPROMO_ID;
    }
    
    public java.math.BigDecimal getEMLPROMO_ID() {
        return this.EMLPROMO_ID;
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
        result.append("MBRGRP_ID: " + getMBRGRP_ID() + "||");
        result.append("EMLPROMO_ID: " + getEMLPROMO_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}