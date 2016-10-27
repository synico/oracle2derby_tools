package com.avn.dataload.model;

public class SCHSTATUS {


    private java.math.BigDecimal SCSINSTREFNUM;
    
    public void setSCSINSTREFNUM(java.math.BigDecimal SCSINSTREFNUM) {
        this.SCSINSTREFNUM = SCSINSTREFNUM;
    }
    
    public java.math.BigDecimal getSCSINSTREFNUM() {
        return this.SCSINSTREFNUM;
    }
      

    private java.math.BigDecimal SCSJOBNBR;
    
    public void setSCSJOBNBR(java.math.BigDecimal SCSJOBNBR) {
        this.SCSJOBNBR = SCSJOBNBR;
    }
    
    public java.math.BigDecimal getSCSJOBNBR() {
        return this.SCSJOBNBR;
    }
      

    private java.lang.String SCSSTATE;
    
    public void setSCSSTATE(java.lang.String SCSSTATE) {
        this.SCSSTATE = SCSSTATE;
    }
    
    public java.lang.String getSCSSTATE() {
        return this.SCSSTATE;
    }
      

    private java.sql.Timestamp SCSPREFSTART;
    
    public void setSCSPREFSTART(java.sql.Timestamp SCSPREFSTART) {
        this.SCSPREFSTART = SCSPREFSTART;
    }
    
    public java.sql.Timestamp getSCSPREFSTART() {
        return this.SCSPREFSTART;
    }
      

    private java.sql.Timestamp SCSACTLSTART;
    
    public void setSCSACTLSTART(java.sql.Timestamp SCSACTLSTART) {
        this.SCSACTLSTART = SCSACTLSTART;
    }
    
    public java.sql.Timestamp getSCSACTLSTART() {
        return this.SCSACTLSTART;
    }
      

    private java.lang.String SCSRESULT;
    
    public void setSCSRESULT(java.lang.String SCSRESULT) {
        this.SCSRESULT = SCSRESULT;
    }
    
    public java.lang.String getSCSRESULT() {
        return this.SCSRESULT;
    }
      

    private java.lang.String SCSQUEUE;
    
    public void setSCSQUEUE(java.lang.String SCSQUEUE) {
        this.SCSQUEUE = SCSQUEUE;
    }
    
    public java.lang.String getSCSQUEUE() {
        return this.SCSQUEUE;
    }
      

    private java.sql.Timestamp SCSEND;
    
    public void setSCSEND(java.sql.Timestamp SCSEND) {
        this.SCSEND = SCSEND;
    }
    
    public java.sql.Timestamp getSCSEND() {
        return this.SCSEND;
    }
      

    private java.math.BigDecimal SCSATTLEFT;
    
    public void setSCSATTLEFT(java.math.BigDecimal SCSATTLEFT) {
        this.SCSATTLEFT = SCSATTLEFT;
    }
    
    public java.math.BigDecimal getSCSATTLEFT() {
        return this.SCSATTLEFT;
    }
      

    private java.math.BigDecimal SCSSEQUENCE;
    
    public void setSCSSEQUENCE(java.math.BigDecimal SCSSEQUENCE) {
        this.SCSSEQUENCE = SCSSEQUENCE;
    }
    
    public java.math.BigDecimal getSCSSEQUENCE() {
        return this.SCSSEQUENCE;
    }
      

    private java.math.BigDecimal SCSINSTRECOV;
    
    public void setSCSINSTRECOV(java.math.BigDecimal SCSINSTRECOV) {
        this.SCSINSTRECOV = SCSINSTRECOV;
    }
    
    public java.math.BigDecimal getSCSINSTRECOV() {
        return this.SCSINSTRECOV;
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
        result.append("SCSINSTREFNUM: " + getSCSINSTREFNUM() + "||");
        result.append("SCSJOBNBR: " + getSCSJOBNBR() + "||");
        result.append("SCSSTATE: " + getSCSSTATE() + "||");
        result.append("SCSPREFSTART: " + getSCSPREFSTART() + "||");
        result.append("SCSACTLSTART: " + getSCSACTLSTART() + "||");
        result.append("SCSRESULT: " + getSCSRESULT() + "||");
        result.append("SCSQUEUE: " + getSCSQUEUE() + "||");
        result.append("SCSEND: " + getSCSEND() + "||");
        result.append("SCSATTLEFT: " + getSCSATTLEFT() + "||");
        result.append("SCSSEQUENCE: " + getSCSSEQUENCE() + "||");
        result.append("SCSINSTRECOV: " + getSCSINSTRECOV() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}