package com.avn.dataload.model;

public class PROFILE {


    private java.math.BigDecimal PROFILE_ID;
    
    public void setPROFILE_ID(java.math.BigDecimal PROFILE_ID) {
        this.PROFILE_ID = PROFILE_ID;
    }
    
    public java.math.BigDecimal getPROFILE_ID() {
        return this.PROFILE_ID;
    }
      

    private java.math.BigDecimal STORE_ID;
    
    public void setSTORE_ID(java.math.BigDecimal STORE_ID) {
        this.STORE_ID = STORE_ID;
    }
    
    public java.math.BigDecimal getSTORE_ID() {
        return this.STORE_ID;
    }
      

    private java.math.BigDecimal DEVICEFMT_ID;
    
    public void setDEVICEFMT_ID(java.math.BigDecimal DEVICEFMT_ID) {
        this.DEVICEFMT_ID = DEVICEFMT_ID;
    }
    
    public java.math.BigDecimal getDEVICEFMT_ID() {
        return this.DEVICEFMT_ID;
    }
      

    private java.math.BigDecimal TRANSPORT_ID;
    
    public void setTRANSPORT_ID(java.math.BigDecimal TRANSPORT_ID) {
        this.TRANSPORT_ID = TRANSPORT_ID;
    }
    
    public java.math.BigDecimal getTRANSPORT_ID() {
        return this.TRANSPORT_ID;
    }
      

    private java.math.BigDecimal MSGTYPE_ID;
    
    public void setMSGTYPE_ID(java.math.BigDecimal MSGTYPE_ID) {
        this.MSGTYPE_ID = MSGTYPE_ID;
    }
    
    public java.math.BigDecimal getMSGTYPE_ID() {
        return this.MSGTYPE_ID;
    }
      

    private java.lang.String USERSVIEW;
    
    public void setUSERSVIEW(java.lang.String USERSVIEW) {
        this.USERSVIEW = USERSVIEW;
    }
    
    public java.lang.String getUSERSVIEW() {
        return this.USERSVIEW;
    }
      

    private java.math.BigDecimal LOWPRIORITY;
    
    public void setLOWPRIORITY(java.math.BigDecimal LOWPRIORITY) {
        this.LOWPRIORITY = LOWPRIORITY;
    }
    
    public java.math.BigDecimal getLOWPRIORITY() {
        return this.LOWPRIORITY;
    }
      

    private java.math.BigDecimal HIGHPRIORITY;
    
    public void setHIGHPRIORITY(java.math.BigDecimal HIGHPRIORITY) {
        this.HIGHPRIORITY = HIGHPRIORITY;
    }
    
    public java.math.BigDecimal getHIGHPRIORITY() {
        return this.HIGHPRIORITY;
    }
      

    private java.math.BigDecimal ARCHIVEMSG;
    
    public void setARCHIVEMSG(java.math.BigDecimal ARCHIVEMSG) {
        this.ARCHIVEMSG = ARCHIVEMSG;
    }
    
    public java.math.BigDecimal getARCHIVEMSG() {
        return this.ARCHIVEMSG;
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
        result.append("PROFILE_ID: " + getPROFILE_ID() + "||");
        result.append("STORE_ID: " + getSTORE_ID() + "||");
        result.append("DEVICEFMT_ID: " + getDEVICEFMT_ID() + "||");
        result.append("TRANSPORT_ID: " + getTRANSPORT_ID() + "||");
        result.append("MSGTYPE_ID: " + getMSGTYPE_ID() + "||");
        result.append("USERSVIEW: " + getUSERSVIEW() + "||");
        result.append("LOWPRIORITY: " + getLOWPRIORITY() + "||");
        result.append("HIGHPRIORITY: " + getHIGHPRIORITY() + "||");
        result.append("ARCHIVEMSG: " + getARCHIVEMSG() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}