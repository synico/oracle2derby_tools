package com.avn.dataload.model;

public class CHKARRANG {


    private java.math.BigDecimal CHKCMD_ID;
    
    public void setCHKCMD_ID(java.math.BigDecimal CHKCMD_ID) {
        this.CHKCMD_ID = CHKCMD_ID;
    }
    
    public java.math.BigDecimal getCHKCMD_ID() {
        return this.CHKCMD_ID;
    }
      

    private java.math.BigDecimal SCHCMD_ID;
    
    public void setSCHCMD_ID(java.math.BigDecimal SCHCMD_ID) {
        this.SCHCMD_ID = SCHCMD_ID;
    }
    
    public java.math.BigDecimal getSCHCMD_ID() {
        return this.SCHCMD_ID;
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
        result.append("CHKCMD_ID: " + getCHKCMD_ID() + "||");
        result.append("SCHCMD_ID: " + getSCHCMD_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}