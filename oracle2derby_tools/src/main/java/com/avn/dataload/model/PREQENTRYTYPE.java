package com.avn.dataload.model;

public class PREQENTRYTYPE {


    private java.math.BigDecimal PREQENTRYTYPE_ID;
    
    public void setPREQENTRYTYPE_ID(java.math.BigDecimal PREQENTRYTYPE_ID) {
        this.PREQENTRYTYPE_ID = PREQENTRYTYPE_ID;
    }
    
    public java.math.BigDecimal getPREQENTRYTYPE_ID() {
        return this.PREQENTRYTYPE_ID;
    }
      

    private java.lang.String IDENTIFIER;
    
    public void setIDENTIFIER(java.lang.String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
    
    public java.lang.String getIDENTIFIER() {
        return this.IDENTIFIER;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String PROPERTIES;
    
    public void setPROPERTIES(java.lang.String PROPERTIES) {
        this.PROPERTIES = PROPERTIES;
    }
    
    public java.lang.String getPROPERTIES() {
        return this.PROPERTIES;
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
        result.append("PREQENTRYTYPE_ID: " + getPREQENTRYTYPE_ID() + "||");
        result.append("IDENTIFIER: " + getIDENTIFIER() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("PROPERTIES: " + getPROPERTIES() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}