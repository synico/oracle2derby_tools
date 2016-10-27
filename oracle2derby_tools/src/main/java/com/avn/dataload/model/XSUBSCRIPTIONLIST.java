package com.avn.dataload.model;

public class XSUBSCRIPTIONLIST {


    private java.math.BigDecimal SUBSCRIPTION_ID;
    
    public void setSUBSCRIPTION_ID(java.math.BigDecimal SUBSCRIPTION_ID) {
        this.SUBSCRIPTION_ID = SUBSCRIPTION_ID;
    }
    
    public java.math.BigDecimal getSUBSCRIPTION_ID() {
        return this.SUBSCRIPTION_ID;
    }
      

    private java.lang.String SUBSCRIPTION_NAME;
    
    public void setSUBSCRIPTION_NAME(java.lang.String SUBSCRIPTION_NAME) {
        this.SUBSCRIPTION_NAME = SUBSCRIPTION_NAME;
    }
    
    public java.lang.String getSUBSCRIPTION_NAME() {
        return this.SUBSCRIPTION_NAME;
    }
      

    private java.math.BigDecimal SOURCE_ID;
    
    public void setSOURCE_ID(java.math.BigDecimal SOURCE_ID) {
        this.SOURCE_ID = SOURCE_ID;
    }
    
    public java.math.BigDecimal getSOURCE_ID() {
        return this.SOURCE_ID;
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
      

    private java.lang.String FIELD3;
    
    public void setFIELD3(java.lang.String FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.lang.String getFIELD3() {
        return this.FIELD3;
    }
      

    private java.lang.String FIELD4;
    
    public void setFIELD4(java.lang.String FIELD4) {
        this.FIELD4 = FIELD4;
    }
    
    public java.lang.String getFIELD4() {
        return this.FIELD4;
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
        result.append("SUBSCRIPTION_ID: " + getSUBSCRIPTION_ID() + "||");
        result.append("SUBSCRIPTION_NAME: " + getSUBSCRIPTION_NAME() + "||");
        result.append("SOURCE_ID: " + getSOURCE_ID() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("FIELD4: " + getFIELD4() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}