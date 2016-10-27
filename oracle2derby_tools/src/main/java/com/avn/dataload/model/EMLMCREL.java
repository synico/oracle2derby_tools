package com.avn.dataload.model;

public class EMLMCREL {


    private java.math.BigDecimal EMLMSG_ID;
    
    public void setEMLMSG_ID(java.math.BigDecimal EMLMSG_ID) {
        this.EMLMSG_ID = EMLMSG_ID;
    }
    
    public java.math.BigDecimal getEMLMSG_ID() {
        return this.EMLMSG_ID;
    }
      

    private java.math.BigDecimal EMLCONTENT_ID;
    
    public void setEMLCONTENT_ID(java.math.BigDecimal EMLCONTENT_ID) {
        this.EMLCONTENT_ID = EMLCONTENT_ID;
    }
    
    public java.math.BigDecimal getEMLCONTENT_ID() {
        return this.EMLCONTENT_ID;
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
        result.append("EMLMSG_ID: " + getEMLMSG_ID() + "||");
        result.append("EMLCONTENT_ID: " + getEMLCONTENT_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}