package com.avn.dataload.model;

public class DISPENTREL {


    private java.math.BigDecimal CATENTRY_ID;
    
    public void setCATENTRY_ID(java.math.BigDecimal CATENTRY_ID) {
        this.CATENTRY_ID = CATENTRY_ID;
    }
    
    public java.math.BigDecimal getCATENTRY_ID() {
        return this.CATENTRY_ID;
    }
      

    private java.math.BigDecimal DISPENTREL_ID;
    
    public void setDISPENTREL_ID(java.math.BigDecimal DISPENTREL_ID) {
        this.DISPENTREL_ID = DISPENTREL_ID;
    }
    
    public java.math.BigDecimal getDISPENTREL_ID() {
        return this.DISPENTREL_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.math.BigDecimal DEVICEFMT_ID;
    
    public void setDEVICEFMT_ID(java.math.BigDecimal DEVICEFMT_ID) {
        this.DEVICEFMT_ID = DEVICEFMT_ID;
    }
    
    public java.math.BigDecimal getDEVICEFMT_ID() {
        return this.DEVICEFMT_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.lang.String PAGENAME;
    
    public void setPAGENAME(java.lang.String PAGENAME) {
        this.PAGENAME = PAGENAME;
    }
    
    public java.lang.String getPAGENAME() {
        return this.PAGENAME;
    }
      

    private java.lang.String CATENTTYPE_ID;
    
    public void setCATENTTYPE_ID(java.lang.String CATENTTYPE_ID) {
        this.CATENTTYPE_ID = CATENTTYPE_ID;
    }
    
    public java.lang.String getCATENTTYPE_ID() {
        return this.CATENTTYPE_ID;
    }
      

    private java.math.BigDecimal AUCTIONSTATE;
    
    public void setAUCTIONSTATE(java.math.BigDecimal AUCTIONSTATE) {
        this.AUCTIONSTATE = AUCTIONSTATE;
    }
    
    public java.math.BigDecimal getAUCTIONSTATE() {
        return this.AUCTIONSTATE;
    }
      

    private java.math.BigDecimal MBRGRP_ID;
    
    public void setMBRGRP_ID(java.math.BigDecimal MBRGRP_ID) {
        this.MBRGRP_ID = MBRGRP_ID;
    }
    
    public java.math.BigDecimal getMBRGRP_ID() {
        return this.MBRGRP_ID;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.math.BigDecimal RANK;
    
    public void setRANK(java.math.BigDecimal RANK) {
        this.RANK = RANK;
    }
    
    public java.math.BigDecimal getRANK() {
        return this.RANK;
    }
      

    private java.lang.String FIELD2;
    
    public void setFIELD2(java.lang.String FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.lang.String getFIELD2() {
        return this.FIELD2;
    }
      

    private java.lang.String OID;
    
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }
    
    public java.lang.String getOID() {
        return this.OID;
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
        result.append("CATENTRY_ID: " + getCATENTRY_ID() + "||");
        result.append("DISPENTREL_ID: " + getDISPENTREL_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("DEVICEFMT_ID: " + getDEVICEFMT_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("PAGENAME: " + getPAGENAME() + "||");
        result.append("CATENTTYPE_ID: " + getCATENTTYPE_ID() + "||");
        result.append("AUCTIONSTATE: " + getAUCTIONSTATE() + "||");
        result.append("MBRGRP_ID: " + getMBRGRP_ID() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("RANK: " + getRANK() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("OID: " + getOID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}