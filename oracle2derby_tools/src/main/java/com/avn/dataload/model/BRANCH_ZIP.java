package com.avn.dataload.model;

public class BRANCH_ZIP {


    private java.math.BigDecimal BRANCH_ZIP_ID;
    
    public void setBRANCH_ZIP_ID(java.math.BigDecimal BRANCH_ZIP_ID) {
        this.BRANCH_ZIP_ID = BRANCH_ZIP_ID;
    }
    
    public java.math.BigDecimal getBRANCH_ZIP_ID() {
        return this.BRANCH_ZIP_ID;
    }
      

    private java.lang.String BRANCH_ID;
    
    public void setBRANCH_ID(java.lang.String BRANCH_ID) {
        this.BRANCH_ID = BRANCH_ID;
    }
    
    public java.lang.String getBRANCH_ID() {
        return this.BRANCH_ID;
    }
      

    private java.lang.String COUNTRY_CD;
    
    public void setCOUNTRY_CD(java.lang.String COUNTRY_CD) {
        this.COUNTRY_CD = COUNTRY_CD;
    }
    
    public java.lang.String getCOUNTRY_CD() {
        return this.COUNTRY_CD;
    }
      

    private java.lang.String LOW_POSTAL_CD;
    
    public void setLOW_POSTAL_CD(java.lang.String LOW_POSTAL_CD) {
        this.LOW_POSTAL_CD = LOW_POSTAL_CD;
    }
    
    public java.lang.String getLOW_POSTAL_CD() {
        return this.LOW_POSTAL_CD;
    }
      

    private java.lang.String HIGH_POSTAL_CD;
    
    public void setHIGH_POSTAL_CD(java.lang.String HIGH_POSTAL_CD) {
        this.HIGH_POSTAL_CD = HIGH_POSTAL_CD;
    }
    
    public java.lang.String getHIGH_POSTAL_CD() {
        return this.HIGH_POSTAL_CD;
    }
      

    private java.lang.String DISPLAY_FL;
    
    public void setDISPLAY_FL(java.lang.String DISPLAY_FL) {
        this.DISPLAY_FL = DISPLAY_FL;
    }
    
    public java.lang.String getDISPLAY_FL() {
        return this.DISPLAY_FL;
    }
      

    private java.lang.String SALES_ORG;
    
    public void setSALES_ORG(java.lang.String SALES_ORG) {
        this.SALES_ORG = SALES_ORG;
    }
    
    public java.lang.String getSALES_ORG() {
        return this.SALES_ORG;
    }
      

    private java.lang.String SALES_OFFICE;
    
    public void setSALES_OFFICE(java.lang.String SALES_OFFICE) {
        this.SALES_OFFICE = SALES_OFFICE;
    }
    
    public java.lang.String getSALES_OFFICE() {
        return this.SALES_OFFICE;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("BRANCH_ZIP_ID: " + getBRANCH_ZIP_ID() + "||");
        result.append("BRANCH_ID: " + getBRANCH_ID() + "||");
        result.append("COUNTRY_CD: " + getCOUNTRY_CD() + "||");
        result.append("LOW_POSTAL_CD: " + getLOW_POSTAL_CD() + "||");
        result.append("HIGH_POSTAL_CD: " + getHIGH_POSTAL_CD() + "||");
        result.append("DISPLAY_FL: " + getDISPLAY_FL() + "||");
        result.append("SALES_ORG: " + getSALES_ORG() + "||");
        result.append("SALES_OFFICE: " + getSALES_OFFICE() + "||");
        return result.toString();
    }
    
}