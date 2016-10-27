package com.avn.dataload.model;

public class DMEXPTYPE {


    private java.math.BigDecimal DMEXPTYPE_ID;
    
    public void setDMEXPTYPE_ID(java.math.BigDecimal DMEXPTYPE_ID) {
        this.DMEXPTYPE_ID = DMEXPTYPE_ID;
    }
    
    public java.math.BigDecimal getDMEXPTYPE_ID() {
        return this.DMEXPTYPE_ID;
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
        result.append("DMEXPTYPE_ID: " + getDMEXPTYPE_ID() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}