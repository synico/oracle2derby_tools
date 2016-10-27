package com.avn.dataload.model;

public class CURFORMAT {


    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.lang.String SETCCURR;
    
    public void setSETCCURR(java.lang.String SETCCURR) {
        this.SETCCURR = SETCCURR;
    }
    
    public java.lang.String getSETCCURR() {
        return this.SETCCURR;
    }
      

    private java.math.BigDecimal ROUNDINGMULTIPLE;
    
    public void setROUNDINGMULTIPLE(java.math.BigDecimal ROUNDINGMULTIPLE) {
        this.ROUNDINGMULTIPLE = ROUNDINGMULTIPLE;
    }
    
    public java.math.BigDecimal getROUNDINGMULTIPLE() {
        return this.ROUNDINGMULTIPLE;
    }
      

    private java.math.BigDecimal NUMBRUSG_ID;
    
    public void setNUMBRUSG_ID(java.math.BigDecimal NUMBRUSG_ID) {
        this.NUMBRUSG_ID = NUMBRUSG_ID;
    }
    
    public java.math.BigDecimal getNUMBRUSG_ID() {
        return this.NUMBRUSG_ID;
    }
      

    private java.lang.String ROUNDINGMETHOD;
    
    public void setROUNDINGMETHOD(java.lang.String ROUNDINGMETHOD) {
        this.ROUNDINGMETHOD = ROUNDINGMETHOD;
    }
    
    public java.lang.String getROUNDINGMETHOD() {
        return this.ROUNDINGMETHOD;
    }
      

    private java.math.BigDecimal DECIMALPLACES;
    
    public void setDECIMALPLACES(java.math.BigDecimal DECIMALPLACES) {
        this.DECIMALPLACES = DECIMALPLACES;
    }
    
    public java.math.BigDecimal getDECIMALPLACES() {
        return this.DECIMALPLACES;
    }
      

    private java.math.BigDecimal MINAPPROVEAMOUNT;
    
    public void setMINAPPROVEAMOUNT(java.math.BigDecimal MINAPPROVEAMOUNT) {
        this.MINAPPROVEAMOUNT = MINAPPROVEAMOUNT;
    }
    
    public java.math.BigDecimal getMINAPPROVEAMOUNT() {
        return this.MINAPPROVEAMOUNT;
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
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("SETCCURR: " + getSETCCURR() + "||");
        result.append("ROUNDINGMULTIPLE: " + getROUNDINGMULTIPLE() + "||");
        result.append("NUMBRUSG_ID: " + getNUMBRUSG_ID() + "||");
        result.append("ROUNDINGMETHOD: " + getROUNDINGMETHOD() + "||");
        result.append("DECIMALPLACES: " + getDECIMALPLACES() + "||");
        result.append("MINAPPROVEAMOUNT: " + getMINAPPROVEAMOUNT() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}