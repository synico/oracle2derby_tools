package com.avn.dataload.model;

public class DMEMSPOTORD {


    private java.math.BigDecimal DMEMSPOTORD_ID;
    
    public void setDMEMSPOTORD_ID(java.math.BigDecimal DMEMSPOTORD_ID) {
        this.DMEMSPOTORD_ID = DMEMSPOTORD_ID;
    }
    
    public java.math.BigDecimal getDMEMSPOTORD_ID() {
        return this.DMEMSPOTORD_ID;
    }
      

    private java.lang.String CONTENTTYPE;
    
    public void setCONTENTTYPE(java.lang.String CONTENTTYPE) {
        this.CONTENTTYPE = CONTENTTYPE;
    }
    
    public java.lang.String getCONTENTTYPE() {
        return this.CONTENTTYPE;
    }
      

    private java.lang.String ORDERINGNAME;
    
    public void setORDERINGNAME(java.lang.String ORDERINGNAME) {
        this.ORDERINGNAME = ORDERINGNAME;
    }
    
    public java.lang.String getORDERINGNAME() {
        return this.ORDERINGNAME;
    }
      

    private java.lang.String INTERFACENAME;
    
    public void setINTERFACENAME(java.lang.String INTERFACENAME) {
        this.INTERFACENAME = INTERFACENAME;
    }
    
    public java.lang.String getINTERFACENAME() {
        return this.INTERFACENAME;
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
        result.append("DMEMSPOTORD_ID: " + getDMEMSPOTORD_ID() + "||");
        result.append("CONTENTTYPE: " + getCONTENTTYPE() + "||");
        result.append("ORDERINGNAME: " + getORDERINGNAME() + "||");
        result.append("INTERFACENAME: " + getINTERFACENAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}