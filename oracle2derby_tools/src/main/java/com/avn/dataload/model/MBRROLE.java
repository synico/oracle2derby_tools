package com.avn.dataload.model;

public class MBRROLE {


    private java.math.BigDecimal MEMBER_ID;
    
    public void setMEMBER_ID(java.math.BigDecimal MEMBER_ID) {
        this.MEMBER_ID = MEMBER_ID;
    }
    
    public java.math.BigDecimal getMEMBER_ID() {
        return this.MEMBER_ID;
    }
      

    private java.math.BigDecimal ROLE_ID;
    
    public void setROLE_ID(java.math.BigDecimal ROLE_ID) {
        this.ROLE_ID = ROLE_ID;
    }
    
    public java.math.BigDecimal getROLE_ID() {
        return this.ROLE_ID;
    }
      

    private java.math.BigDecimal ORGENTITY_ID;
    
    public void setORGENTITY_ID(java.math.BigDecimal ORGENTITY_ID) {
        this.ORGENTITY_ID = ORGENTITY_ID;
    }
    
    public java.math.BigDecimal getORGENTITY_ID() {
        return this.ORGENTITY_ID;
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
        result.append("MEMBER_ID: " + getMEMBER_ID() + "||");
        result.append("ROLE_ID: " + getROLE_ID() + "||");
        result.append("ORGENTITY_ID: " + getORGENTITY_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}