package com.avn.dataload.model;

public class PLWIDGETSLOT {


    private java.math.BigDecimal PLWIDGETSLOT_ID;
    
    public void setPLWIDGETSLOT_ID(java.math.BigDecimal PLWIDGETSLOT_ID) {
        this.PLWIDGETSLOT_ID = PLWIDGETSLOT_ID;
    }
    
    public java.math.BigDecimal getPLWIDGETSLOT_ID() {
        return this.PLWIDGETSLOT_ID;
    }
      

    private java.math.BigDecimal PAGELAYOUT_ID;
    
    public void setPAGELAYOUT_ID(java.math.BigDecimal PAGELAYOUT_ID) {
        this.PAGELAYOUT_ID = PAGELAYOUT_ID;
    }
    
    public java.math.BigDecimal getPAGELAYOUT_ID() {
        return this.PAGELAYOUT_ID;
    }
      

    private java.math.BigDecimal PLWIDGET_ID;
    
    public void setPLWIDGET_ID(java.math.BigDecimal PLWIDGET_ID) {
        this.PLWIDGET_ID = PLWIDGET_ID;
    }
    
    public java.math.BigDecimal getPLWIDGET_ID() {
        return this.PLWIDGET_ID;
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
      

    private java.math.BigDecimal SLOTTYPE;
    
    public void setSLOTTYPE(java.math.BigDecimal SLOTTYPE) {
        this.SLOTTYPE = SLOTTYPE;
    }
    
    public java.math.BigDecimal getSLOTTYPE() {
        return this.SLOTTYPE;
    }
      

    private java.lang.String PROPERTIES;
    
    public void setPROPERTIES(java.lang.String PROPERTIES) {
        this.PROPERTIES = PROPERTIES;
    }
    
    public java.lang.String getPROPERTIES() {
        return this.PROPERTIES;
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
        result.append("PLWIDGETSLOT_ID: " + getPLWIDGETSLOT_ID() + "||");
        result.append("PAGELAYOUT_ID: " + getPAGELAYOUT_ID() + "||");
        result.append("PLWIDGET_ID: " + getPLWIDGET_ID() + "||");
        result.append("ADMINNAME: " + getADMINNAME() + "||");
        result.append("SLOTID: " + getSLOTID() + "||");
        result.append("SLOTTYPE: " + getSLOTTYPE() + "||");
        result.append("PROPERTIES: " + getPROPERTIES() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}