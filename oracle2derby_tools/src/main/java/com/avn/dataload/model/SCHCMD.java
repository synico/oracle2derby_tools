package com.avn.dataload.model;

public class SCHCMD {


    private java.math.BigDecimal SCHCMD_ID;
    
    public void setSCHCMD_ID(java.math.BigDecimal SCHCMD_ID) {
        this.SCHCMD_ID = SCHCMD_ID;
    }
    
    public java.math.BigDecimal getSCHCMD_ID() {
        return this.SCHCMD_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.lang.String PATHINFO;
    
    public void setPATHINFO(java.lang.String PATHINFO) {
        this.PATHINFO = PATHINFO;
    }
    
    public java.lang.String getPATHINFO() {
        return this.PATHINFO;
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
        result.append("SCHCMD_ID: " + getSCHCMD_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("PATHINFO: " + getPATHINFO() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}