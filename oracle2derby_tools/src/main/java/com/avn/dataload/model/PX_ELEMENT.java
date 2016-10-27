package com.avn.dataload.model;

public class PX_ELEMENT {


    private java.math.BigDecimal PX_ELEMENT_ID;
    
    public void setPX_ELEMENT_ID(java.math.BigDecimal PX_ELEMENT_ID) {
        this.PX_ELEMENT_ID = PX_ELEMENT_ID;
    }
    
    public java.math.BigDecimal getPX_ELEMENT_ID() {
        return this.PX_ELEMENT_ID;
    }
      

    private java.math.BigDecimal PX_PROMOTION_ID;
    
    public void setPX_PROMOTION_ID(java.math.BigDecimal PX_PROMOTION_ID) {
        this.PX_PROMOTION_ID = PX_PROMOTION_ID;
    }
    
    public java.math.BigDecimal getPX_PROMOTION_ID() {
        return this.PX_PROMOTION_ID;
    }
      

    private java.lang.String NAME;
    
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    
    public java.lang.String getNAME() {
        return this.NAME;
    }
      

    private java.lang.String TYPE;
    
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }
    
    public java.lang.String getTYPE() {
        return this.TYPE;
    }
      

    private java.lang.String SUBTYPE;
    
    public void setSUBTYPE(java.lang.String SUBTYPE) {
        this.SUBTYPE = SUBTYPE;
    }
    
    public java.lang.String getSUBTYPE() {
        return this.SUBTYPE;
    }
      

    private java.lang.String PARENT;
    
    public void setPARENT(java.lang.String PARENT) {
        this.PARENT = PARENT;
    }
    
    public java.lang.String getPARENT() {
        return this.PARENT;
    }
      

    private java.math.BigDecimal SEQUENCE;
    
    public void setSEQUENCE(java.math.BigDecimal SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }
    
    public java.math.BigDecimal getSEQUENCE() {
        return this.SEQUENCE;
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
        result.append("PX_ELEMENT_ID: " + getPX_ELEMENT_ID() + "||");
        result.append("PX_PROMOTION_ID: " + getPX_PROMOTION_ID() + "||");
        result.append("NAME: " + getNAME() + "||");
        result.append("TYPE: " + getTYPE() + "||");
        result.append("SUBTYPE: " + getSUBTYPE() + "||");
        result.append("PARENT: " + getPARENT() + "||");
        result.append("SEQUENCE: " + getSEQUENCE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}