package com.avn.dataload.model;

public class MASSOCCECE {


    private java.math.BigDecimal MASSOCCECE_ID;
    
    public void setMASSOCCECE_ID(java.math.BigDecimal MASSOCCECE_ID) {
        this.MASSOCCECE_ID = MASSOCCECE_ID;
    }
    
    public java.math.BigDecimal getMASSOCCECE_ID() {
        return this.MASSOCCECE_ID;
    }
      

    private java.lang.String MASSOCTYPE_ID;
    
    public void setMASSOCTYPE_ID(java.lang.String MASSOCTYPE_ID) {
        this.MASSOCTYPE_ID = MASSOCTYPE_ID;
    }
    
    public java.lang.String getMASSOCTYPE_ID() {
        return this.MASSOCTYPE_ID;
    }
      

    private java.math.BigDecimal CATENTRY_ID_FROM;
    
    public void setCATENTRY_ID_FROM(java.math.BigDecimal CATENTRY_ID_FROM) {
        this.CATENTRY_ID_FROM = CATENTRY_ID_FROM;
    }
    
    public java.math.BigDecimal getCATENTRY_ID_FROM() {
        return this.CATENTRY_ID_FROM;
    }
      

    private java.math.BigDecimal RANK;
    
    public void setRANK(java.math.BigDecimal RANK) {
        this.RANK = RANK;
    }
    
    public java.math.BigDecimal getRANK() {
        return this.RANK;
    }
      

    private java.math.BigDecimal CATENTRY_ID_TO;
    
    public void setCATENTRY_ID_TO(java.math.BigDecimal CATENTRY_ID_TO) {
        this.CATENTRY_ID_TO = CATENTRY_ID_TO;
    }
    
    public java.math.BigDecimal getCATENTRY_ID_TO() {
        return this.CATENTRY_ID_TO;
    }
      

    private java.lang.String MASSOC_ID;
    
    public void setMASSOC_ID(java.lang.String MASSOC_ID) {
        this.MASSOC_ID = MASSOC_ID;
    }
    
    public java.lang.String getMASSOC_ID() {
        return this.MASSOC_ID;
    }
      

    private java.math.BigDecimal QUANTITY;
    
    public void setQUANTITY(java.math.BigDecimal QUANTITY) {
        this.QUANTITY = QUANTITY;
    }
    
    public java.math.BigDecimal getQUANTITY() {
        return this.QUANTITY;
    }
      

    private java.lang.String RULE;
    
    public void setRULE(java.lang.String RULE) {
        this.RULE = RULE;
    }
    
    public java.lang.String getRULE() {
        return this.RULE;
    }
      

    private java.lang.String GROUPNAME;
    
    public void setGROUPNAME(java.lang.String GROUPNAME) {
        this.GROUPNAME = GROUPNAME;
    }
    
    public java.lang.String getGROUPNAME() {
        return this.GROUPNAME;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
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
      

    private java.lang.String OID;
    
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }
    
    public java.lang.String getOID() {
        return this.OID;
    }
      

    private java.sql.Timestamp DATE1;
    
    public void setDATE1(java.sql.Timestamp DATE1) {
        this.DATE1 = DATE1;
    }
    
    public java.sql.Timestamp getDATE1() {
        return this.DATE1;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
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
        result.append("MASSOCCECE_ID: " + getMASSOCCECE_ID() + "||");
        result.append("MASSOCTYPE_ID: " + getMASSOCTYPE_ID() + "||");
        result.append("CATENTRY_ID_FROM: " + getCATENTRY_ID_FROM() + "||");
        result.append("RANK: " + getRANK() + "||");
        result.append("CATENTRY_ID_TO: " + getCATENTRY_ID_TO() + "||");
        result.append("MASSOC_ID: " + getMASSOC_ID() + "||");
        result.append("QUANTITY: " + getQUANTITY() + "||");
        result.append("RULE: " + getRULE() + "||");
        result.append("GROUPNAME: " + getGROUPNAME() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("OID: " + getOID() + "||");
        result.append("DATE1: " + getDATE1() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}