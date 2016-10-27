package com.avn.dataload.model;

public class PLCYACCT {


    private java.math.BigDecimal PLCYACCT_ID;
    
    public void setPLCYACCT_ID(java.math.BigDecimal PLCYACCT_ID) {
        this.PLCYACCT_ID = PLCYACCT_ID;
    }
    
    public java.math.BigDecimal getPLCYACCT_ID() {
        return this.PLCYACCT_ID;
    }
      

    private java.math.BigDecimal PLCYACCLCK_ID;
    
    public void setPLCYACCLCK_ID(java.math.BigDecimal PLCYACCLCK_ID) {
        this.PLCYACCLCK_ID = PLCYACCLCK_ID;
    }
    
    public java.math.BigDecimal getPLCYACCLCK_ID() {
        return this.PLCYACCLCK_ID;
    }
      

    private java.math.BigDecimal PLCYPASSWD_ID;
    
    public void setPLCYPASSWD_ID(java.math.BigDecimal PLCYPASSWD_ID) {
        this.PLCYPASSWD_ID = PLCYPASSWD_ID;
    }
    
    public java.math.BigDecimal getPLCYPASSWD_ID() {
        return this.PLCYPASSWD_ID;
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
        result.append("PLCYACCT_ID: " + getPLCYACCT_ID() + "||");
        result.append("PLCYACCLCK_ID: " + getPLCYACCLCK_ID() + "||");
        result.append("PLCYPASSWD_ID: " + getPLCYPASSWD_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}