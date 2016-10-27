package com.avn.dataload.model;

public class FLTRANSITN {


    private java.math.BigDecimal FLTRANSITN_ID;
    
    public void setFLTRANSITN_ID(java.math.BigDecimal FLTRANSITN_ID) {
        this.FLTRANSITN_ID = FLTRANSITN_ID;
    }
    
    public java.math.BigDecimal getFLTRANSITN_ID() {
        return this.FLTRANSITN_ID;
    }
      

    private java.math.BigDecimal FLOW_ID;
    
    public void setFLOW_ID(java.math.BigDecimal FLOW_ID) {
        this.FLOW_ID = FLOW_ID;
    }
    
    public java.math.BigDecimal getFLOW_ID() {
        return this.FLOW_ID;
    }
      

    private java.math.BigDecimal SOURCESTATE_ID;
    
    public void setSOURCESTATE_ID(java.math.BigDecimal SOURCESTATE_ID) {
        this.SOURCESTATE_ID = SOURCESTATE_ID;
    }
    
    public java.math.BigDecimal getSOURCESTATE_ID() {
        return this.SOURCESTATE_ID;
    }
      

    private java.math.BigDecimal TARGETSTATE_ID;
    
    public void setTARGETSTATE_ID(java.math.BigDecimal TARGETSTATE_ID) {
        this.TARGETSTATE_ID = TARGETSTATE_ID;
    }
    
    public java.math.BigDecimal getTARGETSTATE_ID() {
        return this.TARGETSTATE_ID;
    }
      

    private java.math.BigDecimal PRIORITY;
    
    public void setPRIORITY(java.math.BigDecimal PRIORITY) {
        this.PRIORITY = PRIORITY;
    }
    
    public java.math.BigDecimal getPRIORITY() {
        return this.PRIORITY;
    }
      

    private java.lang.String EVENTIDENTIFIER;
    
    public void setEVENTIDENTIFIER(java.lang.String EVENTIDENTIFIER) {
        this.EVENTIDENTIFIER = EVENTIDENTIFIER;
    }
    
    public java.lang.String getEVENTIDENTIFIER() {
        return this.EVENTIDENTIFIER;
    }
      

    private java.math.BigDecimal APPROVAL;
    
    public void setAPPROVAL(java.math.BigDecimal APPROVAL) {
        this.APPROVAL = APPROVAL;
    }
    
    public java.math.BigDecimal getAPPROVAL() {
        return this.APPROVAL;
    }
      

    private java.lang.String ACTIONINTERFACE;
    
    public void setACTIONINTERFACE(java.lang.String ACTIONINTERFACE) {
        this.ACTIONINTERFACE = ACTIONINTERFACE;
    }
    
    public java.lang.String getACTIONINTERFACE() {
        return this.ACTIONINTERFACE;
    }
      

    private java.lang.String ACCESSCTRLGUARD;
    
    public void setACCESSCTRLGUARD(java.lang.String ACCESSCTRLGUARD) {
        this.ACCESSCTRLGUARD = ACCESSCTRLGUARD;
    }
    
    public java.lang.String getACCESSCTRLGUARD() {
        return this.ACCESSCTRLGUARD;
    }
      

    private java.lang.String BUSINESSLOGICGUARD;
    
    public void setBUSINESSLOGICGUARD(java.lang.String BUSINESSLOGICGUARD) {
        this.BUSINESSLOGICGUARD = BUSINESSLOGICGUARD;
    }
    
    public java.lang.String getBUSINESSLOGICGUARD() {
        return this.BUSINESSLOGICGUARD;
    }
      

    private java.math.BigDecimal SPAWNFLWTYPE_ID;
    
    public void setSPAWNFLWTYPE_ID(java.math.BigDecimal SPAWNFLWTYPE_ID) {
        this.SPAWNFLWTYPE_ID = SPAWNFLWTYPE_ID;
    }
    
    public java.math.BigDecimal getSPAWNFLWTYPE_ID() {
        return this.SPAWNFLWTYPE_ID;
    }
      

    private java.math.BigDecimal SPAWNTYPE;
    
    public void setSPAWNTYPE(java.math.BigDecimal SPAWNTYPE) {
        this.SPAWNTYPE = SPAWNTYPE;
    }
    
    public java.math.BigDecimal getSPAWNTYPE() {
        return this.SPAWNTYPE;
    }
      

    private java.lang.String RESPONSEVIEWNAME;
    
    public void setRESPONSEVIEWNAME(java.lang.String RESPONSEVIEWNAME) {
        this.RESPONSEVIEWNAME = RESPONSEVIEWNAME;
    }
    
    public java.lang.String getRESPONSEVIEWNAME() {
        return this.RESPONSEVIEWNAME;
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
        result.append("FLOW_ID: " + getFLOW_ID() + "||");
        result.append("SOURCESTATE_ID: " + getSOURCESTATE_ID() + "||");
        result.append("TARGETSTATE_ID: " + getTARGETSTATE_ID() + "||");
        result.append("PRIORITY: " + getPRIORITY() + "||");
        result.append("EVENTIDENTIFIER: " + getEVENTIDENTIFIER() + "||");
        result.append("APPROVAL: " + getAPPROVAL() + "||");
        result.append("ACTIONINTERFACE: " + getACTIONINTERFACE() + "||");
        result.append("ACCESSCTRLGUARD: " + getACCESSCTRLGUARD() + "||");
        result.append("BUSINESSLOGICGUARD: " + getBUSINESSLOGICGUARD() + "||");
        result.append("SPAWNFLWTYPE_ID: " + getSPAWNFLWTYPE_ID() + "||");
        result.append("SPAWNTYPE: " + getSPAWNTYPE() + "||");
        result.append("RESPONSEVIEWNAME: " + getRESPONSEVIEWNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}