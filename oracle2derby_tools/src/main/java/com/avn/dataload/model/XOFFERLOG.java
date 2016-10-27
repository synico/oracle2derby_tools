package com.avn.dataload.model;

public class XOFFERLOG {


    private java.lang.String PRICELISTNAME;
    
    public void setPRICELISTNAME(java.lang.String PRICELISTNAME) {
        this.PRICELISTNAME = PRICELISTNAME;
    }
    
    public java.lang.String getPRICELISTNAME() {
        return this.PRICELISTNAME;
    }
      

    private java.lang.String CUSTOMERID;
    
    public void setCUSTOMERID(java.lang.String CUSTOMERID) {
        this.CUSTOMERID = CUSTOMERID;
    }
    
    public java.lang.String getCUSTOMERID() {
        return this.CUSTOMERID;
    }
      

    private java.lang.String CATENTRYPARTNUMBER;
    
    public void setCATENTRYPARTNUMBER(java.lang.String CATENTRYPARTNUMBER) {
        this.CATENTRYPARTNUMBER = CATENTRYPARTNUMBER;
    }
    
    public java.lang.String getCATENTRYPARTNUMBER() {
        return this.CATENTRYPARTNUMBER;
    }
      

    private java.lang.String STARTDATE;
    
    public void setSTARTDATE(java.lang.String STARTDATE) {
        this.STARTDATE = STARTDATE;
    }
    
    public java.lang.String getSTARTDATE() {
        return this.STARTDATE;
    }
      

    private java.lang.String ENDDATE;
    
    public void setENDDATE(java.lang.String ENDDATE) {
        this.ENDDATE = ENDDATE;
    }
    
    public java.lang.String getENDDATE() {
        return this.ENDDATE;
    }
      

    private java.lang.String MINQUANTITY;
    
    public void setMINQUANTITY(java.lang.String MINQUANTITY) {
        this.MINQUANTITY = MINQUANTITY;
    }
    
    public java.lang.String getMINQUANTITY() {
        return this.MINQUANTITY;
    }
      

    private java.lang.String MAXQUANTITY;
    
    public void setMAXQUANTITY(java.lang.String MAXQUANTITY) {
        this.MAXQUANTITY = MAXQUANTITY;
    }
    
    public java.lang.String getMAXQUANTITY() {
        return this.MAXQUANTITY;
    }
      

    private java.lang.String PRICE;
    
    public void setPRICE(java.lang.String PRICE) {
        this.PRICE = PRICE;
    }
    
    public java.lang.String getPRICE() {
        return this.PRICE;
    }
      

    private java.lang.String QUANTITY;
    
    public void setQUANTITY(java.lang.String QUANTITY) {
        this.QUANTITY = QUANTITY;
    }
    
    public java.lang.String getQUANTITY() {
        return this.QUANTITY;
    }
      

    private java.lang.String PRICEPERQUANTITY;
    
    public void setPRICEPERQUANTITY(java.lang.String PRICEPERQUANTITY) {
        this.PRICEPERQUANTITY = PRICEPERQUANTITY;
    }
    
    public java.lang.String getPRICEPERQUANTITY() {
        return this.PRICEPERQUANTITY;
    }
      

    private java.lang.String UOM;
    
    public void setUOM(java.lang.String UOM) {
        this.UOM = UOM;
    }
    
    public java.lang.String getUOM() {
        return this.UOM;
    }
      

    private java.lang.String CURRENCY;
    
    public void setCURRENCY(java.lang.String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }
    
    public java.lang.String getCURRENCY() {
        return this.CURRENCY;
    }
      

    private java.lang.String PROCESSED;
    
    public void setPROCESSED(java.lang.String PROCESSED) {
        this.PROCESSED = PROCESSED;
    }
    
    public java.lang.String getPROCESSED() {
        return this.PROCESSED;
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
        result.append("PRICELISTNAME: " + getPRICELISTNAME() + "||");
        result.append("CUSTOMERID: " + getCUSTOMERID() + "||");
        result.append("CATENTRYPARTNUMBER: " + getCATENTRYPARTNUMBER() + "||");
        result.append("STARTDATE: " + getSTARTDATE() + "||");
        result.append("ENDDATE: " + getENDDATE() + "||");
        result.append("MINQUANTITY: " + getMINQUANTITY() + "||");
        result.append("MAXQUANTITY: " + getMAXQUANTITY() + "||");
        result.append("PRICE: " + getPRICE() + "||");
        result.append("QUANTITY: " + getQUANTITY() + "||");
        result.append("PRICEPERQUANTITY: " + getPRICEPERQUANTITY() + "||");
        result.append("UOM: " + getUOM() + "||");
        result.append("CURRENCY: " + getCURRENCY() + "||");
        result.append("PROCESSED: " + getPROCESSED() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}