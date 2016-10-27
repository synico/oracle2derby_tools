package com.avn.dataload.model;

public class XPCATENTDESC {


    private java.math.BigDecimal CATENTRY_ID;
    
    public void setCATENTRY_ID(java.math.BigDecimal CATENTRY_ID) {
        this.CATENTRY_ID = CATENTRY_ID;
    }
    
    public java.math.BigDecimal getCATENTRY_ID() {
        return this.CATENTRY_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String PRODUCTAPPLICATIONS;
    
    public void setPRODUCTAPPLICATIONS(java.lang.String PRODUCTAPPLICATIONS) {
        this.PRODUCTAPPLICATIONS = PRODUCTAPPLICATIONS;
    }
    
    public java.lang.String getPRODUCTAPPLICATIONS() {
        return this.PRODUCTAPPLICATIONS;
    }
      

    private java.lang.String KITINCLUDE;
    
    public void setKITINCLUDE(java.lang.String KITINCLUDE) {
        this.KITINCLUDE = KITINCLUDE;
    }
    
    public java.lang.String getKITINCLUDE() {
        return this.KITINCLUDE;
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
        result.append("CATENTRY_ID: " + getCATENTRY_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("PRODUCTAPPLICATIONS: " + getPRODUCTAPPLICATIONS() + "||");
        result.append("KITINCLUDE: " + getKITINCLUDE() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}