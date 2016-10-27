package com.avn.dataload.model;

public class XROLEREQUEST {


    private java.math.BigDecimal USERS_ID;
    
    public void setUSERS_ID(java.math.BigDecimal USERS_ID) {
        this.USERS_ID = USERS_ID;
    }
    
    public java.math.BigDecimal getUSERS_ID() {
        return this.USERS_ID;
    }
      

    private java.math.BigDecimal ORGANIZATION_ID;
    
    public void setORGANIZATION_ID(java.math.BigDecimal ORGANIZATION_ID) {
        this.ORGANIZATION_ID = ORGANIZATION_ID;
    }
    
    public java.math.BigDecimal getORGANIZATION_ID() {
        return this.ORGANIZATION_ID;
    }
      

    private java.math.BigDecimal APPROVER_ID;
    
    public void setAPPROVER_ID(java.math.BigDecimal APPROVER_ID) {
        this.APPROVER_ID = APPROVER_ID;
    }
    
    public java.math.BigDecimal getAPPROVER_ID() {
        return this.APPROVER_ID;
    }
      

    private java.math.BigDecimal ROLE_ID;
    
    public void setROLE_ID(java.math.BigDecimal ROLE_ID) {
        this.ROLE_ID = ROLE_ID;
    }
    
    public java.math.BigDecimal getROLE_ID() {
        return this.ROLE_ID;
    }
      

    private java.math.BigDecimal MBRGRP_ID;
    
    public void setMBRGRP_ID(java.math.BigDecimal MBRGRP_ID) {
        this.MBRGRP_ID = MBRGRP_ID;
    }
    
    public java.math.BigDecimal getMBRGRP_ID() {
        return this.MBRGRP_ID;
    }
      

    private java.math.BigDecimal STATUS;
    
    public void setSTATUS(java.math.BigDecimal STATUS) {
        this.STATUS = STATUS;
    }
    
    public java.math.BigDecimal getSTATUS() {
        return this.STATUS;
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
        result.append("USERS_ID: " + getUSERS_ID() + "||");
        result.append("ORGANIZATION_ID: " + getORGANIZATION_ID() + "||");
        result.append("APPROVER_ID: " + getAPPROVER_ID() + "||");
        result.append("ROLE_ID: " + getROLE_ID() + "||");
        result.append("MBRGRP_ID: " + getMBRGRP_ID() + "||");
        result.append("STATUS: " + getSTATUS() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}