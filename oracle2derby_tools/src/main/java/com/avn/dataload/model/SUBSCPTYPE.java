package com.avn.dataload.model;

public class SUBSCPTYPE {


    private java.lang.String SUBSCPTYPE_ID;
    
    public void setSUBSCPTYPE_ID(java.lang.String SUBSCPTYPE_ID) {
        this.SUBSCPTYPE_ID = SUBSCPTYPE_ID;
    }
    
    public java.lang.String getSUBSCPTYPE_ID() {
        return this.SUBSCPTYPE_ID;
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
        result.append("SUBSCPTYPE_ID: " + getSUBSCPTYPE_ID() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}