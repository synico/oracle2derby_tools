package com.avn.dataload.model;

public class PROFNVSTRG {


    private java.math.BigDecimal PROFNVSTRG_ID;
    
    public void setPROFNVSTRG_ID(java.math.BigDecimal PROFNVSTRG_ID) {
        this.PROFNVSTRG_ID = PROFNVSTRG_ID;
    }
    
    public java.math.BigDecimal getPROFNVSTRG_ID() {
        return this.PROFNVSTRG_ID;
    }
      

    private java.math.BigDecimal PROFILE_ID;
    
    public void setPROFILE_ID(java.math.BigDecimal PROFILE_ID) {
        this.PROFILE_ID = PROFILE_ID;
    }
    
    public java.math.BigDecimal getPROFILE_ID() {
        return this.PROFILE_ID;
    }
      

    private java.lang.String PROFILEATTNAME;
    
    public void setPROFILEATTNAME(java.lang.String PROFILEATTNAME) {
        this.PROFILEATTNAME = PROFILEATTNAME;
    }
    
    public java.lang.String getPROFILEATTNAME() {
        return this.PROFILEATTNAME;
    }
      

    private java.lang.String PROFILEATTVALUE;
    
    public void setPROFILEATTVALUE(java.lang.String PROFILEATTVALUE) {
        this.PROFILEATTVALUE = PROFILEATTVALUE;
    }
    
    public java.lang.String getPROFILEATTVALUE() {
        return this.PROFILEATTVALUE;
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
        result.append("PROFNVSTRG_ID: " + getPROFNVSTRG_ID() + "||");
        result.append("PROFILE_ID: " + getPROFILE_ID() + "||");
        result.append("PROFILEATTNAME: " + getPROFILEATTNAME() + "||");
        result.append("PROFILEATTVALUE: " + getPROFILEATTVALUE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}