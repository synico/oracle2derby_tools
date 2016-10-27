package com.avn.dataload.model;

public class VERSIONSPC {


    private java.math.BigDecimal VERSIONSPC_ID;
    
    public void setVERSIONSPC_ID(java.math.BigDecimal VERSIONSPC_ID) {
        this.VERSIONSPC_ID = VERSIONSPC_ID;
    }
    
    public java.math.BigDecimal getVERSIONSPC_ID() {
        return this.VERSIONSPC_ID;
    }
      

    private java.math.BigDecimal ITEMSPC_ID;
    
    public void setITEMSPC_ID(java.math.BigDecimal ITEMSPC_ID) {
        this.ITEMSPC_ID = ITEMSPC_ID;
    }
    
    public java.math.BigDecimal getITEMSPC_ID() {
        return this.ITEMSPC_ID;
    }
      

    private java.math.BigDecimal ITEMVERSN_ID;
    
    public void setITEMVERSN_ID(java.math.BigDecimal ITEMVERSN_ID) {
        this.ITEMVERSN_ID = ITEMVERSN_ID;
    }
    
    public java.math.BigDecimal getITEMVERSN_ID() {
        return this.ITEMVERSN_ID;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
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
        result.append("VERSIONSPC_ID: " + getVERSIONSPC_ID() + "||");
        result.append("ITEMSPC_ID: " + getITEMSPC_ID() + "||");
        result.append("ITEMVERSN_ID: " + getITEMVERSN_ID() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}