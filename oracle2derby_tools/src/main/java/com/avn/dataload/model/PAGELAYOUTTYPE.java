package com.avn.dataload.model;

public class PAGELAYOUTTYPE {


    private java.lang.String PAGELAYOUTTYPE_ID;
    
    public void setPAGELAYOUTTYPE_ID(java.lang.String PAGELAYOUTTYPE_ID) {
        this.PAGELAYOUTTYPE_ID = PAGELAYOUTTYPE_ID;
    }
    
    public java.lang.String getPAGELAYOUTTYPE_ID() {
        return this.PAGELAYOUTTYPE_ID;
    }
      

    private java.math.BigDecimal ISSTATIC;
    
    public void setISSTATIC(java.math.BigDecimal ISSTATIC) {
        this.ISSTATIC = ISSTATIC;
    }
    
    public java.math.BigDecimal getISSTATIC() {
        return this.ISSTATIC;
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
        result.append("PAGELAYOUTTYPE_ID: " + getPAGELAYOUTTYPE_ID() + "||");
        result.append("ISSTATIC: " + getISSTATIC() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}