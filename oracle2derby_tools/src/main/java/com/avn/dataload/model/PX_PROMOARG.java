package com.avn.dataload.model;

public class PX_PROMOARG {


    private java.math.BigDecimal ORDERS_ID;
    
    public void setORDERS_ID(java.math.BigDecimal ORDERS_ID) {
        this.ORDERS_ID = ORDERS_ID;
    }
    
    public java.math.BigDecimal getORDERS_ID() {
        return this.ORDERS_ID;
    }
      

    private java.sql.Clob DETAIL;
    
    public void setDETAIL(java.sql.Clob DETAIL) {
        this.DETAIL = DETAIL;
    }
    
    public java.sql.Clob getDETAIL() {
        return this.DETAIL;
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
        result.append("ORDERS_ID: " + getORDERS_ID() + "||");
        result.append("DETAIL: " + getDETAIL() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}