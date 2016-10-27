package com.avn.dataload.model;

public class X_ZFC_CUSTMAT {


    private java.lang.String MANDT;
    
    public void setMANDT(java.lang.String MANDT) {
        this.MANDT = MANDT;
    }
    
    public java.lang.String getMANDT() {
        return this.MANDT;
    }
      

    private java.lang.String ZZFPA;
    
    public void setZZFPA(java.lang.String ZZFPA) {
        this.ZZFPA = ZZFPA;
    }
    
    public java.lang.String getZZFPA() {
        return this.ZZFPA;
    }
      

    private java.lang.String ZZCMA;
    
    public void setZZCMA(java.lang.String ZZCMA) {
        this.ZZCMA = ZZCMA;
    }
    
    public java.lang.String getZZCMA() {
        return this.ZZCMA;
    }
      

    private java.lang.String VKORG;
    
    public void setVKORG(java.lang.String VKORG) {
        this.VKORG = VKORG;
    }
    
    public java.lang.String getVKORG() {
        return this.VKORG;
    }
      

    private java.lang.String VTWEG;
    
    public void setVTWEG(java.lang.String VTWEG) {
        this.VTWEG = VTWEG;
    }
    
    public java.lang.String getVTWEG() {
        return this.VTWEG;
    }
      

    private java.lang.String RESERVING;
    
    public void setRESERVING(java.lang.String RESERVING) {
        this.RESERVING = RESERVING;
    }
    
    public java.lang.String getRESERVING() {
        return this.RESERVING;
    }
      

    private java.lang.String CONSIGNMENT;
    
    public void setCONSIGNMENT(java.lang.String CONSIGNMENT) {
        this.CONSIGNMENT = CONSIGNMENT;
    }
    
    public java.lang.String getCONSIGNMENT() {
        return this.CONSIGNMENT;
    }
      

    private java.sql.Timestamp ERZEIT;
    
    public void setERZEIT(java.sql.Timestamp ERZEIT) {
        this.ERZEIT = ERZEIT;
    }
    
    public java.sql.Timestamp getERZEIT() {
        return this.ERZEIT;
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
        result.append("MANDT: " + getMANDT() + "||");
        result.append("ZZFPA: " + getZZFPA() + "||");
        result.append("ZZCMA: " + getZZCMA() + "||");
        result.append("VKORG: " + getVKORG() + "||");
        result.append("VTWEG: " + getVTWEG() + "||");
        result.append("RESERVING: " + getRESERVING() + "||");
        result.append("CONSIGNMENT: " + getCONSIGNMENT() + "||");
        result.append("ERZEIT: " + getERZEIT() + "||");
        result.append("UPDATED_FLAG: " + getUPDATED_FLAG() + "||");
        return result.toString();
    }
    
}