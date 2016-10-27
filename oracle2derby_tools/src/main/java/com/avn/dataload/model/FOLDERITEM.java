package com.avn.dataload.model;

public class FOLDERITEM {


    private java.math.BigDecimal FOLDERITEM_ID;
    
    public void setFOLDERITEM_ID(java.math.BigDecimal FOLDERITEM_ID) {
        this.FOLDERITEM_ID = FOLDERITEM_ID;
    }
    
    public java.math.BigDecimal getFOLDERITEM_ID() {
        return this.FOLDERITEM_ID;
    }
      

    private java.math.BigDecimal FOLDER_ID;
    
    public void setFOLDER_ID(java.math.BigDecimal FOLDER_ID) {
        this.FOLDER_ID = FOLDER_ID;
    }
    
    public java.math.BigDecimal getFOLDER_ID() {
        return this.FOLDER_ID;
    }
      

    private java.math.BigDecimal REFERENCE_ID;
    
    public void setREFERENCE_ID(java.math.BigDecimal REFERENCE_ID) {
        this.REFERENCE_ID = REFERENCE_ID;
    }
    
    public java.math.BigDecimal getREFERENCE_ID() {
        return this.REFERENCE_ID;
    }
      

    private java.lang.String FOLDERITEMTYPE;
    
    public void setFOLDERITEMTYPE(java.lang.String FOLDERITEMTYPE) {
        this.FOLDERITEMTYPE = FOLDERITEMTYPE;
    }
    
    public java.lang.String getFOLDERITEMTYPE() {
        return this.FOLDERITEMTYPE;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
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
        result.append("FOLDERITEM_ID: " + getFOLDERITEM_ID() + "||");
        result.append("FOLDER_ID: " + getFOLDER_ID() + "||");
        result.append("REFERENCE_ID: " + getREFERENCE_ID() + "||");
        result.append("FOLDERITEMTYPE: " + getFOLDERITEMTYPE() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}