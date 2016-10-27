package com.avn.dataload.model;

public class STOREREL {


    private java.math.BigDecimal STRELTYP_ID;
    
    public void setSTRELTYP_ID(java.math.BigDecimal STRELTYP_ID) {
        this.STRELTYP_ID = STRELTYP_ID;
    }
    
    public java.math.BigDecimal getSTRELTYP_ID() {
        return this.STRELTYP_ID;
    }
      

    private java.math.BigDecimal RELATEDSTORE_ID;
    
    public void setRELATEDSTORE_ID(java.math.BigDecimal RELATEDSTORE_ID) {
        this.RELATEDSTORE_ID = RELATEDSTORE_ID;
    }
    
    public java.math.BigDecimal getRELATEDSTORE_ID() {
        return this.RELATEDSTORE_ID;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
    }
      

    private java.math.BigDecimal SEQUENCE;
    
    public void setSEQUENCE(java.math.BigDecimal SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }
    
    public java.math.BigDecimal getSEQUENCE() {
        return this.SEQUENCE;
    }
      

    private java.math.BigDecimal STATE;
    
    public void setSTATE(java.math.BigDecimal STATE) {
        this.STATE = STATE;
    }
    
    public java.math.BigDecimal getSTATE() {
        return this.STATE;
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
        result.append("STRELTYP_ID: " + getSTRELTYP_ID() + "||");
        result.append("RELATEDSTORE_ID: " + getRELATEDSTORE_ID() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("STATE: " + getSTATE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}