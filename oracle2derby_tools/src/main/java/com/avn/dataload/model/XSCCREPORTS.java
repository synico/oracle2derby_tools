package com.avn.dataload.model;

public class XSCCREPORTS {


    private java.math.BigDecimal REPORT_ID;
    
    public void setREPORT_ID(java.math.BigDecimal REPORT_ID) {
        this.REPORT_ID = REPORT_ID;
    }
    
    public java.math.BigDecimal getREPORT_ID() {
        return this.REPORT_ID;
    }
      

    private java.math.BigDecimal USERS_ID;
    
    public void setUSERS_ID(java.math.BigDecimal USERS_ID) {
        this.USERS_ID = USERS_ID;
    }
    
    public java.math.BigDecimal getUSERS_ID() {
        return this.USERS_ID;
    }
      

    private java.math.BigDecimal ORGENTITY_ID;
    
    public void setORGENTITY_ID(java.math.BigDecimal ORGENTITY_ID) {
        this.ORGENTITY_ID = ORGENTITY_ID;
    }
    
    public java.math.BigDecimal getORGENTITY_ID() {
        return this.ORGENTITY_ID;
    }
      

    private java.lang.String REPORTTYPE;
    
    public void setREPORTTYPE(java.lang.String REPORTTYPE) {
        this.REPORTTYPE = REPORTTYPE;
    }
    
    public java.lang.String getREPORTTYPE() {
        return this.REPORTTYPE;
    }
      

    private java.lang.String REPORTNAME;
    
    public void setREPORTNAME(java.lang.String REPORTNAME) {
        this.REPORTNAME = REPORTNAME;
    }
    
    public java.lang.String getREPORTNAME() {
        return this.REPORTNAME;
    }
      

    private java.lang.String REPORTFREQUENCY;
    
    public void setREPORTFREQUENCY(java.lang.String REPORTFREQUENCY) {
        this.REPORTFREQUENCY = REPORTFREQUENCY;
    }
    
    public java.lang.String getREPORTFREQUENCY() {
        return this.REPORTFREQUENCY;
    }
      

    private java.sql.Timestamp REPORTSCHEDULEDTIME;
    
    public void setREPORTSCHEDULEDTIME(java.sql.Timestamp REPORTSCHEDULEDTIME) {
        this.REPORTSCHEDULEDTIME = REPORTSCHEDULEDTIME;
    }
    
    public java.sql.Timestamp getREPORTSCHEDULEDTIME() {
        return this.REPORTSCHEDULEDTIME;
    }
      

    private java.math.BigDecimal REPORTSCHEDULEDDATE;
    
    public void setREPORTSCHEDULEDDATE(java.math.BigDecimal REPORTSCHEDULEDDATE) {
        this.REPORTSCHEDULEDDATE = REPORTSCHEDULEDDATE;
    }
    
    public java.math.BigDecimal getREPORTSCHEDULEDDATE() {
        return this.REPORTSCHEDULEDDATE;
    }
      

    private java.lang.String REPORTSCHEDULEDDAY;
    
    public void setREPORTSCHEDULEDDAY(java.lang.String REPORTSCHEDULEDDAY) {
        this.REPORTSCHEDULEDDAY = REPORTSCHEDULEDDAY;
    }
    
    public java.lang.String getREPORTSCHEDULEDDAY() {
        return this.REPORTSCHEDULEDDAY;
    }
      

    private java.sql.Timestamp REPORTCREATEDDATE;
    
    public void setREPORTCREATEDDATE(java.sql.Timestamp REPORTCREATEDDATE) {
        this.REPORTCREATEDDATE = REPORTCREATEDDATE;
    }
    
    public java.sql.Timestamp getREPORTCREATEDDATE() {
        return this.REPORTCREATEDDATE;
    }
      

    private java.lang.String REPORTFILTERS;
    
    public void setREPORTFILTERS(java.lang.String REPORTFILTERS) {
        this.REPORTFILTERS = REPORTFILTERS;
    }
    
    public java.lang.String getREPORTFILTERS() {
        return this.REPORTFILTERS;
    }
      

    private java.sql.Timestamp REPORTLASTUPDATEDDATE;
    
    public void setREPORTLASTUPDATEDDATE(java.sql.Timestamp REPORTLASTUPDATEDDATE) {
        this.REPORTLASTUPDATEDDATE = REPORTLASTUPDATEDDATE;
    }
    
    public java.sql.Timestamp getREPORTLASTUPDATEDDATE() {
        return this.REPORTLASTUPDATEDDATE;
    }
      

    private java.lang.String SENDREPORTEMAILIDS;
    
    public void setSENDREPORTEMAILIDS(java.lang.String SENDREPORTEMAILIDS) {
        this.SENDREPORTEMAILIDS = SENDREPORTEMAILIDS;
    }
    
    public java.lang.String getSENDREPORTEMAILIDS() {
        return this.SENDREPORTEMAILIDS;
    }
      

    private java.lang.String REPORTCOMMENTS;
    
    public void setREPORTCOMMENTS(java.lang.String REPORTCOMMENTS) {
        this.REPORTCOMMENTS = REPORTCOMMENTS;
    }
    
    public java.lang.String getREPORTCOMMENTS() {
        return this.REPORTCOMMENTS;
    }
      

    private java.sql.Timestamp NEXTINVOCATIONTIME;
    
    public void setNEXTINVOCATIONTIME(java.sql.Timestamp NEXTINVOCATIONTIME) {
        this.NEXTINVOCATIONTIME = NEXTINVOCATIONTIME;
    }
    
    public java.sql.Timestamp getNEXTINVOCATIONTIME() {
        return this.NEXTINVOCATIONTIME;
    }
      

    private java.lang.String REPORTSTATUS;
    
    public void setREPORTSTATUS(java.lang.String REPORTSTATUS) {
        this.REPORTSTATUS = REPORTSTATUS;
    }
    
    public java.lang.String getREPORTSTATUS() {
        return this.REPORTSTATUS;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
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
        result.append("REPORT_ID: " + getREPORT_ID() + "||");
        result.append("USERS_ID: " + getUSERS_ID() + "||");
        result.append("ORGENTITY_ID: " + getORGENTITY_ID() + "||");
        result.append("REPORTTYPE: " + getREPORTTYPE() + "||");
        result.append("REPORTNAME: " + getREPORTNAME() + "||");
        result.append("REPORTFREQUENCY: " + getREPORTFREQUENCY() + "||");
        result.append("REPORTSCHEDULEDTIME: " + getREPORTSCHEDULEDTIME() + "||");
        result.append("REPORTSCHEDULEDDATE: " + getREPORTSCHEDULEDDATE() + "||");
        result.append("REPORTSCHEDULEDDAY: " + getREPORTSCHEDULEDDAY() + "||");
        result.append("REPORTCREATEDDATE: " + getREPORTCREATEDDATE() + "||");
        result.append("REPORTFILTERS: " + getREPORTFILTERS() + "||");
        result.append("REPORTLASTUPDATEDDATE: " + getREPORTLASTUPDATEDDATE() + "||");
        result.append("SENDREPORTEMAILIDS: " + getSENDREPORTEMAILIDS() + "||");
        result.append("REPORTCOMMENTS: " + getREPORTCOMMENTS() + "||");
        result.append("NEXTINVOCATIONTIME: " + getNEXTINVOCATIONTIME() + "||");
        result.append("REPORTSTATUS: " + getREPORTSTATUS() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}