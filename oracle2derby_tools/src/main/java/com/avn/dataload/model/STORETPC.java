package com.avn.dataload.model;

public class STORETPC {


    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal TRADEPOSCN_ID;
    
    public void setTRADEPOSCN_ID(java.math.BigDecimal TRADEPOSCN_ID) {
        this.TRADEPOSCN_ID = TRADEPOSCN_ID;
    }
    
    public java.math.BigDecimal getTRADEPOSCN_ID() {
        return this.TRADEPOSCN_ID;
    }
      

    private java.math.BigDecimal STTPCUSG_ID;
    
    public void setSTTPCUSG_ID(java.math.BigDecimal STTPCUSG_ID) {
        this.STTPCUSG_ID = STTPCUSG_ID;
    }
    
    public java.math.BigDecimal getSTTPCUSG_ID() {
        return this.STTPCUSG_ID;
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
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("TRADEPOSCN_ID: " + getTRADEPOSCN_ID() + "||");
        result.append("STTPCUSG_ID: " + getSTTPCUSG_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}