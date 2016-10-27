package com.avn.dataload.model;

public class SEOPAGEDEF {


    private java.math.BigDecimal SEOPAGEDEF_ID;
    
    public void setSEOPAGEDEF_ID(java.math.BigDecimal SEOPAGEDEF_ID) {
        this.SEOPAGEDEF_ID = SEOPAGEDEF_ID;
    }
    
    public java.math.BigDecimal getSEOPAGEDEF_ID() {
        return this.SEOPAGEDEF_ID;
    }
      

    private java.lang.String PAGENAME;
    
    public void setPAGENAME(java.lang.String PAGENAME) {
        this.PAGENAME = PAGENAME;
    }
    
    public java.lang.String getPAGENAME() {
        return this.PAGENAME;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
    }
      

    private java.sql.Timestamp CREATEDTIME;
    
    public void setCREATEDTIME(java.sql.Timestamp CREATEDTIME) {
        this.CREATEDTIME = CREATEDTIME;
    }
    
    public java.sql.Timestamp getCREATEDTIME() {
        return this.CREATEDTIME;
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
        result.append("SEOPAGEDEF_ID: " + getSEOPAGEDEF_ID() + "||");
        result.append("PAGENAME: " + getPAGENAME() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("CREATEDTIME: " + getCREATEDTIME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}