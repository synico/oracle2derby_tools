package com.avn.dataload.model;

public class GREVNTTYPE {


    private java.math.BigDecimal EVENTTYPE_ID;
    
    public void setEVENTTYPE_ID(java.math.BigDecimal EVENTTYPE_ID) {
        this.EVENTTYPE_ID = EVENTTYPE_ID;
    }
    
    public java.math.BigDecimal getEVENTTYPE_ID() {
        return this.EVENTTYPE_ID;
    }
      

    private java.math.BigDecimal SORTORDER;
    
    public void setSORTORDER(java.math.BigDecimal SORTORDER) {
        this.SORTORDER = SORTORDER;
    }
    
    public java.math.BigDecimal getSORTORDER() {
        return this.SORTORDER;
    }
      

    private java.math.BigDecimal STATUS;
    
    public void setSTATUS(java.math.BigDecimal STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.math.BigDecimal getSTATUS() {
        return this.STATUS;
    }
      

    private java.math.BigDecimal STOREID;
    
    public void setSTOREID(java.math.BigDecimal STOREID) {
        this.STOREID = STOREID;
    }
    
    public java.math.BigDecimal getSTOREID() {
        return this.STOREID;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
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
      

    private java.lang.String FIELD3;
    
    public void setFIELD3(java.lang.String FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.lang.String getFIELD3() {
        return this.FIELD3;
    }
      

    private java.lang.String EVENTTYPENAME;
    
    public void setEVENTTYPENAME(java.lang.String EVENTTYPENAME) {
        this.EVENTTYPENAME = EVENTTYPENAME;
    }
    
    public java.lang.String getEVENTTYPENAME() {
        return this.EVENTTYPENAME;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("EVENTTYPE_ID: " + getEVENTTYPE_ID() + "||");
        result.append("SORTORDER: " + getSORTORDER() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("STOREID: " + getSTOREID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("EVENTTYPENAME: " + getEVENTTYPENAME() + "||");
        return result.toString();
    }
    
}