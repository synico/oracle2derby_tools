package com.avn.dataload.model;

public class PRELEMENT {


    private java.math.BigDecimal PRELEMENT_ID;
    
    public void setPRELEMENT_ID(java.math.BigDecimal PRELEMENT_ID) {
        this.PRELEMENT_ID = PRELEMENT_ID;
    }
    
    public java.math.BigDecimal getPRELEMENT_ID() {
        return this.PRELEMENT_ID;
    }
      

    private java.lang.String IDENTIFIER;
    
    public void setIDENTIFIER(java.lang.String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
    
    public java.lang.String getIDENTIFIER() {
        return this.IDENTIFIER;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.math.BigDecimal PRELETEMPLATE_ID;
    
    public void setPRELETEMPLATE_ID(java.math.BigDecimal PRELETEMPLATE_ID) {
        this.PRELETEMPLATE_ID = PRELETEMPLATE_ID;
    }
    
    public java.math.BigDecimal getPRELETEMPLATE_ID() {
        return this.PRELETEMPLATE_ID;
    }
      

    private java.math.BigDecimal PRICERULE_ID;
    
    public void setPRICERULE_ID(java.math.BigDecimal PRICERULE_ID) {
        this.PRICERULE_ID = PRICERULE_ID;
    }
    
    public java.math.BigDecimal getPRICERULE_ID() {
        return this.PRICERULE_ID;
    }
      

    private java.lang.String PARENT;
    
    public void setPARENT(java.lang.String PARENT) {
        this.PARENT = PARENT;
    }
    
    public java.lang.String getPARENT() {
        return this.PARENT;
    }
      

    private java.math.BigDecimal SEQUENCE;
    
    public void setSEQUENCE(java.math.BigDecimal SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }
    
    public java.math.BigDecimal getSEQUENCE() {
        return this.SEQUENCE;
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
        result.append("PRELEMENT_ID: " + getPRELEMENT_ID() + "||");
        result.append("IDENTIFIER: " + getIDENTIFIER() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("PRELETEMPLATE_ID: " + getPRELETEMPLATE_ID() + "||");
        result.append("PRICERULE_ID: " + getPRICERULE_ID() + "||");
        result.append("PARENT: " + getPARENT() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}