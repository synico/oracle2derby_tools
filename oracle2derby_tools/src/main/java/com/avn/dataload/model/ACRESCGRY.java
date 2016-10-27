package com.avn.dataload.model;

public class ACRESCGRY {


    private java.math.BigDecimal ACRESCGRY_ID;
    
    public void setACRESCGRY_ID(java.math.BigDecimal ACRESCGRY_ID) {
        this.ACRESCGRY_ID = ACRESCGRY_ID;
    }
    
    public java.math.BigDecimal getACRESCGRY_ID() {
        return this.ACRESCGRY_ID;
    }
      

    private java.lang.String RESPRIMARYTABLE;
    
    public void setRESPRIMARYTABLE(java.lang.String RESPRIMARYTABLE) {
        this.RESPRIMARYTABLE = RESPRIMARYTABLE;
    }
    
    public java.lang.String getRESPRIMARYTABLE() {
        return this.RESPRIMARYTABLE;
    }
      

    private java.lang.String RESOWNERTABLE;
    
    public void setRESOWNERTABLE(java.lang.String RESOWNERTABLE) {
        this.RESOWNERTABLE = RESOWNERTABLE;
    }
    
    public java.lang.String getRESOWNERTABLE() {
        return this.RESOWNERTABLE;
    }
      

    private java.lang.String RESOWNERCOL;
    
    public void setRESOWNERCOL(java.lang.String RESOWNERCOL) {
        this.RESOWNERCOL = RESOWNERCOL;
    }
    
    public java.lang.String getRESOWNERCOL() {
        return this.RESOWNERCOL;
    }
      

    private java.lang.String RESKEYOWNCOL;
    
    public void setRESKEYOWNCOL(java.lang.String RESKEYOWNCOL) {
        this.RESKEYOWNCOL = RESKEYOWNCOL;
    }
    
    public java.lang.String getRESKEYOWNCOL() {
        return this.RESKEYOWNCOL;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String RESCLASSNAME;
    
    public void setRESCLASSNAME(java.lang.String RESCLASSNAME) {
        this.RESCLASSNAME = RESCLASSNAME;
    }
    
    public java.lang.String getRESCLASSNAME() {
        return this.RESCLASSNAME;
    }
      

    private java.lang.String RESJOINKEY;
    
    public void setRESJOINKEY(java.lang.String RESJOINKEY) {
        this.RESJOINKEY = RESJOINKEY;
    }
    
    public java.lang.String getRESJOINKEY() {
        return this.RESJOINKEY;
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
        result.append("ACRESCGRY_ID: " + getACRESCGRY_ID() + "||");
        result.append("RESPRIMARYTABLE: " + getRESPRIMARYTABLE() + "||");
        result.append("RESOWNERTABLE: " + getRESOWNERTABLE() + "||");
        result.append("RESOWNERCOL: " + getRESOWNERCOL() + "||");
        result.append("RESKEYOWNCOL: " + getRESKEYOWNCOL() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("RESCLASSNAME: " + getRESCLASSNAME() + "||");
        result.append("RESJOINKEY: " + getRESJOINKEY() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}