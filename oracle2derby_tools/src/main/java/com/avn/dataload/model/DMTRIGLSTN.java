package com.avn.dataload.model;

public class DMTRIGLSTN {


    private java.math.BigDecimal DMELEMENT_ID;
    
    public void setDMELEMENT_ID(java.math.BigDecimal DMELEMENT_ID) {
        this.DMELEMENT_ID = DMELEMENT_ID;
    }
    
    public java.math.BigDecimal getDMELEMENT_ID() {
        return this.DMELEMENT_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal DMACTIVITY_ID;
    
    public void setDMACTIVITY_ID(java.math.BigDecimal DMACTIVITY_ID) {
        this.DMACTIVITY_ID = DMACTIVITY_ID;
    }
    
    public java.math.BigDecimal getDMACTIVITY_ID() {
        return this.DMACTIVITY_ID;
    }
      

    private java.math.BigDecimal ALLUSERS;
    
    public void setALLUSERS(java.math.BigDecimal ALLUSERS) {
        this.ALLUSERS = ALLUSERS;
    }
    
    public java.math.BigDecimal getALLUSERS() {
        return this.ALLUSERS;
    }
      

    private java.math.BigDecimal FIELD1;
    
    public void setFIELD1(java.math.BigDecimal FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.math.BigDecimal getFIELD1() {
        return this.FIELD1;
    }
      

    private java.math.BigDecimal FIELD2;
    
    public void setFIELD2(java.math.BigDecimal FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.math.BigDecimal getFIELD2() {
        return this.FIELD2;
    }
      

    private java.math.BigDecimal FIELD3;
    
    public void setFIELD3(java.math.BigDecimal FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.math.BigDecimal getFIELD3() {
        return this.FIELD3;
    }
      

    private java.lang.String FIELD4;
    
    public void setFIELD4(java.lang.String FIELD4) {
        this.FIELD4 = FIELD4;
    }
    
    public java.lang.String getFIELD4() {
        return this.FIELD4;
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
        result.append("DMELEMENT_ID: " + getDMELEMENT_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("DMACTIVITY_ID: " + getDMACTIVITY_ID() + "||");
        result.append("ALLUSERS: " + getALLUSERS() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("FIELD4: " + getFIELD4() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}