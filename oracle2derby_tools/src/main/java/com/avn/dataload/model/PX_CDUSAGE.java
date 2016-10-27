package com.avn.dataload.model;

public class PX_CDUSAGE {


    private java.math.BigDecimal PX_CDUSAGE_ID;
    
    public void setPX_CDUSAGE_ID(java.math.BigDecimal PX_CDUSAGE_ID) {
        this.PX_CDUSAGE_ID = PX_CDUSAGE_ID;
    }
    
    public java.math.BigDecimal getPX_CDUSAGE_ID() {
        return this.PX_CDUSAGE_ID;
    }
      

    private java.math.BigDecimal PX_CDPOOL_ID;
    
    public void setPX_CDPOOL_ID(java.math.BigDecimal PX_CDPOOL_ID) {
        this.PX_CDPOOL_ID = PX_CDPOOL_ID;
    }
    
    public java.math.BigDecimal getPX_CDPOOL_ID() {
        return this.PX_CDPOOL_ID;
    }
      

    private java.math.BigDecimal OWNER_ID;
    
    public void setOWNER_ID(java.math.BigDecimal OWNER_ID) {
        this.OWNER_ID = OWNER_ID;
    }
    
    public java.math.BigDecimal getOWNER_ID() {
        return this.OWNER_ID;
    }
      

    private java.math.BigDecimal ORDERS_ID;
    
    public void setORDERS_ID(java.math.BigDecimal ORDERS_ID) {
        this.ORDERS_ID = ORDERS_ID;
    }
    
    public java.math.BigDecimal getORDERS_ID() {
        return this.ORDERS_ID;
    }
      

    private java.math.BigDecimal STATUS;
    
    public void setSTATUS(java.math.BigDecimal STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.math.BigDecimal getSTATUS() {
        return this.STATUS;
    }
      

    private java.sql.Timestamp VALIDFROM;
    
    public void setVALIDFROM(java.sql.Timestamp VALIDFROM) {
        this.VALIDFROM = VALIDFROM;
    }
    
    public java.sql.Timestamp getVALIDFROM() {
        return this.VALIDFROM;
    }
      

    private java.sql.Timestamp VALIDUNTIL;
    
    public void setVALIDUNTIL(java.sql.Timestamp VALIDUNTIL) {
        this.VALIDUNTIL = VALIDUNTIL;
    }
    
    public java.sql.Timestamp getVALIDUNTIL() {
        return this.VALIDUNTIL;
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
        result.append("PX_CDUSAGE_ID: " + getPX_CDUSAGE_ID() + "||");
        result.append("PX_CDPOOL_ID: " + getPX_CDPOOL_ID() + "||");
        result.append("OWNER_ID: " + getOWNER_ID() + "||");
        result.append("ORDERS_ID: " + getORDERS_ID() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("VALIDFROM: " + getVALIDFROM() + "||");
        result.append("VALIDUNTIL: " + getVALIDUNTIL() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}