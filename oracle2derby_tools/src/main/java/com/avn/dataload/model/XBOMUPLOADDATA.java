package com.avn.dataload.model;

public class XBOMUPLOADDATA {


    private java.math.BigDecimal XBOMUPLOADDATAID;
    
    public void setXBOMUPLOADDATAID(java.math.BigDecimal XBOMUPLOADDATAID) {
        this.XBOMUPLOADDATAID = XBOMUPLOADDATAID;
    }
    
    public java.math.BigDecimal getXBOMUPLOADDATAID() {
        return this.XBOMUPLOADDATAID;
    }
      

    private java.math.BigDecimal XBOMUPLOADID;
    
    public void setXBOMUPLOADID(java.math.BigDecimal XBOMUPLOADID) {
        this.XBOMUPLOADID = XBOMUPLOADID;
    }
    
    public java.math.BigDecimal getXBOMUPLOADID() {
        return this.XBOMUPLOADID;
    }
      

    private java.lang.String PARTNUMBER;
    
    public void setPARTNUMBER(java.lang.String PARTNUMBER) {
        this.PARTNUMBER = PARTNUMBER;
    }
    
    public java.lang.String getPARTNUMBER() {
        return this.PARTNUMBER;
    }
      

    private java.lang.String MFNAME;
    
    public void setMFNAME(java.lang.String MFNAME) {
        this.MFNAME = MFNAME;
    }
    
    public java.lang.String getMFNAME() {
        return this.MFNAME;
    }
      

    private java.math.BigDecimal QUANTITY;
    
    public void setQUANTITY(java.math.BigDecimal QUANTITY) {
        this.QUANTITY = QUANTITY;
    }
    
    public java.math.BigDecimal getQUANTITY() {
        return this.QUANTITY;
    }
      

    private java.lang.String STATUS;
    
    public void setSTATUS(java.lang.String STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.lang.String getSTATUS() {
        return this.STATUS;
    }
      

    private java.math.BigDecimal ROWCOUNTER;
    
    public void setROWCOUNTER(java.math.BigDecimal ROWCOUNTER) {
        this.ROWCOUNTER = ROWCOUNTER;
    }
    
    public java.math.BigDecimal getROWCOUNTER() {
        return this.ROWCOUNTER;
    }
      

    private java.sql.Timestamp CREATEDDATE;
    
    public void setCREATEDDATE(java.sql.Timestamp CREATEDDATE) {
        this.CREATEDDATE = CREATEDDATE;
    }
    
    public java.sql.Timestamp getCREATEDDATE() {
        return this.CREATEDDATE;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.lang.String CUSTOMERPARTNUMBER;
    
    public void setCUSTOMERPARTNUMBER(java.lang.String CUSTOMERPARTNUMBER) {
        this.CUSTOMERPARTNUMBER = CUSTOMERPARTNUMBER;
    }
    
    public java.lang.String getCUSTOMERPARTNUMBER() {
        return this.CUSTOMERPARTNUMBER;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("XBOMUPLOADDATAID: " + getXBOMUPLOADDATAID() + "||");
        result.append("XBOMUPLOADID: " + getXBOMUPLOADID() + "||");
        result.append("PARTNUMBER: " + getPARTNUMBER() + "||");
        result.append("MFNAME: " + getMFNAME() + "||");
        result.append("QUANTITY: " + getQUANTITY() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("ROWCOUNTER: " + getROWCOUNTER() + "||");
        result.append("CREATEDDATE: " + getCREATEDDATE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("CUSTOMERPARTNUMBER: " + getCUSTOMERPARTNUMBER() + "||");
        return result.toString();
    }
    
}