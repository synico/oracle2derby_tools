package com.avn.dataload.model;

public class XSCCREPORTSTATUS {


    private java.math.BigDecimal REPORT_ID;
    
    public void setREPORT_ID(java.math.BigDecimal REPORT_ID) {
        this.REPORT_ID = REPORT_ID;
    }
    
    public java.math.BigDecimal getREPORT_ID() {
        return this.REPORT_ID;
    }
      

    private java.sql.Timestamp LASTREPORTSENDTIME;
    
    public void setLASTREPORTSENDTIME(java.sql.Timestamp LASTREPORTSENDTIME) {
        this.LASTREPORTSENDTIME = LASTREPORTSENDTIME;
    }
    
    public java.sql.Timestamp getLASTREPORTSENDTIME() {
        return this.LASTREPORTSENDTIME;
    }
      

    private java.lang.String REPORTSENDSTATUS;
    
    public void setREPORTSENDSTATUS(java.lang.String REPORTSENDSTATUS) {
        this.REPORTSENDSTATUS = REPORTSENDSTATUS;
    }
    
    public java.lang.String getREPORTSENDSTATUS() {
        return this.REPORTSENDSTATUS;
    }
      

    private java.sql.Timestamp LASTREPORTGENERATEDTIME;
    
    public void setLASTREPORTGENERATEDTIME(java.sql.Timestamp LASTREPORTGENERATEDTIME) {
        this.LASTREPORTGENERATEDTIME = LASTREPORTGENERATEDTIME;
    }
    
    public java.sql.Timestamp getLASTREPORTGENERATEDTIME() {
        return this.LASTREPORTGENERATEDTIME;
    }
      

    private java.lang.String REPORTNAME;
    
    public void setREPORTNAME(java.lang.String REPORTNAME) {
        this.REPORTNAME = REPORTNAME;
    }
    
    public java.lang.String getREPORTNAME() {
        return this.REPORTNAME;
    }
      

    private java.lang.String REPORTLOC;
    
    public void setREPORTLOC(java.lang.String REPORTLOC) {
        this.REPORTLOC = REPORTLOC;
    }
    
    public java.lang.String getREPORTLOC() {
        return this.REPORTLOC;
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
        result.append("REPORT_ID: " + getREPORT_ID() + "||");
        result.append("LASTREPORTSENDTIME: " + getLASTREPORTSENDTIME() + "||");
        result.append("REPORTSENDSTATUS: " + getREPORTSENDSTATUS() + "||");
        result.append("LASTREPORTGENERATEDTIME: " + getLASTREPORTGENERATEDTIME() + "||");
        result.append("REPORTNAME: " + getREPORTNAME() + "||");
        result.append("REPORTLOC: " + getREPORTLOC() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}