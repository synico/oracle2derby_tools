package com.avn.dataload.model;

public class TAGCLASS {


    private java.lang.String TAGNAME;
    
    public void setTAGNAME(java.lang.String TAGNAME) {
        this.TAGNAME = TAGNAME;
    }
    
    public java.lang.String getTAGNAME() {
        return this.TAGNAME;
    }
      

    private java.lang.String TAGCLASSNAME;
    
    public void setTAGCLASSNAME(java.lang.String TAGCLASSNAME) {
        this.TAGCLASSNAME = TAGCLASSNAME;
    }
    
    public java.lang.String getTAGCLASSNAME() {
        return this.TAGCLASSNAME;
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
        result.append("TAGNAME: " + getTAGNAME() + "||");
        result.append("TAGCLASSNAME: " + getTAGCLASSNAME() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}