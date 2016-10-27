package com.avn.dataload.model;

public class JURSTGPREL {


    private java.math.BigDecimal JURST_ID;
    
    public void setJURST_ID(java.math.BigDecimal JURST_ID) {
        this.JURST_ID = JURST_ID;
    }
    
    public java.math.BigDecimal getJURST_ID() {
        return this.JURST_ID;
    }
      

    private java.math.BigDecimal JURSTGROUP_ID;
    
    public void setJURSTGROUP_ID(java.math.BigDecimal JURSTGROUP_ID) {
        this.JURSTGROUP_ID = JURSTGROUP_ID;
    }
    
    public java.math.BigDecimal getJURSTGROUP_ID() {
        return this.JURSTGROUP_ID;
    }
      

    private java.math.BigDecimal SUBCLASS;
    
    public void setSUBCLASS(java.math.BigDecimal SUBCLASS) {
        this.SUBCLASS = SUBCLASS;
    }
    
    public java.math.BigDecimal getSUBCLASS() {
        return this.SUBCLASS;
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
        result.append("JURST_ID: " + getJURST_ID() + "||");
        result.append("JURSTGROUP_ID: " + getJURSTGROUP_ID() + "||");
        result.append("SUBCLASS: " + getSUBCLASS() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}