package com.avn.dataload.model;

public class ECETMPT {


    private java.math.BigDecimal ECRFNBR;
    
    public void setECRFNBR(java.math.BigDecimal ECRFNBR) {
        this.ECRFNBR = ECRFNBR;
    }
    
    public java.math.BigDecimal getECRFNBR() {
        return this.ECRFNBR;
    }
      

    private java.lang.String ECDOCTYP;
    
    public void setECDOCTYP(java.lang.String ECDOCTYP) {
        this.ECDOCTYP = ECDOCTYP;
    }
    
    public java.lang.String getECDOCTYP() {
        return this.ECDOCTYP;
    }
      

    private java.lang.String ECDOCVER;
    
    public void setECDOCVER(java.lang.String ECDOCVER) {
        this.ECDOCVER = ECDOCVER;
    }
    
    public java.lang.String getECDOCVER() {
        return this.ECDOCVER;
    }
      

    private java.lang.String ECRECTYP;
    
    public void setECRECTYP(java.lang.String ECRECTYP) {
        this.ECRECTYP = ECRECTYP;
    }
    
    public java.lang.String getECRECTYP() {
        return this.ECRECTYP;
    }
      

    private java.lang.String ECRECVER;
    
    public void setECRECVER(java.lang.String ECRECVER) {
        this.ECRECVER = ECRECVER;
    }
    
    public java.lang.String getECRECVER() {
        return this.ECRECVER;
    }
      

    private java.lang.String ECCOMMANDNAME;
    
    public void setECCOMMANDNAME(java.lang.String ECCOMMANDNAME) {
        this.ECCOMMANDNAME = ECCOMMANDNAME;
    }
    
    public java.lang.String getECCOMMANDNAME() {
        return this.ECCOMMANDNAME;
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
        result.append("ECRFNBR: " + getECRFNBR() + "||");
        result.append("ECDOCTYP: " + getECDOCTYP() + "||");
        result.append("ECDOCVER: " + getECDOCVER() + "||");
        result.append("ECRECTYP: " + getECRECTYP() + "||");
        result.append("ECRECVER: " + getECRECVER() + "||");
        result.append("ECCOMMANDNAME: " + getECCOMMANDNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}