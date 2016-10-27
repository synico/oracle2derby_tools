package com.avn.dataload.model;

public class CLEANCONF {


    private java.lang.String OBJECTNAME;
    
    public void setOBJECTNAME(java.lang.String OBJECTNAME) {
        this.OBJECTNAME = OBJECTNAME;
    }
    
    public java.lang.String getOBJECTNAME() {
        return this.OBJECTNAME;
    }
      

    private java.lang.String TYPE;
    
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }
    
    public java.lang.String getTYPE() {
        return this.TYPE;
    }
      

    private java.lang.String STATEMENT;
    
    public void setSTATEMENT(java.lang.String STATEMENT) {
        this.STATEMENT = STATEMENT;
    }
    
    public java.lang.String getSTATEMENT() {
        return this.STATEMENT;
    }
      

    private java.lang.String NAMEARG;
    
    public void setNAMEARG(java.lang.String NAMEARG) {
        this.NAMEARG = NAMEARG;
    }
    
    public java.lang.String getNAMEARG() {
        return this.NAMEARG;
    }
      

    private java.math.BigDecimal SEQUENCE;
    
    public void setSEQUENCE(java.math.BigDecimal SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }
    
    public java.math.BigDecimal getSEQUENCE() {
        return this.SEQUENCE;
    }
      

    private java.lang.String DAYSARG;
    
    public void setDAYSARG(java.lang.String DAYSARG) {
        this.DAYSARG = DAYSARG;
    }
    
    public java.lang.String getDAYSARG() {
        return this.DAYSARG;
    }
      

    private java.lang.String STATEMENTTYPE;
    
    public void setSTATEMENTTYPE(java.lang.String STATEMENTTYPE) {
        this.STATEMENTTYPE = STATEMENTTYPE;
    }
    
    public java.lang.String getSTATEMENTTYPE() {
        return this.STATEMENTTYPE;
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
        result.append("OBJECTNAME: " + getOBJECTNAME() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("STATEMENT: " + getSTATEMENT() + "||");
        result.append("NAMEARG: " + getNAMEARG() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("DAYSARG: " + getDAYSARG() + "||");
        result.append("STATEMENTTYPE: " + getSTATEMENTTYPE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}