package com.avn.dataload.model;

public class CACHEIVL {


    private java.lang.String TEMPLATE;
    
    public void setTEMPLATE(java.lang.String TEMPLATE) {
        this.TEMPLATE = TEMPLATE;
    }
    
    public java.lang.String getTEMPLATE() {
        return this.TEMPLATE;
    }
      

    private java.lang.String DATAID;
    
    public void setDATAID(java.lang.String DATAID) {
        this.DATAID = DATAID;
    }
    
    public java.lang.String getDATAID() {
        return this.DATAID;
    }
      

    private java.sql.Timestamp INSERTTIME;
    
    public void setINSERTTIME(java.sql.Timestamp INSERTTIME) {
        this.INSERTTIME = INSERTTIME;
    }
    
    public java.sql.Timestamp getINSERTTIME() {
        return this.INSERTTIME;
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
        result.append("TEMPLATE: " + getTEMPLATE() + "||");
        result.append("DATAID: " + getDATAID() + "||");
        result.append("INSERTTIME: " + getINSERTTIME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}