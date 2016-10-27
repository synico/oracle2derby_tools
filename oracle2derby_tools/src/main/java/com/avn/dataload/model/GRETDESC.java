package com.avn.dataload.model;

public class GRETDESC {


    private java.math.BigDecimal EVENTTYPE_ID;
    
    public void setEVENTTYPE_ID(java.math.BigDecimal EVENTTYPE_ID) {
        this.EVENTTYPE_ID = EVENTTYPE_ID;
    }
    
    public java.math.BigDecimal getEVENTTYPE_ID() {
        return this.EVENTTYPE_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("EVENTTYPE_ID: " + getEVENTTYPE_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        return result.toString();
    }
    
}