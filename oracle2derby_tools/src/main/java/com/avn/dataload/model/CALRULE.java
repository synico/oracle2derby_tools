package com.avn.dataload.model;

public class CALRULE {


    private java.math.BigDecimal CALRULE_ID;
    
    public void setCALRULE_ID(java.math.BigDecimal CALRULE_ID) {
        this.CALRULE_ID = CALRULE_ID;
    }
    
    public java.math.BigDecimal getCALRULE_ID() {
        return this.CALRULE_ID;
    }
      

    private java.math.BigDecimal CALCODE_ID;
    
    public void setCALCODE_ID(java.math.BigDecimal CALCODE_ID) {
        this.CALCODE_ID = CALCODE_ID;
    }
    
    public java.math.BigDecimal getCALCODE_ID() {
        return this.CALCODE_ID;
    }
      

    private java.sql.Timestamp STARTDATE;
    
    public void setSTARTDATE(java.sql.Timestamp STARTDATE) {
        this.STARTDATE = STARTDATE;
    }
    
    public java.sql.Timestamp getSTARTDATE() {
        return this.STARTDATE;
    }
      

    private java.math.BigDecimal TAXCGRY_ID;
    
    public void setTAXCGRY_ID(java.math.BigDecimal TAXCGRY_ID) {
        this.TAXCGRY_ID = TAXCGRY_ID;
    }
    
    public java.math.BigDecimal getTAXCGRY_ID() {
        return this.TAXCGRY_ID;
    }
      

    private java.sql.Timestamp ENDDATE;
    
    public void setENDDATE(java.sql.Timestamp ENDDATE) {
        this.ENDDATE = ENDDATE;
    }
    
    public java.sql.Timestamp getENDDATE() {
        return this.ENDDATE;
    }
      

    private java.math.BigDecimal SEQUENCE;
    
    public void setSEQUENCE(java.math.BigDecimal SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }
    
    public java.math.BigDecimal getSEQUENCE() {
        return this.SEQUENCE;
    }
      

    private java.math.BigDecimal COMBINATION;
    
    public void setCOMBINATION(java.math.BigDecimal COMBINATION) {
        this.COMBINATION = COMBINATION;
    }
    
    public java.math.BigDecimal getCOMBINATION() {
        return this.COMBINATION;
    }
      

    private java.math.BigDecimal CALMETHOD_ID;
    
    public void setCALMETHOD_ID(java.math.BigDecimal CALMETHOD_ID) {
        this.CALMETHOD_ID = CALMETHOD_ID;
    }
    
    public java.math.BigDecimal getCALMETHOD_ID() {
        return this.CALMETHOD_ID;
    }
      

    private java.math.BigDecimal CALMETHOD_ID_QFY;
    
    public void setCALMETHOD_ID_QFY(java.math.BigDecimal CALMETHOD_ID_QFY) {
        this.CALMETHOD_ID_QFY = CALMETHOD_ID_QFY;
    }
    
    public java.math.BigDecimal getCALMETHOD_ID_QFY() {
        return this.CALMETHOD_ID_QFY;
    }
      

    private java.math.BigDecimal FIELD1;
    
    public void setFIELD1(java.math.BigDecimal FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.math.BigDecimal getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String FIELD2;
    
    public void setFIELD2(java.lang.String FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.lang.String getFIELD2() {
        return this.FIELD2;
    }
      

    private java.math.BigDecimal FLAGS;
    
    public void setFLAGS(java.math.BigDecimal FLAGS) {
        this.FLAGS = FLAGS;
    }
    
    public java.math.BigDecimal getFLAGS() {
        return this.FLAGS;
    }
      

    private java.math.BigDecimal IDENTIFIER;
    
    public void setIDENTIFIER(java.math.BigDecimal IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
    
    public java.math.BigDecimal getIDENTIFIER() {
        return this.IDENTIFIER;
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
        result.append("CALRULE_ID: " + getCALRULE_ID() + "||");
        result.append("CALCODE_ID: " + getCALCODE_ID() + "||");
        result.append("STARTDATE: " + getSTARTDATE() + "||");
        result.append("TAXCGRY_ID: " + getTAXCGRY_ID() + "||");
        result.append("ENDDATE: " + getENDDATE() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("COMBINATION: " + getCOMBINATION() + "||");
        result.append("CALMETHOD_ID: " + getCALMETHOD_ID() + "||");
        result.append("CALMETHOD_ID_QFY: " + getCALMETHOD_ID_QFY() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FLAGS: " + getFLAGS() + "||");
        result.append("IDENTIFIER: " + getIDENTIFIER() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}