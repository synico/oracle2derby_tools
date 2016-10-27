package com.avn.dataload.model;

public class DMEMSPOTCOLLDEF {


    private java.math.BigDecimal DMEMSPOTCOLLDEF_ID;
    
    public void setDMEMSPOTCOLLDEF_ID(java.math.BigDecimal DMEMSPOTCOLLDEF_ID) {
        this.DMEMSPOTCOLLDEF_ID = DMEMSPOTCOLLDEF_ID;
    }
    
    public java.math.BigDecimal getDMEMSPOTCOLLDEF_ID() {
        return this.DMEMSPOTCOLLDEF_ID;
    }
      

    private java.math.BigDecimal EMSPOT_ID;
    
    public void setEMSPOT_ID(java.math.BigDecimal EMSPOT_ID) {
        this.EMSPOT_ID = EMSPOT_ID;
    }
    
    public java.math.BigDecimal getEMSPOT_ID() {
        return this.EMSPOT_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal COLLATERAL_ID;
    
    public void setCOLLATERAL_ID(java.math.BigDecimal COLLATERAL_ID) {
        this.COLLATERAL_ID = COLLATERAL_ID;
    }
    
    public java.math.BigDecimal getCOLLATERAL_ID() {
        return this.COLLATERAL_ID;
    }
      

    private java.math.BigDecimal SEQUENCE;
    
    public void setSEQUENCE(java.math.BigDecimal SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }
    
    public java.math.BigDecimal getSEQUENCE() {
        return this.SEQUENCE;
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
        result.append("DMEMSPOTCOLLDEF_ID: " + getDMEMSPOTCOLLDEF_ID() + "||");
        result.append("EMSPOT_ID: " + getEMSPOT_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("COLLATERAL_ID: " + getCOLLATERAL_ID() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}