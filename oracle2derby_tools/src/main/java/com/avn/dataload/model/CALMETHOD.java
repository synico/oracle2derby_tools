package com.avn.dataload.model;

public class CALMETHOD {


    private java.math.BigDecimal CALMETHOD_ID;
    
    public void setCALMETHOD_ID(java.math.BigDecimal CALMETHOD_ID) {
        this.CALMETHOD_ID = CALMETHOD_ID;
    }
    
    public java.math.BigDecimal getCALMETHOD_ID() {
        return this.CALMETHOD_ID;
    }
      

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
      

    private java.lang.String TASKNAME;
    
    public void setTASKNAME(java.lang.String TASKNAME) {
        this.TASKNAME = TASKNAME;
    }
    
    public java.lang.String getTASKNAME() {
        return this.TASKNAME;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.math.BigDecimal SUBCLASS;
    
    public void setSUBCLASS(java.math.BigDecimal SUBCLASS) {
        this.SUBCLASS = SUBCLASS;
    }
    
    public java.math.BigDecimal getSUBCLASS() {
        return this.SUBCLASS;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
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
        result.append("CALMETHOD_ID: " + getCALMETHOD_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("CALUSAGE_ID: " + getCALUSAGE_ID() + "||");
        result.append("TASKNAME: " + getTASKNAME() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("SUBCLASS: " + getSUBCLASS() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}