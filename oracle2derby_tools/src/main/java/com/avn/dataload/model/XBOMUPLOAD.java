package com.avn.dataload.model;

public class XBOMUPLOAD {


    private java.math.BigDecimal XBOMUPLOADID;
    
    public void setXBOMUPLOADID(java.math.BigDecimal XBOMUPLOADID) {
        this.XBOMUPLOADID = XBOMUPLOADID;
    }
    
    public java.math.BigDecimal getXBOMUPLOADID() {
        return this.XBOMUPLOADID;
    }
      

    private java.math.BigDecimal USERS_ID;
    
    public void setUSERS_ID(java.math.BigDecimal USERS_ID) {
        this.USERS_ID = USERS_ID;
    }
    
    public java.math.BigDecimal getUSERS_ID() {
        return this.USERS_ID;
    }
      

    private java.math.BigDecimal REQUISITIONLISTID;
    
    public void setREQUISITIONLISTID(java.math.BigDecimal REQUISITIONLISTID) {
        this.REQUISITIONLISTID = REQUISITIONLISTID;
    }
    
    public java.math.BigDecimal getREQUISITIONLISTID() {
        return this.REQUISITIONLISTID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.sql.Timestamp CREATEDDATE;
    
    public void setCREATEDDATE(java.sql.Timestamp CREATEDDATE) {
        this.CREATEDDATE = CREATEDDATE;
    }
    
    public java.sql.Timestamp getCREATEDDATE() {
        return this.CREATEDDATE;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
    }
      

    private java.math.BigDecimal ROWCOUNTER;
    
    public void setROWCOUNTER(java.math.BigDecimal ROWCOUNTER) {
        this.ROWCOUNTER = ROWCOUNTER;
    }
    
    public java.math.BigDecimal getROWCOUNTER() {
        return this.ROWCOUNTER;
    }
      

    private java.lang.String UPLOADSTATUS;
    
    public void setUPLOADSTATUS(java.lang.String UPLOADSTATUS) {
        this.UPLOADSTATUS = UPLOADSTATUS;
    }
    
    public java.lang.String getUPLOADSTATUS() {
        return this.UPLOADSTATUS;
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
        result.append("XBOMUPLOADID: " + getXBOMUPLOADID() + "||");
        result.append("USERS_ID: " + getUSERS_ID() + "||");
        result.append("REQUISITIONLISTID: " + getREQUISITIONLISTID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("CREATEDDATE: " + getCREATEDDATE() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("ROWCOUNTER: " + getROWCOUNTER() + "||");
        result.append("UPLOADSTATUS: " + getUPLOADSTATUS() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}