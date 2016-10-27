package com.avn.dataload.model;

public class SRCHATTRPROP {


    private java.math.BigDecimal SRCHATTR_ID;
    
    public void setSRCHATTR_ID(java.math.BigDecimal SRCHATTR_ID) {
        this.SRCHATTR_ID = SRCHATTR_ID;
    }
    
    public java.math.BigDecimal getSRCHATTR_ID() {
        return this.SRCHATTR_ID;
    }
      

    private java.lang.String PROPERTYNAME;
    
    public void setPROPERTYNAME(java.lang.String PROPERTYNAME) {
        this.PROPERTYNAME = PROPERTYNAME;
    }
    
    public java.lang.String getPROPERTYNAME() {
        return this.PROPERTYNAME;
    }
      

    private java.lang.String PROPERTYVALUE;
    
    public void setPROPERTYVALUE(java.lang.String PROPERTYVALUE) {
        this.PROPERTYVALUE = PROPERTYVALUE;
    }
    
    public java.lang.String getPROPERTYVALUE() {
        return this.PROPERTYVALUE;
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
        result.append("SRCHATTR_ID: " + getSRCHATTR_ID() + "||");
        result.append("PROPERTYNAME: " + getPROPERTYNAME() + "||");
        result.append("PROPERTYVALUE: " + getPROPERTYVALUE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}