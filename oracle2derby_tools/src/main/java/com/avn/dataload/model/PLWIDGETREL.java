package com.avn.dataload.model;

public class PLWIDGETREL {


    private java.math.BigDecimal PLWIDGET_ID_PARENT;
    
    public void setPLWIDGET_ID_PARENT(java.math.BigDecimal PLWIDGET_ID_PARENT) {
        this.PLWIDGET_ID_PARENT = PLWIDGET_ID_PARENT;
    }
    
    public java.math.BigDecimal getPLWIDGET_ID_PARENT() {
        return this.PLWIDGET_ID_PARENT;
    }
      

    private java.math.BigDecimal PLWIDGET_ID_CHILD;
    
    public void setPLWIDGET_ID_CHILD(java.math.BigDecimal PLWIDGET_ID_CHILD) {
        this.PLWIDGET_ID_CHILD = PLWIDGET_ID_CHILD;
    }
    
    public java.math.BigDecimal getPLWIDGET_ID_CHILD() {
        return this.PLWIDGET_ID_CHILD;
    }
      

    private java.math.BigDecimal SEQUENCE;
    
    public void setSEQUENCE(java.math.BigDecimal SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }
    
    public java.math.BigDecimal getSEQUENCE() {
        return this.SEQUENCE;
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
        result.append("PLWIDGET_ID_PARENT: " + getPLWIDGET_ID_PARENT() + "||");
        result.append("PLWIDGET_ID_CHILD: " + getPLWIDGET_ID_CHILD() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}