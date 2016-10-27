package com.avn.dataload.model;

public class XMDMMATERIALSTS {


    private java.lang.String MDMMATERIALNUMBER;
    
    public void setMDMMATERIALNUMBER(java.lang.String MDMMATERIALNUMBER) {
        this.MDMMATERIALNUMBER = MDMMATERIALNUMBER;
    }
    
    public java.lang.String getMDMMATERIALNUMBER() {
        return this.MDMMATERIALNUMBER;
    }
      

    private java.lang.String STATUS;
    
    public void setSTATUS(java.lang.String STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.lang.String getSTATUS() {
        return this.STATUS;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
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
        result.append("MDMMATERIALNUMBER: " + getMDMMATERIALNUMBER() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}