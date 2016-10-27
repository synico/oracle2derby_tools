package com.avn.dataload.model;

public class ACATTR {


    private java.math.BigDecimal ACATTR_ID;
    
    public void setACATTR_ID(java.math.BigDecimal ACATTR_ID) {
        this.ACATTR_ID = ACATTR_ID;
    }
    
    public java.math.BigDecimal getACATTR_ID() {
        return this.ACATTR_ID;
    }
      

    private java.lang.String ATTRNAME;
    
    public void setATTRNAME(java.lang.String ATTRNAME) {
        this.ATTRNAME = ATTRNAME;
    }
    
    public java.lang.String getATTRNAME() {
        return this.ATTRNAME;
    }
      

    private java.math.BigDecimal DATATYPE;
    
    public void setDATATYPE(java.math.BigDecimal DATATYPE) {
        this.DATATYPE = DATATYPE;
    }
    
    public java.math.BigDecimal getDATATYPE() {
        return this.DATATYPE;
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
        result.append("ACATTR_ID: " + getACATTR_ID() + "||");
        result.append("ATTRNAME: " + getATTRNAME() + "||");
        result.append("DATATYPE: " + getDATATYPE() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}