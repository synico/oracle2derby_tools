package com.avn.dataload.model;

public class EXPTYPE {


    private java.math.BigDecimal EXPTYPE_ID;
    
    public void setEXPTYPE_ID(java.math.BigDecimal EXPTYPE_ID) {
        this.EXPTYPE_ID = EXPTYPE_ID;
    }
    
    public java.math.BigDecimal getEXPTYPE_ID() {
        return this.EXPTYPE_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String IMPLCLS;
    
    public void setIMPLCLS(java.lang.String IMPLCLS) {
        this.IMPLCLS = IMPLCLS;
    }
    
    public java.lang.String getIMPLCLS() {
        return this.IMPLCLS;
    }
      

    private java.lang.String OBJCLS;
    
    public void setOBJCLS(java.lang.String OBJCLS) {
        this.OBJCLS = OBJCLS;
    }
    
    public java.lang.String getOBJCLS() {
        return this.OBJCLS;
    }
      

    private java.lang.String FIELD1;
    
    public void setFIELD1(java.lang.String FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.lang.String getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String FIELD2;
    
    public void setFIELD2(java.lang.String FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.lang.String getFIELD2() {
        return this.FIELD2;
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
        result.append("EXPTYPE_ID: " + getEXPTYPE_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("IMPLCLS: " + getIMPLCLS() + "||");
        result.append("OBJCLS: " + getOBJCLS() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}