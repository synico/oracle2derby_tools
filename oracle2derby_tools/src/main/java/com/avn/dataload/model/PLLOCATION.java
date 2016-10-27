package com.avn.dataload.model;

public class PLLOCATION {


    private java.math.BigDecimal PLLOCATION_ID;
    
    public void setPLLOCATION_ID(java.math.BigDecimal PLLOCATION_ID) {
        this.PLLOCATION_ID = PLLOCATION_ID;
    }
    
    public java.math.BigDecimal getPLLOCATION_ID() {
        return this.PLLOCATION_ID;
    }
      

    private java.math.BigDecimal PAGELAYOUT_ID;
    
    public void setPAGELAYOUT_ID(java.math.BigDecimal PAGELAYOUT_ID) {
        this.PAGELAYOUT_ID = PAGELAYOUT_ID;
    }
    
    public java.math.BigDecimal getPAGELAYOUT_ID() {
        return this.PAGELAYOUT_ID;
    }
      

    private java.math.BigDecimal DMACTIVITY_ID;
    
    public void setDMACTIVITY_ID(java.math.BigDecimal DMACTIVITY_ID) {
        this.DMACTIVITY_ID = DMACTIVITY_ID;
    }
    
    public java.math.BigDecimal getDMACTIVITY_ID() {
        return this.DMACTIVITY_ID;
    }
      

    private java.math.BigDecimal GROUPNUMBER;
    
    public void setGROUPNUMBER(java.math.BigDecimal GROUPNUMBER) {
        this.GROUPNUMBER = GROUPNUMBER;
    }
    
    public java.math.BigDecimal getGROUPNUMBER() {
        return this.GROUPNUMBER;
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
        result.append("PLLOCATION_ID: " + getPLLOCATION_ID() + "||");
        result.append("PAGELAYOUT_ID: " + getPAGELAYOUT_ID() + "||");
        result.append("DMACTIVITY_ID: " + getDMACTIVITY_ID() + "||");
        result.append("GROUPNUMBER: " + getGROUPNUMBER() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}