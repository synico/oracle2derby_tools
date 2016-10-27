package com.avn.dataload.model;

public class PLWIDGETNVP {


    private java.math.BigDecimal PLWIDGETNVP_ID;
    
    public void setPLWIDGETNVP_ID(java.math.BigDecimal PLWIDGETNVP_ID) {
        this.PLWIDGETNVP_ID = PLWIDGETNVP_ID;
    }
    
    public java.math.BigDecimal getPLWIDGETNVP_ID() {
        return this.PLWIDGETNVP_ID;
    }
      

    private java.math.BigDecimal PLWIDGET_ID;
    
    public void setPLWIDGET_ID(java.math.BigDecimal PLWIDGET_ID) {
        this.PLWIDGET_ID = PLWIDGET_ID;
    }
    
    public java.math.BigDecimal getPLWIDGET_ID() {
        return this.PLWIDGET_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String VALUE;
    
    public void setVALUE(java.lang.String VALUE) {
        this.VALUE = VALUE;
    }
    
    public java.lang.String getVALUE() {
        return this.VALUE;
    }
      

    private java.lang.String PROPERTIES;
    
    public void setPROPERTIES(java.lang.String PROPERTIES) {
        this.PROPERTIES = PROPERTIES;
    }
    
    public java.lang.String getPROPERTIES() {
        return this.PROPERTIES;
    }
      

    private java.math.BigDecimal SEQUENCE;
    
    public void setSEQUENCE(java.math.BigDecimal SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }
    
    public java.math.BigDecimal getSEQUENCE() {
        return this.SEQUENCE;
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
        result.append("PLWIDGETNVP_ID: " + getPLWIDGETNVP_ID() + "||");
        result.append("PLWIDGET_ID: " + getPLWIDGET_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("VALUE: " + getVALUE() + "||");
        result.append("PROPERTIES: " + getPROPERTIES() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}