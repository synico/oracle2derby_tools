package com.avn.dataload.model;

public class STENCALUSG {


    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal CALUSAGE_ID;
    
    public void setCALUSAGE_ID(java.math.BigDecimal CALUSAGE_ID) {
        this.CALUSAGE_ID = CALUSAGE_ID;
    }
    
    public java.math.BigDecimal getCALUSAGE_ID() {
        return this.CALUSAGE_ID;
    }
      

    private java.math.BigDecimal ACTCC_CALMETHOD_ID;
    
    public void setACTCC_CALMETHOD_ID(java.math.BigDecimal ACTCC_CALMETHOD_ID) {
        this.ACTCC_CALMETHOD_ID = ACTCC_CALMETHOD_ID;
    }
    
    public java.math.BigDecimal getACTCC_CALMETHOD_ID() {
        return this.ACTCC_CALMETHOD_ID;
    }
      

    private java.math.BigDecimal ACTRC_CALMETHOD_ID;
    
    public void setACTRC_CALMETHOD_ID(java.math.BigDecimal ACTRC_CALMETHOD_ID) {
        this.ACTRC_CALMETHOD_ID = ACTRC_CALMETHOD_ID;
    }
    
    public java.math.BigDecimal getACTRC_CALMETHOD_ID() {
        return this.ACTRC_CALMETHOD_ID;
    }
      

    private java.math.BigDecimal CALCODE_ID;
    
    public void setCALCODE_ID(java.math.BigDecimal CALCODE_ID) {
        this.CALCODE_ID = CALCODE_ID;
    }
    
    public java.math.BigDecimal getCALCODE_ID() {
        return this.CALCODE_ID;
    }
      

    private java.math.BigDecimal CALMETHOD_ID_APP;
    
    public void setCALMETHOD_ID_APP(java.math.BigDecimal CALMETHOD_ID_APP) {
        this.CALMETHOD_ID_APP = CALMETHOD_ID_APP;
    }
    
    public java.math.BigDecimal getCALMETHOD_ID_APP() {
        return this.CALMETHOD_ID_APP;
    }
      

    private java.math.BigDecimal CALMETHOD_ID_SUM;
    
    public void setCALMETHOD_ID_SUM(java.math.BigDecimal CALMETHOD_ID_SUM) {
        this.CALMETHOD_ID_SUM = CALMETHOD_ID_SUM;
    }
    
    public java.math.BigDecimal getCALMETHOD_ID_SUM() {
        return this.CALMETHOD_ID_SUM;
    }
      

    private java.math.BigDecimal CALMETHOD_ID_FIN;
    
    public void setCALMETHOD_ID_FIN(java.math.BigDecimal CALMETHOD_ID_FIN) {
        this.CALMETHOD_ID_FIN = CALMETHOD_ID_FIN;
    }
    
    public java.math.BigDecimal getCALMETHOD_ID_FIN() {
        return this.CALMETHOD_ID_FIN;
    }
      

    private java.math.BigDecimal USAGEFLAGS;
    
    public void setUSAGEFLAGS(java.math.BigDecimal USAGEFLAGS) {
        this.USAGEFLAGS = USAGEFLAGS;
    }
    
    public java.math.BigDecimal getUSAGEFLAGS() {
        return this.USAGEFLAGS;
    }
      

    private java.math.BigDecimal CALMETHOD_ID_INI;
    
    public void setCALMETHOD_ID_INI(java.math.BigDecimal CALMETHOD_ID_INI) {
        this.CALMETHOD_ID_INI = CALMETHOD_ID_INI;
    }
    
    public java.math.BigDecimal getCALMETHOD_ID_INI() {
        return this.CALMETHOD_ID_INI;
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
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("CALUSAGE_ID: " + getCALUSAGE_ID() + "||");
        result.append("ACTCC_CALMETHOD_ID: " + getACTCC_CALMETHOD_ID() + "||");
        result.append("ACTRC_CALMETHOD_ID: " + getACTRC_CALMETHOD_ID() + "||");
        result.append("CALCODE_ID: " + getCALCODE_ID() + "||");
        result.append("CALMETHOD_ID_APP: " + getCALMETHOD_ID_APP() + "||");
        result.append("CALMETHOD_ID_SUM: " + getCALMETHOD_ID_SUM() + "||");
        result.append("CALMETHOD_ID_FIN: " + getCALMETHOD_ID_FIN() + "||");
        result.append("USAGEFLAGS: " + getUSAGEFLAGS() + "||");
        result.append("CALMETHOD_ID_INI: " + getCALMETHOD_ID_INI() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}