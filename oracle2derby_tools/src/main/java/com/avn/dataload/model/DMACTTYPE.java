package com.avn.dataload.model;

public class DMACTTYPE {


    private java.math.BigDecimal DMACTTYPE_ID;
    
    public void setDMACTTYPE_ID(java.math.BigDecimal DMACTTYPE_ID) {
        this.DMACTTYPE_ID = DMACTTYPE_ID;
    }
    
    public java.math.BigDecimal getDMACTTYPE_ID() {
        return this.DMACTTYPE_ID;
    }
      

    private java.lang.String TYPE;
    
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }
    
    public java.lang.String getTYPE() {
        return this.TYPE;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
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
        result.append("DMACTTYPE_ID: " + getDMACTTYPE_ID() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}