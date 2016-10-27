package com.avn.dataload.model;

public class XACCOUNTPREFERENCE {


    private java.math.BigDecimal USERS_ID;
    
    public void setUSERS_ID(java.math.BigDecimal USERS_ID) {
        this.USERS_ID = USERS_ID;
    }
    
    public java.math.BigDecimal getUSERS_ID() {
        return this.USERS_ID;
    }
      

    private java.math.BigDecimal ORGENTITY_ID;
    
    public void setORGENTITY_ID(java.math.BigDecimal ORGENTITY_ID) {
        this.ORGENTITY_ID = ORGENTITY_ID;
    }
    
    public java.math.BigDecimal getORGENTITY_ID() {
        return this.ORGENTITY_ID;
    }
      

    private java.lang.String PREFERENCETYPE;
    
    public void setPREFERENCETYPE(java.lang.String PREFERENCETYPE) {
        this.PREFERENCETYPE = PREFERENCETYPE;
    }
    
    public java.lang.String getPREFERENCETYPE() {
        return this.PREFERENCETYPE;
    }
      

    private java.lang.String PREFERENCE_ID;
    
    public void setPREFERENCE_ID(java.lang.String PREFERENCE_ID) {
        this.PREFERENCE_ID = PREFERENCE_ID;
    }
    
    public java.lang.String getPREFERENCE_ID() {
        return this.PREFERENCE_ID;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("USERS_ID: " + getUSERS_ID() + "||");
        result.append("ORGENTITY_ID: " + getORGENTITY_ID() + "||");
        result.append("PREFERENCETYPE: " + getPREFERENCETYPE() + "||");
        result.append("PREFERENCE_ID: " + getPREFERENCE_ID() + "||");
        return result.toString();
    }
    
}