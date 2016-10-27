package com.avn.dataload.model;

public class LMEVENTMAP {


    private java.math.BigDecimal LMEVENTMAP_ID;
    
    public void setLMEVENTMAP_ID(java.math.BigDecimal LMEVENTMAP_ID) {
        this.LMEVENTMAP_ID = LMEVENTMAP_ID;
    }
    
    public java.math.BigDecimal getLMEVENTMAP_ID() {
        return this.LMEVENTMAP_ID;
    }
      

    private java.lang.String LMSETNAME;
    
    public void setLMSETNAME(java.lang.String LMSETNAME) {
        this.LMSETNAME = LMSETNAME;
    }
    
    public java.lang.String getLMSETNAME() {
        return this.LMSETNAME;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.lang.String EXTEVENTNAME;
    
    public void setEXTEVENTNAME(java.lang.String EXTEVENTNAME) {
        this.EXTEVENTNAME = EXTEVENTNAME;
    }
    
    public java.lang.String getEXTEVENTNAME() {
        return this.EXTEVENTNAME;
    }
      

    private java.lang.String EXTEVENTDESC;
    
    public void setEXTEVENTDESC(java.lang.String EXTEVENTDESC) {
        this.EXTEVENTDESC = EXTEVENTDESC;
    }
    
    public java.lang.String getEXTEVENTDESC() {
        return this.EXTEVENTDESC;
    }
      

    private java.math.BigDecimal LMTXTYPEID;
    
    public void setLMTXTYPEID(java.math.BigDecimal LMTXTYPEID) {
        this.LMTXTYPEID = LMTXTYPEID;
    }
    
    public java.math.BigDecimal getLMTXTYPEID() {
        return this.LMTXTYPEID;
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
        result.append("LMEVENTMAP_ID: " + getLMEVENTMAP_ID() + "||");
        result.append("LMSETNAME: " + getLMSETNAME() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("EXTEVENTNAME: " + getEXTEVENTNAME() + "||");
        result.append("EXTEVENTDESC: " + getEXTEVENTDESC() + "||");
        result.append("LMTXTYPEID: " + getLMTXTYPEID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}