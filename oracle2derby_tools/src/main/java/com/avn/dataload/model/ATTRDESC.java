package com.avn.dataload.model;

public class ATTRDESC {


    private java.math.BigDecimal ATTR_ID;
    
    public void setATTR_ID(java.math.BigDecimal ATTR_ID) {
        this.ATTR_ID = ATTR_ID;
    }
    
    public java.math.BigDecimal getATTR_ID() {
        return this.ATTR_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String ATTRTYPE_ID;
    
    public void setATTRTYPE_ID(java.lang.String ATTRTYPE_ID) {
        this.ATTRTYPE_ID = ATTRTYPE_ID;
    }
    
    public java.lang.String getATTRTYPE_ID() {
        return this.ATTRTYPE_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String DESCRIPTION2;
    
    public void setDESCRIPTION2(java.lang.String DESCRIPTION2) {
        this.DESCRIPTION2 = DESCRIPTION2;
    }
    
    public java.lang.String getDESCRIPTION2() {
        return this.DESCRIPTION2;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String GROUPNAME;
    
    public void setGROUPNAME(java.lang.String GROUPNAME) {
        this.GROUPNAME = GROUPNAME;
    }
    
    public java.lang.String getGROUPNAME() {
        return this.GROUPNAME;
    }
      

    private java.lang.String QTYUNIT_ID;
    
    public void setQTYUNIT_ID(java.lang.String QTYUNIT_ID) {
        this.QTYUNIT_ID = QTYUNIT_ID;
    }
    
    public java.lang.String getQTYUNIT_ID() {
        return this.QTYUNIT_ID;
    }
      

    private java.lang.String NOTEINFO;
    
    public void setNOTEINFO(java.lang.String NOTEINFO) {
        this.NOTEINFO = NOTEINFO;
    }
    
    public java.lang.String getNOTEINFO() {
        return this.NOTEINFO;
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
        result.append("ATTR_ID: " + getATTR_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("ATTRTYPE_ID: " + getATTRTYPE_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("DESCRIPTION2: " + getDESCRIPTION2() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("GROUPNAME: " + getGROUPNAME() + "||");
        result.append("QTYUNIT_ID: " + getQTYUNIT_ID() + "||");
        result.append("NOTEINFO: " + getNOTEINFO() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}