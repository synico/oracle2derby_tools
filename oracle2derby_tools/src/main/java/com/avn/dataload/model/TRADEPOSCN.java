package com.avn.dataload.model;

public class TRADEPOSCN {


    private java.math.BigDecimal TRADEPOSCN_ID;
    
    public void setTRADEPOSCN_ID(java.math.BigDecimal TRADEPOSCN_ID) {
        this.TRADEPOSCN_ID = TRADEPOSCN_ID;
    }
    
    public java.math.BigDecimal getTRADEPOSCN_ID() {
        return this.TRADEPOSCN_ID;
    }
      

    private java.math.BigDecimal MEMBER_ID;
    
    public void setMEMBER_ID(java.math.BigDecimal MEMBER_ID) {
        this.MEMBER_ID = MEMBER_ID;
    }
    
    public java.math.BigDecimal getMEMBER_ID() {
        return this.MEMBER_ID;
    }
      

    private java.math.BigDecimal PRODUCTSET_ID;
    
    public void setPRODUCTSET_ID(java.math.BigDecimal PRODUCTSET_ID) {
        this.PRODUCTSET_ID = PRODUCTSET_ID;
    }
    
    public java.math.BigDecimal getPRODUCTSET_ID() {
        return this.PRODUCTSET_ID;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.math.BigDecimal PRECEDENCE;
    
    public void setPRECEDENCE(java.math.BigDecimal PRECEDENCE) {
        this.PRECEDENCE = PRECEDENCE;
    }
    
    public java.math.BigDecimal getPRECEDENCE() {
        return this.PRECEDENCE;
    }
      

    private java.math.BigDecimal MARKFORDELETE;
    
    public void setMARKFORDELETE(java.math.BigDecimal MARKFORDELETE) {
        this.MARKFORDELETE = MARKFORDELETE;
    }
    
    public java.math.BigDecimal getMARKFORDELETE() {
        return this.MARKFORDELETE;
    }
      

    private java.lang.String TYPE;
    
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }
    
    public java.lang.String getTYPE() {
        return this.TYPE;
    }
      

    private java.math.BigDecimal FLAGS;
    
    public void setFLAGS(java.math.BigDecimal FLAGS) {
        this.FLAGS = FLAGS;
    }
    
    public java.math.BigDecimal getFLAGS() {
        return this.FLAGS;
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
        result.append("TRADEPOSCN_ID: " + getTRADEPOSCN_ID() + "||");
        result.append("MEMBER_ID: " + getMEMBER_ID() + "||");
        result.append("PRODUCTSET_ID: " + getPRODUCTSET_ID() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("PRECEDENCE: " + getPRECEDENCE() + "||");
        result.append("MARKFORDELETE: " + getMARKFORDELETE() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("FLAGS: " + getFLAGS() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}