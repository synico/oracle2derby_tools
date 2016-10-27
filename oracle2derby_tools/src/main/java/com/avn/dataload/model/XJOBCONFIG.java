package com.avn.dataload.model;

public class XJOBCONFIG {


    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.lang.String JOBIDENTIFIER;
    
    public void setJOBIDENTIFIER(java.lang.String JOBIDENTIFIER) {
        this.JOBIDENTIFIER = JOBIDENTIFIER;
    }
    
    public java.lang.String getJOBIDENTIFIER() {
        return this.JOBIDENTIFIER;
    }
      

    private java.lang.String CONFIGNAME;
    
    public void setCONFIGNAME(java.lang.String CONFIGNAME) {
        this.CONFIGNAME = CONFIGNAME;
    }
    
    public java.lang.String getCONFIGNAME() {
        return this.CONFIGNAME;
    }
      

    private java.sql.Timestamp DATEVALUE;
    
    public void setDATEVALUE(java.sql.Timestamp DATEVALUE) {
        this.DATEVALUE = DATEVALUE;
    }
    
    public java.sql.Timestamp getDATEVALUE() {
        return this.DATEVALUE;
    }
      

    private java.lang.String STRINGVALUE;
    
    public void setSTRINGVALUE(java.lang.String STRINGVALUE) {
        this.STRINGVALUE = STRINGVALUE;
    }
    
    public java.lang.String getSTRINGVALUE() {
        return this.STRINGVALUE;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("JOBIDENTIFIER: " + getJOBIDENTIFIER() + "||");
        result.append("CONFIGNAME: " + getCONFIGNAME() + "||");
        result.append("DATEVALUE: " + getDATEVALUE() + "||");
        result.append("STRINGVALUE: " + getSTRINGVALUE() + "||");
        return result.toString();
    }
    
}