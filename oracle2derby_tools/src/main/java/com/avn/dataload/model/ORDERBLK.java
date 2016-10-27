package com.avn.dataload.model;

public class ORDERBLK {


    private java.math.BigDecimal ORDERBLK_ID;
    
    public void setORDERBLK_ID(java.math.BigDecimal ORDERBLK_ID) {
        this.ORDERBLK_ID = ORDERBLK_ID;
    }
    
    public java.math.BigDecimal getORDERBLK_ID() {
        return this.ORDERBLK_ID;
    }
      

    private java.math.BigDecimal ORDERS_ID;
    
    public void setORDERS_ID(java.math.BigDecimal ORDERS_ID) {
        this.ORDERS_ID = ORDERS_ID;
    }
    
    public java.math.BigDecimal getORDERS_ID() {
        return this.ORDERS_ID;
    }
      

    private java.math.BigDecimal BLKRSNCODE_ID;
    
    public void setBLKRSNCODE_ID(java.math.BigDecimal BLKRSNCODE_ID) {
        this.BLKRSNCODE_ID = BLKRSNCODE_ID;
    }
    
    public java.math.BigDecimal getBLKRSNCODE_ID() {
        return this.BLKRSNCODE_ID;
    }
      

    private java.sql.Timestamp TIMEBLOCKED;
    
    public void setTIMEBLOCKED(java.sql.Timestamp TIMEBLOCKED) {
        this.TIMEBLOCKED = TIMEBLOCKED;
    }
    
    public java.sql.Timestamp getTIMEBLOCKED() {
        return this.TIMEBLOCKED;
    }
      

    private java.math.BigDecimal RESOLVED;
    
    public void setRESOLVED(java.math.BigDecimal RESOLVED) {
        this.RESOLVED = RESOLVED;
    }
    
    public java.math.BigDecimal getRESOLVED() {
        return this.RESOLVED;
    }
      

    private java.lang.String BLKCOMMENT;
    
    public void setBLKCOMMENT(java.lang.String BLKCOMMENT) {
        this.BLKCOMMENT = BLKCOMMENT;
    }
    
    public java.lang.String getBLKCOMMENT() {
        return this.BLKCOMMENT;
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
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("ORDERBLK_ID: " + getORDERBLK_ID() + "||");
        result.append("ORDERS_ID: " + getORDERS_ID() + "||");
        result.append("BLKRSNCODE_ID: " + getBLKRSNCODE_ID() + "||");
        result.append("TIMEBLOCKED: " + getTIMEBLOCKED() + "||");
        result.append("RESOLVED: " + getRESOLVED() + "||");
        result.append("BLKCOMMENT: " + getBLKCOMMENT() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}