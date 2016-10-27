package com.avn.dataload.model;

public class ATTACHUSG {


    private java.lang.String ATTACHUSG_ID;
    
    public void setATTACHUSG_ID(java.lang.String ATTACHUSG_ID) {
        this.ATTACHUSG_ID = ATTACHUSG_ID;
    }
    
    public java.lang.String getATTACHUSG_ID() {
        return this.ATTACHUSG_ID;
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
        result.append("ATTACHUSG_ID: " + getATTACHUSG_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}