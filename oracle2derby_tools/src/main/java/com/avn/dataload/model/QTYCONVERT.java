package com.avn.dataload.model;

public class QTYCONVERT {


    private java.lang.String QTYUNIT_ID_TO;
    
    public void setQTYUNIT_ID_TO(java.lang.String QTYUNIT_ID_TO) {
        this.QTYUNIT_ID_TO = QTYUNIT_ID_TO;
    }
    
    public java.lang.String getQTYUNIT_ID_TO() {
        return this.QTYUNIT_ID_TO;
    }
      

    private java.math.BigDecimal QTYCONVERT_ID;
    
    public void setQTYCONVERT_ID(java.math.BigDecimal QTYCONVERT_ID) {
        this.QTYCONVERT_ID = QTYCONVERT_ID;
    }
    
    public java.math.BigDecimal getQTYCONVERT_ID() {
        return this.QTYCONVERT_ID;
    }
      

    private java.lang.String QTYUNIT_ID_FROM;
    
    public void setQTYUNIT_ID_FROM(java.lang.String QTYUNIT_ID_FROM) {
        this.QTYUNIT_ID_FROM = QTYUNIT_ID_FROM;
    }
    
    public java.lang.String getQTYUNIT_ID_FROM() {
        return this.QTYUNIT_ID_FROM;
    }
      

    private java.math.BigDecimal FACTOR;
    
    public void setFACTOR(java.math.BigDecimal FACTOR) {
        this.FACTOR = FACTOR;
    }
    
    public java.math.BigDecimal getFACTOR() {
        return this.FACTOR;
    }
      

    private java.lang.String MULTIPLYORDIVIDE;
    
    public void setMULTIPLYORDIVIDE(java.lang.String MULTIPLYORDIVIDE) {
        this.MULTIPLYORDIVIDE = MULTIPLYORDIVIDE;
    }
    
    public java.lang.String getMULTIPLYORDIVIDE() {
        return this.MULTIPLYORDIVIDE;
    }
      

    private java.lang.String UPDATABLE;
    
    public void setUPDATABLE(java.lang.String UPDATABLE) {
        this.UPDATABLE = UPDATABLE;
    }
    
    public java.lang.String getUPDATABLE() {
        return this.UPDATABLE;
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
        result.append("QTYUNIT_ID_TO: " + getQTYUNIT_ID_TO() + "||");
        result.append("QTYCONVERT_ID: " + getQTYCONVERT_ID() + "||");
        result.append("QTYUNIT_ID_FROM: " + getQTYUNIT_ID_FROM() + "||");
        result.append("FACTOR: " + getFACTOR() + "||");
        result.append("MULTIPLYORDIVIDE: " + getMULTIPLYORDIVIDE() + "||");
        result.append("UPDATABLE: " + getUPDATABLE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}