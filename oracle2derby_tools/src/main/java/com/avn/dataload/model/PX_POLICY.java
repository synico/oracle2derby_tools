package com.avn.dataload.model;

public class PX_POLICY {


    private java.math.BigDecimal PX_POLICY_ID;
    
    public void setPX_POLICY_ID(java.math.BigDecimal PX_POLICY_ID) {
        this.PX_POLICY_ID = PX_POLICY_ID;
    }
    
    public java.math.BigDecimal getPX_POLICY_ID() {
        return this.PX_POLICY_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal STATUS;
    
    public void setSTATUS(java.math.BigDecimal STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.math.BigDecimal getSTATUS() {
        return this.STATUS;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String IMPLCLS;
    
    public void setIMPLCLS(java.lang.String IMPLCLS) {
        this.IMPLCLS = IMPLCLS;
    }
    
    public java.lang.String getIMPLCLS() {
        return this.IMPLCLS;
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
        result.append("PX_POLICY_ID: " + getPX_POLICY_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("IMPLCLS: " + getIMPLCLS() + "||");
        result.append("XMLPARAM: " + getXMLPARAM() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}