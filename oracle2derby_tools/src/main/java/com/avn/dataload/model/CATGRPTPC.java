package com.avn.dataload.model;

public class CATGRPTPC {


    private java.math.BigDecimal CATALOG_ID;
    
    public void setCATALOG_ID(java.math.BigDecimal CATALOG_ID) {
        this.CATALOG_ID = CATALOG_ID;
    }
    
    public java.math.BigDecimal getCATALOG_ID() {
        return this.CATALOG_ID;
    }
      

    private java.math.BigDecimal CATGROUP_ID;
    
    public void setCATGROUP_ID(java.math.BigDecimal CATGROUP_ID) {
        this.CATGROUP_ID = CATGROUP_ID;
    }
    
    public java.math.BigDecimal getCATGROUP_ID() {
        return this.CATGROUP_ID;
    }
      

    private java.math.BigDecimal TRADEPOSCN_ID;
    
    public void setTRADEPOSCN_ID(java.math.BigDecimal TRADEPOSCN_ID) {
        this.TRADEPOSCN_ID = TRADEPOSCN_ID;
    }
    
    public java.math.BigDecimal getTRADEPOSCN_ID() {
        return this.TRADEPOSCN_ID;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
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
        result.append("CATALOG_ID: " + getCATALOG_ID() + "||");
        result.append("CATGROUP_ID: " + getCATGROUP_ID() + "||");
        result.append("TRADEPOSCN_ID: " + getTRADEPOSCN_ID() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}