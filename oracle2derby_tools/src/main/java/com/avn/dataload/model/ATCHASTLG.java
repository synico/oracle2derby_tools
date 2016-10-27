package com.avn.dataload.model;

public class ATCHASTLG {


    private java.math.BigDecimal ATCHASTLG_ID;
    
    public void setATCHASTLG_ID(java.math.BigDecimal ATCHASTLG_ID) {
        this.ATCHASTLG_ID = ATCHASTLG_ID;
    }
    
    public java.math.BigDecimal getATCHASTLG_ID() {
        return this.ATCHASTLG_ID;
    }
      

    private java.math.BigDecimal ATCHAST_ID;
    
    public void setATCHAST_ID(java.math.BigDecimal ATCHAST_ID) {
        this.ATCHAST_ID = ATCHAST_ID;
    }
    
    public java.math.BigDecimal getATCHAST_ID() {
        return this.ATCHAST_ID;
    }
      

    private java.math.BigDecimal LANGUAGE_ID;
    
    public void setLANGUAGE_ID(java.math.BigDecimal LANGUAGE_ID) {
        this.LANGUAGE_ID = LANGUAGE_ID;
    }
    
    public java.math.BigDecimal getLANGUAGE_ID() {
        return this.LANGUAGE_ID;
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
        result.append("ATCHASTLG_ID: " + getATCHASTLG_ID() + "||");
        result.append("ATCHAST_ID: " + getATCHAST_ID() + "||");
        result.append("LANGUAGE_ID: " + getLANGUAGE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}