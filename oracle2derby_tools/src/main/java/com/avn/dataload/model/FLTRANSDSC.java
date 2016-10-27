package com.avn.dataload.model;

public class FLTRANSDSC {


    private java.math.BigDecimal FLTRANSITN_ID;
    
    public void setFLTRANSITN_ID(java.math.BigDecimal FLTRANSITN_ID) {
        this.FLTRANSITN_ID = FLTRANSITN_ID;
    }
    
    public java.math.BigDecimal getFLTRANSITN_ID() {
        return this.FLTRANSITN_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String TRANSITIONDESC;
    
    public void setTRANSITIONDESC(java.lang.String TRANSITIONDESC) {
        this.TRANSITIONDESC = TRANSITIONDESC;
    }
    
    public java.lang.String getTRANSITIONDESC() {
        return this.TRANSITIONDESC;
    }
      

    private java.lang.String EVENTDESC;
    
    public void setEVENTDESC(java.lang.String EVENTDESC) {
        this.EVENTDESC = EVENTDESC;
    }
    
    public java.lang.String getEVENTDESC() {
        return this.EVENTDESC;
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
        result.append("FLTRANSITN_ID: " + getFLTRANSITN_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("TRANSITIONDESC: " + getTRANSITIONDESC() + "||");
        result.append("EVENTDESC: " + getEVENTDESC() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}