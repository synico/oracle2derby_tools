package com.avn.dataload.model;

public class STRELTYP {


    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.math.BigDecimal STRELTYP_ID;
    
    public void setSTRELTYP_ID(java.math.BigDecimal STRELTYP_ID) {
        this.STRELTYP_ID = STRELTYP_ID;
    }
    
    public java.math.BigDecimal getSTRELTYP_ID() {
        return this.STRELTYP_ID;
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
        result.append("NAME: " + getNAME() + "||");
        result.append("STRELTYP_ID: " + getSTRELTYP_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}