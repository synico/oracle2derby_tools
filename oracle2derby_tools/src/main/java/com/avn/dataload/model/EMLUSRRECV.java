package com.avn.dataload.model;

public class EMLUSRRECV {


    private java.math.BigDecimal USERS_ID;
    
    public void setUSERS_ID(java.math.BigDecimal USERS_ID) {
        this.USERS_ID = USERS_ID;
    }
    
    public java.math.BigDecimal getUSERS_ID() {
        return this.USERS_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal RECEIVEEML;
    
    public void setRECEIVEEML(java.math.BigDecimal RECEIVEEML) {
        this.RECEIVEEML = RECEIVEEML;
    }
    
    public java.math.BigDecimal getRECEIVEEML() {
        return this.RECEIVEEML;
    }
      

    private java.math.BigDecimal RECEIVESMS;
    
    public void setRECEIVESMS(java.math.BigDecimal RECEIVESMS) {
        this.RECEIVESMS = RECEIVESMS;
    }
    
    public java.math.BigDecimal getRECEIVESMS() {
        return this.RECEIVESMS;
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
        result.append("USERS_ID: " + getUSERS_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("RECEIVEEML: " + getRECEIVEEML() + "||");
        result.append("RECEIVESMS: " + getRECEIVESMS() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}