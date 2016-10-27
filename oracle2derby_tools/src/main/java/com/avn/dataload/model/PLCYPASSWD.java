package com.avn.dataload.model;

public class PLCYPASSWD {


    private java.math.BigDecimal PLCYPASSWD_ID;
    
    public void setPLCYPASSWD_ID(java.math.BigDecimal PLCYPASSWD_ID) {
        this.PLCYPASSWD_ID = PLCYPASSWD_ID;
    }
    
    public java.math.BigDecimal getPLCYPASSWD_ID() {
        return this.PLCYPASSWD_ID;
    }
      

    private java.math.BigDecimal MINPASSWDLENGTH;
    
    public void setMINPASSWDLENGTH(java.math.BigDecimal MINPASSWDLENGTH) {
        this.MINPASSWDLENGTH = MINPASSWDLENGTH;
    }
    
    public java.math.BigDecimal getMINPASSWDLENGTH() {
        return this.MINPASSWDLENGTH;
    }
      

    private java.math.BigDecimal MINALPHABETIC;
    
    public void setMINALPHABETIC(java.math.BigDecimal MINALPHABETIC) {
        this.MINALPHABETIC = MINALPHABETIC;
    }
    
    public java.math.BigDecimal getMINALPHABETIC() {
        return this.MINALPHABETIC;
    }
      

    private java.math.BigDecimal MINNUMERIC;
    
    public void setMINNUMERIC(java.math.BigDecimal MINNUMERIC) {
        this.MINNUMERIC = MINNUMERIC;
    }
    
    public java.math.BigDecimal getMINNUMERIC() {
        return this.MINNUMERIC;
    }
      

    private java.math.BigDecimal MAXINSTANCES;
    
    public void setMAXINSTANCES(java.math.BigDecimal MAXINSTANCES) {
        this.MAXINSTANCES = MAXINSTANCES;
    }
    
    public java.math.BigDecimal getMAXINSTANCES() {
        return this.MAXINSTANCES;
    }
      

    private java.math.BigDecimal MAXCONSECUTIVETYPE;
    
    public void setMAXCONSECUTIVETYPE(java.math.BigDecimal MAXCONSECUTIVETYPE) {
        this.MAXCONSECUTIVETYPE = MAXCONSECUTIVETYPE;
    }
    
    public java.math.BigDecimal getMAXCONSECUTIVETYPE() {
        return this.MAXCONSECUTIVETYPE;
    }
      

    private java.math.BigDecimal MAXLIFETIME;
    
    public void setMAXLIFETIME(java.math.BigDecimal MAXLIFETIME) {
        this.MAXLIFETIME = MAXLIFETIME;
    }
    
    public java.math.BigDecimal getMAXLIFETIME() {
        return this.MAXLIFETIME;
    }
      

    private java.math.BigDecimal MATCHUSERID;
    
    public void setMATCHUSERID(java.math.BigDecimal MATCHUSERID) {
        this.MATCHUSERID = MATCHUSERID;
    }
    
    public java.math.BigDecimal getMATCHUSERID() {
        return this.MATCHUSERID;
    }
      

    private java.math.BigDecimal REUSEPASSWORD;
    
    public void setREUSEPASSWORD(java.math.BigDecimal REUSEPASSWORD) {
        this.REUSEPASSWORD = REUSEPASSWORD;
    }
    
    public java.math.BigDecimal getREUSEPASSWORD() {
        return this.REUSEPASSWORD;
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
        result.append("PLCYPASSWD_ID: " + getPLCYPASSWD_ID() + "||");
        result.append("MINPASSWDLENGTH: " + getMINPASSWDLENGTH() + "||");
        result.append("MINALPHABETIC: " + getMINALPHABETIC() + "||");
        result.append("MINNUMERIC: " + getMINNUMERIC() + "||");
        result.append("MAXINSTANCES: " + getMAXINSTANCES() + "||");
        result.append("MAXCONSECUTIVETYPE: " + getMAXCONSECUTIVETYPE() + "||");
        result.append("MAXLIFETIME: " + getMAXLIFETIME() + "||");
        result.append("MATCHUSERID: " + getMATCHUSERID() + "||");
        result.append("REUSEPASSWORD: " + getREUSEPASSWORD() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}