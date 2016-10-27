package com.avn.dataload.model;

public class STGMERTAB {


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
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.lang.String UPDATABLE_UK_COL;
    
    public void setUPDATABLE_UK_COL(java.lang.String UPDATABLE_UK_COL) {
        this.UPDATABLE_UK_COL = UPDATABLE_UK_COL;
    }
    
    public java.lang.String getUPDATABLE_UK_COL() {
        return this.UPDATABLE_UK_COL;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("TABNBR: " + getTABNBR() + "||");
        result.append("TABNAME: " + getTABNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("UPDATABLE_UK_COL: " + getUPDATABLE_UK_COL() + "||");
        return result.toString();
    }
    
}