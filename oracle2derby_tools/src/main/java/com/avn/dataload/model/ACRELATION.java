package com.avn.dataload.model;

public class ACRELATION {


    private java.math.BigDecimal ACRELATION_ID;
    
    public void setACRELATION_ID(java.math.BigDecimal ACRELATION_ID) {
        this.ACRELATION_ID = ACRELATION_ID;
    }
    
    public java.math.BigDecimal getACRELATION_ID() {
        return this.ACRELATION_ID;
    }
      

    private java.lang.String RELATIONNAME;
    
    public void setRELATIONNAME(java.lang.String RELATIONNAME) {
        this.RELATIONNAME = RELATIONNAME;
    }
    
    public java.lang.String getRELATIONNAME() {
        return this.RELATIONNAME;
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
        result.append("ACRELATION_ID: " + getACRELATION_ID() + "||");
        result.append("RELATIONNAME: " + getRELATIONNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}