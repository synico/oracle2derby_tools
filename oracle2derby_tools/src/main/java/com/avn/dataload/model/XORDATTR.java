package com.avn.dataload.model;

public class XORDATTR {


    private java.math.BigDecimal ORDERS_ID;
    
    public void setORDERS_ID(java.math.BigDecimal ORDERS_ID) {
        this.ORDERS_ID = ORDERS_ID;
    }
    
    public java.math.BigDecimal getORDERS_ID() {
        return this.ORDERS_ID;
    }
      

    private java.math.BigDecimal ORDATTR_ID;
    
    public void setORDATTR_ID(java.math.BigDecimal ORDATTR_ID) {
        this.ORDATTR_ID = ORDATTR_ID;
    }
    
    public java.math.BigDecimal getORDATTR_ID() {
        return this.ORDATTR_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String VALUE;
    
    public void setVALUE(java.lang.String VALUE) {
        this.VALUE = VALUE;
    }
    
    public java.lang.String getVALUE() {
        return this.VALUE;
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
        result.append("ORDATTR_ID: " + getORDATTR_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("VALUE: " + getVALUE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}