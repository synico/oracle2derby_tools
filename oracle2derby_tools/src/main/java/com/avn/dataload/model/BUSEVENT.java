package com.avn.dataload.model;

public class BUSEVENT {


    private java.math.BigDecimal BUSEVENT_ID;
    
    public void setBUSEVENT_ID(java.math.BigDecimal BUSEVENT_ID) {
        this.BUSEVENT_ID = BUSEVENT_ID;
    }
    
    public java.math.BigDecimal getBUSEVENT_ID() {
        return this.BUSEVENT_ID;
    }
      

    private java.math.BigDecimal SEQUENCE;
    
    public void setSEQUENCE(java.math.BigDecimal SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }
    
    public java.math.BigDecimal getSEQUENCE() {
        return this.SEQUENCE;
    }
      

    private java.sql.Timestamp CREATETSTMP;
    
    public void setCREATETSTMP(java.sql.Timestamp CREATETSTMP) {
        this.CREATETSTMP = CREATETSTMP;
    }
    
    public java.sql.Timestamp getCREATETSTMP() {
        return this.CREATETSTMP;
    }
      

    private java.lang.String EVENTDATA;
    
    public void setEVENTDATA(java.lang.String EVENTDATA) {
        this.EVENTDATA = EVENTDATA;
    }
    
    public java.lang.String getEVENTDATA() {
        return this.EVENTDATA;
    }
      

    private java.math.BigDecimal CHECKED;
    
    public void setCHECKED(java.math.BigDecimal CHECKED) {
        this.CHECKED = CHECKED;
    }
    
    public java.math.BigDecimal getCHECKED() {
        return this.CHECKED;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.lang.String EVENT_SEARCHKEY;
    
    public void setEVENT_SEARCHKEY(java.lang.String EVENT_SEARCHKEY) {
        this.EVENT_SEARCHKEY = EVENT_SEARCHKEY;
    }
    
    public java.lang.String getEVENT_SEARCHKEY() {
        return this.EVENT_SEARCHKEY;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("BUSEVENT_ID: " + getBUSEVENT_ID() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("CREATETSTMP: " + getCREATETSTMP() + "||");
        result.append("EVENTDATA: " + getEVENTDATA() + "||");
        result.append("CHECKED: " + getCHECKED() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("EVENT_SEARCHKEY: " + getEVENT_SEARCHKEY() + "||");
        return result.toString();
    }
    
}