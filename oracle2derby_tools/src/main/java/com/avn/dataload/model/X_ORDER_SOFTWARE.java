package com.avn.dataload.model;

public class X_ORDER_SOFTWARE {


    private java.math.BigDecimal ORDERS_ID;
    
    public void setORDERS_ID(java.math.BigDecimal ORDERS_ID) {
        this.ORDERS_ID = ORDERS_ID;
    }
    
    public java.math.BigDecimal getORDERS_ID() {
        return this.ORDERS_ID;
    }
      

    private java.lang.String EMAIL_ADDRESS_TX;
    
    public void setEMAIL_ADDRESS_TX(java.lang.String EMAIL_ADDRESS_TX) {
        this.EMAIL_ADDRESS_TX = EMAIL_ADDRESS_TX;
    }
    
    public java.lang.String getEMAIL_ADDRESS_TX() {
        return this.EMAIL_ADDRESS_TX;
    }
      

    private java.lang.String FIRST_NM;
    
    public void setFIRST_NM(java.lang.String FIRST_NM) {
        this.FIRST_NM = FIRST_NM;
    }
    
    public java.lang.String getFIRST_NM() {
        return this.FIRST_NM;
    }
      

    private java.lang.String LAST_NM;
    
    public void setLAST_NM(java.lang.String LAST_NM) {
        this.LAST_NM = LAST_NM;
    }
    
    public java.lang.String getLAST_NM() {
        return this.LAST_NM;
    }
      

    private java.lang.String SOFTWARE_PROCESS_CD;
    
    public void setSOFTWARE_PROCESS_CD(java.lang.String SOFTWARE_PROCESS_CD) {
        this.SOFTWARE_PROCESS_CD = SOFTWARE_PROCESS_CD;
    }
    
    public java.lang.String getSOFTWARE_PROCESS_CD() {
        return this.SOFTWARE_PROCESS_CD;
    }
      

    private java.lang.String SOFTWARE_VOUCHER_NO;
    
    public void setSOFTWARE_VOUCHER_NO(java.lang.String SOFTWARE_VOUCHER_NO) {
        this.SOFTWARE_VOUCHER_NO = SOFTWARE_VOUCHER_NO;
    }
    
    public java.lang.String getSOFTWARE_VOUCHER_NO() {
        return this.SOFTWARE_VOUCHER_NO;
    }
      

    private java.sql.Timestamp APPL_CREATE_DT;
    
    public void setAPPL_CREATE_DT(java.sql.Timestamp APPL_CREATE_DT) {
        this.APPL_CREATE_DT = APPL_CREATE_DT;
    }
    
    public java.sql.Timestamp getAPPL_CREATE_DT() {
        return this.APPL_CREATE_DT;
    }
      

    private java.sql.Timestamp APPL_UPDATE_DT;
    
    public void setAPPL_UPDATE_DT(java.sql.Timestamp APPL_UPDATE_DT) {
        this.APPL_UPDATE_DT = APPL_UPDATE_DT;
    }
    
    public java.sql.Timestamp getAPPL_UPDATE_DT() {
        return this.APPL_UPDATE_DT;
    }
      

    private java.lang.String SOFTWARE_AUTHORIZER_CD;
    
    public void setSOFTWARE_AUTHORIZER_CD(java.lang.String SOFTWARE_AUTHORIZER_CD) {
        this.SOFTWARE_AUTHORIZER_CD = SOFTWARE_AUTHORIZER_CD;
    }
    
    public java.lang.String getSOFTWARE_AUTHORIZER_CD() {
        return this.SOFTWARE_AUTHORIZER_CD;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("ORDERS_ID: " + getORDERS_ID() + "||");
        result.append("EMAIL_ADDRESS_TX: " + getEMAIL_ADDRESS_TX() + "||");
        result.append("FIRST_NM: " + getFIRST_NM() + "||");
        result.append("LAST_NM: " + getLAST_NM() + "||");
        result.append("SOFTWARE_PROCESS_CD: " + getSOFTWARE_PROCESS_CD() + "||");
        result.append("SOFTWARE_VOUCHER_NO: " + getSOFTWARE_VOUCHER_NO() + "||");
        result.append("APPL_CREATE_DT: " + getAPPL_CREATE_DT() + "||");
        result.append("APPL_UPDATE_DT: " + getAPPL_UPDATE_DT() + "||");
        result.append("SOFTWARE_AUTHORIZER_CD: " + getSOFTWARE_AUTHORIZER_CD() + "||");
        return result.toString();
    }
    
}