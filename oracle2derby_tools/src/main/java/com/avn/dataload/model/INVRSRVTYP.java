package com.avn.dataload.model;

public class INVRSRVTYP {


    private java.math.BigDecimal INVRSRVTYP_ID;
    
    public void setINVRSRVTYP_ID(java.math.BigDecimal INVRSRVTYP_ID) {
        this.INVRSRVTYP_ID = INVRSRVTYP_ID;
    }
    
    public java.math.BigDecimal getINVRSRVTYP_ID() {
        return this.INVRSRVTYP_ID;
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
        result.append("INVRSRVTYP_ID: " + getINVRSRVTYP_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}