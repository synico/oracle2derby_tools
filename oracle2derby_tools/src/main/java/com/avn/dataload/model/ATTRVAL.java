package com.avn.dataload.model;

public class ATTRVAL {


    private java.math.BigDecimal ATTRVAL_ID;
    
    public void setATTRVAL_ID(java.math.BigDecimal ATTRVAL_ID) {
        this.ATTRVAL_ID = ATTRVAL_ID;
    }
    
    public java.math.BigDecimal getATTRVAL_ID() {
        return this.ATTRVAL_ID;
    }
      

    private java.math.BigDecimal ATTR_ID;
    
    public void setATTR_ID(java.math.BigDecimal ATTR_ID) {
        this.ATTR_ID = ATTR_ID;
    }
    
    public java.math.BigDecimal getATTR_ID() {
        return this.ATTR_ID;
    }
      

    private java.lang.String IDENTIFIER;
    
    public void setIDENTIFIER(java.lang.String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
    
    public java.lang.String getIDENTIFIER() {
        return this.IDENTIFIER;
    }
      

    private java.math.BigDecimal VALUSAGE;
    
    public void setVALUSAGE(java.math.BigDecimal VALUSAGE) {
        this.VALUSAGE = VALUSAGE;
    }
    
    public java.math.BigDecimal getVALUSAGE() {
        return this.VALUSAGE;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
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
        result.append("ATTRVAL_ID: " + getATTRVAL_ID() + "||");
        result.append("ATTR_ID: " + getATTR_ID() + "||");
        result.append("IDENTIFIER: " + getIDENTIFIER() + "||");
        result.append("VALUSAGE: " + getVALUSAGE() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}