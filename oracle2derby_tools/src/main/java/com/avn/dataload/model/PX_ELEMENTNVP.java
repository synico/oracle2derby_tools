package com.avn.dataload.model;

public class PX_ELEMENTNVP {


    private java.math.BigDecimal PX_ELEMENTNVP_ID;
    
    public void setPX_ELEMENTNVP_ID(java.math.BigDecimal PX_ELEMENTNVP_ID) {
        this.PX_ELEMENTNVP_ID = PX_ELEMENTNVP_ID;
    }
    
    public java.math.BigDecimal getPX_ELEMENTNVP_ID() {
        return this.PX_ELEMENTNVP_ID;
    }
      

    private java.math.BigDecimal PX_ELEMENT_ID;
    
    public void setPX_ELEMENT_ID(java.math.BigDecimal PX_ELEMENT_ID) {
        this.PX_ELEMENT_ID = PX_ELEMENT_ID;
    }
    
    public java.math.BigDecimal getPX_ELEMENT_ID() {
        return this.PX_ELEMENT_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String VALUE;
    
    public void setVALUE(java.lang.String VALUE) {
        this.VALUE = VALUE;
    }
    
    public java.lang.String getVALUE() {
        return this.VALUE;
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
        result.append("PX_ELEMENTNVP_ID: " + getPX_ELEMENTNVP_ID() + "||");
        result.append("PX_ELEMENT_ID: " + getPX_ELEMENT_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("VALUE: " + getVALUE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}