package com.avn.dataload.model;

public class XORDITEMRELEASE {


    private java.math.BigDecimal XORDITEMRELEASE_ID;
    
    public void setXORDITEMRELEASE_ID(java.math.BigDecimal XORDITEMRELEASE_ID) {
        this.XORDITEMRELEASE_ID = XORDITEMRELEASE_ID;
    }
    
    public java.math.BigDecimal getXORDITEMRELEASE_ID() {
        return this.XORDITEMRELEASE_ID;
    }
      

    private java.math.BigDecimal ORDERITEMS_ID;
    
    public void setORDERITEMS_ID(java.math.BigDecimal ORDERITEMS_ID) {
        this.ORDERITEMS_ID = ORDERITEMS_ID;
    }
    
    public java.math.BigDecimal getORDERITEMS_ID() {
        return this.ORDERITEMS_ID;
    }
      

    private java.math.BigDecimal ORDRELEASENUM;
    
    public void setORDRELEASENUM(java.math.BigDecimal ORDRELEASENUM) {
        this.ORDRELEASENUM = ORDRELEASENUM;
    }
    
    public java.math.BigDecimal getORDRELEASENUM() {
        return this.ORDRELEASENUM;
    }
      

    private java.math.BigDecimal QUANTITY;
    
    public void setQUANTITY(java.math.BigDecimal QUANTITY) {
        this.QUANTITY = QUANTITY;
    }
    
    public java.math.BigDecimal getQUANTITY() {
        return this.QUANTITY;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String FIELD2;
    
    public void setFIELD2(java.lang.String FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.lang.String getFIELD2() {
        return this.FIELD2;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("XORDITEMRELEASE_ID: " + getXORDITEMRELEASE_ID() + "||");
        result.append("ORDERITEMS_ID: " + getORDERITEMS_ID() + "||");
        result.append("ORDRELEASENUM: " + getORDRELEASENUM() + "||");
        result.append("QUANTITY: " + getQUANTITY() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        return result.toString();
    }
    
}