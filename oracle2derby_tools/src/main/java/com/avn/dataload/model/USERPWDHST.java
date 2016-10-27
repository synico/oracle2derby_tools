package com.avn.dataload.model;

public class USERPWDHST {


    private java.math.BigDecimal USERPWDHST_ID;
    
    public void setUSERPWDHST_ID(java.math.BigDecimal USERPWDHST_ID) {
        this.USERPWDHST_ID = USERPWDHST_ID;
    }
    
    public java.math.BigDecimal getUSERPWDHST_ID() {
        return this.USERPWDHST_ID;
    }
      

    private java.math.BigDecimal USERS_ID;
    
    public void setUSERS_ID(java.math.BigDecimal USERS_ID) {
        this.USERS_ID = USERS_ID;
    }
    
    public java.math.BigDecimal getUSERS_ID() {
        return this.USERS_ID;
    }
      

    private byte[] PREVLOGONPASSWORD;
    
    public void setPREVLOGONPASSWORD(byte[] PREVLOGONPASSWORD) {
        this.PREVLOGONPASSWORD = PREVLOGONPASSWORD;
    }
    
    public byte[] getPREVLOGONPASSWORD() {
        return this.PREVLOGONPASSWORD;
    }
      

    private java.lang.String SALT;
    
    public void setSALT(java.lang.String SALT) {
        this.SALT = SALT;
    }
    
    public java.lang.String getSALT() {
        return this.SALT;
    }
      

    private java.sql.Timestamp PASSWORDCREATION;
    
    public void setPASSWORDCREATION(java.sql.Timestamp PASSWORDCREATION) {
        this.PASSWORDCREATION = PASSWORDCREATION;
    }
    
    public java.sql.Timestamp getPASSWORDCREATION() {
        return this.PASSWORDCREATION;
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
        result.append("USERPWDHST_ID: " + getUSERPWDHST_ID() + "||");
        result.append("USERS_ID: " + getUSERS_ID() + "||");
        result.append("PREVLOGONPASSWORD: " + getPREVLOGONPASSWORD() + "||");
        result.append("SALT: " + getSALT() + "||");
        result.append("PASSWORDCREATION: " + getPASSWORDCREATION() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}