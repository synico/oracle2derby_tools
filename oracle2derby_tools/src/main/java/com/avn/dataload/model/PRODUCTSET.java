package com.avn.dataload.model;

public class PRODUCTSET {


    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.math.BigDecimal PRODUCTSET_ID;
    
    public void setPRODUCTSET_ID(java.math.BigDecimal PRODUCTSET_ID) {
        this.PRODUCTSET_ID = PRODUCTSET_ID;
    }
    
    public java.math.BigDecimal getPRODUCTSET_ID() {
        return this.PRODUCTSET_ID;
    }
      

    private java.math.BigDecimal MEMBER_ID;
    
    public void setMEMBER_ID(java.math.BigDecimal MEMBER_ID) {
        this.MEMBER_ID = MEMBER_ID;
    }
    
    public java.math.BigDecimal getMEMBER_ID() {
        return this.MEMBER_ID;
    }
      

    private java.sql.Clob XMLDEFINITION;
    
    public void setXMLDEFINITION(java.sql.Clob XMLDEFINITION) {
        this.XMLDEFINITION = XMLDEFINITION;
    }
    
    public java.sql.Clob getXMLDEFINITION() {
        return this.XMLDEFINITION;
    }
      

    private java.sql.Timestamp PUBLISHTIME;
    
    public void setPUBLISHTIME(java.sql.Timestamp PUBLISHTIME) {
        this.PUBLISHTIME = PUBLISHTIME;
    }
    
    public java.sql.Timestamp getPUBLISHTIME() {
        return this.PUBLISHTIME;
    }
      

    private java.math.BigDecimal MARKFORDELETE;
    
    public void setMARKFORDELETE(java.math.BigDecimal MARKFORDELETE) {
        this.MARKFORDELETE = MARKFORDELETE;
    }
    
    public java.math.BigDecimal getMARKFORDELETE() {
        return this.MARKFORDELETE;
    }
      

    private java.lang.String STATIC;
    
    public void setSTATIC(java.lang.String STATIC) {
        this.STATIC = STATIC;
    }
    
    public java.lang.String getSTATIC() {
        return this.STATIC;
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
        result.append("NAME: " + getNAME() + "||");
        result.append("PRODUCTSET_ID: " + getPRODUCTSET_ID() + "||");
        result.append("MEMBER_ID: " + getMEMBER_ID() + "||");
        result.append("XMLDEFINITION: " + getXMLDEFINITION() + "||");
        result.append("PUBLISHTIME: " + getPUBLISHTIME() + "||");
        result.append("MARKFORDELETE: " + getMARKFORDELETE() + "||");
        result.append("STATIC: " + getSTATIC() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}