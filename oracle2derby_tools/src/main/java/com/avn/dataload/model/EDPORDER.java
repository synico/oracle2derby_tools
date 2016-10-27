package com.avn.dataload.model;

public class EDPORDER {


    private java.math.BigDecimal EDPORDER_ID;
    
    public void setEDPORDER_ID(java.math.BigDecimal EDPORDER_ID) {
        this.EDPORDER_ID = EDPORDER_ID;
    }
    
    public java.math.BigDecimal getEDPORDER_ID() {
        return this.EDPORDER_ID;
    }
      

    private java.math.BigDecimal ORDER_ID;
    
    public void setORDER_ID(java.math.BigDecimal ORDER_ID) {
        this.ORDER_ID = ORDER_ID;
    }
    
    public java.math.BigDecimal getORDER_ID() {
        return this.ORDER_ID;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
    }
      

    private java.math.BigDecimal INITIALAMOUNT;
    
    public void setINITIALAMOUNT(java.math.BigDecimal INITIALAMOUNT) {
        this.INITIALAMOUNT = INITIALAMOUNT;
    }
    
    public java.math.BigDecimal getINITIALAMOUNT() {
        return this.INITIALAMOUNT;
    }
      

    private java.math.BigDecimal TOTALAMOUNT;
    
    public void setTOTALAMOUNT(java.math.BigDecimal TOTALAMOUNT) {
        this.TOTALAMOUNT = TOTALAMOUNT;
    }
    
    public java.math.BigDecimal getTOTALAMOUNT() {
        return this.TOTALAMOUNT;
    }
      

    private java.lang.String CURRENCY;
    
    public void setCURRENCY(java.lang.String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }
    
    public java.lang.String getCURRENCY() {
        return this.CURRENCY;
    }
      

    private java.math.BigDecimal MARKFORDELETE;
    
    public void setMARKFORDELETE(java.math.BigDecimal MARKFORDELETE) {
        this.MARKFORDELETE = MARKFORDELETE;
    }
    
    public java.math.BigDecimal getMARKFORDELETE() {
        return this.MARKFORDELETE;
    }
      

    private java.math.BigDecimal BLOCKED;
    
    public void setBLOCKED(java.math.BigDecimal BLOCKED) {
        this.BLOCKED = BLOCKED;
    }
    
    public java.math.BigDecimal getBLOCKED() {
        return this.BLOCKED;
    }
      

    private java.math.BigDecimal BGJOBSTATUS;
    
    public void setBGJOBSTATUS(java.math.BigDecimal BGJOBSTATUS) {
        this.BGJOBSTATUS = BGJOBSTATUS;
    }
    
    public java.math.BigDecimal getBGJOBSTATUS() {
        return this.BGJOBSTATUS;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.math.BigDecimal FIELD1;
    
    public void setFIELD1(java.math.BigDecimal FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.math.BigDecimal getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String FIELD2;
    
    public void setFIELD2(java.lang.String FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.lang.String getFIELD2() {
        return this.FIELD2;
    }
      

    private java.lang.String FIELD3;
    
    public void setFIELD3(java.lang.String FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.lang.String getFIELD3() {
        return this.FIELD3;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("EDPORDER_ID: " + getEDPORDER_ID() + "||");
        result.append("ORDER_ID: " + getORDER_ID() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("INITIALAMOUNT: " + getINITIALAMOUNT() + "||");
        result.append("TOTALAMOUNT: " + getTOTALAMOUNT() + "||");
        result.append("CURRENCY: " + getCURRENCY() + "||");
        result.append("MARKFORDELETE: " + getMARKFORDELETE() + "||");
        result.append("BLOCKED: " + getBLOCKED() + "||");
        result.append("BGJOBSTATUS: " + getBGJOBSTATUS() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        return result.toString();
    }
    
}