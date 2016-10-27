package com.avn.dataload.model;

public class CATGPCALCD {


    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
    }
      

    private java.math.BigDecimal CATGPCALCD_ID;
    
    public void setCATGPCALCD_ID(java.math.BigDecimal CATGPCALCD_ID) {
        this.CATGPCALCD_ID = CATGPCALCD_ID;
    }
    
    public java.math.BigDecimal getCATGPCALCD_ID() {
        return this.CATGPCALCD_ID;
    }
      

    private java.math.BigDecimal TRADING_ID;
    
    public void setTRADING_ID(java.math.BigDecimal TRADING_ID) {
        this.TRADING_ID = TRADING_ID;
    }
    
    public java.math.BigDecimal getTRADING_ID() {
        return this.TRADING_ID;
    }
      

    private java.math.BigDecimal CATGROUP_ID;
    
    public void setCATGROUP_ID(java.math.BigDecimal CATGROUP_ID) {
        this.CATGROUP_ID = CATGROUP_ID;
    }
    
    public java.math.BigDecimal getCATGROUP_ID() {
        return this.CATGROUP_ID;
    }
      

    private java.math.BigDecimal CALCODE_ID;
    
    public void setCALCODE_ID(java.math.BigDecimal CALCODE_ID) {
        this.CALCODE_ID = CALCODE_ID;
    }
    
    public java.math.BigDecimal getCALCODE_ID() {
        return this.CALCODE_ID;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.math.BigDecimal CALFLAGS;
    
    public void setCALFLAGS(java.math.BigDecimal CALFLAGS) {
        this.CALFLAGS = CALFLAGS;
    }
    
    public java.math.BigDecimal getCALFLAGS() {
        return this.CALFLAGS;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("CATGPCALCD_ID: " + getCATGPCALCD_ID() + "||");
        result.append("TRADING_ID: " + getTRADING_ID() + "||");
        result.append("CATGROUP_ID: " + getCATGROUP_ID() + "||");
        result.append("CALCODE_ID: " + getCALCODE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("CALFLAGS: " + getCALFLAGS() + "||");
        return result.toString();
    }
    
}