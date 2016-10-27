package com.avn.dataload.model;

public class SRCHPROPRELV {


    private java.math.BigDecimal SRCHPROPRELV_ID;
    
    public void setSRCHPROPRELV_ID(java.math.BigDecimal SRCHPROPRELV_ID) {
        this.SRCHPROPRELV_ID = SRCHPROPRELV_ID;
    }
    
    public java.math.BigDecimal getSRCHPROPRELV_ID() {
        return this.SRCHPROPRELV_ID;
    }
      

    private java.math.BigDecimal CATALOG_ID;
    
    public void setCATALOG_ID(java.math.BigDecimal CATALOG_ID) {
        this.CATALOG_ID = CATALOG_ID;
    }
    
    public java.math.BigDecimal getCATALOG_ID() {
        return this.CATALOG_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal CATGROUP_ID;
    
    public void setCATGROUP_ID(java.math.BigDecimal CATGROUP_ID) {
        this.CATGROUP_ID = CATGROUP_ID;
    }
    
    public java.math.BigDecimal getCATGROUP_ID() {
        return this.CATGROUP_ID;
    }
      

    private java.math.BigDecimal RELVALUE;
    
    public void setRELVALUE(java.math.BigDecimal RELVALUE) {
        this.RELVALUE = RELVALUE;
    }
    
    public java.math.BigDecimal getRELVALUE() {
        return this.RELVALUE;
    }
      

    private java.lang.String INDEXFIELD;
    
    public void setINDEXFIELD(java.lang.String INDEXFIELD) {
        this.INDEXFIELD = INDEXFIELD;
    }
    
    public java.lang.String getINDEXFIELD() {
        return this.INDEXFIELD;
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
        result.append("SRCHPROPRELV_ID: " + getSRCHPROPRELV_ID() + "||");
        result.append("CATALOG_ID: " + getCATALOG_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("CATGROUP_ID: " + getCATGROUP_ID() + "||");
        result.append("RELVALUE: " + getRELVALUE() + "||");
        result.append("INDEXFIELD: " + getINDEXFIELD() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}