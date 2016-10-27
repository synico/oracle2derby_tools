package com.avn.dataload.model;

public class SCHERRORLOG {


    private java.math.BigDecimal SCSINSTREFNUM;
    
    public void setSCSINSTREFNUM(java.math.BigDecimal SCSINSTREFNUM) {
        this.SCSINSTREFNUM = SCSINSTREFNUM;
    }
    
    public java.math.BigDecimal getSCSINSTREFNUM() {
        return this.SCSINSTREFNUM;
    }
      

    private java.sql.Clob SCSERROR;
    
    public void setSCSERROR(java.sql.Clob SCSERROR) {
        this.SCSERROR = SCSERROR;
    }
    
    public java.sql.Clob getSCSERROR() {
        return this.SCSERROR;
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
        result.append("SCSERROR: " + getSCSERROR() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}