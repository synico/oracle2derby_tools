package com.avn.dataload.model;

public class SEOPAGEDEFOVR {


    private java.math.BigDecimal SEOPAGEDEFOVR_ID;
    
    public void setSEOPAGEDEFOVR_ID(java.math.BigDecimal SEOPAGEDEFOVR_ID) {
        this.SEOPAGEDEFOVR_ID = SEOPAGEDEFOVR_ID;
    }
    
    public java.math.BigDecimal getSEOPAGEDEFOVR_ID() {
        return this.SEOPAGEDEFOVR_ID;
    }
      

    private java.math.BigDecimal SEOPAGEDEF_ID;
    
    public void setSEOPAGEDEF_ID(java.math.BigDecimal SEOPAGEDEF_ID) {
        this.SEOPAGEDEF_ID = SEOPAGEDEF_ID;
    }
    
    public java.math.BigDecimal getSEOPAGEDEF_ID() {
        return this.SEOPAGEDEF_ID;
    }
      

    private java.math.BigDecimal APPLY_TO_CHILD;
    
    public void setAPPLY_TO_CHILD(java.math.BigDecimal APPLY_TO_CHILD) {
        this.APPLY_TO_CHILD = APPLY_TO_CHILD;
    }
    
    public java.math.BigDecimal getAPPLY_TO_CHILD() {
        return this.APPLY_TO_CHILD;
    }
      

    private java.lang.String OBJECTTYPE;
    
    public void setOBJECTTYPE(java.lang.String OBJECTTYPE) {
        this.OBJECTTYPE = OBJECTTYPE;
    }
    
    public java.lang.String getOBJECTTYPE() {
        return this.OBJECTTYPE;
    }
      

    private java.lang.String OBJECT_ID;
    
    public void setOBJECT_ID(java.lang.String OBJECT_ID) {
        this.OBJECT_ID = OBJECT_ID;
    }
    
    public java.lang.String getOBJECT_ID() {
        return this.OBJECT_ID;
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
        result.append("SEOPAGEDEFOVR_ID: " + getSEOPAGEDEFOVR_ID() + "||");
        result.append("SEOPAGEDEF_ID: " + getSEOPAGEDEF_ID() + "||");
        result.append("APPLY_TO_CHILD: " + getAPPLY_TO_CHILD() + "||");
        result.append("OBJECTTYPE: " + getOBJECTTYPE() + "||");
        result.append("OBJECT_ID: " + getOBJECT_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}