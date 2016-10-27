package com.avn.dataload.model;

public class ECTPTITM {


    private java.math.BigDecimal ECITMRFNBR;
    
    public void setECITMRFNBR(java.math.BigDecimal ECITMRFNBR) {
        this.ECITMRFNBR = ECITMRFNBR;
    }
    
    public java.math.BigDecimal getECITMRFNBR() {
        return this.ECITMRFNBR;
    }
      

    private java.math.BigDecimal ECRFNBR;
    
    public void setECRFNBR(java.math.BigDecimal ECRFNBR) {
        this.ECRFNBR = ECRFNBR;
    }
    
    public java.math.BigDecimal getECRFNBR() {
        return this.ECRFNBR;
    }
      

    private java.math.BigDecimal ECSEQNO;
    
    public void setECSEQNO(java.math.BigDecimal ECSEQNO) {
        this.ECSEQNO = ECSEQNO;
    }
    
    public java.math.BigDecimal getECSEQNO() {
        return this.ECSEQNO;
    }
      

    private java.lang.String ECNAME;
    
    public void setECNAME(java.lang.String ECNAME) {
        this.ECNAME = ECNAME;
    }
    
    public java.lang.String getECNAME() {
        return this.ECNAME;
    }
      

    private java.math.BigDecimal ECSIZE;
    
    public void setECSIZE(java.math.BigDecimal ECSIZE) {
        this.ECSIZE = ECSIZE;
    }
    
    public java.math.BigDecimal getECSIZE() {
        return this.ECSIZE;
    }
      

    private java.lang.String ECISTAG;
    
    public void setECISTAG(java.lang.String ECISTAG) {
        this.ECISTAG = ECISTAG;
    }
    
    public java.lang.String getECISTAG() {
        return this.ECISTAG;
    }
      

    private java.lang.String ECFLDDT;
    
    public void setECFLDDT(java.lang.String ECFLDDT) {
        this.ECFLDDT = ECFLDDT;
    }
    
    public java.lang.String getECFLDDT() {
        return this.ECFLDDT;
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
        result.append("ECITMRFNBR: " + getECITMRFNBR() + "||");
        result.append("ECRFNBR: " + getECRFNBR() + "||");
        result.append("ECSEQNO: " + getECSEQNO() + "||");
        result.append("ECNAME: " + getECNAME() + "||");
        result.append("ECSIZE: " + getECSIZE() + "||");
        result.append("ECISTAG: " + getECISTAG() + "||");
        result.append("ECFLDDT: " + getECFLDDT() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}