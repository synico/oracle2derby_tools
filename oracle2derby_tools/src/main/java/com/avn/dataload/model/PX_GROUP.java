package com.avn.dataload.model;

public class PX_GROUP {


    private java.math.BigDecimal PX_GROUP_ID;
    
    public void setPX_GROUP_ID(java.math.BigDecimal PX_GROUP_ID) {
        this.PX_GROUP_ID = PX_GROUP_ID;
    }
    
    public java.math.BigDecimal getPX_GROUP_ID() {
        return this.PX_GROUP_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal STATUS;
    
    public void setSTATUS(java.math.BigDecimal STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.math.BigDecimal getSTATUS() {
        return this.STATUS;
    }
      

    private java.lang.String GRPNAME;
    
    public void setGRPNAME(java.lang.String GRPNAME) {
        this.GRPNAME = GRPNAME;
    }
    
    public java.lang.String getGRPNAME() {
        return this.GRPNAME;
    }
      

    private java.sql.Clob XMLPARAM;
    
    public void setXMLPARAM(java.sql.Clob XMLPARAM) {
        this.XMLPARAM = XMLPARAM;
    }
    
    public java.sql.Clob getXMLPARAM() {
        return this.XMLPARAM;
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
        result.append("PX_GROUP_ID: " + getPX_GROUP_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("GRPNAME: " + getGRPNAME() + "||");
        result.append("XMLPARAM: " + getXMLPARAM() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}