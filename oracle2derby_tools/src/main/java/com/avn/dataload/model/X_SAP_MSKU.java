package com.avn.dataload.model;

public class X_SAP_MSKU {


    private java.lang.String MSKU_WERKS;
    
    public void setMSKU_WERKS(java.lang.String MSKU_WERKS) {
        this.MSKU_WERKS = MSKU_WERKS;
    }
    
    public java.lang.String getMSKU_WERKS() {
        return this.MSKU_WERKS;
    }
      

    private java.lang.String MSKU_MATNR;
    
    public void setMSKU_MATNR(java.lang.String MSKU_MATNR) {
        this.MSKU_MATNR = MSKU_MATNR;
    }
    
    public java.lang.String getMSKU_MATNR() {
        return this.MSKU_MATNR;
    }
      

    private java.lang.String MSKU_KUNNR;
    
    public void setMSKU_KUNNR(java.lang.String MSKU_KUNNR) {
        this.MSKU_KUNNR = MSKU_KUNNR;
    }
    
    public java.lang.String getMSKU_KUNNR() {
        return this.MSKU_KUNNR;
    }
      

    private java.math.BigDecimal MSKU_LABST;
    
    public void setMSKU_LABST(java.math.BigDecimal MSKU_LABST) {
        this.MSKU_LABST = MSKU_LABST;
    }
    
    public java.math.BigDecimal getMSKU_LABST() {
        return this.MSKU_LABST;
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
        result.append("MSKU_WERKS: " + getMSKU_WERKS() + "||");
        result.append("MSKU_MATNR: " + getMSKU_MATNR() + "||");
        result.append("MSKU_KUNNR: " + getMSKU_KUNNR() + "||");
        result.append("MSKU_LABST: " + getMSKU_LABST() + "||");
        result.append("UPDATED_FLAG: " + getUPDATED_FLAG() + "||");
        return result.toString();
    }
    
}