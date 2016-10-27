package com.avn.dataload.model;

public class STOREGRP {


    private java.math.BigDecimal STOREGRP_ID;
    
    public void setSTOREGRP_ID(java.math.BigDecimal STOREGRP_ID) {
        this.STOREGRP_ID = STOREGRP_ID;
    }
    
    public java.math.BigDecimal getSTOREGRP_ID() {
        return this.STOREGRP_ID;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
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
        result.append("STOREGRP_ID: " + getSTOREGRP_ID() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}