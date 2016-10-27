package com.avn.dataload.model;

public class X_SAP_SALESDOC_HDR {


    private java.lang.String VBAK_VBELN;
    
    public void setVBAK_VBELN(java.lang.String VBAK_VBELN) {
        this.VBAK_VBELN = VBAK_VBELN;
    }
    
    public java.lang.String getVBAK_VBELN() {
        return this.VBAK_VBELN;
    }
      

    private java.lang.String SOLD_TO;
    
    public void setSOLD_TO(java.lang.String SOLD_TO) {
        this.SOLD_TO = SOLD_TO;
    }
    
    public java.lang.String getSOLD_TO() {
        return this.SOLD_TO;
    }
      

    private java.lang.String VBAK_AUART;
    
    public void setVBAK_AUART(java.lang.String VBAK_AUART) {
        this.VBAK_AUART = VBAK_AUART;
    }
    
    public java.lang.String getVBAK_AUART() {
        return this.VBAK_AUART;
    }
      

    private java.sql.Timestamp VBKD_BSTDK;
    
    public void setVBKD_BSTDK(java.sql.Timestamp VBKD_BSTDK) {
        this.VBKD_BSTDK = VBKD_BSTDK;
    }
    
    public java.sql.Timestamp getVBKD_BSTDK() {
        return this.VBKD_BSTDK;
    }
      

    private java.lang.String UPDATED_FLAG;
    
    public void setUPDATED_FLAG(java.lang.String UPDATED_FLAG) {
        this.UPDATED_FLAG = UPDATED_FLAG;
    }
    
    public java.lang.String getUPDATED_FLAG() {
        return this.UPDATED_FLAG;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("VBAK_VBELN: " + getVBAK_VBELN() + "||");
        result.append("SOLD_TO: " + getSOLD_TO() + "||");
        result.append("VBAK_AUART: " + getVBAK_AUART() + "||");
        result.append("VBKD_BSTDK: " + getVBKD_BSTDK() + "||");
        result.append("UPDATED_FLAG: " + getUPDATED_FLAG() + "||");
        return result.toString();
    }
    
}