package com.avn.dataload.model;

public class USERS {


    private java.math.BigDecimal USERS_ID;
    
    public void setUSERS_ID(java.math.BigDecimal USERS_ID) {
        this.USERS_ID = USERS_ID;
    }
    
    public java.math.BigDecimal getUSERS_ID() {
        return this.USERS_ID;
    }
      

    private java.lang.String DN;
    
    public void setDN(java.lang.String DN) {
        this.DN = DN;
    }
    
    public java.lang.String getDN() {
        return this.DN;
    }
      

    private java.lang.String REGISTERTYPE;
    
    public void setREGISTERTYPE(java.lang.String REGISTERTYPE) {
        this.REGISTERTYPE = REGISTERTYPE;
    }
    
    public java.lang.String getREGISTERTYPE() {
        return this.REGISTERTYPE;
    }
      

    private java.lang.String PROFILETYPE;
    
    public void setPROFILETYPE(java.lang.String PROFILETYPE) {
        this.PROFILETYPE = PROFILETYPE;
    }
    
    public java.lang.String getPROFILETYPE() {
        return this.PROFILETYPE;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String SETCCURR;
    
    public void setSETCCURR(java.lang.String SETCCURR) {
        this.SETCCURR = SETCCURR;
    }
    
    public java.lang.String getSETCCURR() {
        return this.SETCCURR;
    }
      

    private java.lang.String FIELD3;
    
    public void setFIELD3(java.lang.String FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.lang.String getFIELD3() {
        return this.FIELD3;
    }
      

    private java.lang.String FIELD2;
    
    public void setFIELD2(java.lang.String FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.lang.String getFIELD2() {
        return this.FIELD2;
    }
      

    private java.sql.Timestamp LASTORDER;
    
    public void setLASTORDER(java.sql.Timestamp LASTORDER) {
        this.LASTORDER = LASTORDER;
    }
    
    public java.sql.Timestamp getLASTORDER() {
        return this.LASTORDER;
    }
      

    private java.sql.Timestamp REGISTRATION;
    
    public void setREGISTRATION(java.sql.Timestamp REGISTRATION) {
        this.REGISTRATION = REGISTRATION;
    }
    
    public java.sql.Timestamp getREGISTRATION() {
        return this.REGISTRATION;
    }
      

    private java.sql.Timestamp LASTSESSION;
    
    public void setLASTSESSION(java.sql.Timestamp LASTSESSION) {
        this.LASTSESSION = LASTSESSION;
    }
    
    public java.sql.Timestamp getLASTSESSION() {
        return this.LASTSESSION;
    }
      

    private java.sql.Timestamp REGISTRATIONUPDATE;
    
    public void setREGISTRATIONUPDATE(java.sql.Timestamp REGISTRATIONUPDATE) {
        this.REGISTRATIONUPDATE = REGISTRATIONUPDATE;
    }
    
    public java.sql.Timestamp getREGISTRATIONUPDATE() {
        return this.REGISTRATIONUPDATE;
    }
      

    private java.sql.Timestamp REGISTRATIONCANCEL;
    
    public void setREGISTRATIONCANCEL(java.sql.Timestamp REGISTRATIONCANCEL) {
        this.REGISTRATIONCANCEL = REGISTRATIONCANCEL;
    }
    
    public java.sql.Timestamp getREGISTRATIONCANCEL() {
        return this.REGISTRATIONCANCEL;
    }
      

    private java.sql.Timestamp PREVLASTSESSION;
    
    public void setPREVLASTSESSION(java.sql.Timestamp PREVLASTSESSION) {
        this.PREVLASTSESSION = PREVLASTSESSION;
    }
    
    public java.sql.Timestamp getPREVLASTSESSION() {
        return this.PREVLASTSESSION;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.lang.String PERSONALIZATIONID;
    
    public void setPERSONALIZATIONID(java.lang.String PERSONALIZATIONID) {
        this.PERSONALIZATIONID = PERSONALIZATIONID;
    }
    
    public java.lang.String getPERSONALIZATIONID() {
        return this.PERSONALIZATIONID;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("USERS_ID: " + getUSERS_ID() + "||");
        result.append("DN: " + getDN() + "||");
        result.append("REGISTERTYPE: " + getREGISTERTYPE() + "||");
        result.append("PROFILETYPE: " + getPROFILETYPE() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("SETCCURR: " + getSETCCURR() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("LASTORDER: " + getLASTORDER() + "||");
        result.append("REGISTRATION: " + getREGISTRATION() + "||");
        result.append("LASTSESSION: " + getLASTSESSION() + "||");
        result.append("REGISTRATIONUPDATE: " + getREGISTRATIONUPDATE() + "||");
        result.append("REGISTRATIONCANCEL: " + getREGISTRATIONCANCEL() + "||");
        result.append("PREVLASTSESSION: " + getPREVLASTSESSION() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("PERSONALIZATIONID: " + getPERSONALIZATIONID() + "||");
        return result.toString();
    }
    
}