package com.avn.dataload.model;

public class CLCDPROMO {


    private java.math.BigDecimal PX_PROMOTION_ID;
    
    public void setPX_PROMOTION_ID(java.math.BigDecimal PX_PROMOTION_ID) {
        this.PX_PROMOTION_ID = PX_PROMOTION_ID;
    }
    
    public java.math.BigDecimal getPX_PROMOTION_ID() {
        return this.PX_PROMOTION_ID;
    }
      

    private java.math.BigDecimal CALCODE_ID;
    
    public void setCALCODE_ID(java.math.BigDecimal CALCODE_ID) {
        this.CALCODE_ID = CALCODE_ID;
    }
    
    public java.math.BigDecimal getCALCODE_ID() {
        return this.CALCODE_ID;
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
        result.append("PX_PROMOTION_ID: " + getPX_PROMOTION_ID() + "||");
        result.append("CALCODE_ID: " + getCALCODE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}