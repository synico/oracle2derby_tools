package com.avn.dataload.model;

public class X_ZFC_UPLOAD_LOG {


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
      

    private java.lang.String ZZCMA;
    
    public void setZZCMA(java.lang.String ZZCMA) {
        this.ZZCMA = ZZCMA;
    }
    
    public java.lang.String getZZCMA() {
        return this.ZZCMA;
    }
      

    private java.lang.String MATNR;
    
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }
    
    public java.lang.String getMATNR() {
        return this.MATNR;
    }
      

    private java.lang.String FCASTWEEK;
    
    public void setFCASTWEEK(java.lang.String FCASTWEEK) {
        this.FCASTWEEK = FCASTWEEK;
    }
    
    public java.lang.String getFCASTWEEK() {
        return this.FCASTWEEK;
    }
      

    private java.sql.Timestamp FCASTRECVDDATE;
    
    public void setFCASTRECVDDATE(java.sql.Timestamp FCASTRECVDDATE) {
        this.FCASTRECVDDATE = FCASTRECVDDATE;
    }
    
    public java.sql.Timestamp getFCASTRECVDDATE() {
        return this.FCASTRECVDDATE;
    }
      

    private java.math.BigDecimal FCASTRAW;
    
    public void setFCASTRAW(java.math.BigDecimal FCASTRAW) {
        this.FCASTRAW = FCASTRAW;
    }
    
    public java.math.BigDecimal getFCASTRAW() {
        return this.FCASTRAW;
    }
      

    private java.math.BigDecimal FCASTAMENDED;
    
    public void setFCASTAMENDED(java.math.BigDecimal FCASTAMENDED) {
        this.FCASTAMENDED = FCASTAMENDED;
    }
    
    public java.math.BigDecimal getFCASTAMENDED() {
        return this.FCASTAMENDED;
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
        result.append("VKORG: " + getVKORG() + "||");
        result.append("VTWEG: " + getVTWEG() + "||");
        result.append("ZZCMA: " + getZZCMA() + "||");
        result.append("MATNR: " + getMATNR() + "||");
        result.append("FCASTWEEK: " + getFCASTWEEK() + "||");
        result.append("FCASTRECVDDATE: " + getFCASTRECVDDATE() + "||");
        result.append("FCASTRAW: " + getFCASTRAW() + "||");
        result.append("FCASTAMENDED: " + getFCASTAMENDED() + "||");
        result.append("UPDATED_FLAG: " + getUPDATED_FLAG() + "||");
        return result.toString();
    }
    
}