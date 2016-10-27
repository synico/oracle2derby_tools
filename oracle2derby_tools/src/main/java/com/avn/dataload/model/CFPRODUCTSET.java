package com.avn.dataload.model;

public class CFPRODUCTSET {


    private java.math.BigDecimal CFPRODUCTSET_ID;
    
    public void setCFPRODUCTSET_ID(java.math.BigDecimal CFPRODUCTSET_ID) {
        this.CFPRODUCTSET_ID = CFPRODUCTSET_ID;
    }
    
    public java.math.BigDecimal getCFPRODUCTSET_ID() {
        return this.CFPRODUCTSET_ID;
    }
      

    private java.math.BigDecimal CATFILTER_ID;
    
    public void setCATFILTER_ID(java.math.BigDecimal CATFILTER_ID) {
        this.CATFILTER_ID = CATFILTER_ID;
    }
    
    public java.math.BigDecimal getCATFILTER_ID() {
        return this.CATFILTER_ID;
    }
      

    private java.math.BigDecimal PRODUCTSET_ID;
    
    public void setPRODUCTSET_ID(java.math.BigDecimal PRODUCTSET_ID) {
        this.PRODUCTSET_ID = PRODUCTSET_ID;
    }
    
    public java.math.BigDecimal getPRODUCTSET_ID() {
        return this.PRODUCTSET_ID;
    }
      

    private java.math.BigDecimal TYPE;
    
    public void setTYPE(java.math.BigDecimal TYPE) {
        this.TYPE = TYPE;
    }
    
    public java.math.BigDecimal getTYPE() {
        return this.TYPE;
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
        result.append("CFPRODUCTSET_ID: " + getCFPRODUCTSET_ID() + "||");
        result.append("CATFILTER_ID: " + getCATFILTER_ID() + "||");
        result.append("PRODUCTSET_ID: " + getPRODUCTSET_ID() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}