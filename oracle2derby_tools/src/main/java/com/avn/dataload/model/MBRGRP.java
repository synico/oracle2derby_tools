package com.avn.dataload.model;

public class MBRGRP {


    private java.math.BigDecimal MBRGRP_ID;
    
    public void setMBRGRP_ID(java.math.BigDecimal MBRGRP_ID) {
        this.MBRGRP_ID = MBRGRP_ID;
    }
    
    public java.math.BigDecimal getMBRGRP_ID() {
        return this.MBRGRP_ID;
    }
      

    private java.math.BigDecimal OWNER_ID;
    
    public void setOWNER_ID(java.math.BigDecimal OWNER_ID) {
        this.OWNER_ID = OWNER_ID;
    }
    
    public java.math.BigDecimal getOWNER_ID() {
        return this.OWNER_ID;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String FIELD2;
    
    public void setFIELD2(java.lang.String FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.lang.String getFIELD2() {
        return this.FIELD2;
    }
      

    private java.lang.String DN;
    
    public void setDN(java.lang.String DN) {
        this.DN = DN;
    }
    
    public java.lang.String getDN() {
        return this.DN;
    }
      

    private java.lang.String MBRGRPNAME;
    
    public void setMBRGRPNAME(java.lang.String MBRGRPNAME) {
        this.MBRGRPNAME = MBRGRPNAME;
    }
    
    public java.lang.String getMBRGRPNAME() {
        return this.MBRGRPNAME;
    }
      

    private java.lang.String FIELD3;
    
    public void setFIELD3(java.lang.String FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.lang.String getFIELD3() {
        return this.FIELD3;
    }
      

    private java.lang.String OID;
    
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }
    
    public java.lang.String getOID() {
        return this.OID;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
    }
      

    private java.lang.String LASTUPDATEDBY;
    
    public void setLASTUPDATEDBY(java.lang.String LASTUPDATEDBY) {
        this.LASTUPDATEDBY = LASTUPDATEDBY;
    }
    
    public java.lang.String getLASTUPDATEDBY() {
        return this.LASTUPDATEDBY;
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
        result.append("OWNER_ID: " + getOWNER_ID() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("DN: " + getDN() + "||");
        result.append("MBRGRPNAME: " + getMBRGRPNAME() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("OID: " + getOID() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("LASTUPDATEDBY: " + getLASTUPDATEDBY() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}