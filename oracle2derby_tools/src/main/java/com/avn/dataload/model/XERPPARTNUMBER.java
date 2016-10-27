package com.avn.dataload.model;

public class XERPPARTNUMBER {


    private java.math.BigDecimal CATENTRY_ID;
    
    public void setCATENTRY_ID(java.math.BigDecimal CATENTRY_ID) {
        this.CATENTRY_ID = CATENTRY_ID;
    }
    
    public java.math.BigDecimal getCATENTRY_ID() {
        return this.CATENTRY_ID;
    }
      

    private java.lang.String DIVISIONCODE;
    
    public void setDIVISIONCODE(java.lang.String DIVISIONCODE) {
        this.DIVISIONCODE = DIVISIONCODE;
    }
    
    public java.lang.String getDIVISIONCODE() {
        return this.DIVISIONCODE;
    }
      

    private java.lang.String MFCODE;
    
    public void setMFCODE(java.lang.String MFCODE) {
        this.MFCODE = MFCODE;
    }
    
    public java.lang.String getMFCODE() {
        return this.MFCODE;
    }
      

    private java.lang.String ERPPARTNUMBER;
    
    public void setERPPARTNUMBER(java.lang.String ERPPARTNUMBER) {
        this.ERPPARTNUMBER = ERPPARTNUMBER;
    }
    
    public java.lang.String getERPPARTNUMBER() {
        return this.ERPPARTNUMBER;
    }
      

    private java.lang.String ISACTIVE;
    
    public void setISACTIVE(java.lang.String ISACTIVE) {
        this.ISACTIVE = ISACTIVE;
    }
    
    public java.lang.String getISACTIVE() {
        return this.ISACTIVE;
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
        result.append("CATENTRY_ID: " + getCATENTRY_ID() + "||");
        result.append("DIVISIONCODE: " + getDIVISIONCODE() + "||");
        result.append("MFCODE: " + getMFCODE() + "||");
        result.append("ERPPARTNUMBER: " + getERPPARTNUMBER() + "||");
        result.append("ISACTIVE: " + getISACTIVE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}