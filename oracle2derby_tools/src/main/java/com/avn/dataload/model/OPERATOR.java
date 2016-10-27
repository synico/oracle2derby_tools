package com.avn.dataload.model;

public class OPERATOR {


    private java.math.BigDecimal OPERATOR_ID;
    
    public void setOPERATOR_ID(java.math.BigDecimal OPERATOR_ID) {
        this.OPERATOR_ID = OPERATOR_ID;
    }
    
    public java.math.BigDecimal getOPERATOR_ID() {
        return this.OPERATOR_ID;
    }
      

    private java.lang.String OPERATOR;
    
    public void setOPERATOR(java.lang.String OPERATOR) {
        this.OPERATOR = OPERATOR;
    }
    
    public java.lang.String getOPERATOR() {
        return this.OPERATOR;
    }
      

    private java.lang.String OPERATORTYPE;
    
    public void setOPERATORTYPE(java.lang.String OPERATORTYPE) {
        this.OPERATORTYPE = OPERATORTYPE;
    }
    
    public java.lang.String getOPERATORTYPE() {
        return this.OPERATORTYPE;
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
        result.append("OPERATOR_ID: " + getOPERATOR_ID() + "||");
        result.append("OPERATOR: " + getOPERATOR() + "||");
        result.append("OPERATORTYPE: " + getOPERATORTYPE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}