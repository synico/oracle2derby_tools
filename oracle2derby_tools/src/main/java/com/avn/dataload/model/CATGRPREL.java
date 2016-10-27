package com.avn.dataload.model;

public class CATGRPREL {


    private java.math.BigDecimal CATGROUP_ID_PARENT;
    
    public void setCATGROUP_ID_PARENT(java.math.BigDecimal CATGROUP_ID_PARENT) {
        this.CATGROUP_ID_PARENT = CATGROUP_ID_PARENT;
    }
    
    public java.math.BigDecimal getCATGROUP_ID_PARENT() {
        return this.CATGROUP_ID_PARENT;
    }
      

    private java.math.BigDecimal CATGROUP_ID_CHILD;
    
    public void setCATGROUP_ID_CHILD(java.math.BigDecimal CATGROUP_ID_CHILD) {
        this.CATGROUP_ID_CHILD = CATGROUP_ID_CHILD;
    }
    
    public java.math.BigDecimal getCATGROUP_ID_CHILD() {
        return this.CATGROUP_ID_CHILD;
    }
      

    private java.math.BigDecimal CATALOG_ID;
    
    public void setCATALOG_ID(java.math.BigDecimal CATALOG_ID) {
        this.CATALOG_ID = CATALOG_ID;
    }
    
    public java.math.BigDecimal getCATALOG_ID() {
        return this.CATALOG_ID;
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
      

    private java.math.BigDecimal CATALOG_ID_LINK;
    
    public void setCATALOG_ID_LINK(java.math.BigDecimal CATALOG_ID_LINK) {
        this.CATALOG_ID_LINK = CATALOG_ID_LINK;
    }
    
    public java.math.BigDecimal getCATALOG_ID_LINK() {
        return this.CATALOG_ID_LINK;
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
        result.append("CATGROUP_ID_PARENT: " + getCATGROUP_ID_PARENT() + "||");
        result.append("CATGROUP_ID_CHILD: " + getCATGROUP_ID_CHILD() + "||");
        result.append("CATALOG_ID: " + getCATALOG_ID() + "||");
        result.append("RULE: " + getRULE() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("CATALOG_ID_LINK: " + getCATALOG_ID_LINK() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}