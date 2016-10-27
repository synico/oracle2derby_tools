package com.avn.dataload.model;

public class DMMBRGRPPZN {


    private java.math.BigDecimal MBRGRP_ID;
    
    public void setMBRGRP_ID(java.math.BigDecimal MBRGRP_ID) {
        this.MBRGRP_ID = MBRGRP_ID;
    }
    
    public java.math.BigDecimal getMBRGRP_ID() {
        return this.MBRGRP_ID;
    }
      

    private java.lang.String PERSONALIZATIONID;
    
    public void setPERSONALIZATIONID(java.lang.String PERSONALIZATIONID) {
        this.PERSONALIZATIONID = PERSONALIZATIONID;
    }
    
    public java.lang.String getPERSONALIZATIONID() {
        return this.PERSONALIZATIONID;
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
        result.append("PERSONALIZATIONID: " + getPERSONALIZATIONID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}