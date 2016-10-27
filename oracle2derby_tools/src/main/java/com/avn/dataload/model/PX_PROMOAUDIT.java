package com.avn.dataload.model;

public class PX_PROMOAUDIT {


    private java.math.BigDecimal PX_PROMOTION_ID;
    
    public void setPX_PROMOTION_ID(java.math.BigDecimal PX_PROMOTION_ID) {
        this.PX_PROMOTION_ID = PX_PROMOTION_ID;
    }
    
    public java.math.BigDecimal getPX_PROMOTION_ID() {
        return this.PX_PROMOTION_ID;
    }
      

    private java.math.BigDecimal VERSION;
    
    public void setVERSION(java.math.BigDecimal VERSION) {
        this.VERSION = VERSION;
    }
    
    public java.math.BigDecimal getVERSION() {
        return this.VERSION;
    }
      

    private java.math.BigDecimal REVISION;
    
    public void setREVISION(java.math.BigDecimal REVISION) {
        this.REVISION = REVISION;
    }
    
    public java.math.BigDecimal getREVISION() {
        return this.REVISION;
    }
      

    private java.sql.Clob XMLPARAM;
    
    public void setXMLPARAM(java.sql.Clob XMLPARAM) {
        this.XMLPARAM = XMLPARAM;
    }
    
    public java.sql.Clob getXMLPARAM() {
        return this.XMLPARAM;
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
        result.append("VERSION: " + getVERSION() + "||");
        result.append("REVISION: " + getREVISION() + "||");
        result.append("XMLPARAM: " + getXMLPARAM() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}