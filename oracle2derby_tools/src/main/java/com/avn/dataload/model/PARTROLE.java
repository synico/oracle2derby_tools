package com.avn.dataload.model;

public class PARTROLE {


    private java.math.BigDecimal PARTROLE_ID;
    
    public void setPARTROLE_ID(java.math.BigDecimal PARTROLE_ID) {
        this.PARTROLE_ID = PARTROLE_ID;
    }
    
    public java.math.BigDecimal getPARTROLE_ID() {
        return this.PARTROLE_ID;
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
        result.append("PARTROLE_ID: " + getPARTROLE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}