package com.avn.dataload.model;

public class MGPCONDELE {


    private java.math.BigDecimal MGPCONDELE_ID;
    
    public void setMGPCONDELE_ID(java.math.BigDecimal MGPCONDELE_ID) {
        this.MGPCONDELE_ID = MGPCONDELE_ID;
    }
    
    public java.math.BigDecimal getMGPCONDELE_ID() {
        return this.MGPCONDELE_ID;
    }
      

    private java.math.BigDecimal MBRGRP_ID;
    
    public void setMBRGRP_ID(java.math.BigDecimal MBRGRP_ID) {
        this.MBRGRP_ID = MBRGRP_ID;
    }
    
    public java.math.BigDecimal getMBRGRP_ID() {
        return this.MBRGRP_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String TYPE;
    
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }
    
    public java.lang.String getTYPE() {
        return this.TYPE;
    }
      

    private java.lang.String PARENT;
    
    public void setPARENT(java.lang.String PARENT) {
        this.PARENT = PARENT;
    }
    
    public java.lang.String getPARENT() {
        return this.PARENT;
    }
      

    private java.math.BigDecimal SEQUENCE;
    
    public void setSEQUENCE(java.math.BigDecimal SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }
    
    public java.math.BigDecimal getSEQUENCE() {
        return this.SEQUENCE;
    }
      

    private java.lang.String VARIABLE;
    
    public void setVARIABLE(java.lang.String VARIABLE) {
        this.VARIABLE = VARIABLE;
    }
    
    public java.lang.String getVARIABLE() {
        return this.VARIABLE;
    }
      

    private java.lang.String OPERATOR;
    
    public void setOPERATOR(java.lang.String OPERATOR) {
        this.OPERATOR = OPERATOR;
    }
    
    public java.lang.String getOPERATOR() {
        return this.OPERATOR;
    }
      

    private java.lang.String VALUE;
    
    public void setVALUE(java.lang.String VALUE) {
        this.VALUE = VALUE;
    }
    
    public java.lang.String getVALUE() {
        return this.VALUE;
    }
      

    private java.lang.String CONDNAME;
    
    public void setCONDNAME(java.lang.String CONDNAME) {
        this.CONDNAME = CONDNAME;
    }
    
    public java.lang.String getCONDNAME() {
        return this.CONDNAME;
    }
      

    private java.math.BigDecimal NEGATE;
    
    public void setNEGATE(java.math.BigDecimal NEGATE) {
        this.NEGATE = NEGATE;
    }
    
    public java.math.BigDecimal getNEGATE() {
        return this.NEGATE;
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
        result.append("MGPCONDELE_ID: " + getMGPCONDELE_ID() + "||");
        result.append("MBRGRP_ID: " + getMBRGRP_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("PARENT: " + getPARENT() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("VARIABLE: " + getVARIABLE() + "||");
        result.append("OPERATOR: " + getOPERATOR() + "||");
        result.append("VALUE: " + getVALUE() + "||");
        result.append("CONDNAME: " + getCONDNAME() + "||");
        result.append("NEGATE: " + getNEGATE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}