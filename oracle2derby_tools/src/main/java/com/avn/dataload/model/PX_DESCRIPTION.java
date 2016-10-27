package com.avn.dataload.model;

public class PX_DESCRIPTION {


    private java.math.BigDecimal PX_PROMOTION_ID;
    
    public void setPX_PROMOTION_ID(java.math.BigDecimal PX_PROMOTION_ID) {
        this.PX_PROMOTION_ID = PX_PROMOTION_ID;
    }
    
    public java.math.BigDecimal getPX_PROMOTION_ID() {
        return this.PX_PROMOTION_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
    }
      

    private java.lang.String ADMINDESC;
    
    public void setADMINDESC(java.lang.String ADMINDESC) {
        this.ADMINDESC = ADMINDESC;
    }
    
    public java.lang.String getADMINDESC() {
        return this.ADMINDESC;
    }
      

    private java.lang.String SHORTDESC;
    
    public void setSHORTDESC(java.lang.String SHORTDESC) {
        this.SHORTDESC = SHORTDESC;
    }
    
    public java.lang.String getSHORTDESC() {
        return this.SHORTDESC;
    }
      

    private java.lang.String LONGDESC;
    
    public void setLONGDESC(java.lang.String LONGDESC) {
        this.LONGDESC = LONGDESC;
    }
    
    public java.lang.String getLONGDESC() {
        return this.LONGDESC;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String FIELD2;
    
    public void setFIELD2(java.lang.String FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.lang.String getFIELD2() {
        return this.FIELD2;
    }
      

    private java.lang.String FIELD3;
    
    public void setFIELD3(java.lang.String FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.lang.String getFIELD3() {
        return this.FIELD3;
    }
      

    private java.lang.String FIELD4;
    
    public void setFIELD4(java.lang.String FIELD4) {
        this.FIELD4 = FIELD4;
    }
    
    public java.lang.String getFIELD4() {
        return this.FIELD4;
    }
      

    private java.lang.String FIELD5;
    
    public void setFIELD5(java.lang.String FIELD5) {
        this.FIELD5 = FIELD5;
    }
    
    public java.lang.String getFIELD5() {
        return this.FIELD5;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("PX_PROMOTION_ID: " + getPX_PROMOTION_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("ADMINDESC: " + getADMINDESC() + "||");
        result.append("SHORTDESC: " + getSHORTDESC() + "||");
        result.append("LONGDESC: " + getLONGDESC() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("FIELD4: " + getFIELD4() + "||");
        result.append("FIELD5: " + getFIELD5() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}