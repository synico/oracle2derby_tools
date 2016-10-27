package com.avn.dataload.model;

public class PVCDEVMDL {


    private java.math.BigDecimal MODEL_ID;
    
    public void setMODEL_ID(java.math.BigDecimal MODEL_ID) {
        this.MODEL_ID = MODEL_ID;
    }
    
    public java.math.BigDecimal getMODEL_ID() {
        return this.MODEL_ID;
    }
      

    private java.lang.String MODELNAME;
    
    public void setMODELNAME(java.lang.String MODELNAME) {
        this.MODELNAME = MODELNAME;
    }
    
    public java.lang.String getMODELNAME() {
        return this.MODELNAME;
    }
      

    private java.lang.String SESSIONTYPE;
    
    public void setSESSIONTYPE(java.lang.String SESSIONTYPE) {
        this.SESSIONTYPE = SESSIONTYPE;
    }
    
    public java.lang.String getSESSIONTYPE() {
        return this.SESSIONTYPE;
    }
      

    private java.lang.String VENDOR;
    
    public void setVENDOR(java.lang.String VENDOR) {
        this.VENDOR = VENDOR;
    }
    
    public java.lang.String getVENDOR() {
        return this.VENDOR;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String DEVMDLNAME;
    
    public void setDEVMDLNAME(java.lang.String DEVMDLNAME) {
        this.DEVMDLNAME = DEVMDLNAME;
    }
    
    public java.lang.String getDEVMDLNAME() {
        return this.DEVMDLNAME;
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
        result.append("MODEL_ID: " + getMODEL_ID() + "||");
        result.append("MODELNAME: " + getMODELNAME() + "||");
        result.append("SESSIONTYPE: " + getSESSIONTYPE() + "||");
        result.append("VENDOR: " + getVENDOR() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("DEVMDLNAME: " + getDEVMDLNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}