package com.avn.dataload.model;

public class CMMETADATA {


    private java.math.BigDecimal CMCONTAINER_ID;
    
    public void setCMCONTAINER_ID(java.math.BigDecimal CMCONTAINER_ID) {
        this.CMCONTAINER_ID = CMCONTAINER_ID;
    }
    
    public java.math.BigDecimal getCMCONTAINER_ID() {
        return this.CMCONTAINER_ID;
    }
      

    private java.math.BigDecimal CMRESMGR_ID;
    
    public void setCMRESMGR_ID(java.math.BigDecimal CMRESMGR_ID) {
        this.CMRESMGR_ID = CMRESMGR_ID;
    }
    
    public java.math.BigDecimal getCMRESMGR_ID() {
        return this.CMRESMGR_ID;
    }
      

    private java.math.BigDecimal BOKEY1;
    
    public void setBOKEY1(java.math.BigDecimal BOKEY1) {
        this.BOKEY1 = BOKEY1;
    }
    
    public java.math.BigDecimal getBOKEY1() {
        return this.BOKEY1;
    }
      

    private java.math.BigDecimal BOKEY2;
    
    public void setBOKEY2(java.math.BigDecimal BOKEY2) {
        this.BOKEY2 = BOKEY2;
    }
    
    public java.math.BigDecimal getBOKEY2() {
        return this.BOKEY2;
    }
      

    private java.math.BigDecimal BOKEY3;
    
    public void setBOKEY3(java.math.BigDecimal BOKEY3) {
        this.BOKEY3 = BOKEY3;
    }
    
    public java.math.BigDecimal getBOKEY3() {
        return this.BOKEY3;
    }
      

    private java.math.BigDecimal BOKEY4;
    
    public void setBOKEY4(java.math.BigDecimal BOKEY4) {
        this.BOKEY4 = BOKEY4;
    }
    
    public java.math.BigDecimal getBOKEY4() {
        return this.BOKEY4;
    }
      

    private java.lang.String ACTION;
    
    public void setACTION(java.lang.String ACTION) {
        this.ACTION = ACTION;
    }
    
    public java.lang.String getACTION() {
        return this.ACTION;
    }
      

    private java.sql.Timestamp CMTIMESTAMP;
    
    public void setCMTIMESTAMP(java.sql.Timestamp CMTIMESTAMP) {
        this.CMTIMESTAMP = CMTIMESTAMP;
    }
    
    public java.sql.Timestamp getCMTIMESTAMP() {
        return this.CMTIMESTAMP;
    }
      

    private java.lang.String WORKSPACE;
    
    public void setWORKSPACE(java.lang.String WORKSPACE) {
        this.WORKSPACE = WORKSPACE;
    }
    
    public java.lang.String getWORKSPACE() {
        return this.WORKSPACE;
    }
      

    private java.lang.String TASKGRP;
    
    public void setTASKGRP(java.lang.String TASKGRP) {
        this.TASKGRP = TASKGRP;
    }
    
    public java.lang.String getTASKGRP() {
        return this.TASKGRP;
    }
      

    private java.lang.String TASK;
    
    public void setTASK(java.lang.String TASK) {
        this.TASK = TASK;
    }
    
    public java.lang.String getTASK() {
        return this.TASK;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.math.BigDecimal MEMBER_ID;
    
    public void setMEMBER_ID(java.math.BigDecimal MEMBER_ID) {
        this.MEMBER_ID = MEMBER_ID;
    }
    
    public java.math.BigDecimal getMEMBER_ID() {
        return this.MEMBER_ID;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("CMCONTAINER_ID: " + getCMCONTAINER_ID() + "||");
        result.append("CMRESMGR_ID: " + getCMRESMGR_ID() + "||");
        result.append("BOKEY1: " + getBOKEY1() + "||");
        result.append("BOKEY2: " + getBOKEY2() + "||");
        result.append("BOKEY3: " + getBOKEY3() + "||");
        result.append("BOKEY4: " + getBOKEY4() + "||");
        result.append("ACTION: " + getACTION() + "||");
        result.append("CMTIMESTAMP: " + getCMTIMESTAMP() + "||");
        result.append("WORKSPACE: " + getWORKSPACE() + "||");
        result.append("TASKGRP: " + getTASKGRP() + "||");
        result.append("TASK: " + getTASK() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("MEMBER_ID: " + getMEMBER_ID() + "||");
        return result.toString();
    }
    
}