package com.avn.dataload.model;

public class CATFILTER {


    private java.math.BigDecimal CATFILTER_ID;
    
    public void setCATFILTER_ID(java.math.BigDecimal CATFILTER_ID) {
        this.CATFILTER_ID = CATFILTER_ID;
    }
    
    public java.math.BigDecimal getCATFILTER_ID() {
        return this.CATFILTER_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal CATALOG_ID;
    
    public void setCATALOG_ID(java.math.BigDecimal CATALOG_ID) {
        this.CATALOG_ID = CATALOG_ID;
    }
    
    public java.math.BigDecimal getCATALOG_ID() {
        return this.CATALOG_ID;
    }
      

    private java.lang.String IDENTIFIER;
    
    public void setIDENTIFIER(java.lang.String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
    
    public java.lang.String getIDENTIFIER() {
        return this.IDENTIFIER;
    }
      

    private java.math.BigDecimal USAGE;
    
    public void setUSAGE(java.math.BigDecimal USAGE) {
        this.USAGE = USAGE;
    }
    
    public java.math.BigDecimal getUSAGE() {
        return this.USAGE;
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
      

    private java.lang.String FIELD3;
    
    public void setFIELD3(java.lang.String FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.lang.String getFIELD3() {
        return this.FIELD3;
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
        result.append("CATFILTER_ID: " + getCATFILTER_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("CATALOG_ID: " + getCATALOG_ID() + "||");
        result.append("IDENTIFIER: " + getIDENTIFIER() + "||");
        result.append("USAGE: " + getUSAGE() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}