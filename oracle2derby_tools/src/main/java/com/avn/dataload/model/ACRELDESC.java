package com.avn.dataload.model;

public class ACRELDESC {


    private java.math.BigDecimal ACRELATION_ID;
    
    public void setACRELATION_ID(java.math.BigDecimal ACRELATION_ID) {
        this.ACRELATION_ID = ACRELATION_ID;
    }
    
    public java.math.BigDecimal getACRELATION_ID() {
        return this.ACRELATION_ID;
    }
      

    private java.lang.String DISPLAYNAME;
    
    public void setDISPLAYNAME(java.lang.String DISPLAYNAME) {
        this.DISPLAYNAME = DISPLAYNAME;
    }
    
    public java.lang.String getDISPLAYNAME() {
        return this.DISPLAYNAME;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
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
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("ACRELATION_ID: " + getACRELATION_ID() + "||");
        result.append("DISPLAYNAME: " + getDISPLAYNAME() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}