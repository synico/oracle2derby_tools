package com.avn.dataload.model;

public class PLWIDGET {


    private java.math.BigDecimal PLWIDGET_ID;
    
    public void setPLWIDGET_ID(java.math.BigDecimal PLWIDGET_ID) {
        this.PLWIDGET_ID = PLWIDGET_ID;
    }
    
    public java.math.BigDecimal getPLWIDGET_ID() {
        return this.PLWIDGET_ID;
    }
      

    private java.math.BigDecimal PAGELAYOUT_ID;
    
    public void setPAGELAYOUT_ID(java.math.BigDecimal PAGELAYOUT_ID) {
        this.PAGELAYOUT_ID = PAGELAYOUT_ID;
    }
    
    public java.math.BigDecimal getPAGELAYOUT_ID() {
        return this.PAGELAYOUT_ID;
    }
      

    private java.math.BigDecimal PLWIDGETDEF_ID;
    
    public void setPLWIDGETDEF_ID(java.math.BigDecimal PLWIDGETDEF_ID) {
        this.PLWIDGETDEF_ID = PLWIDGETDEF_ID;
    }
    
    public java.math.BigDecimal getPLWIDGETDEF_ID() {
        return this.PLWIDGETDEF_ID;
    }
      

    private java.lang.String ADMINNAME;
    
    public void setADMINNAME(java.lang.String ADMINNAME) {
        this.ADMINNAME = ADMINNAME;
    }
    
    public java.lang.String getADMINNAME() {
        return this.ADMINNAME;
    }
      

    private java.lang.String SLOTID;
    
    public void setSLOTID(java.lang.String SLOTID) {
        this.SLOTID = SLOTID;
    }
    
    public java.lang.String getSLOTID() {
        return this.SLOTID;
    }
      

    private java.math.BigDecimal FIELD1;
    
    public void setFIELD1(java.math.BigDecimal FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.math.BigDecimal getFIELD1() {
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
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("PLWIDGET_ID: " + getPLWIDGET_ID() + "||");
        result.append("PAGELAYOUT_ID: " + getPAGELAYOUT_ID() + "||");
        result.append("PLWIDGETDEF_ID: " + getPLWIDGETDEF_ID() + "||");
        result.append("ADMINNAME: " + getADMINNAME() + "||");
        result.append("SLOTID: " + getSLOTID() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}