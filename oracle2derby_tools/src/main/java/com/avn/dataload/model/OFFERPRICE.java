package com.avn.dataload.model;

public class OFFERPRICE {


    private java.math.BigDecimal OFFER_ID;
    
    public void setOFFER_ID(java.math.BigDecimal OFFER_ID) {
        this.OFFER_ID = OFFER_ID;
    }
    
    public java.math.BigDecimal getOFFER_ID() {
        return this.OFFER_ID;
    }
      

    private java.lang.String CURRENCY;
    
    public void setCURRENCY(java.lang.String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }
    
    public java.lang.String getCURRENCY() {
        return this.CURRENCY;
    }
      

    private java.math.BigDecimal PRICE;
    
    public void setPRICE(java.math.BigDecimal PRICE) {
        this.PRICE = PRICE;
    }
    
    public java.math.BigDecimal getPRICE() {
        return this.PRICE;
    }
      

    private java.math.BigDecimal COMPAREPRICE;
    
    public void setCOMPAREPRICE(java.math.BigDecimal COMPAREPRICE) {
        this.COMPAREPRICE = COMPAREPRICE;
    }
    
    public java.math.BigDecimal getCOMPAREPRICE() {
        return this.COMPAREPRICE;
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
        result.append("OFFER_ID: " + getOFFER_ID() + "||");
        result.append("CURRENCY: " + getCURRENCY() + "||");
        result.append("PRICE: " + getPRICE() + "||");
        result.append("COMPAREPRICE: " + getCOMPAREPRICE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}