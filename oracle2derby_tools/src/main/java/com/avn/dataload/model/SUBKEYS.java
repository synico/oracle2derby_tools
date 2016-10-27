package com.avn.dataload.model;

public class SUBKEYS {


    private java.math.BigDecimal SUBKEYS_ID;
    
    public void setSUBKEYS_ID(java.math.BigDecimal SUBKEYS_ID) {
        this.SUBKEYS_ID = SUBKEYS_ID;
    }
    
    public java.math.BigDecimal getSUBKEYS_ID() {
        return this.SUBKEYS_ID;
    }
      

    private java.lang.String TABLENAME;
    
    public void setTABLENAME(java.lang.String TABLENAME) {
        this.TABLENAME = TABLENAME;
    }
    
    public java.lang.String getTABLENAME() {
        return this.TABLENAME;
    }
      

    private java.lang.String COLUMNNAME;
    
    public void setCOLUMNNAME(java.lang.String COLUMNNAME) {
        this.COLUMNNAME = COLUMNNAME;
    }
    
    public java.lang.String getCOLUMNNAME() {
        return this.COLUMNNAME;
    }
      

    private java.math.BigDecimal COUNTER;
    
    public void setCOUNTER(java.math.BigDecimal COUNTER) {
        this.COUNTER = COUNTER;
    }
    
    public java.math.BigDecimal getCOUNTER() {
        return this.COUNTER;
    }
      

    private java.math.BigDecimal PREFETCHSIZE;
    
    public void setPREFETCHSIZE(java.math.BigDecimal PREFETCHSIZE) {
        this.PREFETCHSIZE = PREFETCHSIZE;
    }
    
    public java.math.BigDecimal getPREFETCHSIZE() {
        return this.PREFETCHSIZE;
    }
      

    private java.math.BigDecimal LOWERBOUND;
    
    public void setLOWERBOUND(java.math.BigDecimal LOWERBOUND) {
        this.LOWERBOUND = LOWERBOUND;
    }
    
    public java.math.BigDecimal getLOWERBOUND() {
        return this.LOWERBOUND;
    }
      

    private java.math.BigDecimal UPPERBOUND;
    
    public void setUPPERBOUND(java.math.BigDecimal UPPERBOUND) {
        this.UPPERBOUND = UPPERBOUND;
    }
    
    public java.math.BigDecimal getUPPERBOUND() {
        return this.UPPERBOUND;
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
        result.append("SUBKEYS_ID: " + getSUBKEYS_ID() + "||");
        result.append("TABLENAME: " + getTABLENAME() + "||");
        result.append("COLUMNNAME: " + getCOLUMNNAME() + "||");
        result.append("COUNTER: " + getCOUNTER() + "||");
        result.append("PREFETCHSIZE: " + getPREFETCHSIZE() + "||");
        result.append("LOWERBOUND: " + getLOWERBOUND() + "||");
        result.append("UPPERBOUND: " + getUPPERBOUND() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}