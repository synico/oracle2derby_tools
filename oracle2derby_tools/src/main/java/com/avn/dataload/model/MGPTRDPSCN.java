package com.avn.dataload.model;

public class MGPTRDPSCN {


    private java.math.BigDecimal MBRGRP_ID;
    
    public void setMBRGRP_ID(java.math.BigDecimal MBRGRP_ID) {
        this.MBRGRP_ID = MBRGRP_ID;
    }
    
    public java.math.BigDecimal getMBRGRP_ID() {
        return this.MBRGRP_ID;
    }
      

    private java.math.BigDecimal TRADEPOSCN_ID;
    
    public void setTRADEPOSCN_ID(java.math.BigDecimal TRADEPOSCN_ID) {
        this.TRADEPOSCN_ID = TRADEPOSCN_ID;
    }
    
    public java.math.BigDecimal getTRADEPOSCN_ID() {
        return this.TRADEPOSCN_ID;
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
        result.append("TRADEPOSCN_ID: " + getTRADEPOSCN_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}