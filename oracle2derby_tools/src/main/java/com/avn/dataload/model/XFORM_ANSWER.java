package com.avn.dataload.model;

public class XFORM_ANSWER {


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
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
    }
      

    private java.math.BigDecimal FORM_QUESTION_ID;
    
    public void setFORM_QUESTION_ID(java.math.BigDecimal FORM_QUESTION_ID) {
        this.FORM_QUESTION_ID = FORM_QUESTION_ID;
    }
    
    public java.math.BigDecimal getFORM_QUESTION_ID() {
        return this.FORM_QUESTION_ID;
    }
      

    private java.math.BigDecimal FORM_RESPONSE_ID;
    
    public void setFORM_RESPONSE_ID(java.math.BigDecimal FORM_RESPONSE_ID) {
        this.FORM_RESPONSE_ID = FORM_RESPONSE_ID;
    }
    
    public java.math.BigDecimal getFORM_RESPONSE_ID() {
        return this.FORM_RESPONSE_ID;
    }
      

    private java.lang.String FORM_ANSWER_TX;
    
    public void setFORM_ANSWER_TX(java.lang.String FORM_ANSWER_TX) {
        this.FORM_ANSWER_TX = FORM_ANSWER_TX;
    }
    
    public java.lang.String getFORM_ANSWER_TX() {
        return this.FORM_ANSWER_TX;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("FORM_ID: " + getFORM_ID() + "||");
        result.append("FORM_VERSION_ID: " + getFORM_VERSION_ID() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("FORM_QUESTION_ID: " + getFORM_QUESTION_ID() + "||");
        result.append("FORM_RESPONSE_ID: " + getFORM_RESPONSE_ID() + "||");
        result.append("FORM_ANSWER_TX: " + getFORM_ANSWER_TX() + "||");
        return result.toString();
    }
    
}