package com.avn.dataload.model;

public class XINVENTORY {


    private java.math.BigDecimal CATENTRY_ID;
    
    public void setCATENTRY_ID(java.math.BigDecimal CATENTRY_ID) {
        this.CATENTRY_ID = CATENTRY_ID;
    }
    
    public java.math.BigDecimal getCATENTRY_ID() {
        return this.CATENTRY_ID;
    }
      

    private java.math.BigDecimal FFMCENTER_ID;
    
    public void setFFMCENTER_ID(java.math.BigDecimal FFMCENTER_ID) {
        this.FFMCENTER_ID = FFMCENTER_ID;
    }
    
    public java.math.BigDecimal getFFMCENTER_ID() {
        return this.FFMCENTER_ID;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
    }
      

    private java.math.BigDecimal FACTORY_LEADTIME;
    
    public void setFACTORY_LEADTIME(java.math.BigDecimal FACTORY_LEADTIME) {
        this.FACTORY_LEADTIME = FACTORY_LEADTIME;
    }
    
    public java.math.BigDecimal getFACTORY_LEADTIME() {
        return this.FACTORY_LEADTIME;
    }
      

    private java.lang.String LEADTIME_UOM;
    
    public void setLEADTIME_UOM(java.lang.String LEADTIME_UOM) {
        this.LEADTIME_UOM = LEADTIME_UOM;
    }
    
    public java.lang.String getLEADTIME_UOM() {
        return this.LEADTIME_UOM;
    }
      

    private java.sql.Timestamp TIME_STAMP_UTC;
    
    public void setTIME_STAMP_UTC(java.sql.Timestamp TIME_STAMP_UTC) {
        this.TIME_STAMP_UTC = TIME_STAMP_UTC;
    }
    
    public java.sql.Timestamp getTIME_STAMP_UTC() {
        return this.TIME_STAMP_UTC;
    }
      

    private java.math.BigDecimal FACTORYQOH;
    
    public void setFACTORYQOH(java.math.BigDecimal FACTORYQOH) {
        this.FACTORYQOH = FACTORYQOH;
    }
    
    public java.math.BigDecimal getFACTORYQOH() {
        return this.FACTORYQOH;
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
      

    private java.lang.String FIELD6;
    
    public void setFIELD6(java.lang.String FIELD6) {
        this.FIELD6 = FIELD6;
    }
    
    public java.lang.String getFIELD6() {
        return this.FIELD6;
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
        result.append("CATENTRY_ID: " + getCATENTRY_ID() + "||");
        result.append("FFMCENTER_ID: " + getFFMCENTER_ID() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("FACTORY_LEADTIME: " + getFACTORY_LEADTIME() + "||");
        result.append("LEADTIME_UOM: " + getLEADTIME_UOM() + "||");
        result.append("TIME_STAMP_UTC: " + getTIME_STAMP_UTC() + "||");
        result.append("FACTORYQOH: " + getFACTORYQOH() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("FIELD4: " + getFIELD4() + "||");
        result.append("FIELD5: " + getFIELD5() + "||");
        result.append("FIELD6: " + getFIELD6() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}