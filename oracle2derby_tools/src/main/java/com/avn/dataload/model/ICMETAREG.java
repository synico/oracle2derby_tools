package com.avn.dataload.model;

public class ICMETAREG {


    private java.math.BigDecimal METAPHORTYPEID;
    
    public void setMETAPHORTYPEID(java.math.BigDecimal METAPHORTYPEID) {
        this.METAPHORTYPEID = METAPHORTYPEID;
    }
    
    public java.math.BigDecimal getMETAPHORTYPEID() {
        return this.METAPHORTYPEID;
    }
      

    private java.lang.String CLASSNAME;
    
    public void setCLASSNAME(java.lang.String CLASSNAME) {
        this.CLASSNAME = CLASSNAME;
    }
    
    public java.lang.String getCLASSNAME() {
        return this.CLASSNAME;
    }
      

    private java.lang.String BUILDERNAME;
    
    public void setBUILDERNAME(java.lang.String BUILDERNAME) {
        this.BUILDERNAME = BUILDERNAME;
    }
    
    public java.lang.String getBUILDERNAME() {
        return this.BUILDERNAME;
    }
      

    private java.math.BigDecimal EXPLSPCREQ;
    
    public void setEXPLSPCREQ(java.math.BigDecimal EXPLSPCREQ) {
        this.EXPLSPCREQ = EXPLSPCREQ;
    }
    
    public java.math.BigDecimal getEXPLSPCREQ() {
        return this.EXPLSPCREQ;
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
        result.append("METAPHORTYPEID: " + getMETAPHORTYPEID() + "||");
        result.append("CLASSNAME: " + getCLASSNAME() + "||");
        result.append("BUILDERNAME: " + getBUILDERNAME() + "||");
        result.append("EXPLSPCREQ: " + getEXPLSPCREQ() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}