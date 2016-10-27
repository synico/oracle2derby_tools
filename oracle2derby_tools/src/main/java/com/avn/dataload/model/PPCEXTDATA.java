package com.avn.dataload.model;

public class PPCEXTDATA {


    private java.math.BigDecimal PPCEXTDATA_ID;
    
    public void setPPCEXTDATA_ID(java.math.BigDecimal PPCEXTDATA_ID) {
        this.PPCEXTDATA_ID = PPCEXTDATA_ID;
    }
    
    public java.math.BigDecimal getPPCEXTDATA_ID() {
        return this.PPCEXTDATA_ID;
    }
      

    private java.math.BigDecimal PPCPAYINST_ID;
    
    public void setPPCPAYINST_ID(java.math.BigDecimal PPCPAYINST_ID) {
        this.PPCPAYINST_ID = PPCPAYINST_ID;
    }
    
    public java.math.BigDecimal getPPCPAYINST_ID() {
        return this.PPCPAYINST_ID;
    }
      

    private java.math.BigDecimal PPCPAYTRAN_ID;
    
    public void setPPCPAYTRAN_ID(java.math.BigDecimal PPCPAYTRAN_ID) {
        this.PPCPAYTRAN_ID = PPCPAYTRAN_ID;
    }
    
    public java.math.BigDecimal getPPCPAYTRAN_ID() {
        return this.PPCPAYTRAN_ID;
    }
      

    private java.math.BigDecimal ATTRIBUTETYPE;
    
    public void setATTRIBUTETYPE(java.math.BigDecimal ATTRIBUTETYPE) {
        this.ATTRIBUTETYPE = ATTRIBUTETYPE;
    }
    
    public java.math.BigDecimal getATTRIBUTETYPE() {
        return this.ATTRIBUTETYPE;
    }
      

    private java.math.BigDecimal ENCRYPTED;
    
    public void setENCRYPTED(java.math.BigDecimal ENCRYPTED) {
        this.ENCRYPTED = ENCRYPTED;
    }
    
    public java.math.BigDecimal getENCRYPTED() {
        return this.ENCRYPTED;
    }
      

    private java.math.BigDecimal MARKFORDELETE;
    
    public void setMARKFORDELETE(java.math.BigDecimal MARKFORDELETE) {
        this.MARKFORDELETE = MARKFORDELETE;
    }
    
    public java.math.BigDecimal getMARKFORDELETE() {
        return this.MARKFORDELETE;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.lang.String ATTRIBUTENAME;
    
    public void setATTRIBUTENAME(java.lang.String ATTRIBUTENAME) {
        this.ATTRIBUTENAME = ATTRIBUTENAME;
    }
    
    public java.lang.String getATTRIBUTENAME() {
        return this.ATTRIBUTENAME;
    }
      

    private java.lang.String SEARCHVALUE;
    
    public void setSEARCHVALUE(java.lang.String SEARCHVALUE) {
        this.SEARCHVALUE = SEARCHVALUE;
    }
    
    public java.lang.String getSEARCHVALUE() {
        return this.SEARCHVALUE;
    }
      

    private java.lang.String DATAVALUE;
    
    public void setDATAVALUE(java.lang.String DATAVALUE) {
        this.DATAVALUE = DATAVALUE;
    }
    
    public java.lang.String getDATAVALUE() {
        return this.DATAVALUE;
    }
      

    private java.math.BigDecimal PPCBATCH_ID;
    
    public void setPPCBATCH_ID(java.math.BigDecimal PPCBATCH_ID) {
        this.PPCBATCH_ID = PPCBATCH_ID;
    }
    
    public java.math.BigDecimal getPPCBATCH_ID() {
        return this.PPCBATCH_ID;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("PPCEXTDATA_ID: " + getPPCEXTDATA_ID() + "||");
        result.append("PPCPAYINST_ID: " + getPPCPAYINST_ID() + "||");
        result.append("PPCPAYTRAN_ID: " + getPPCPAYTRAN_ID() + "||");
        result.append("ATTRIBUTETYPE: " + getATTRIBUTETYPE() + "||");
        result.append("ENCRYPTED: " + getENCRYPTED() + "||");
        result.append("MARKFORDELETE: " + getMARKFORDELETE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("ATTRIBUTENAME: " + getATTRIBUTENAME() + "||");
        result.append("SEARCHVALUE: " + getSEARCHVALUE() + "||");
        result.append("DATAVALUE: " + getDATAVALUE() + "||");
        result.append("PPCBATCH_ID: " + getPPCBATCH_ID() + "||");
        return result.toString();
    }
    
}