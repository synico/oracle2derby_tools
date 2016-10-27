package com.avn.dataload.model;

public class XADDRESS {


    private java.math.BigDecimal ADDRESS_ID;
    
    public void setADDRESS_ID(java.math.BigDecimal ADDRESS_ID) {
        this.ADDRESS_ID = ADDRESS_ID;
    }
    
    public java.math.BigDecimal getADDRESS_ID() {
        return this.ADDRESS_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String ADDRESSTYPE;
    
    public void setADDRESSTYPE(java.lang.String ADDRESSTYPE) {
        this.ADDRESSTYPE = ADDRESSTYPE;
    }
    
    public java.lang.String getADDRESSTYPE() {
        return this.ADDRESSTYPE;
    }
      

    private java.math.BigDecimal MEMBER_ID;
    
    public void setMEMBER_ID(java.math.BigDecimal MEMBER_ID) {
        this.MEMBER_ID = MEMBER_ID;
    }
    
    public java.math.BigDecimal getMEMBER_ID() {
        return this.MEMBER_ID;
    }
      

    private java.math.BigDecimal SELFADDRESS;
    
    public void setSELFADDRESS(java.math.BigDecimal SELFADDRESS) {
        this.SELFADDRESS = SELFADDRESS;
    }
    
    public java.math.BigDecimal getSELFADDRESS() {
        return this.SELFADDRESS;
    }
      

    private java.lang.String FIRSTNAME;
    
    public void setFIRSTNAME(java.lang.String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }
    
    public java.lang.String getFIRSTNAME() {
        return this.FIRSTNAME;
    }
      

    private java.lang.String LASTNAME;
    
    public void setLASTNAME(java.lang.String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }
    
    public java.lang.String getLASTNAME() {
        return this.LASTNAME;
    }
      

    private java.lang.String ADDRESS1;
    
    public void setADDRESS1(java.lang.String ADDRESS1) {
        this.ADDRESS1 = ADDRESS1;
    }
    
    public java.lang.String getADDRESS1() {
        return this.ADDRESS1;
    }
      

    private java.lang.String ADDRESS2;
    
    public void setADDRESS2(java.lang.String ADDRESS2) {
        this.ADDRESS2 = ADDRESS2;
    }
    
    public java.lang.String getADDRESS2() {
        return this.ADDRESS2;
    }
      

    private java.lang.String ADDRESS3;
    
    public void setADDRESS3(java.lang.String ADDRESS3) {
        this.ADDRESS3 = ADDRESS3;
    }
    
    public java.lang.String getADDRESS3() {
        return this.ADDRESS3;
    }
      

    private java.lang.String CITY;
    
    public void setCITY(java.lang.String CITY) {
        this.CITY = CITY;
    }
    
    public java.lang.String getCITY() {
        return this.CITY;
    }
      

    private java.lang.String STATE;
    
    public void setSTATE(java.lang.String STATE) {
        this.STATE = STATE;
    }
    
    public java.lang.String getSTATE() {
        return this.STATE;
    }
      

    private java.lang.String COUNTRY;
    
    public void setCOUNTRY(java.lang.String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }
    
    public java.lang.String getCOUNTRY() {
        return this.COUNTRY;
    }
      

    private java.lang.String ZIPCODE;
    
    public void setZIPCODE(java.lang.String ZIPCODE) {
        this.ZIPCODE = ZIPCODE;
    }
    
    public java.lang.String getZIPCODE() {
        return this.ZIPCODE;
    }
      

    private java.lang.String STATUS;
    
    public void setSTATUS(java.lang.String STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.lang.String getSTATUS() {
        return this.STATUS;
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
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("ADDRESS_ID: " + getADDRESS_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("ADDRESSTYPE: " + getADDRESSTYPE() + "||");
        result.append("MEMBER_ID: " + getMEMBER_ID() + "||");
        result.append("SELFADDRESS: " + getSELFADDRESS() + "||");
        result.append("FIRSTNAME: " + getFIRSTNAME() + "||");
        result.append("LASTNAME: " + getLASTNAME() + "||");
        result.append("ADDRESS1: " + getADDRESS1() + "||");
        result.append("ADDRESS2: " + getADDRESS2() + "||");
        result.append("ADDRESS3: " + getADDRESS3() + "||");
        result.append("CITY: " + getCITY() + "||");
        result.append("STATE: " + getSTATE() + "||");
        result.append("COUNTRY: " + getCOUNTRY() + "||");
        result.append("ZIPCODE: " + getZIPCODE() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}