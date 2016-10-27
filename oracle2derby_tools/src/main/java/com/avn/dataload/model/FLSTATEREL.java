package com.avn.dataload.model;

public class FLSTATEREL {


    private java.math.BigDecimal FLSTATEDCT_ID;
    
    public void setFLSTATEDCT_ID(java.math.BigDecimal FLSTATEDCT_ID) {
        this.FLSTATEDCT_ID = FLSTATEDCT_ID;
    }
    
    public java.math.BigDecimal getFLSTATEDCT_ID() {
        return this.FLSTATEDCT_ID;
    }
      

    private java.math.BigDecimal FLOW_ID;
    
    public void setFLOW_ID(java.math.BigDecimal FLOW_ID) {
        this.FLOW_ID = FLOW_ID;
    }
    
    public java.math.BigDecimal getFLOW_ID() {
        return this.FLOW_ID;
    }
      

    private java.lang.String ENTRYACTNINTERFACE;
    
    public void setENTRYACTNINTERFACE(java.lang.String ENTRYACTNINTERFACE) {
        this.ENTRYACTNINTERFACE = ENTRYACTNINTERFACE;
    }
    
    public java.lang.String getENTRYACTNINTERFACE() {
        return this.ENTRYACTNINTERFACE;
    }
      

    private java.lang.String EXITACTNINTERFACE;
    
    public void setEXITACTNINTERFACE(java.lang.String EXITACTNINTERFACE) {
        this.EXITACTNINTERFACE = EXITACTNINTERFACE;
    }
    
    public java.lang.String getEXITACTNINTERFACE() {
        return this.EXITACTNINTERFACE;
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
        result.append("FLSTATEDCT_ID: " + getFLSTATEDCT_ID() + "||");
        result.append("FLOW_ID: " + getFLOW_ID() + "||");
        result.append("ENTRYACTNINTERFACE: " + getENTRYACTNINTERFACE() + "||");
        result.append("EXITACTNINTERFACE: " + getEXITACTNINTERFACE() + "||");
        result.append("RESPONSEVIEWNAME: " + getRESPONSEVIEWNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}