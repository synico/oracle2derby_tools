package com.avn.dataload.model;

public class PX_PROMOCD {


    private java.math.BigDecimal PX_PROMOCD_ID;
    
    public void setPX_PROMOCD_ID(java.math.BigDecimal PX_PROMOCD_ID) {
        this.PX_PROMOCD_ID = PX_PROMOCD_ID;
    }
    
    public java.math.BigDecimal getPX_PROMOCD_ID() {
        return this.PX_PROMOCD_ID;
    }
      

    private java.math.BigDecimal PX_PROMOTION_ID;
    
    public void setPX_PROMOTION_ID(java.math.BigDecimal PX_PROMOTION_ID) {
        this.PX_PROMOTION_ID = PX_PROMOTION_ID;
    }
    
    public java.math.BigDecimal getPX_PROMOTION_ID() {
        return this.PX_PROMOTION_ID;
    }
      

    private java.lang.String CODE;
    
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }
    
    public java.lang.String getCODE() {
        return this.CODE;
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
        result.append("PX_PROMOCD_ID: " + getPX_PROMOCD_ID() + "||");
        result.append("PX_PROMOTION_ID: " + getPX_PROMOTION_ID() + "||");
        result.append("CODE: " + getCODE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}