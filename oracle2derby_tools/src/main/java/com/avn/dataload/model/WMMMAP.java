package com.avn.dataload.model;

public class WMMMAP {


    private java.math.BigDecimal MEMBER_ID;
    
    public void setMEMBER_ID(java.math.BigDecimal MEMBER_ID) {
        this.MEMBER_ID = MEMBER_ID;
    }
    
    public java.math.BigDecimal getMEMBER_ID() {
        return this.MEMBER_ID;
    }
      

    private java.lang.String MEMBER_UNIQUE_ID;
    
    public void setMEMBER_UNIQUE_ID(java.lang.String MEMBER_UNIQUE_ID) {
        this.MEMBER_UNIQUE_ID = MEMBER_UNIQUE_ID;
    }
    
    public java.lang.String getMEMBER_UNIQUE_ID() {
        return this.MEMBER_UNIQUE_ID;
    }
      

    private java.sql.Timestamp LASTSYNC;
    
    public void setLASTSYNC(java.sql.Timestamp LASTSYNC) {
        this.LASTSYNC = LASTSYNC;
    }
    
    public java.sql.Timestamp getLASTSYNC() {
        return this.LASTSYNC;
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
        result.append("MEMBER_ID: " + getMEMBER_ID() + "||");
        result.append("MEMBER_UNIQUE_ID: " + getMEMBER_UNIQUE_ID() + "||");
        result.append("LASTSYNC: " + getLASTSYNC() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}