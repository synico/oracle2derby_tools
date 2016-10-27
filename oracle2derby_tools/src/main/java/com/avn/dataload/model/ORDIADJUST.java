package com.avn.dataload.model;

public class ORDIADJUST {


    private java.math.BigDecimal ORDIADJUST_ID;
    
    public void setORDIADJUST_ID(java.math.BigDecimal ORDIADJUST_ID) {
        this.ORDIADJUST_ID = ORDIADJUST_ID;
    }
    
    public java.math.BigDecimal getORDIADJUST_ID() {
        return this.ORDIADJUST_ID;
    }
      

    private java.math.BigDecimal ORDADJUST_ID;
    
    public void setORDADJUST_ID(java.math.BigDecimal ORDADJUST_ID) {
        this.ORDADJUST_ID = ORDADJUST_ID;
    }
    
    public java.math.BigDecimal getORDADJUST_ID() {
        return this.ORDADJUST_ID;
    }
      

    private java.math.BigDecimal ORDERITEMS_ID;
    
    public void setORDERITEMS_ID(java.math.BigDecimal ORDERITEMS_ID) {
        this.ORDERITEMS_ID = ORDERITEMS_ID;
    }
    
    public java.math.BigDecimal getORDERITEMS_ID() {
        return this.ORDERITEMS_ID;
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
        result.append("ORDIADJUST_ID: " + getORDIADJUST_ID() + "||");
        result.append("ORDADJUST_ID: " + getORDADJUST_ID() + "||");
        result.append("ORDERITEMS_ID: " + getORDERITEMS_ID() + "||");
        result.append("AMOUNT: " + getAMOUNT() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}