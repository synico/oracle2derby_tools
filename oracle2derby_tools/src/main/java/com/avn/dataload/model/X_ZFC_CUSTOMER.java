package com.avn.dataload.model;

public class X_ZFC_CUSTOMER {


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
      

    private java.lang.String WERKS;
    
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }
    
    public java.lang.String getWERKS() {
        return this.WERKS;
    }
      

    private java.lang.String FCPERIOD;
    
    public void setFCPERIOD(java.lang.String FCPERIOD) {
        this.FCPERIOD = FCPERIOD;
    }
    
    public java.lang.String getFCPERIOD() {
        return this.FCPERIOD;
    }
      

    private java.lang.String NET;
    
    public void setNET(java.lang.String NET) {
        this.NET = NET;
    }
    
    public java.lang.String getNET() {
        return this.NET;
    }
      

    private java.lang.String NET_QOH;
    
    public void setNET_QOH(java.lang.String NET_QOH) {
        this.NET_QOH = NET_QOH;
    }
    
    public java.lang.String getNET_QOH() {
        return this.NET_QOH;
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
      

    private java.lang.String VMI;
    
    public void setVMI(java.lang.String VMI) {
        this.VMI = VMI;
    }
    
    public java.lang.String getVMI() {
        return this.VMI;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("MANDT: " + getMANDT() + "||");
        result.append("ZZFPA: " + getZZFPA() + "||");
        result.append("VKORG: " + getVKORG() + "||");
        result.append("VTWEG: " + getVTWEG() + "||");
        result.append("WERKS: " + getWERKS() + "||");
        result.append("FCPERIOD: " + getFCPERIOD() + "||");
        result.append("NET: " + getNET() + "||");
        result.append("NET_QOH: " + getNET_QOH() + "||");
        result.append("CONSIGNMENT: " + getCONSIGNMENT() + "||");
        result.append("ERZEIT: " + getERZEIT() + "||");
        result.append("UPDATED_FLAG: " + getUPDATED_FLAG() + "||");
        result.append("VMI: " + getVMI() + "||");
        return result.toString();
    }
    
}