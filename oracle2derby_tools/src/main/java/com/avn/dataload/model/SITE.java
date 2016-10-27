package com.avn.dataload.model;

public class SITE {


    private java.lang.String DATABASEVENDOR;
    
    public void setDATABASEVENDOR(java.lang.String DATABASEVENDOR) {
        this.DATABASEVENDOR = DATABASEVENDOR;
    }
    
    public java.lang.String getDATABASEVENDOR() {
        return this.DATABASEVENDOR;
    }
      

    private java.lang.String EDITION;
    
    public void setEDITION(java.lang.String EDITION) {
        this.EDITION = EDITION;
    }
    
    public java.lang.String getEDITION() {
        return this.EDITION;
    }
      

    private java.math.BigDecimal VERSION;
    
    public void setVERSION(java.math.BigDecimal VERSION) {
        this.VERSION = VERSION;
    }
    
    public java.math.BigDecimal getVERSION() {
        return this.VERSION;
    }
      

    private java.math.BigDecimal RELEASE;
    
    public void setRELEASE(java.math.BigDecimal RELEASE) {
        this.RELEASE = RELEASE;
    }
    
    public java.math.BigDecimal getRELEASE() {
        return this.RELEASE;
    }
      

    private java.math.BigDecimal MOD;
    
    public void setMOD(java.math.BigDecimal MOD) {
        this.MOD = MOD;
    }
    
    public java.math.BigDecimal getMOD() {
        return this.MOD;
    }
      

    private java.math.BigDecimal FIXPACK;
    
    public void setFIXPACK(java.math.BigDecimal FIXPACK) {
        this.FIXPACK = FIXPACK;
    }
    
    public java.math.BigDecimal getFIXPACK() {
        return this.FIXPACK;
    }
      

    private java.lang.String COMPNAME;
    
    public void setCOMPNAME(java.lang.String COMPNAME) {
        this.COMPNAME = COMPNAME;
    }
    
    public java.lang.String getCOMPNAME() {
        return this.COMPNAME;
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
        result.append("DATABASEVENDOR: " + getDATABASEVENDOR() + "||");
        result.append("EDITION: " + getEDITION() + "||");
        result.append("VERSION: " + getVERSION() + "||");
        result.append("RELEASE: " + getRELEASE() + "||");
        result.append("MOD: " + getMOD() + "||");
        result.append("FIXPACK: " + getFIXPACK() + "||");
        result.append("COMPNAME: " + getCOMPNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}