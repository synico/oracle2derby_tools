package com.avn.dataload.model;

public class TAGDPLYREL {


    private java.lang.String TAGNAME;
    
    public void setTAGNAME(java.lang.String TAGNAME) {
        this.TAGNAME = TAGNAME;
    }
    
    public java.lang.String getTAGNAME() {
        return this.TAGNAME;
    }
      

    private java.lang.String DISPLAYNAME;
    
    public void setDISPLAYNAME(java.lang.String DISPLAYNAME) {
        this.DISPLAYNAME = DISPLAYNAME;
    }
    
    public java.lang.String getDISPLAYNAME() {
        return this.DISPLAYNAME;
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
        result.append("DISPLAYNAME: " + getDISPLAYNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}