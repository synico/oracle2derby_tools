package com.avn.dataload.model;

public class DMCAMPAIGN {


    private java.math.BigDecimal DMCAMPAIGN_ID;
    
    public void setDMCAMPAIGN_ID(java.math.BigDecimal DMCAMPAIGN_ID) {
        this.DMCAMPAIGN_ID = DMCAMPAIGN_ID;
    }
    
    public java.math.BigDecimal getDMCAMPAIGN_ID() {
        return this.DMCAMPAIGN_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
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
      

    private java.math.BigDecimal STATE;
    
    public void setSTATE(java.math.BigDecimal STATE) {
        this.STATE = STATE;
    }
    
    public java.math.BigDecimal getSTATE() {
        return this.STATE;
    }
      

    private java.lang.String SEASON;
    
    public void setSEASON(java.lang.String SEASON) {
        this.SEASON = SEASON;
    }
    
    public java.lang.String getSEASON() {
        return this.SEASON;
    }
      

    private java.math.BigDecimal TYPE;
    
    public void setTYPE(java.math.BigDecimal TYPE) {
        this.TYPE = TYPE;
    }
    
    public java.math.BigDecimal getTYPE() {
        return this.TYPE;
    }
      

    private java.sql.Timestamp STARTDATE;
    
    public void setSTARTDATE(java.sql.Timestamp STARTDATE) {
        this.STARTDATE = STARTDATE;
    }
    
    public java.sql.Timestamp getSTARTDATE() {
        return this.STARTDATE;
    }
      

    private java.sql.Timestamp ENDDATE;
    
    public void setENDDATE(java.sql.Timestamp ENDDATE) {
        this.ENDDATE = ENDDATE;
    }
    
    public java.sql.Timestamp getENDDATE() {
        return this.ENDDATE;
    }
      

    private java.sql.Timestamp CREATED;
    
    public void setCREATED(java.sql.Timestamp CREATED) {
        this.CREATED = CREATED;
    }
    
    public java.sql.Timestamp getCREATED() {
        return this.CREATED;
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
      

    private java.lang.String OWNER;
    
    public void setOWNER(java.lang.String OWNER) {
        this.OWNER = OWNER;
    }
    
    public java.lang.String getOWNER() {
        return this.OWNER;
    }
      

    private java.lang.String OBJECTIVE;
    
    public void setOBJECTIVE(java.lang.String OBJECTIVE) {
        this.OBJECTIVE = OBJECTIVE;
    }
    
    public java.lang.String getOBJECTIVE() {
        return this.OBJECTIVE;
    }
      

    private java.math.BigDecimal FIELD1;
    
    public void setFIELD1(java.math.BigDecimal FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.math.BigDecimal getFIELD1() {
        return this.FIELD1;
    }
      

    private java.math.BigDecimal FIELD2;
    
    public void setFIELD2(java.math.BigDecimal FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.math.BigDecimal getFIELD2() {
        return this.FIELD2;
    }
      

    private java.math.BigDecimal FIELD3;
    
    public void setFIELD3(java.math.BigDecimal FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.math.BigDecimal getFIELD3() {
        return this.FIELD3;
    }
      

    private java.lang.String FIELD4;
    
    public void setFIELD4(java.lang.String FIELD4) {
        this.FIELD4 = FIELD4;
    }
    
    public java.lang.String getFIELD4() {
        return this.FIELD4;
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
        result.append("DMCAMPAIGN_ID: " + getDMCAMPAIGN_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("STATE: " + getSTATE() + "||");
        result.append("SEASON: " + getSEASON() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("STARTDATE: " + getSTARTDATE() + "||");
        result.append("ENDDATE: " + getENDDATE() + "||");
        result.append("CREATED: " + getCREATED() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("LASTUPDATEDBY: " + getLASTUPDATEDBY() + "||");
        result.append("OWNER: " + getOWNER() + "||");
        result.append("OBJECTIVE: " + getOBJECTIVE() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("FIELD4: " + getFIELD4() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}