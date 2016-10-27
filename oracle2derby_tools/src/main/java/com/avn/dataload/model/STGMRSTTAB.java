package com.avn.dataload.model;

public class STGMRSTTAB {


    private java.math.BigDecimal TABNBR;
    
    public void setTABNBR(java.math.BigDecimal TABNBR) {
        this.TABNBR = TABNBR;
    }
    
    public java.math.BigDecimal getTABNBR() {
        return this.TABNBR;
    }
      

    private java.lang.String TABNAME;
    
    public void setTABNAME(java.lang.String TABNAME) {
        this.TABNAME = TABNAME;
    }
    
    public java.lang.String getTABNAME() {
        return this.TABNAME;
    }
      

    private java.lang.String COLNAME;
    
    public void setCOLNAME(java.lang.String COLNAME) {
        this.COLNAME = COLNAME;
    }
    
    public java.lang.String getCOLNAME() {
        return this.COLNAME;
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
        result.append("TABNBR: " + getTABNBR() + "||");
        result.append("TABNAME: " + getTABNAME() + "||");
        result.append("COLNAME: " + getCOLNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}