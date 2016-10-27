package com.avn.dataload.model;

public class NOTIFY {


    private java.math.BigDecimal NOTIFY_ID;
    
    public void setNOTIFY_ID(java.math.BigDecimal NOTIFY_ID) {
        this.NOTIFY_ID = NOTIFY_ID;
    }
    
    public java.math.BigDecimal getNOTIFY_ID() {
        return this.NOTIFY_ID;
    }
      

    private java.math.BigDecimal NOTIFICATIONID;
    
    public void setNOTIFICATIONID(java.math.BigDecimal NOTIFICATIONID) {
        this.NOTIFICATIONID = NOTIFICATIONID;
    }
    
    public java.math.BigDecimal getNOTIFICATIONID() {
        return this.NOTIFICATIONID;
    }
      

    private java.lang.String TRANSPORTATTNAME;
    
    public void setTRANSPORTATTNAME(java.lang.String TRANSPORTATTNAME) {
        this.TRANSPORTATTNAME = TRANSPORTATTNAME;
    }
    
    public java.lang.String getTRANSPORTATTNAME() {
        return this.TRANSPORTATTNAME;
    }
      

    private java.lang.String TRANSPORTATTVALUE;
    
    public void setTRANSPORTATTVALUE(java.lang.String TRANSPORTATTVALUE) {
        this.TRANSPORTATTVALUE = TRANSPORTATTVALUE;
    }
    
    public java.lang.String getTRANSPORTATTVALUE() {
        return this.TRANSPORTATTVALUE;
    }
      

    private java.math.BigDecimal TRANSPORT_ID;
    
    public void setTRANSPORT_ID(java.math.BigDecimal TRANSPORT_ID) {
        this.TRANSPORT_ID = TRANSPORT_ID;
    }
    
    public java.math.BigDecimal getTRANSPORT_ID() {
        return this.TRANSPORT_ID;
    }
      

    private java.math.BigDecimal MSGTYPE_ID;
    
    public void setMSGTYPE_ID(java.math.BigDecimal MSGTYPE_ID) {
        this.MSGTYPE_ID = MSGTYPE_ID;
    }
    
    public java.math.BigDecimal getMSGTYPE_ID() {
        return this.MSGTYPE_ID;
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
        result.append("NOTIFY_ID: " + getNOTIFY_ID() + "||");
        result.append("NOTIFICATIONID: " + getNOTIFICATIONID() + "||");
        result.append("TRANSPORTATTNAME: " + getTRANSPORTATTNAME() + "||");
        result.append("TRANSPORTATTVALUE: " + getTRANSPORTATTVALUE() + "||");
        result.append("TRANSPORT_ID: " + getTRANSPORT_ID() + "||");
        result.append("MSGTYPE_ID: " + getMSGTYPE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}