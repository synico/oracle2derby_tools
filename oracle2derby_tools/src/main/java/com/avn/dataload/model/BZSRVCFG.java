package com.avn.dataload.model;

public class BZSRVCFG {


    private java.math.BigDecimal BZSRVCFG_ID;
    
    public void setBZSRVCFG_ID(java.math.BigDecimal BZSRVCFG_ID) {
        this.BZSRVCFG_ID = BZSRVCFG_ID;
    }
    
    public java.math.BigDecimal getBZSRVCFG_ID() {
        return this.BZSRVCFG_ID;
    }
      

    private java.lang.String SERVERNAME;
    
    public void setSERVERNAME(java.lang.String SERVERNAME) {
        this.SERVERNAME = SERVERNAME;
    }
    
    public java.lang.String getSERVERNAME() {
        return this.SERVERNAME;
    }
      

    private java.math.BigDecimal ENABLED;
    
    public void setENABLED(java.math.BigDecimal ENABLED) {
        this.ENABLED = ENABLED;
    }
    
    public java.math.BigDecimal getENABLED() {
        return this.ENABLED;
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
        result.append("BZSRVCFG_ID: " + getBZSRVCFG_ID() + "||");
        result.append("SERVERNAME: " + getSERVERNAME() + "||");
        result.append("ENABLED: " + getENABLED() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}