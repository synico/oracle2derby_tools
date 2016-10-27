package com.avn.dataload.model;

public class CTXMGMT {


    private java.math.BigDecimal ACTIVITY_ID;
    
    public void setACTIVITY_ID(java.math.BigDecimal ACTIVITY_ID) {
        this.ACTIVITY_ID = ACTIVITY_ID;
    }
    
    public java.math.BigDecimal getACTIVITY_ID() {
        return this.ACTIVITY_ID;
    }
      

    private java.math.BigDecimal CALLER_ID;
    
    public void setCALLER_ID(java.math.BigDecimal CALLER_ID) {
        this.CALLER_ID = CALLER_ID;
    }
    
    public java.math.BigDecimal getCALLER_ID() {
        return this.CALLER_ID;
    }
      

    private java.sql.Timestamp STARTTIME;
    
    public void setSTARTTIME(java.sql.Timestamp STARTTIME) {
        this.STARTTIME = STARTTIME;
    }
    
    public java.sql.Timestamp getSTARTTIME() {
        return this.STARTTIME;
    }
      

    private java.sql.Timestamp ENDTIME;
    
    public void setENDTIME(java.sql.Timestamp ENDTIME) {
        this.ENDTIME = ENDTIME;
    }
    
    public java.sql.Timestamp getENDTIME() {
        return this.ENDTIME;
    }
      

    private java.lang.String STATUS;
    
    public void setSTATUS(java.lang.String STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.lang.String getSTATUS() {
        return this.STATUS;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
    }
      

    private java.math.BigDecimal RUNAS_ID;
    
    public void setRUNAS_ID(java.math.BigDecimal RUNAS_ID) {
        this.RUNAS_ID = RUNAS_ID;
    }
    
    public java.math.BigDecimal getRUNAS_ID() {
        return this.RUNAS_ID;
    }
      

    private java.sql.Timestamp LASTACCESSTIME;
    
    public void setLASTACCESSTIME(java.sql.Timestamp LASTACCESSTIME) {
        this.LASTACCESSTIME = LASTACCESSTIME;
    }
    
    public java.sql.Timestamp getLASTACCESSTIME() {
        return this.LASTACCESSTIME;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("ACTIVITY_ID: " + getACTIVITY_ID() + "||");
        result.append("CALLER_ID: " + getCALLER_ID() + "||");
        result.append("STARTTIME: " + getSTARTTIME() + "||");
        result.append("ENDTIME: " + getENDTIME() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("RUNAS_ID: " + getRUNAS_ID() + "||");
        result.append("LASTACCESSTIME: " + getLASTACCESSTIME() + "||");
        return result.toString();
    }
    
}