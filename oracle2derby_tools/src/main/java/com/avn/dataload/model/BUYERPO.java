package com.avn.dataload.model;

public class BUYERPO {


    private java.math.BigDecimal BUYERPO_ID;
    
    public void setBUYERPO_ID(java.math.BigDecimal BUYERPO_ID) {
        this.BUYERPO_ID = BUYERPO_ID;
    }
    
    public java.math.BigDecimal getBUYERPO_ID() {
        return this.BUYERPO_ID;
    }
      

    private java.lang.String SETCCURR;
    
    public void setSETCCURR(java.lang.String SETCCURR) {
        this.SETCCURR = SETCCURR;
    }
    
    public java.lang.String getSETCCURR() {
        return this.SETCCURR;
    }
      

    private java.math.BigDecimal ACCOUNT_ID;
    
    public void setACCOUNT_ID(java.math.BigDecimal ACCOUNT_ID) {
        this.ACCOUNT_ID = ACCOUNT_ID;
    }
    
    public java.math.BigDecimal getACCOUNT_ID() {
        return this.ACCOUNT_ID;
    }
      

    private java.lang.String PONUMBER;
    
    public void setPONUMBER(java.lang.String PONUMBER) {
        this.PONUMBER = PONUMBER;
    }
    
    public java.lang.String getPONUMBER() {
        return this.PONUMBER;
    }
      

    private java.math.BigDecimal BUYERPOTYP_ID;
    
    public void setBUYERPOTYP_ID(java.math.BigDecimal BUYERPOTYP_ID) {
        this.BUYERPOTYP_ID = BUYERPOTYP_ID;
    }
    
    public java.math.BigDecimal getBUYERPOTYP_ID() {
        return this.BUYERPOTYP_ID;
    }
      

    private java.math.BigDecimal STATE;
    
    public void setSTATE(java.math.BigDecimal STATE) {
        this.STATE = STATE;
    }
    
    public java.math.BigDecimal getSTATE() {
        return this.STATE;
    }
      

    private java.math.BigDecimal AMOUNT;
    
    public void setAMOUNT(java.math.BigDecimal AMOUNT) {
        this.AMOUNT = AMOUNT;
    }
    
    public java.math.BigDecimal getAMOUNT() {
        return this.AMOUNT;
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
        result.append("BUYERPO_ID: " + getBUYERPO_ID() + "||");
        result.append("SETCCURR: " + getSETCCURR() + "||");
        result.append("ACCOUNT_ID: " + getACCOUNT_ID() + "||");
        result.append("PONUMBER: " + getPONUMBER() + "||");
        result.append("BUYERPOTYP_ID: " + getBUYERPOTYP_ID() + "||");
        result.append("STATE: " + getSTATE() + "||");
        result.append("AMOUNT: " + getAMOUNT() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}