package com.avn.dataload.model;

public class STOREPLTYPES {


    private java.lang.String PAGELAYOUTTYPE_ID;
    
    public void setPAGELAYOUTTYPE_ID(java.lang.String PAGELAYOUTTYPE_ID) {
        this.PAGELAYOUTTYPE_ID = PAGELAYOUTTYPE_ID;
    }
    
    public java.lang.String getPAGELAYOUTTYPE_ID() {
        return this.PAGELAYOUTTYPE_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.lang.String VIEWNAME;
    
    public void setVIEWNAME(java.lang.String VIEWNAME) {
        this.VIEWNAME = VIEWNAME;
    }
    
    public java.lang.String getVIEWNAME() {
        return this.VIEWNAME;
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
        result.append("PAGELAYOUTTYPE_ID: " + getPAGELAYOUTTYPE_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("VIEWNAME: " + getVIEWNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}