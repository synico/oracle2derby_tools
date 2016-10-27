package com.avn.dataload.model;

public class PAYMTHD {


    private java.math.BigDecimal PAYMTHD_ID;
    
    public void setPAYMTHD_ID(java.math.BigDecimal PAYMTHD_ID) {
        this.PAYMTHD_ID = PAYMTHD_ID;
    }
    
    public java.math.BigDecimal getPAYMTHD_ID() {
        return this.PAYMTHD_ID;
    }
      

    private java.lang.String PROFILENAME;
    
    public void setPROFILENAME(java.lang.String PROFILENAME) {
        this.PROFILENAME = PROFILENAME;
    }
    
    public java.lang.String getPROFILENAME() {
        return this.PROFILENAME;
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
        result.append("PAYMTHD_ID: " + getPAYMTHD_ID() + "||");
        result.append("PROFILENAME: " + getPROFILENAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}