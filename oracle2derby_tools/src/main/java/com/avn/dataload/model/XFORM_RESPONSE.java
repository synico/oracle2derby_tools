package com.avn.dataload.model;

public class XFORM_RESPONSE {


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
      

    private java.math.BigDecimal FORM_RESPONSE_ID;
    
    public void setFORM_RESPONSE_ID(java.math.BigDecimal FORM_RESPONSE_ID) {
        this.FORM_RESPONSE_ID = FORM_RESPONSE_ID;
    }
    
    public java.math.BigDecimal getFORM_RESPONSE_ID() {
        return this.FORM_RESPONSE_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String ORG_ID;
    
    public void setORG_ID(java.lang.String ORG_ID) {
        this.ORG_ID = ORG_ID;
    }
    
    public java.lang.String getORG_ID() {
        return this.ORG_ID;
    }
      

    private java.lang.String PARTY_ID;
    
    public void setPARTY_ID(java.lang.String PARTY_ID) {
        this.PARTY_ID = PARTY_ID;
    }
    
    public java.lang.String getPARTY_ID() {
        return this.PARTY_ID;
    }
      

    private java.math.BigDecimal USERS_ID;
    
    public void setUSERS_ID(java.math.BigDecimal USERS_ID) {
        this.USERS_ID = USERS_ID;
    }
    
    public java.math.BigDecimal getUSERS_ID() {
        return this.USERS_ID;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("FORM_ID: " + getFORM_ID() + "||");
        result.append("FORM_VERSION_ID: " + getFORM_VERSION_ID() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("FORM_RESPONSE_ID: " + getFORM_RESPONSE_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("ORG_ID: " + getORG_ID() + "||");
        result.append("PARTY_ID: " + getPARTY_ID() + "||");
        result.append("USERS_ID: " + getUSERS_ID() + "||");
        return result.toString();
    }
    
}