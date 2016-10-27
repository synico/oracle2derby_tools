package com.avn.dataload.model;

public class REFKEYS {


    private java.lang.String TABLENAME;
    
    public void setTABLENAME(java.lang.String TABLENAME) {
        this.TABLENAME = TABLENAME;
    }
    
    public java.lang.String getTABLENAME() {
        return this.TABLENAME;
    }
      

    private java.lang.String FKTABLE_NAME;
    
    public void setFKTABLE_NAME(java.lang.String FKTABLE_NAME) {
        this.FKTABLE_NAME = FKTABLE_NAME;
    }
    
    public java.lang.String getFKTABLE_NAME() {
        return this.FKTABLE_NAME;
    }
      

    private java.lang.String FKCOLUMN_NAME;
    
    public void setFKCOLUMN_NAME(java.lang.String FKCOLUMN_NAME) {
        this.FKCOLUMN_NAME = FKCOLUMN_NAME;
    }
    
    public java.lang.String getFKCOLUMN_NAME() {
        return this.FKCOLUMN_NAME;
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
        result.append("TABLENAME: " + getTABLENAME() + "||");
        result.append("FKTABLE_NAME: " + getFKTABLE_NAME() + "||");
        result.append("FKCOLUMN_NAME: " + getFKCOLUMN_NAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}