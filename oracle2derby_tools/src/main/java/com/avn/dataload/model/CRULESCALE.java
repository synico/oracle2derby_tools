package com.avn.dataload.model;

public class CRULESCALE {


    private java.math.BigDecimal CALSCALE_ID;
    
    public void setCALSCALE_ID(java.math.BigDecimal CALSCALE_ID) {
        this.CALSCALE_ID = CALSCALE_ID;
    }
    
    public java.math.BigDecimal getCALSCALE_ID() {
        return this.CALSCALE_ID;
    }
      

    private java.math.BigDecimal CALRULE_ID;
    
    public void setCALRULE_ID(java.math.BigDecimal CALRULE_ID) {
        this.CALRULE_ID = CALRULE_ID;
    }
    
    public java.math.BigDecimal getCALRULE_ID() {
        return this.CALRULE_ID;
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
        result.append("CALSCALE_ID: " + getCALSCALE_ID() + "||");
        result.append("CALRULE_ID: " + getCALRULE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}