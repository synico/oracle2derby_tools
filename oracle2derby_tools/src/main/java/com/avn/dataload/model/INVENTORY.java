package com.avn.dataload.model;

public class INVENTORY {


    private java.math.BigDecimal CATENTRY_ID;
    
    public void setCATENTRY_ID(java.math.BigDecimal CATENTRY_ID) {
        this.CATENTRY_ID = CATENTRY_ID;
    }
    
    public java.math.BigDecimal getCATENTRY_ID() {
        return this.CATENTRY_ID;
    }
      

    private java.math.BigDecimal QUANTITY;
    
    public void setQUANTITY(java.math.BigDecimal QUANTITY) {
        this.QUANTITY = QUANTITY;
    }
    
    public java.math.BigDecimal getQUANTITY() {
        return this.QUANTITY;
    }
      

    private java.math.BigDecimal FFMCENTER_ID;
    
    public void setFFMCENTER_ID(java.math.BigDecimal FFMCENTER_ID) {
        this.FFMCENTER_ID = FFMCENTER_ID;
    }
    
    public java.math.BigDecimal getFFMCENTER_ID() {
        return this.FFMCENTER_ID;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
    }
      

    private java.lang.String QUANTITYMEASURE;
    
    public void setQUANTITYMEASURE(java.lang.String QUANTITYMEASURE) {
        this.QUANTITYMEASURE = QUANTITYMEASURE;
    }
    
    public java.lang.String getQUANTITYMEASURE() {
        return this.QUANTITYMEASURE;
    }
      

    private java.math.BigDecimal INVENTORYFLAGS;
    
    public void setINVENTORYFLAGS(java.math.BigDecimal INVENTORYFLAGS) {
        this.INVENTORYFLAGS = INVENTORYFLAGS;
    }
    
    public java.math.BigDecimal getINVENTORYFLAGS() {
        return this.INVENTORYFLAGS;
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
        result.append("CATENTRY_ID: " + getCATENTRY_ID() + "||");
        result.append("QUANTITY: " + getQUANTITY() + "||");
        result.append("FFMCENTER_ID: " + getFFMCENTER_ID() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("QUANTITYMEASURE: " + getQUANTITYMEASURE() + "||");
        result.append("INVENTORYFLAGS: " + getINVENTORYFLAGS() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}