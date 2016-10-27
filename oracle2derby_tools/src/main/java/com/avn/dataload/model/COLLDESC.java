package com.avn.dataload.model;

public class COLLDESC {


    private java.math.BigDecimal COLLATERAL_ID;
    
    public void setCOLLATERAL_ID(java.math.BigDecimal COLLATERAL_ID) {
        this.COLLATERAL_ID = COLLATERAL_ID;
    }
    
    public java.math.BigDecimal getCOLLATERAL_ID() {
        return this.COLLATERAL_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String LOCATION;
    
    public void setLOCATION(java.lang.String LOCATION) {
        this.LOCATION = LOCATION;
    }
    
    public java.lang.String getLOCATION() {
        return this.LOCATION;
    }
      

    private java.lang.String MARKETINGTEXT;
    
    public void setMARKETINGTEXT(java.lang.String MARKETINGTEXT) {
        this.MARKETINGTEXT = MARKETINGTEXT;
    }
    
    public java.lang.String getMARKETINGTEXT() {
        return this.MARKETINGTEXT;
    }
      

    private java.sql.Clob LONGMKTGTEXT;
    
    public void setLONGMKTGTEXT(java.sql.Clob LONGMKTGTEXT) {
        this.LONGMKTGTEXT = LONGMKTGTEXT;
    }
    
    public java.sql.Clob getLONGMKTGTEXT() {
        return this.LONGMKTGTEXT;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String FIELD2;
    
    public void setFIELD2(java.lang.String FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.lang.String getFIELD2() {
        return this.FIELD2;
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
        result.append("COLLATERAL_ID: " + getCOLLATERAL_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("LOCATION: " + getLOCATION() + "||");
        result.append("MARKETINGTEXT: " + getMARKETINGTEXT() + "||");
        result.append("LONGMKTGTEXT: " + getLONGMKTGTEXT() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}