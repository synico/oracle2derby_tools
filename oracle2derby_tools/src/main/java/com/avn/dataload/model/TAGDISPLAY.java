package com.avn.dataload.model;

public class TAGDISPLAY {


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
      

    private java.lang.String JSPPATH;
    
    public void setJSPPATH(java.lang.String JSPPATH) {
        this.JSPPATH = JSPPATH;
    }
    
    public java.lang.String getJSPPATH() {
        return this.JSPPATH;
    }
      

    private java.lang.String THUMBNAILPATH;
    
    public void setTHUMBNAILPATH(java.lang.String THUMBNAILPATH) {
        this.THUMBNAILPATH = THUMBNAILPATH;
    }
    
    public java.lang.String getTHUMBNAILPATH() {
        return this.THUMBNAILPATH;
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
        result.append("DISPLAYNAME: " + getDISPLAYNAME() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("JSPPATH: " + getJSPPATH() + "||");
        result.append("THUMBNAILPATH: " + getTHUMBNAILPATH() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}