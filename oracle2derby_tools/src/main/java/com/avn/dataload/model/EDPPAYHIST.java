package com.avn.dataload.model;

public class EDPPAYHIST {


    private java.math.BigDecimal EDPPAYHIST_ID;
    
    public void setEDPPAYHIST_ID(java.math.BigDecimal EDPPAYHIST_ID) {
        this.EDPPAYHIST_ID = EDPPAYHIST_ID;
    }
    
    public java.math.BigDecimal getEDPPAYHIST_ID() {
        return this.EDPPAYHIST_ID;
    }
      

    private java.math.BigDecimal ORDER_ID;
    
    public void setORDER_ID(java.math.BigDecimal ORDER_ID) {
        this.ORDER_ID = ORDER_ID;
    }
    
    public java.math.BigDecimal getORDER_ID() {
        return this.ORDER_ID;
    }
      

    private java.math.BigDecimal RMA_ID;
    
    public void setRMA_ID(java.math.BigDecimal RMA_ID) {
        this.RMA_ID = RMA_ID;
    }
    
    public java.math.BigDecimal getRMA_ID() {
        return this.RMA_ID;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
    }
      

    private java.sql.Timestamp HISTTIMESTAMP;
    
    public void setHISTTIMESTAMP(java.sql.Timestamp HISTTIMESTAMP) {
        this.HISTTIMESTAMP = HISTTIMESTAMP;
    }
    
    public java.sql.Timestamp getHISTTIMESTAMP() {
        return this.HISTTIMESTAMP;
    }
      

    private java.math.BigDecimal AMOUNT;
    
    public void setAMOUNT(java.math.BigDecimal AMOUNT) {
        this.AMOUNT = AMOUNT;
    }
    
    public java.math.BigDecimal getAMOUNT() {
        return this.AMOUNT;
    }
      

    private java.lang.String OPERATIONNAME;
    
    public void setOPERATIONNAME(java.lang.String OPERATIONNAME) {
        this.OPERATIONNAME = OPERATIONNAME;
    }
    
    public java.lang.String getOPERATIONNAME() {
        return this.OPERATIONNAME;
    }
      

    private java.lang.String OPERATIONRESULT;
    
    public void setOPERATIONRESULT(java.lang.String OPERATIONRESULT) {
        this.OPERATIONRESULT = OPERATIONRESULT;
    }
    
    public java.lang.String getOPERATIONRESULT() {
        return this.OPERATIONRESULT;
    }
      

    private java.lang.String READABLESTATUS;
    
    public void setREADABLESTATUS(java.lang.String READABLESTATUS) {
        this.READABLESTATUS = READABLESTATUS;
    }
    
    public java.lang.String getREADABLESTATUS() {
        return this.READABLESTATUS;
    }
      

    private java.lang.String RECORDTYPE;
    
    public void setRECORDTYPE(java.lang.String RECORDTYPE) {
        this.RECORDTYPE = RECORDTYPE;
    }
    
    public java.lang.String getRECORDTYPE() {
        return this.RECORDTYPE;
    }
      

    private java.lang.String BACKENDPIID;
    
    public void setBACKENDPIID(java.lang.String BACKENDPIID) {
        this.BACKENDPIID = BACKENDPIID;
    }
    
    public java.lang.String getBACKENDPIID() {
        return this.BACKENDPIID;
    }
      

    private java.lang.String BACKENDPAYMENTID;
    
    public void setBACKENDPAYMENTID(java.lang.String BACKENDPAYMENTID) {
        this.BACKENDPAYMENTID = BACKENDPAYMENTID;
    }
    
    public java.lang.String getBACKENDPAYMENTID() {
        return this.BACKENDPAYMENTID;
    }
      

    private java.lang.String ACCOUNT;
    
    public void setACCOUNT(java.lang.String ACCOUNT) {
        this.ACCOUNT = ACCOUNT;
    }
    
    public java.lang.String getACCOUNT() {
        return this.ACCOUNT;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.math.BigDecimal EDPPAYINST_ID;
    
    public void setEDPPAYINST_ID(java.math.BigDecimal EDPPAYINST_ID) {
        this.EDPPAYINST_ID = EDPPAYINST_ID;
    }
    
    public java.math.BigDecimal getEDPPAYINST_ID() {
        return this.EDPPAYINST_ID;
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
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("EDPPAYHIST_ID: " + getEDPPAYHIST_ID() + "||");
        result.append("ORDER_ID: " + getORDER_ID() + "||");
        result.append("RMA_ID: " + getRMA_ID() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("HISTTIMESTAMP: " + getHISTTIMESTAMP() + "||");
        result.append("AMOUNT: " + getAMOUNT() + "||");
        result.append("OPERATIONNAME: " + getOPERATIONNAME() + "||");
        result.append("OPERATIONRESULT: " + getOPERATIONRESULT() + "||");
        result.append("READABLESTATUS: " + getREADABLESTATUS() + "||");
        result.append("RECORDTYPE: " + getRECORDTYPE() + "||");
        result.append("BACKENDPIID: " + getBACKENDPIID() + "||");
        result.append("BACKENDPAYMENTID: " + getBACKENDPAYMENTID() + "||");
        result.append("ACCOUNT: " + getACCOUNT() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("EDPPAYINST_ID: " + getEDPPAYINST_ID() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        return result.toString();
    }
    
}