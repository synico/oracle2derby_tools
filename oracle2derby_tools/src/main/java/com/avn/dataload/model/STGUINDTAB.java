package com.avn.dataload.model;

public class STGUINDTAB {


    private java.lang.String TABNAME;
    
    public void setTABNAME(java.lang.String TABNAME) {
        this.TABNAME = TABNAME;
    }
    
    public java.lang.String getTABNAME() {
        return this.TABNAME;
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
        result.append("TABNAME: " + getTABNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}