package com.avn.dataload.model;

public class ITEMSPC {


    private java.math.BigDecimal ITEMSPC_ID;
    
    public void setITEMSPC_ID(java.math.BigDecimal ITEMSPC_ID) {
        this.ITEMSPC_ID = ITEMSPC_ID;
    }
    
    public java.math.BigDecimal getITEMSPC_ID() {
        return this.ITEMSPC_ID;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
    }
      

    private java.math.BigDecimal MEMBER_ID;
    
    public void setMEMBER_ID(java.math.BigDecimal MEMBER_ID) {
        this.MEMBER_ID = MEMBER_ID;
    }
    
    public java.math.BigDecimal getMEMBER_ID() {
        return this.MEMBER_ID;
    }
      

    private java.math.BigDecimal MARKFORDELETE;
    
    public void setMARKFORDELETE(java.math.BigDecimal MARKFORDELETE) {
        this.MARKFORDELETE = MARKFORDELETE;
    }
    
    public java.math.BigDecimal getMARKFORDELETE() {
        return this.MARKFORDELETE;
    }
      

    private java.math.BigDecimal BASEITEM_ID;
    
    public void setBASEITEM_ID(java.math.BigDecimal BASEITEM_ID) {
        this.BASEITEM_ID = BASEITEM_ID;
    }
    
    public java.math.BigDecimal getBASEITEM_ID() {
        return this.BASEITEM_ID;
    }
      

    private java.lang.String DISCONTINUED;
    
    public void setDISCONTINUED(java.lang.String DISCONTINUED) {
        this.DISCONTINUED = DISCONTINUED;
    }
    
    public java.lang.String getDISCONTINUED() {
        return this.DISCONTINUED;
    }
      

    private java.lang.String PARTNUMBER;
    
    public void setPARTNUMBER(java.lang.String PARTNUMBER) {
        this.PARTNUMBER = PARTNUMBER;
    }
    
    public java.lang.String getPARTNUMBER() {
        return this.PARTNUMBER;
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
        result.append("ITEMSPC_ID: " + getITEMSPC_ID() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("MEMBER_ID: " + getMEMBER_ID() + "||");
        result.append("MARKFORDELETE: " + getMARKFORDELETE() + "||");
        result.append("BASEITEM_ID: " + getBASEITEM_ID() + "||");
        result.append("DISCONTINUED: " + getDISCONTINUED() + "||");
        result.append("PARTNUMBER: " + getPARTNUMBER() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}