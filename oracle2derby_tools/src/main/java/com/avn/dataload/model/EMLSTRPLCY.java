package com.avn.dataload.model;

public class EMLSTRPLCY {


    private java.math.BigDecimal EMLPOLICY_ID;
    
    public void setEMLPOLICY_ID(java.math.BigDecimal EMLPOLICY_ID) {
        this.EMLPOLICY_ID = EMLPOLICY_ID;
    }
    
    public java.math.BigDecimal getEMLPOLICY_ID() {
        return this.EMLPOLICY_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
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
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}