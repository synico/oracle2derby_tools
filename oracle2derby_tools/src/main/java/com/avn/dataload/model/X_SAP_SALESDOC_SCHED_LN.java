package com.avn.dataload.model;

public class X_SAP_SALESDOC_SCHED_LN {


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
      

    private java.lang.String VBEP_ETENR;
    
    public void setVBEP_ETENR(java.lang.String VBEP_ETENR) {
        this.VBEP_ETENR = VBEP_ETENR;
    }
    
    public java.lang.String getVBEP_ETENR() {
        return this.VBEP_ETENR;
    }
      

    private java.sql.Timestamp REQ_DATE;
    
    public void setREQ_DATE(java.sql.Timestamp REQ_DATE) {
        this.REQ_DATE = REQ_DATE;
    }
    
    public java.sql.Timestamp getREQ_DATE() {
        return this.REQ_DATE;
    }
      

    private java.sql.Timestamp ATP_DATE;
    
    public void setATP_DATE(java.sql.Timestamp ATP_DATE) {
        this.ATP_DATE = ATP_DATE;
    }
    
    public java.sql.Timestamp getATP_DATE() {
        return this.ATP_DATE;
    }
      

    private java.math.BigDecimal VBEP_WMENG;
    
    public void setVBEP_WMENG(java.math.BigDecimal VBEP_WMENG) {
        this.VBEP_WMENG = VBEP_WMENG;
    }
    
    public java.math.BigDecimal getVBEP_WMENG() {
        return this.VBEP_WMENG;
    }
      

    private java.math.BigDecimal VBEP_BMENG;
    
    public void setVBEP_BMENG(java.math.BigDecimal VBEP_BMENG) {
        this.VBEP_BMENG = VBEP_BMENG;
    }
    
    public java.math.BigDecimal getVBEP_BMENG() {
        return this.VBEP_BMENG;
    }
      

    private java.math.BigDecimal U_ATP_QTY;
    
    public void setU_ATP_QTY(java.math.BigDecimal U_ATP_QTY) {
        this.U_ATP_QTY = U_ATP_QTY;
    }
    
    public java.math.BigDecimal getU_ATP_QTY() {
        return this.U_ATP_QTY;
    }
      

    private java.math.BigDecimal U_UNSHIPPED_QTY;
    
    public void setU_UNSHIPPED_QTY(java.math.BigDecimal U_UNSHIPPED_QTY) {
        this.U_UNSHIPPED_QTY = U_UNSHIPPED_QTY;
    }
    
    public java.math.BigDecimal getU_UNSHIPPED_QTY() {
        return this.U_UNSHIPPED_QTY;
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
        result.append("VBEP_ETENR: " + getVBEP_ETENR() + "||");
        result.append("REQ_DATE: " + getREQ_DATE() + "||");
        result.append("ATP_DATE: " + getATP_DATE() + "||");
        result.append("VBEP_WMENG: " + getVBEP_WMENG() + "||");
        result.append("VBEP_BMENG: " + getVBEP_BMENG() + "||");
        result.append("U_ATP_QTY: " + getU_ATP_QTY() + "||");
        result.append("U_UNSHIPPED_QTY: " + getU_UNSHIPPED_QTY() + "||");
        result.append("UPDATED_FLAG: " + getUPDATED_FLAG() + "||");
        return result.toString();
    }
    
}