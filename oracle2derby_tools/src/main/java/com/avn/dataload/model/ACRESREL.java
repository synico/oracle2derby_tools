package com.avn.dataload.model;

public class ACRESREL {


    private java.math.BigDecimal ACRELATION_ID;
    
    public void setACRELATION_ID(java.math.BigDecimal ACRELATION_ID) {
        this.ACRELATION_ID = ACRELATION_ID;
    }
    
    public java.math.BigDecimal getACRELATION_ID() {
        return this.ACRELATION_ID;
    }
      

    private java.math.BigDecimal ACRESCGRY_ID;
    
    public void setACRESCGRY_ID(java.math.BigDecimal ACRESCGRY_ID) {
        this.ACRESCGRY_ID = ACRESCGRY_ID;
    }
    
    public java.math.BigDecimal getACRESCGRY_ID() {
        return this.ACRESCGRY_ID;
    }
      

    private java.lang.String RESRELTABLE;
    
    public void setRESRELTABLE(java.lang.String RESRELTABLE) {
        this.RESRELTABLE = RESRELTABLE;
    }
    
    public java.lang.String getRESRELTABLE() {
        return this.RESRELTABLE;
    }
      

    private java.lang.String RESRELMEMCOL;
    
    public void setRESRELMEMCOL(java.lang.String RESRELMEMCOL) {
        this.RESRELMEMCOL = RESRELMEMCOL;
    }
    
    public java.lang.String getRESRELMEMCOL() {
        return this.RESRELMEMCOL;
    }
      

    private java.lang.String RESRELKEYCOL;
    
    public void setRESRELKEYCOL(java.lang.String RESRELKEYCOL) {
        this.RESRELKEYCOL = RESRELKEYCOL;
    }
    
    public java.lang.String getRESRELKEYCOL() {
        return this.RESRELKEYCOL;
    }
      

    private java.lang.String RESRELCOL;
    
    public void setRESRELCOL(java.lang.String RESRELCOL) {
        this.RESRELCOL = RESRELCOL;
    }
    
    public java.lang.String getRESRELCOL() {
        return this.RESRELCOL;
    }
      

    private java.lang.String RESJOINCOL;
    
    public void setRESJOINCOL(java.lang.String RESJOINCOL) {
        this.RESJOINCOL = RESJOINCOL;
    }
    
    public java.lang.String getRESJOINCOL() {
        return this.RESJOINCOL;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String RESOURCETYPE;
    
    public void setRESOURCETYPE(java.lang.String RESOURCETYPE) {
        this.RESOURCETYPE = RESOURCETYPE;
    }
    
    public java.lang.String getRESOURCETYPE() {
        return this.RESOURCETYPE;
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
        result.append("ACRELATION_ID: " + getACRELATION_ID() + "||");
        result.append("ACRESCGRY_ID: " + getACRESCGRY_ID() + "||");
        result.append("RESRELTABLE: " + getRESRELTABLE() + "||");
        result.append("RESRELMEMCOL: " + getRESRELMEMCOL() + "||");
        result.append("RESRELKEYCOL: " + getRESRELKEYCOL() + "||");
        result.append("RESRELCOL: " + getRESRELCOL() + "||");
        result.append("RESJOINCOL: " + getRESJOINCOL() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("RESOURCETYPE: " + getRESOURCETYPE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}