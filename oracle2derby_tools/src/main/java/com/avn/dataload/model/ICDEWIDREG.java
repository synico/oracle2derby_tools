package com.avn.dataload.model;

public class ICDEWIDREG {


    private java.lang.String CLASSNAME;
    
    public void setCLASSNAME(java.lang.String CLASSNAME) {
        this.CLASSNAME = CLASSNAME;
    }
    
    public java.lang.String getCLASSNAME() {
        return this.CLASSNAME;
    }
      

    private java.lang.String DISPLAYNAME;
    
    public void setDISPLAYNAME(java.lang.String DISPLAYNAME) {
        this.DISPLAYNAME = DISPLAYNAME;
    }
    
    public java.lang.String getDISPLAYNAME() {
        return this.DISPLAYNAME;
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
        result.append("CLASSNAME: " + getCLASSNAME() + "||");
        result.append("DISPLAYNAME: " + getDISPLAYNAME() + "||");
        result.append("ORDERSEQ: " + getORDERSEQ() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}