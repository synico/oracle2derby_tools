package com.avn.dataload.model;

public class COLLATERAL {


    private java.math.BigDecimal COLLATERAL_ID;
    
    public void setCOLLATERAL_ID(java.math.BigDecimal COLLATERAL_ID) {
        this.COLLATERAL_ID = COLLATERAL_ID;
    }
    
    public java.math.BigDecimal getCOLLATERAL_ID() {
        return this.COLLATERAL_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal COLLTYPE_ID;
    
    public void setCOLLTYPE_ID(java.math.BigDecimal COLLTYPE_ID) {
        this.COLLTYPE_ID = COLLTYPE_ID;
    }
    
    public java.math.BigDecimal getCOLLTYPE_ID() {
        return this.COLLTYPE_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String URL;
    
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }
    
    public java.lang.String getURL() {
        return this.URL;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String FIELD2;
    
    public void setFIELD2(java.lang.String FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.lang.String getFIELD2() {
        return this.FIELD2;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.math.BigDecimal BEHAVIOR;
    
    public void setBEHAVIOR(java.math.BigDecimal BEHAVIOR) {
        this.BEHAVIOR = BEHAVIOR;
    }
    
    public java.math.BigDecimal getBEHAVIOR() {
        return this.BEHAVIOR;
    }
      

    private java.math.BigDecimal UIDISPLAYABLE;
    
    public void setUIDISPLAYABLE(java.math.BigDecimal UIDISPLAYABLE) {
        this.UIDISPLAYABLE = UIDISPLAYABLE;
    }
    
    public java.math.BigDecimal getUIDISPLAYABLE() {
        return this.UIDISPLAYABLE;
    }
      

    private java.math.BigDecimal MANAGINGTOOL;
    
    public void setMANAGINGTOOL(java.math.BigDecimal MANAGINGTOOL) {
        this.MANAGINGTOOL = MANAGINGTOOL;
    }
    
    public java.math.BigDecimal getMANAGINGTOOL() {
        return this.MANAGINGTOOL;
    }
      

    private java.math.BigDecimal OVRMKTLIMIT;
    
    public void setOVRMKTLIMIT(java.math.BigDecimal OVRMKTLIMIT) {
        this.OVRMKTLIMIT = OVRMKTLIMIT;
    }
    
    public java.math.BigDecimal getOVRMKTLIMIT() {
        return this.OVRMKTLIMIT;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("COLLATERAL_ID: " + getCOLLATERAL_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("COLLTYPE_ID: " + getCOLLTYPE_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("URL: " + getURL() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("BEHAVIOR: " + getBEHAVIOR() + "||");
        result.append("UIDISPLAYABLE: " + getUIDISPLAYABLE() + "||");
        result.append("MANAGINGTOOL: " + getMANAGINGTOOL() + "||");
        result.append("OVRMKTLIMIT: " + getOVRMKTLIMIT() + "||");
        return result.toString();
    }
    
}