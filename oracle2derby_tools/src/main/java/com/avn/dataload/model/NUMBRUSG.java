package com.avn.dataload.model;

public class NUMBRUSG {


    private java.math.BigDecimal NUMBRUSG_ID;
    
    public void setNUMBRUSG_ID(java.math.BigDecimal NUMBRUSG_ID) {
        this.NUMBRUSG_ID = NUMBRUSG_ID;
    }
    
    public java.math.BigDecimal getNUMBRUSG_ID() {
        return this.NUMBRUSG_ID;
    }
      

    private java.lang.String CODE;
    
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }
    
    public java.lang.String getCODE() {
        return this.CODE;
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
        result.append("NUMBRUSG_ID: " + getNUMBRUSG_ID() + "||");
        result.append("CODE: " + getCODE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}