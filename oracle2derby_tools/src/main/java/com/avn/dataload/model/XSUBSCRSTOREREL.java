package com.avn.dataload.model;

public class XSUBSCRSTOREREL {


    private java.math.BigDecimal SUBSCRIPTION_ID;
    
    public void setSUBSCRIPTION_ID(java.math.BigDecimal SUBSCRIPTION_ID) {
        this.SUBSCRIPTION_ID = SUBSCRIPTION_ID;
    }
    
    public java.math.BigDecimal getSUBSCRIPTION_ID() {
        return this.SUBSCRIPTION_ID;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
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
        result.append("SUBSCRIPTION_ID: " + getSUBSCRIPTION_ID() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}