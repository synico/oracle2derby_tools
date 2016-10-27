package com.avn.dataload.model;

public class CALCODEDSC {


    private java.math.BigDecimal CALCODE_ID;
    
    public void setCALCODE_ID(java.math.BigDecimal CALCODE_ID) {
        this.CALCODE_ID = CALCODE_ID;
    }
    
    public java.math.BigDecimal getCALCODE_ID() {
        return this.CALCODE_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String LONGDESCRIPTION;
    
    public void setLONGDESCRIPTION(java.lang.String LONGDESCRIPTION) {
        this.LONGDESCRIPTION = LONGDESCRIPTION;
    }
    
    public java.lang.String getLONGDESCRIPTION() {
        return this.LONGDESCRIPTION;
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
        result.append("CALCODE_ID: " + getCALCODE_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("LONGDESCRIPTION: " + getLONGDESCRIPTION() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}