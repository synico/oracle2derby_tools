package com.avn.dataload.model;

public class FOLDER {


    private java.math.BigDecimal FOLDER_ID;
    
    public void setFOLDER_ID(java.math.BigDecimal FOLDER_ID) {
        this.FOLDER_ID = FOLDER_ID;
    }
    
    public java.math.BigDecimal getFOLDER_ID() {
        return this.FOLDER_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal MEMBER_ID;
    
    public void setMEMBER_ID(java.math.BigDecimal MEMBER_ID) {
        this.MEMBER_ID = MEMBER_ID;
    }
    
    public java.math.BigDecimal getMEMBER_ID() {
        return this.MEMBER_ID;
    }
      

    private java.math.BigDecimal PARENTFOLDER_ID;
    
    public void setPARENTFOLDER_ID(java.math.BigDecimal PARENTFOLDER_ID) {
        this.PARENTFOLDER_ID = PARENTFOLDER_ID;
    }
    
    public java.math.BigDecimal getPARENTFOLDER_ID() {
        return this.PARENTFOLDER_ID;
    }
      

    private java.lang.String IDENTIFIER;
    
    public void setIDENTIFIER(java.lang.String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
    
    public java.lang.String getIDENTIFIER() {
        return this.IDENTIFIER;
    }
      

    private java.lang.String DESCRIPTION;
    
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public java.lang.String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
      

    private java.lang.String TYPE;
    
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }
    
    public java.lang.String getTYPE() {
        return this.TYPE;
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
        result.append("FOLDER_ID: " + getFOLDER_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("MEMBER_ID: " + getMEMBER_ID() + "||");
        result.append("PARENTFOLDER_ID: " + getPARENTFOLDER_ID() + "||");
        result.append("IDENTIFIER: " + getIDENTIFIER() + "||");
        result.append("DESCRIPTION: " + getDESCRIPTION() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}