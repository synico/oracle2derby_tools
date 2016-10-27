package com.avn.dataload.model;

public class XFORM_QUESTION {


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
      

    private java.lang.String FORM_QUESTION_TYPE_CD;
    
    public void setFORM_QUESTION_TYPE_CD(java.lang.String FORM_QUESTION_TYPE_CD) {
        this.FORM_QUESTION_TYPE_CD = FORM_QUESTION_TYPE_CD;
    }
    
    public java.lang.String getFORM_QUESTION_TYPE_CD() {
        return this.FORM_QUESTION_TYPE_CD;
    }
      

    private java.math.BigDecimal SORT_ORDER_NO;
    
    public void setSORT_ORDER_NO(java.math.BigDecimal SORT_ORDER_NO) {
        this.SORT_ORDER_NO = SORT_ORDER_NO;
    }
    
    public java.math.BigDecimal getSORT_ORDER_NO() {
        return this.SORT_ORDER_NO;
    }
      

    private java.math.BigDecimal FORM_QUESTION_SET_ID;
    
    public void setFORM_QUESTION_SET_ID(java.math.BigDecimal FORM_QUESTION_SET_ID) {
        this.FORM_QUESTION_SET_ID = FORM_QUESTION_SET_ID;
    }
    
    public java.math.BigDecimal getFORM_QUESTION_SET_ID() {
        return this.FORM_QUESTION_SET_ID;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("FORM_ID: " + getFORM_ID() + "||");
        result.append("FORM_VERSION_ID: " + getFORM_VERSION_ID() + "||");
        result.append("FORM_QUESTION_ID: " + getFORM_QUESTION_ID() + "||");
        result.append("FORM_QUESTION_TYPE_CD: " + getFORM_QUESTION_TYPE_CD() + "||");
        result.append("SORT_ORDER_NO: " + getSORT_ORDER_NO() + "||");
        result.append("FORM_QUESTION_SET_ID: " + getFORM_QUESTION_SET_ID() + "||");
        return result.toString();
    }
    
}