package com.avn.dataload.model;

public class ICDATAREG {


    private java.math.BigDecimal REFID;
    
    public void setREFID(java.math.BigDecimal REFID) {
        this.REFID = REFID;
    }
    
    public java.math.BigDecimal getREFID() {
        return this.REFID;
    }
      

    private java.lang.String CLASSNAME;
    
    public void setCLASSNAME(java.lang.String CLASSNAME) {
        this.CLASSNAME = CLASSNAME;
    }
    
    public java.lang.String getCLASSNAME() {
        return this.CLASSNAME;
    }
      

    private java.lang.String BASETYPE;
    
    public void setBASETYPE(java.lang.String BASETYPE) {
        this.BASETYPE = BASETYPE;
    }
    
    public java.lang.String getBASETYPE() {
        return this.BASETYPE;
    }
      

    private java.lang.String DISPLAYNAME;
    
    public void setDISPLAYNAME(java.lang.String DISPLAYNAME) {
        this.DISPLAYNAME = DISPLAYNAME;
    }
    
    public java.lang.String getDISPLAYNAME() {
        return this.DISPLAYNAME;
    }
      

    private java.math.BigDecimal DEFAULTTYPE;
    
    public void setDEFAULTTYPE(java.math.BigDecimal DEFAULTTYPE) {
        this.DEFAULTTYPE = DEFAULTTYPE;
    }
    
    public java.math.BigDecimal getDEFAULTTYPE() {
        return this.DEFAULTTYPE;
    }
      

    private java.math.BigDecimal ORDERSEQ;
    
    public void setORDERSEQ(java.math.BigDecimal ORDERSEQ) {
        this.ORDERSEQ = ORDERSEQ;
    }
    
    public java.math.BigDecimal getORDERSEQ() {
        return this.ORDERSEQ;
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
        result.append("REFID: " + getREFID() + "||");
        result.append("CLASSNAME: " + getCLASSNAME() + "||");
        result.append("BASETYPE: " + getBASETYPE() + "||");
        result.append("DISPLAYNAME: " + getDISPLAYNAME() + "||");
        result.append("DEFAULTTYPE: " + getDEFAULTTYPE() + "||");
        result.append("ORDERSEQ: " + getORDERSEQ() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}