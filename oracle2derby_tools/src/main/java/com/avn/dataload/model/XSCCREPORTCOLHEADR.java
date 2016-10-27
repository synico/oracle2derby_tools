package com.avn.dataload.model;

public class XSCCREPORTCOLHEADR {


    private java.math.BigDecimal REPORTCOLHEADER_ID;
    
    public void setREPORTCOLHEADER_ID(java.math.BigDecimal REPORTCOLHEADER_ID) {
        this.REPORTCOLHEADER_ID = REPORTCOLHEADER_ID;
    }
    
    public java.math.BigDecimal getREPORTCOLHEADER_ID() {
        return this.REPORTCOLHEADER_ID;
    }
      

    private java.math.BigDecimal REPORT_ID;
    
    public void setREPORT_ID(java.math.BigDecimal REPORT_ID) {
        this.REPORT_ID = REPORT_ID;
    }
    
    public java.math.BigDecimal getREPORT_ID() {
        return this.REPORT_ID;
    }
      

    private java.lang.String ACTUALNAME;
    
    public void setACTUALNAME(java.lang.String ACTUALNAME) {
        this.ACTUALNAME = ACTUALNAME;
    }
    
    public java.lang.String getACTUALNAME() {
        return this.ACTUALNAME;
    }
      

    private java.lang.String DISPLAYNAME;
    
    public void setDISPLAYNAME(java.lang.String DISPLAYNAME) {
        this.DISPLAYNAME = DISPLAYNAME;
    }
    
    public java.lang.String getDISPLAYNAME() {
        return this.DISPLAYNAME;
    }
      

    private java.lang.String USERSPECIFICNAME;
    
    public void setUSERSPECIFICNAME(java.lang.String USERSPECIFICNAME) {
        this.USERSPECIFICNAME = USERSPECIFICNAME;
    }
    
    public java.lang.String getUSERSPECIFICNAME() {
        return this.USERSPECIFICNAME;
    }
      

    private java.math.BigDecimal COLHEADERORDER;
    
    public void setCOLHEADERORDER(java.math.BigDecimal COLHEADERORDER) {
        this.COLHEADERORDER = COLHEADERORDER;
    }
    
    public java.math.BigDecimal getCOLHEADERORDER() {
        return this.COLHEADERORDER;
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
        result.append("REPORTCOLHEADER_ID: " + getREPORTCOLHEADER_ID() + "||");
        result.append("REPORT_ID: " + getREPORT_ID() + "||");
        result.append("ACTUALNAME: " + getACTUALNAME() + "||");
        result.append("DISPLAYNAME: " + getDISPLAYNAME() + "||");
        result.append("USERSPECIFICNAME: " + getUSERSPECIFICNAME() + "||");
        result.append("COLHEADERORDER: " + getCOLHEADERORDER() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}