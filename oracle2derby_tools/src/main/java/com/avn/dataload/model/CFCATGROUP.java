package com.avn.dataload.model;

public class CFCATGROUP {


    private java.math.BigDecimal CFCATGROUP_ID;
    
    public void setCFCATGROUP_ID(java.math.BigDecimal CFCATGROUP_ID) {
        this.CFCATGROUP_ID = CFCATGROUP_ID;
    }
    
    public java.math.BigDecimal getCFCATGROUP_ID() {
        return this.CFCATGROUP_ID;
    }
      

    private java.math.BigDecimal CATFILTER_ID;
    
    public void setCATFILTER_ID(java.math.BigDecimal CATFILTER_ID) {
        this.CATFILTER_ID = CATFILTER_ID;
    }
    
    public java.math.BigDecimal getCATFILTER_ID() {
        return this.CATFILTER_ID;
    }
      

    private java.math.BigDecimal CATGROUP_ID;
    
    public void setCATGROUP_ID(java.math.BigDecimal CATGROUP_ID) {
        this.CATGROUP_ID = CATGROUP_ID;
    }
    
    public java.math.BigDecimal getCATGROUP_ID() {
        return this.CATGROUP_ID;
    }
      

    private java.math.BigDecimal TYPE;
    
    public void setTYPE(java.math.BigDecimal TYPE) {
        this.TYPE = TYPE;
    }
    
    public java.math.BigDecimal getTYPE() {
        return this.TYPE;
    }
      

    private java.math.BigDecimal CONDGRPRELATION;
    
    public void setCONDGRPRELATION(java.math.BigDecimal CONDGRPRELATION) {
        this.CONDGRPRELATION = CONDGRPRELATION;
    }
    
    public java.math.BigDecimal getCONDGRPRELATION() {
        return this.CONDGRPRELATION;
    }
      

    private java.math.BigDecimal FIELD1;
    
    public void setFIELD1(java.math.BigDecimal FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.math.BigDecimal getFIELD1() {
        return this.FIELD1;
    }
      

    private java.math.BigDecimal FIELD2;
    
    public void setFIELD2(java.math.BigDecimal FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.math.BigDecimal getFIELD2() {
        return this.FIELD2;
    }
      

    private java.lang.String FIELD3;
    
    public void setFIELD3(java.lang.String FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.lang.String getFIELD3() {
        return this.FIELD3;
    }
      

    private java.math.BigDecimal FIELD4;
    
    public void setFIELD4(java.math.BigDecimal FIELD4) {
        this.FIELD4 = FIELD4;
    }
    
    public java.math.BigDecimal getFIELD4() {
        return this.FIELD4;
    }
      

    private java.math.BigDecimal FIELD5;
    
    public void setFIELD5(java.math.BigDecimal FIELD5) {
        this.FIELD5 = FIELD5;
    }
    
    public java.math.BigDecimal getFIELD5() {
        return this.FIELD5;
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
        result.append("CFCATGROUP_ID: " + getCFCATGROUP_ID() + "||");
        result.append("CATFILTER_ID: " + getCATFILTER_ID() + "||");
        result.append("CATGROUP_ID: " + getCATGROUP_ID() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("CONDGRPRELATION: " + getCONDGRPRELATION() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("FIELD4: " + getFIELD4() + "||");
        result.append("FIELD5: " + getFIELD5() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}