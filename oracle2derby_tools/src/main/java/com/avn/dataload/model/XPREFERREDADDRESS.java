package com.avn.dataload.model;

public class XPREFERREDADDRESS {


    private java.math.BigDecimal USERS_ID;
    
    public void setUSERS_ID(java.math.BigDecimal USERS_ID) {
        this.USERS_ID = USERS_ID;
    }
    
    public java.math.BigDecimal getUSERS_ID() {
        return this.USERS_ID;
    }
      

    private java.math.BigDecimal ORGANIZATION_ID;
    
    public void setORGANIZATION_ID(java.math.BigDecimal ORGANIZATION_ID) {
        this.ORGANIZATION_ID = ORGANIZATION_ID;
    }
    
    public java.math.BigDecimal getORGANIZATION_ID() {
        return this.ORGANIZATION_ID;
    }
      

    private java.math.BigDecimal ADDRESS_ID;
    
    public void setADDRESS_ID(java.math.BigDecimal ADDRESS_ID) {
        this.ADDRESS_ID = ADDRESS_ID;
    }
    
    public java.math.BigDecimal getADDRESS_ID() {
        return this.ADDRESS_ID;
    }
      

    private java.lang.String FLAG;
    
    public void setFLAG(java.lang.String FLAG) {
        this.FLAG = FLAG;
    }
    
    public java.lang.String getFLAG() {
        return this.FLAG;
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
        result.append("USERS_ID: " + getUSERS_ID() + "||");
        result.append("ORGANIZATION_ID: " + getORGANIZATION_ID() + "||");
        result.append("ADDRESS_ID: " + getADDRESS_ID() + "||");
        result.append("FLAG: " + getFLAG() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}