package com.avn.dataload.model;

public class QTYUNIT {


    private java.lang.String QTYUNIT_ID;
    
    public void setQTYUNIT_ID(java.lang.String QTYUNIT_ID) {
        this.QTYUNIT_ID = QTYUNIT_ID;
    }
    
    public java.lang.String getQTYUNIT_ID() {
        return this.QTYUNIT_ID;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
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
        result.append("QTYUNIT_ID: " + getQTYUNIT_ID() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}