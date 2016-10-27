package com.avn.dataload.model;

public class CALUSAGE {


    private java.math.BigDecimal CALUSAGE_ID;
    
    public void setCALUSAGE_ID(java.math.BigDecimal CALUSAGE_ID) {
        this.CALUSAGE_ID = CALUSAGE_ID;
    }
    
    public java.math.BigDecimal getCALUSAGE_ID() {
        return this.CALUSAGE_ID;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.lang.String STRELTYPNAMECFG;
    
    public void setSTRELTYPNAMECFG(java.lang.String STRELTYPNAMECFG) {
        this.STRELTYPNAMECFG = STRELTYPNAMECFG;
    }
    
    public java.lang.String getSTRELTYPNAMECFG() {
        return this.STRELTYPNAMECFG;
    }
      

    private java.lang.String STRELTYPNAMERT;
    
    public void setSTRELTYPNAMERT(java.lang.String STRELTYPNAMERT) {
        this.STRELTYPNAMERT = STRELTYPNAMERT;
    }
    
    public java.lang.String getSTRELTYPNAMERT() {
        return this.STRELTYPNAMERT;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("CALUSAGE_ID: " + getCALUSAGE_ID() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("STRELTYPNAMECFG: " + getSTRELTYPNAMECFG() + "||");
        result.append("STRELTYPNAMERT: " + getSTRELTYPNAMERT() + "||");
        return result.toString();
    }
    
}