package com.avn.dataload.model;

public class CATGPENREL {


    private java.math.BigDecimal CATGROUP_ID;
    
    public void setCATGROUP_ID(java.math.BigDecimal CATGROUP_ID) {
        this.CATGROUP_ID = CATGROUP_ID;
    }
    
    public java.math.BigDecimal getCATGROUP_ID() {
        return this.CATGROUP_ID;
    }
      

    private java.math.BigDecimal CATALOG_ID;
    
    public void setCATALOG_ID(java.math.BigDecimal CATALOG_ID) {
        this.CATALOG_ID = CATALOG_ID;
    }
    
    public java.math.BigDecimal getCATALOG_ID() {
        return this.CATALOG_ID;
    }
      

    private java.math.BigDecimal CATENTRY_ID;
    
    public void setCATENTRY_ID(java.math.BigDecimal CATENTRY_ID) {
        this.CATENTRY_ID = CATENTRY_ID;
    }
    
    public java.math.BigDecimal getCATENTRY_ID() {
        return this.CATENTRY_ID;
    }
      

    private java.lang.String RULE;
    
    public void setRULE(java.lang.String RULE) {
        this.RULE = RULE;
    }
    
    public java.lang.String getRULE() {
        return this.RULE;
    }
      

    private java.math.BigDecimal SEQUENCE;
    
    public void setSEQUENCE(java.math.BigDecimal SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }
    
    public java.math.BigDecimal getSEQUENCE() {
        return this.SEQUENCE;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
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
        result.append("CATGROUP_ID: " + getCATGROUP_ID() + "||");
        result.append("CATALOG_ID: " + getCATALOG_ID() + "||");
        result.append("CATENTRY_ID: " + getCATENTRY_ID() + "||");
        result.append("RULE: " + getRULE() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}