package com.avn.dataload.model;

public class ITEMTYPE {


    private java.lang.String ITEMTYPE_ID;
    
    public void setITEMTYPE_ID(java.lang.String ITEMTYPE_ID) {
        this.ITEMTYPE_ID = ITEMTYPE_ID;
    }
    
    public java.lang.String getITEMTYPE_ID() {
        return this.ITEMTYPE_ID;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String OID;
    
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }
    
    public java.lang.String getOID() {
        return this.OID;
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
        result.append("ITEMTYPE_ID: " + getITEMTYPE_ID() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("OID: " + getOID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}