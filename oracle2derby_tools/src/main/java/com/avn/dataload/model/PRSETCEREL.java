package com.avn.dataload.model;

public class PRSETCEREL {


    private java.math.BigDecimal PRODUCTSET_ID;
    
    public void setPRODUCTSET_ID(java.math.BigDecimal PRODUCTSET_ID) {
        this.PRODUCTSET_ID = PRODUCTSET_ID;
    }
    
    public java.math.BigDecimal getPRODUCTSET_ID() {
        return this.PRODUCTSET_ID;
    }
      

    private java.math.BigDecimal CATENTRY_ID;
    
    public void setCATENTRY_ID(java.math.BigDecimal CATENTRY_ID) {
        this.CATENTRY_ID = CATENTRY_ID;
    }
    
    public java.math.BigDecimal getCATENTRY_ID() {
        return this.CATENTRY_ID;
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
        result.append("PRODUCTSET_ID: " + getPRODUCTSET_ID() + "||");
        result.append("CATENTRY_ID: " + getCATENTRY_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}