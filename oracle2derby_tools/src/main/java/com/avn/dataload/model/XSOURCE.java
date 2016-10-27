package com.avn.dataload.model;

public class XSOURCE {


    private java.math.BigDecimal SOURCE_ID;
    
    public void setSOURCE_ID(java.math.BigDecimal SOURCE_ID) {
        this.SOURCE_ID = SOURCE_ID;
    }
    
    public java.math.BigDecimal getSOURCE_ID() {
        return this.SOURCE_ID;
    }
      

    private java.lang.String SOURCE_NAME;
    
    public void setSOURCE_NAME(java.lang.String SOURCE_NAME) {
        this.SOURCE_NAME = SOURCE_NAME;
    }
    
    public java.lang.String getSOURCE_NAME() {
        return this.SOURCE_NAME;
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
        result.append("SOURCE_ID: " + getSOURCE_ID() + "||");
        result.append("SOURCE_NAME: " + getSOURCE_NAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}