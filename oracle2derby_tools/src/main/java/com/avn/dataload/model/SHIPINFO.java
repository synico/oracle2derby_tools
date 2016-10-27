package com.avn.dataload.model;

public class SHIPINFO {


    private java.math.BigDecimal SHIPINFO_ID;
    
    public void setSHIPINFO_ID(java.math.BigDecimal SHIPINFO_ID) {
        this.SHIPINFO_ID = SHIPINFO_ID;
    }
    
    public java.math.BigDecimal getSHIPINFO_ID() {
        return this.SHIPINFO_ID;
    }
      

    private java.math.BigDecimal ORDERS_ID;
    
    public void setORDERS_ID(java.math.BigDecimal ORDERS_ID) {
        this.ORDERS_ID = ORDERS_ID;
    }
    
    public java.math.BigDecimal getORDERS_ID() {
        return this.ORDERS_ID;
    }
      

    private java.math.BigDecimal ADDRESS_ID;
    
    public void setADDRESS_ID(java.math.BigDecimal ADDRESS_ID) {
        this.ADDRESS_ID = ADDRESS_ID;
    }
    
    public java.math.BigDecimal getADDRESS_ID() {
        return this.ADDRESS_ID;
    }
      

    private java.math.BigDecimal POLICY_ID;
    
    public void setPOLICY_ID(java.math.BigDecimal POLICY_ID) {
        this.POLICY_ID = POLICY_ID;
    }
    
    public java.math.BigDecimal getPOLICY_ID() {
        return this.POLICY_ID;
    }
      

    private java.math.BigDecimal SHIPMODE_ID;
    
    public void setSHIPMODE_ID(java.math.BigDecimal SHIPMODE_ID) {
        this.SHIPMODE_ID = SHIPMODE_ID;
    }
    
    public java.math.BigDecimal getSHIPMODE_ID() {
        return this.SHIPMODE_ID;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.lang.String CARRIERACCNTNUM;
    
    public void setCARRIERACCNTNUM(java.lang.String CARRIERACCNTNUM) {
        this.CARRIERACCNTNUM = CARRIERACCNTNUM;
    }
    
    public java.lang.String getCARRIERACCNTNUM() {
        return this.CARRIERACCNTNUM;
    }
      

    private java.lang.String INSTRUCTIONS;
    
    public void setINSTRUCTIONS(java.lang.String INSTRUCTIONS) {
        this.INSTRUCTIONS = INSTRUCTIONS;
    }
    
    public java.lang.String getINSTRUCTIONS() {
        return this.INSTRUCTIONS;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("SHIPINFO_ID: " + getSHIPINFO_ID() + "||");
        result.append("ORDERS_ID: " + getORDERS_ID() + "||");
        result.append("ADDRESS_ID: " + getADDRESS_ID() + "||");
        result.append("POLICY_ID: " + getPOLICY_ID() + "||");
        result.append("SHIPMODE_ID: " + getSHIPMODE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("CARRIERACCNTNUM: " + getCARRIERACCNTNUM() + "||");
        result.append("INSTRUCTIONS: " + getINSTRUCTIONS() + "||");
        return result.toString();
    }
    
}