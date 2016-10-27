package com.avn.dataload.model;

public class PLTEMPLATEREL {


    private java.math.BigDecimal PAGELAYOUT_ID;
    
    public void setPAGELAYOUT_ID(java.math.BigDecimal PAGELAYOUT_ID) {
        this.PAGELAYOUT_ID = PAGELAYOUT_ID;
    }
    
    public java.math.BigDecimal getPAGELAYOUT_ID() {
        return this.PAGELAYOUT_ID;
    }
      

    private java.math.BigDecimal TEMPLATE_ID;
    
    public void setTEMPLATE_ID(java.math.BigDecimal TEMPLATE_ID) {
        this.TEMPLATE_ID = TEMPLATE_ID;
    }
    
    public java.math.BigDecimal getTEMPLATE_ID() {
        return this.TEMPLATE_ID;
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
        result.append("PAGELAYOUT_ID: " + getPAGELAYOUT_ID() + "||");
        result.append("TEMPLATE_ID: " + getTEMPLATE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}