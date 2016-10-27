package com.avn.dataload.model;

public class EMLPOLICY {


    private java.math.BigDecimal EMLPOLICY_ID;
    
    public void setEMLPOLICY_ID(java.math.BigDecimal EMLPOLICY_ID) {
        this.EMLPOLICY_ID = EMLPOLICY_ID;
    }
    
    public java.math.BigDecimal getEMLPOLICY_ID() {
        return this.EMLPOLICY_ID;
    }
      

    private java.math.BigDecimal NUMRETRIES;
    
    public void setNUMRETRIES(java.math.BigDecimal NUMRETRIES) {
        this.NUMRETRIES = NUMRETRIES;
    }
    
    public java.math.BigDecimal getNUMRETRIES() {
        return this.NUMRETRIES;
    }
      

    private java.math.BigDecimal INTERVAL;
    
    public void setINTERVAL(java.math.BigDecimal INTERVAL) {
        this.INTERVAL = INTERVAL;
    }
    
    public java.math.BigDecimal getINTERVAL() {
        return this.INTERVAL;
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
        result.append("EMLPOLICY_ID: " + getEMLPOLICY_ID() + "||");
        result.append("NUMRETRIES: " + getNUMRETRIES() + "||");
        result.append("INTERVAL: " + getINTERVAL() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}