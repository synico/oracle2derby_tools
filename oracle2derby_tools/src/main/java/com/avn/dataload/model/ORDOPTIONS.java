package com.avn.dataload.model;

public class ORDOPTIONS {


    private java.math.BigDecimal ORDERS_ID;
    
    public void setORDERS_ID(java.math.BigDecimal ORDERS_ID) {
        this.ORDERS_ID = ORDERS_ID;
    }
    
    public java.math.BigDecimal getORDERS_ID() {
        return this.ORDERS_ID;
    }
      

    private java.math.BigDecimal NOTIFYMERCHANT;
    
    public void setNOTIFYMERCHANT(java.math.BigDecimal NOTIFYMERCHANT) {
        this.NOTIFYMERCHANT = NOTIFYMERCHANT;
    }
    
    public java.math.BigDecimal getNOTIFYMERCHANT() {
        return this.NOTIFYMERCHANT;
    }
      

    private java.math.BigDecimal NOTIFYSHOPPER;
    
    public void setNOTIFYSHOPPER(java.math.BigDecimal NOTIFYSHOPPER) {
        this.NOTIFYSHOPPER = NOTIFYSHOPPER;
    }
    
    public java.math.BigDecimal getNOTIFYSHOPPER() {
        return this.NOTIFYSHOPPER;
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
        result.append("NOTIFYMERCHANT: " + getNOTIFYMERCHANT() + "||");
        result.append("NOTIFYSHOPPER: " + getNOTIFYSHOPPER() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}