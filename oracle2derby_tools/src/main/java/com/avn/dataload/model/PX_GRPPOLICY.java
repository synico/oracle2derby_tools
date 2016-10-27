package com.avn.dataload.model;

public class PX_GRPPOLICY {


    private java.math.BigDecimal PX_GROUP_ID;
    
    public void setPX_GROUP_ID(java.math.BigDecimal PX_GROUP_ID) {
        this.PX_GROUP_ID = PX_GROUP_ID;
    }
    
    public java.math.BigDecimal getPX_GROUP_ID() {
        return this.PX_GROUP_ID;
    }
      

    private java.math.BigDecimal PX_POLICY_ID;
    
    public void setPX_POLICY_ID(java.math.BigDecimal PX_POLICY_ID) {
        this.PX_POLICY_ID = PX_POLICY_ID;
    }
    
    public java.math.BigDecimal getPX_POLICY_ID() {
        return this.PX_POLICY_ID;
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
        result.append("PX_GROUP_ID: " + getPX_GROUP_ID() + "||");
        result.append("PX_POLICY_ID: " + getPX_POLICY_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}