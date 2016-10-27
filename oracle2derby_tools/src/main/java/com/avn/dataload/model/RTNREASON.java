package com.avn.dataload.model;

public class RTNREASON {


    private java.lang.String REASONTYPE;
    
    public void setREASONTYPE(java.lang.String REASONTYPE) {
        this.REASONTYPE = REASONTYPE;
    }
    
    public java.lang.String getREASONTYPE() {
        return this.REASONTYPE;
    }
      

    private java.math.BigDecimal RTNREASON_ID;
    
    public void setRTNREASON_ID(java.math.BigDecimal RTNREASON_ID) {
        this.RTNREASON_ID = RTNREASON_ID;
    }
    
    public java.math.BigDecimal getRTNREASON_ID() {
        return this.RTNREASON_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal MARKFORDELETE;
    
    public void setMARKFORDELETE(java.math.BigDecimal MARKFORDELETE) {
        this.MARKFORDELETE = MARKFORDELETE;
    }
    
    public java.math.BigDecimal getMARKFORDELETE() {
        return this.MARKFORDELETE;
    }
      

    private java.lang.String CODE;
    
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }
    
    public java.lang.String getCODE() {
        return this.CODE;
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
        result.append("REASONTYPE: " + getREASONTYPE() + "||");
        result.append("RTNREASON_ID: " + getRTNREASON_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("MARKFORDELETE: " + getMARKFORDELETE() + "||");
        result.append("CODE: " + getCODE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}