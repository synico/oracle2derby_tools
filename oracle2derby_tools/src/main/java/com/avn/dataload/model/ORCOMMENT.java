package com.avn.dataload.model;

public class ORCOMMENT {


    private java.math.BigDecimal ORCOMMENT_ID;
    
    public void setORCOMMENT_ID(java.math.BigDecimal ORCOMMENT_ID) {
        this.ORCOMMENT_ID = ORCOMMENT_ID;
    }
    
    public java.math.BigDecimal getORCOMMENT_ID() {
        return this.ORCOMMENT_ID;
    }
      

    private java.math.BigDecimal ORDERS_ID;
    
    public void setORDERS_ID(java.math.BigDecimal ORDERS_ID) {
        this.ORDERS_ID = ORDERS_ID;
    }
    
    public java.math.BigDecimal getORDERS_ID() {
        return this.ORDERS_ID;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
    }
      

    private java.lang.String COMMENTS;
    
    public void setCOMMENTS(java.lang.String COMMENTS) {
        this.COMMENTS = COMMENTS;
    }
    
    public java.lang.String getCOMMENTS() {
        return this.COMMENTS;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.math.BigDecimal ORDCHGRSN_ID;
    
    public void setORDCHGRSN_ID(java.math.BigDecimal ORDCHGRSN_ID) {
        this.ORDCHGRSN_ID = ORDCHGRSN_ID;
    }
    
    public java.math.BigDecimal getORDCHGRSN_ID() {
        return this.ORDCHGRSN_ID;
    }
      

    private java.math.BigDecimal SERVICEREP_ID;
    
    public void setSERVICEREP_ID(java.math.BigDecimal SERVICEREP_ID) {
        this.SERVICEREP_ID = SERVICEREP_ID;
    }
    
    public java.math.BigDecimal getSERVICEREP_ID() {
        return this.SERVICEREP_ID;
    }
      

    private java.math.BigDecimal BUSCHN_ID;
    
    public void setBUSCHN_ID(java.math.BigDecimal BUSCHN_ID) {
        this.BUSCHN_ID = BUSCHN_ID;
    }
    
    public java.math.BigDecimal getBUSCHN_ID() {
        return this.BUSCHN_ID;
    }
      

    private java.math.BigDecimal ORDERVERSION;
    
    public void setORDERVERSION(java.math.BigDecimal ORDERVERSION) {
        this.ORDERVERSION = ORDERVERSION;
    }
    
    public java.math.BigDecimal getORDERVERSION() {
        return this.ORDERVERSION;
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
      

    private java.sql.Timestamp FIELD3;
    
    public void setFIELD3(java.sql.Timestamp FIELD3) {
        this.FIELD3 = FIELD3;
    }
    
    public java.sql.Timestamp getFIELD3() {
        return this.FIELD3;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("ORCOMMENT_ID: " + getORCOMMENT_ID() + "||");
        result.append("ORDERS_ID: " + getORDERS_ID() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("COMMENTS: " + getCOMMENTS() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("ORDCHGRSN_ID: " + getORDCHGRSN_ID() + "||");
        result.append("SERVICEREP_ID: " + getSERVICEREP_ID() + "||");
        result.append("BUSCHN_ID: " + getBUSCHN_ID() + "||");
        result.append("ORDERVERSION: " + getORDERVERSION() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FIELD3: " + getFIELD3() + "||");
        return result.toString();
    }
    
}