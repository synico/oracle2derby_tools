package com.avn.dataload.model;

public class X_SAP_SALESDOC_ITEM {


    private java.lang.String VBAK_VBELN;
    
    public void setVBAK_VBELN(java.lang.String VBAK_VBELN) {
        this.VBAK_VBELN = VBAK_VBELN;
    }
    
    public java.lang.String getVBAK_VBELN() {
        return this.VBAK_VBELN;
    }
      

    private java.lang.String VBAP_POSNR;
    
    public void setVBAP_POSNR(java.lang.String VBAP_POSNR) {
        this.VBAP_POSNR = VBAP_POSNR;
    }
    
    public java.lang.String getVBAP_POSNR() {
        return this.VBAP_POSNR;
    }
      

    private java.lang.String VBAP_PSTYV;
    
    public void setVBAP_PSTYV(java.lang.String VBAP_PSTYV) {
        this.VBAP_PSTYV = VBAP_PSTYV;
    }
    
    public java.lang.String getVBAP_PSTYV() {
        return this.VBAP_PSTYV;
    }
      

    private java.lang.String VBAP_WERKS;
    
    public void setVBAP_WERKS(java.lang.String VBAP_WERKS) {
        this.VBAP_WERKS = VBAP_WERKS;
    }
    
    public java.lang.String getVBAP_WERKS() {
        return this.VBAP_WERKS;
    }
      

    private java.lang.String VBAP_KDMAT;
    
    public void setVBAP_KDMAT(java.lang.String VBAP_KDMAT) {
        this.VBAP_KDMAT = VBAP_KDMAT;
    }
    
    public java.lang.String getVBAP_KDMAT() {
        return this.VBAP_KDMAT;
    }
      

    private java.lang.String VBAP_MATNR;
    
    public void setVBAP_MATNR(java.lang.String VBAP_MATNR) {
        this.VBAP_MATNR = VBAP_MATNR;
    }
    
    public java.lang.String getVBAP_MATNR() {
        return this.VBAP_MATNR;
    }
      

    private java.math.BigDecimal VBAP_KWMENG;
    
    public void setVBAP_KWMENG(java.math.BigDecimal VBAP_KWMENG) {
        this.VBAP_KWMENG = VBAP_KWMENG;
    }
    
    public java.math.BigDecimal getVBAP_KWMENG() {
        return this.VBAP_KWMENG;
    }
      

    private java.lang.String VBSTT_ABSTA_BEZ;
    
    public void setVBSTT_ABSTA_BEZ(java.lang.String VBSTT_ABSTA_BEZ) {
        this.VBSTT_ABSTA_BEZ = VBSTT_ABSTA_BEZ;
    }
    
    public java.lang.String getVBSTT_ABSTA_BEZ() {
        return this.VBSTT_ABSTA_BEZ;
    }
      

    private java.lang.String MARA_MFRNR;
    
    public void setMARA_MFRNR(java.lang.String MARA_MFRNR) {
        this.MARA_MFRNR = MARA_MFRNR;
    }
    
    public java.lang.String getMARA_MFRNR() {
        return this.MARA_MFRNR;
    }
      

    private java.sql.Timestamp ZZ_DATWSTA;
    
    public void setZZ_DATWSTA(java.sql.Timestamp ZZ_DATWSTA) {
        this.ZZ_DATWSTA = ZZ_DATWSTA;
    }
    
    public java.sql.Timestamp getZZ_DATWSTA() {
        return this.ZZ_DATWSTA;
    }
      

    private java.math.BigDecimal LIPSD_G_LFIMG;
    
    public void setLIPSD_G_LFIMG(java.math.BigDecimal LIPSD_G_LFIMG) {
        this.LIPSD_G_LFIMG = LIPSD_G_LFIMG;
    }
    
    public java.math.BigDecimal getLIPSD_G_LFIMG() {
        return this.LIPSD_G_LFIMG;
    }
      

    private java.lang.String VBAP_ZZ_CBLK;
    
    public void setVBAP_ZZ_CBLK(java.lang.String VBAP_ZZ_CBLK) {
        this.VBAP_ZZ_CBLK = VBAP_ZZ_CBLK;
    }
    
    public java.lang.String getVBAP_ZZ_CBLK() {
        return this.VBAP_ZZ_CBLK;
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
        result.append("VBAP_POSNR: " + getVBAP_POSNR() + "||");
        result.append("VBAP_PSTYV: " + getVBAP_PSTYV() + "||");
        result.append("VBAP_WERKS: " + getVBAP_WERKS() + "||");
        result.append("VBAP_KDMAT: " + getVBAP_KDMAT() + "||");
        result.append("VBAP_MATNR: " + getVBAP_MATNR() + "||");
        result.append("VBAP_KWMENG: " + getVBAP_KWMENG() + "||");
        result.append("VBSTT_ABSTA_BEZ: " + getVBSTT_ABSTA_BEZ() + "||");
        result.append("MARA_MFRNR: " + getMARA_MFRNR() + "||");
        result.append("ZZ_DATWSTA: " + getZZ_DATWSTA() + "||");
        result.append("LIPSD_G_LFIMG: " + getLIPSD_G_LFIMG() + "||");
        result.append("VBAP_ZZ_CBLK: " + getVBAP_ZZ_CBLK() + "||");
        result.append("UPDATED_FLAG: " + getUPDATED_FLAG() + "||");
        return result.toString();
    }
    
}