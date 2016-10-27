package com.avn.dataload.model;

public class FLOWDOMAIN {


    private java.math.BigDecimal FLOWDOMAIN_ID;
    
    public void setFLOWDOMAIN_ID(java.math.BigDecimal FLOWDOMAIN_ID) {
        this.FLOWDOMAIN_ID = FLOWDOMAIN_ID;
    }
    
    public java.math.BigDecimal getFLOWDOMAIN_ID() {
        return this.FLOWDOMAIN_ID;
    }
      

    private java.lang.String IDENTIFIER;
    
    public void setIDENTIFIER(java.lang.String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
    
    public java.lang.String getIDENTIFIER() {
        return this.IDENTIFIER;
    }
      

    private java.math.BigDecimal PRIORITY;
    
    public void setPRIORITY(java.math.BigDecimal PRIORITY) {
        this.PRIORITY = PRIORITY;
    }
    
    public java.math.BigDecimal getPRIORITY() {
        return this.PRIORITY;
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
        result.append("FLOWDOMAIN_ID: " + getFLOWDOMAIN_ID() + "||");
        result.append("IDENTIFIER: " + getIDENTIFIER() + "||");
        result.append("PRIORITY: " + getPRIORITY() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}