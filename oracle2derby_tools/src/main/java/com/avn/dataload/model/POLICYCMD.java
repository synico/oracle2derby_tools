package com.avn.dataload.model;

public class POLICYCMD {


    private java.math.BigDecimal POLICY_ID;
    
    public void setPOLICY_ID(java.math.BigDecimal POLICY_ID) {
        this.POLICY_ID = POLICY_ID;
    }
    
    public java.math.BigDecimal getPOLICY_ID() {
        return this.POLICY_ID;
    }
      

    private java.lang.String BUSINESSCMDCLASS;
    
    public void setBUSINESSCMDCLASS(java.lang.String BUSINESSCMDCLASS) {
        this.BUSINESSCMDCLASS = BUSINESSCMDCLASS;
    }
    
    public java.lang.String getBUSINESSCMDCLASS() {
        return this.BUSINESSCMDCLASS;
    }
      

    private java.lang.String PROPERTIES;
    
    public void setPROPERTIES(java.lang.String PROPERTIES) {
        this.PROPERTIES = PROPERTIES;
    }
    
    public java.lang.String getPROPERTIES() {
        return this.PROPERTIES;
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
        result.append("POLICY_ID: " + getPOLICY_ID() + "||");
        result.append("BUSINESSCMDCLASS: " + getBUSINESSCMDCLASS() + "||");
        result.append("PROPERTIES: " + getPROPERTIES() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}