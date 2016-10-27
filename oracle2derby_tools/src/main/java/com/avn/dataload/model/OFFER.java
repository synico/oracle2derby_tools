package com.avn.dataload.model;

public class OFFER {


    private java.math.BigDecimal OFFER_ID;
    
    public void setOFFER_ID(java.math.BigDecimal OFFER_ID) {
        this.OFFER_ID = OFFER_ID;
    }
    
    public java.math.BigDecimal getOFFER_ID() {
        return this.OFFER_ID;
    }
      

    private java.sql.Timestamp STARTDATE;
    
    public void setSTARTDATE(java.sql.Timestamp STARTDATE) {
        this.STARTDATE = STARTDATE;
    }
    
    public java.sql.Timestamp getSTARTDATE() {
        return this.STARTDATE;
    }
      

    private java.math.BigDecimal TRADEPOSCN_ID;
    
    public void setTRADEPOSCN_ID(java.math.BigDecimal TRADEPOSCN_ID) {
        this.TRADEPOSCN_ID = TRADEPOSCN_ID;
    }
    
    public java.math.BigDecimal getTRADEPOSCN_ID() {
        return this.TRADEPOSCN_ID;
    }
      

    private java.math.BigDecimal CATENTRY_ID;
    
    public void setCATENTRY_ID(java.math.BigDecimal CATENTRY_ID) {
        this.CATENTRY_ID = CATENTRY_ID;
    }
    
    public java.math.BigDecimal getCATENTRY_ID() {
        return this.CATENTRY_ID;
    }
      

    private java.sql.Timestamp ENDDATE;
    
    public void setENDDATE(java.sql.Timestamp ENDDATE) {
        this.ENDDATE = ENDDATE;
    }
    
    public java.sql.Timestamp getENDDATE() {
        return this.ENDDATE;
    }
      

    private java.math.BigDecimal PRECEDENCE;
    
    public void setPRECEDENCE(java.math.BigDecimal PRECEDENCE) {
        this.PRECEDENCE = PRECEDENCE;
    }
    
    public java.math.BigDecimal getPRECEDENCE() {
        return this.PRECEDENCE;
    }
      

    private java.math.BigDecimal PUBLISHED;
    
    public void setPUBLISHED(java.math.BigDecimal PUBLISHED) {
        this.PUBLISHED = PUBLISHED;
    }
    
    public java.math.BigDecimal getPUBLISHED() {
        return this.PUBLISHED;
    }
      

    private java.sql.Timestamp LASTUPDATE;
    
    public void setLASTUPDATE(java.sql.Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }
    
    public java.sql.Timestamp getLASTUPDATE() {
        return this.LASTUPDATE;
    }
      

    private java.math.BigDecimal MINIMUMQUANTITY;
    
    public void setMINIMUMQUANTITY(java.math.BigDecimal MINIMUMQUANTITY) {
        this.MINIMUMQUANTITY = MINIMUMQUANTITY;
    }
    
    public java.math.BigDecimal getMINIMUMQUANTITY() {
        return this.MINIMUMQUANTITY;
    }
      

    private java.lang.String QTYUNIT_ID;
    
    public void setQTYUNIT_ID(java.lang.String QTYUNIT_ID) {
        this.QTYUNIT_ID = QTYUNIT_ID;
    }
    
    public java.lang.String getQTYUNIT_ID() {
        return this.QTYUNIT_ID;
    }
      

    private java.math.BigDecimal MAXIMUMQUANTITY;
    
    public void setMAXIMUMQUANTITY(java.math.BigDecimal MAXIMUMQUANTITY) {
        this.MAXIMUMQUANTITY = MAXIMUMQUANTITY;
    }
    
    public java.math.BigDecimal getMAXIMUMQUANTITY() {
        return this.MAXIMUMQUANTITY;
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
      

    private java.math.BigDecimal FLAGS;
    
    public void setFLAGS(java.math.BigDecimal FLAGS) {
        this.FLAGS = FLAGS;
    }
    
    public java.math.BigDecimal getFLAGS() {
        return this.FLAGS;
    }
      

    private java.math.BigDecimal IDENTIFIER;
    
    public void setIDENTIFIER(java.math.BigDecimal IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
    
    public java.math.BigDecimal getIDENTIFIER() {
        return this.IDENTIFIER;
    }
      

    private java.lang.String OID;
    
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }
    
    public java.lang.String getOID() {
        return this.OID;
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
        result.append("OFFER_ID: " + getOFFER_ID() + "||");
        result.append("STARTDATE: " + getSTARTDATE() + "||");
        result.append("TRADEPOSCN_ID: " + getTRADEPOSCN_ID() + "||");
        result.append("CATENTRY_ID: " + getCATENTRY_ID() + "||");
        result.append("ENDDATE: " + getENDDATE() + "||");
        result.append("PRECEDENCE: " + getPRECEDENCE() + "||");
        result.append("PUBLISHED: " + getPUBLISHED() + "||");
        result.append("LASTUPDATE: " + getLASTUPDATE() + "||");
        result.append("MINIMUMQUANTITY: " + getMINIMUMQUANTITY() + "||");
        result.append("QTYUNIT_ID: " + getQTYUNIT_ID() + "||");
        result.append("MAXIMUMQUANTITY: " + getMAXIMUMQUANTITY() + "||");
        result.append("FIELD1: " + getFIELD1() + "||");
        result.append("FIELD2: " + getFIELD2() + "||");
        result.append("FLAGS: " + getFLAGS() + "||");
        result.append("IDENTIFIER: " + getIDENTIFIER() + "||");
        result.append("OID: " + getOID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}