package com.avn.dataload.model;

public class XMSG {


    private java.math.BigDecimal XMSG_ID;
    
    public void setXMSG_ID(java.math.BigDecimal XMSG_ID) {
        this.XMSG_ID = XMSG_ID;
    }
    
    public java.math.BigDecimal getXMSG_ID() {
        return this.XMSG_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal ENTITY_ID;
    
    public void setENTITY_ID(java.math.BigDecimal ENTITY_ID) {
        this.ENTITY_ID = ENTITY_ID;
    }
    
    public java.math.BigDecimal getENTITY_ID() {
        return this.ENTITY_ID;
    }
      

    private java.lang.String ENTITY_TYPE;
    
    public void setENTITY_TYPE(java.lang.String ENTITY_TYPE) {
        this.ENTITY_TYPE = ENTITY_TYPE;
    }
    
    public java.lang.String getENTITY_TYPE() {
        return this.ENTITY_TYPE;
    }
      

    private java.sql.Blob REQUEST;
    
    public void setREQUEST(java.sql.Blob REQUEST) {
        this.REQUEST = REQUEST;
    }
    
    public java.sql.Blob getREQUEST() {
        return this.REQUEST;
    }
      

    private java.sql.Blob RESPONSE;
    
    public void setRESPONSE(java.sql.Blob RESPONSE) {
        this.RESPONSE = RESPONSE;
    }
    
    public java.sql.Blob getRESPONSE() {
        return this.RESPONSE;
    }
      

    private java.sql.Timestamp LAST_UPDATE;
    
    public void setLAST_UPDATE(java.sql.Timestamp LAST_UPDATE) {
        this.LAST_UPDATE = LAST_UPDATE;
    }
    
    public java.sql.Timestamp getLAST_UPDATE() {
        return this.LAST_UPDATE;
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
      

    private java.sql.Blob FIELD4;
    
    public void setFIELD4(java.sql.Blob FIELD4) {
        this.FIELD4 = FIELD4;
    }
    
    public java.sql.Blob getFIELD4() {
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
        result.append("XMSG_ID: " + getXMSG_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("ENTITY_ID: " + getENTITY_ID() + "||");
        result.append("ENTITY_TYPE: " + getENTITY_TYPE() + "||");
        result.append("REQUEST: " + getREQUEST() + "||");
        result.append("RESPONSE: " + getRESPONSE() + "||");
        result.append("LAST_UPDATE: " + getLAST_UPDATE() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        result.append("FIELD4: " + getFIELD4() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}