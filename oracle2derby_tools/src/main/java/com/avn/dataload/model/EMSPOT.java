package com.avn.dataload.model;

public class EMSPOT {


    private java.math.BigDecimal EMSPOT_ID;
    
    public void setEMSPOT_ID(java.math.BigDecimal EMSPOT_ID) {
        this.EMSPOT_ID = EMSPOT_ID;
    }
    
    public java.math.BigDecimal getEMSPOT_ID() {
        return this.EMSPOT_ID;
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
      

    private java.lang.String SUPPORTEDTYPES;
    
    public void setSUPPORTEDTYPES(java.lang.String SUPPORTEDTYPES) {
        this.SUPPORTEDTYPES = SUPPORTEDTYPES;
    }
    
    public java.lang.String getSUPPORTEDTYPES() {
        return this.SUPPORTEDTYPES;
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
      

    private java.lang.String DEFAULTRULE;
    
    public void setDEFAULTRULE(java.lang.String DEFAULTRULE) {
        this.DEFAULTRULE = DEFAULTRULE;
    }
    
    public java.lang.String getDEFAULTRULE() {
        return this.DEFAULTRULE;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.lang.String USAGETYPE;
    
    public void setUSAGETYPE(java.lang.String USAGETYPE) {
        this.USAGETYPE = USAGETYPE;
    }
    
    public java.lang.String getUSAGETYPE() {
        return this.USAGETYPE;
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
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("EMSPOT_ID: " + getEMSPOT_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("SUPPORTEDTYPES: " + getSUPPORTEDTYPES() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("LASTUPDATEDBY: " + getLASTUPDATEDBY() + "||");
        result.append("DEFAULTRULE: " + getDEFAULTRULE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("USAGETYPE: " + getUSAGETYPE() + "||");
        result.append("UIDISPLAYABLE: " + getUIDISPLAYABLE() + "||");
        result.append("MANAGINGTOOL: " + getMANAGINGTOOL() + "||");
        return result.toString();
    }
    
}