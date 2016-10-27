package com.avn.dataload.model;

public class PX_CDSPEC {


    private java.math.BigDecimal PX_PROMOTION_ID;
    
    public void setPX_PROMOTION_ID(java.math.BigDecimal PX_PROMOTION_ID) {
        this.PX_PROMOTION_ID = PX_PROMOTION_ID;
    }
    
    public java.math.BigDecimal getPX_PROMOTION_ID() {
        return this.PX_PROMOTION_ID;
    }
      

    private java.math.BigDecimal CODETYPE;
    
    public void setCODETYPE(java.math.BigDecimal CODETYPE) {
        this.CODETYPE = CODETYPE;
    }
    
    public java.math.BigDecimal getCODETYPE() {
        return this.CODETYPE;
    }
      

    private java.lang.String PATTERN;
    
    public void setPATTERN(java.lang.String PATTERN) {
        this.PATTERN = PATTERN;
    }
    
    public java.lang.String getPATTERN() {
        return this.PATTERN;
    }
      

    private java.math.BigDecimal COUNT;
    
    public void setCOUNT(java.math.BigDecimal COUNT) {
        this.COUNT = COUNT;
    }
    
    public java.math.BigDecimal getCOUNT() {
        return this.COUNT;
    }
      

    private java.math.BigDecimal CODESTATUS;
    
    public void setCODESTATUS(java.math.BigDecimal CODESTATUS) {
        this.CODESTATUS = CODESTATUS;
    }
    
    public java.math.BigDecimal getCODESTATUS() {
        return this.CODESTATUS;
    }
      

    private java.math.BigDecimal TRANSFERABLE;
    
    public void setTRANSFERABLE(java.math.BigDecimal TRANSFERABLE) {
        this.TRANSFERABLE = TRANSFERABLE;
    }
    
    public java.math.BigDecimal getTRANSFERABLE() {
        return this.TRANSFERABLE;
    }
      

    private java.sql.Timestamp VALIDFROM;
    
    public void setVALIDFROM(java.sql.Timestamp VALIDFROM) {
        this.VALIDFROM = VALIDFROM;
    }
    
    public java.sql.Timestamp getVALIDFROM() {
        return this.VALIDFROM;
    }
      

    private java.sql.Timestamp VALIDUNTIL;
    
    public void setVALIDUNTIL(java.sql.Timestamp VALIDUNTIL) {
        this.VALIDUNTIL = VALIDUNTIL;
    }
    
    public java.sql.Timestamp getVALIDUNTIL() {
        return this.VALIDUNTIL;
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
        result.append("PX_PROMOTION_ID: " + getPX_PROMOTION_ID() + "||");
        result.append("CODETYPE: " + getCODETYPE() + "||");
        result.append("PATTERN: " + getPATTERN() + "||");
        result.append("COUNT: " + getCOUNT() + "||");
        result.append("CODESTATUS: " + getCODESTATUS() + "||");
        result.append("TRANSFERABLE: " + getTRANSFERABLE() + "||");
        result.append("VALIDFROM: " + getVALIDFROM() + "||");
        result.append("VALIDUNTIL: " + getVALIDUNTIL() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}