package com.avn.dataload.model;

public class CMWORKSPACE {


    private java.lang.String WORKSPACE;
    
    public void setWORKSPACE(java.lang.String WORKSPACE) {
        this.WORKSPACE = WORKSPACE;
    }
    
    public java.lang.String getWORKSPACE() {
        return this.WORKSPACE;
    }
      

    private java.lang.String LOCKING_POLICY;
    
    public void setLOCKING_POLICY(java.lang.String LOCKING_POLICY) {
        this.LOCKING_POLICY = LOCKING_POLICY;
    }
    
    public java.lang.String getLOCKING_POLICY() {
        return this.LOCKING_POLICY;
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
        result.append("WORKSPACE: " + getWORKSPACE() + "||");
        result.append("LOCKING_POLICY: " + getLOCKING_POLICY() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}