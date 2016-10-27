package com.avn.dataload.model;

public class MBRGRPTYPE {


    private java.math.BigDecimal MBRGRPTYPE_ID;
    
    public void setMBRGRPTYPE_ID(java.math.BigDecimal MBRGRPTYPE_ID) {
        this.MBRGRPTYPE_ID = MBRGRPTYPE_ID;
    }
    
    public java.math.BigDecimal getMBRGRPTYPE_ID() {
        return this.MBRGRPTYPE_ID;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
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
        result.append("MBRGRPTYPE_ID: " + getMBRGRPTYPE_ID() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("PROPERTIES: " + getPROPERTIES() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}