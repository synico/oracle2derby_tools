package com.avn.dataload.model;

public class XFORM_QUESTION_LANGUAGE {


    private java.math.BigDecimal FORM_ID;
    
    public void setFORM_ID(java.math.BigDecimal FORM_ID) {
        this.FORM_ID = FORM_ID;
    }
    
    public java.math.BigDecimal getFORM_ID() {
        return this.FORM_ID;
    }
      

    private java.math.BigDecimal FORM_VERSION_ID;
    
    public void setFORM_VERSION_ID(java.math.BigDecimal FORM_VERSION_ID) {
        this.FORM_VERSION_ID = FORM_VERSION_ID;
    }
    
    public java.math.BigDecimal getFORM_VERSION_ID() {
        return this.FORM_VERSION_ID;
    }
      

    private java.math.BigDecimal FORM_QUESTION_ID;
    
    public void setFORM_QUESTION_ID(java.math.BigDecimal FORM_QUESTION_ID) {
        this.FORM_QUESTION_ID = FORM_QUESTION_ID;
    }
    
    public java.math.BigDecimal getFORM_QUESTION_ID() {
        return this.FORM_QUESTION_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String FORM_QUESTION_TX;
    
    public void setFORM_QUESTION_TX(java.lang.String FORM_QUESTION_TX) {
        this.FORM_QUESTION_TX = FORM_QUESTION_TX;
    }
    
    public java.lang.String getFORM_QUESTION_TX() {
        return this.FORM_QUESTION_TX;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("FORM_ID: " + getFORM_ID() + "||");
        result.append("FORM_VERSION_ID: " + getFORM_VERSION_ID() + "||");
        result.append("FORM_QUESTION_ID: " + getFORM_QUESTION_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("FORM_QUESTION_TX: " + getFORM_QUESTION_TX() + "||");
        return result.toString();
    }
    
}