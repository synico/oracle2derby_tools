package com.avn.dataload.model;

public class XCUSTPARTNO {


    private java.math.BigDecimal XCUSTPARTNO_ID;
    
    public void setXCUSTPARTNO_ID(java.math.BigDecimal XCUSTPARTNO_ID) {
        this.XCUSTPARTNO_ID = XCUSTPARTNO_ID;
    }
    
    public java.math.BigDecimal getXCUSTPARTNO_ID() {
        return this.XCUSTPARTNO_ID;
    }
      

    private java.math.BigDecimal CATENTRY_ID;
    
    public void setCATENTRY_ID(java.math.BigDecimal CATENTRY_ID) {
        this.CATENTRY_ID = CATENTRY_ID;
    }
    
    public java.math.BigDecimal getCATENTRY_ID() {
        return this.CATENTRY_ID;
    }
      

    private java.math.BigDecimal ORGENTITY_ID;
    
    public void setORGENTITY_ID(java.math.BigDecimal ORGENTITY_ID) {
        this.ORGENTITY_ID = ORGENTITY_ID;
    }
    
    public java.math.BigDecimal getORGENTITY_ID() {
        return this.ORGENTITY_ID;
    }
      

    private java.lang.String CUSTPARTNO;
    
    public void setCUSTPARTNO(java.lang.String CUSTPARTNO) {
        this.CUSTPARTNO = CUSTPARTNO;
    }
    
    public java.lang.String getCUSTPARTNO() {
        return this.CUSTPARTNO;
    }
      

    private java.math.BigDecimal FIELD1;
    
    public void setFIELD1(java.math.BigDecimal FIELD1) {
        this.FIELD1 = FIELD1;
    }
    
    public java.math.BigDecimal getFIELD1() {
        return this.FIELD1;
    }
      

    private java.lang.String FIELD2;
    
    public void setFIELD2(java.lang.String FIELD2) {
        this.FIELD2 = FIELD2;
    }
    
    public java.lang.String getFIELD2() {
        return this.FIELD2;
    }
      

    private java.lang.String FIELD3;
    
    public void setFIELD3(java.lang.String FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.lang.String getFIELD3() {
        return this.FIELD3;
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
        result.append("XCUSTPARTNO_ID: " + getXCUSTPARTNO_ID() + "||");
        result.append("CATENTRY_ID: " + getCATENTRY_ID() + "||");
        result.append("ORGENTITY_ID: " + getORGENTITY_ID() + "||");
        result.append("CUSTPARTNO: " + getCUSTPARTNO() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}