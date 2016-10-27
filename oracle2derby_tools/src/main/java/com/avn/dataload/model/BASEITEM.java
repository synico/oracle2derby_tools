package com.avn.dataload.model;

public class BASEITEM {


    private java.math.BigDecimal BASEITEM_ID;
    
    public void setBASEITEM_ID(java.math.BigDecimal BASEITEM_ID) {
        this.BASEITEM_ID = BASEITEM_ID;
    }
    
    public java.math.BigDecimal getBASEITEM_ID() {
        return this.BASEITEM_ID;
    }
      

    private java.math.BigDecimal MEMBER_ID;
    
    public void setMEMBER_ID(java.math.BigDecimal MEMBER_ID) {
        this.MEMBER_ID = MEMBER_ID;
    }
    
    public java.math.BigDecimal getMEMBER_ID() {
        return this.MEMBER_ID;
    }
      

    private java.lang.String ITEMTYPE_ID;
    
    public void setITEMTYPE_ID(java.lang.String ITEMTYPE_ID) {
        this.ITEMTYPE_ID = ITEMTYPE_ID;
    }
    
    public java.lang.String getITEMTYPE_ID() {
        return this.ITEMTYPE_ID;
    }
      

    private java.lang.String QUANTITYMEASURE;
    
    public void setQUANTITYMEASURE(java.lang.String QUANTITYMEASURE) {
        this.QUANTITYMEASURE = QUANTITYMEASURE;
    }
    
    public java.lang.String getQUANTITYMEASURE() {
        return this.QUANTITYMEASURE;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
    }
      

    private java.math.BigDecimal MARKFORDELETE;
    
    public void setMARKFORDELETE(java.math.BigDecimal MARKFORDELETE) {
        this.MARKFORDELETE = MARKFORDELETE;
    }
    
    public java.math.BigDecimal getMARKFORDELETE() {
        return this.MARKFORDELETE;
    }
      

    private java.lang.String PARTNUMBER;
    
    public void setPARTNUMBER(java.lang.String PARTNUMBER) {
        this.PARTNUMBER = PARTNUMBER;
    }
    
    public java.lang.String getPARTNUMBER() {
        return this.PARTNUMBER;
    }
      

    private java.math.BigDecimal QUANTITYMULTIPLE;
    
    public void setQUANTITYMULTIPLE(java.math.BigDecimal QUANTITYMULTIPLE) {
        this.QUANTITYMULTIPLE = QUANTITYMULTIPLE;
    }
    
    public java.math.BigDecimal getQUANTITYMULTIPLE() {
        return this.QUANTITYMULTIPLE;
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
        result.append("BASEITEM_ID: " + getBASEITEM_ID() + "||");
        result.append("MEMBER_ID: " + getMEMBER_ID() + "||");
        result.append("ITEMTYPE_ID: " + getITEMTYPE_ID() + "||");
        result.append("QUANTITYMEASURE: " + getQUANTITYMEASURE() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("MARKFORDELETE: " + getMARKFORDELETE() + "||");
        result.append("PARTNUMBER: " + getPARTNUMBER() + "||");
        result.append("QUANTITYMULTIPLE: " + getQUANTITYMULTIPLE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}