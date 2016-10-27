package com.avn.dataload.model;

public class CALRLOOKUP {


    private java.math.BigDecimal CALRLOOKUP_ID;
    
    public void setCALRLOOKUP_ID(java.math.BigDecimal CALRLOOKUP_ID) {
        this.CALRLOOKUP_ID = CALRLOOKUP_ID;
    }
    
    public java.math.BigDecimal getCALRLOOKUP_ID() {
        return this.CALRLOOKUP_ID;
    }
      

    private java.lang.String SETCCURR;
    
    public void setSETCCURR(java.lang.String SETCCURR) {
        this.SETCCURR = SETCCURR;
    }
    
    public java.lang.String getSETCCURR() {
        return this.SETCCURR;
    }
      

    private java.math.BigDecimal CALRANGE_ID;
    
    public void setCALRANGE_ID(java.math.BigDecimal CALRANGE_ID) {
        this.CALRANGE_ID = CALRANGE_ID;
    }
    
    public java.math.BigDecimal getCALRANGE_ID() {
        return this.CALRANGE_ID;
    }
      

    private java.math.BigDecimal VALUE;
    
    public void setVALUE(java.math.BigDecimal VALUE) {
        this.VALUE = VALUE;
    }
    
    public java.math.BigDecimal getVALUE() {
        return this.VALUE;
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
        result.append("CALRLOOKUP_ID: " + getCALRLOOKUP_ID() + "||");
        result.append("SETCCURR: " + getSETCCURR() + "||");
        result.append("CALRANGE_ID: " + getCALRANGE_ID() + "||");
        result.append("VALUE: " + getVALUE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}