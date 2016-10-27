package com.avn.dataload.model;

public class CNTRDISPLY {


    private java.math.BigDecimal DEVICEFMT_ID;
    
    public void setDEVICEFMT_ID(java.math.BigDecimal DEVICEFMT_ID) {
        this.DEVICEFMT_ID = DEVICEFMT_ID;
    }
    
    public java.math.BigDecimal getDEVICEFMT_ID() {
        return this.DEVICEFMT_ID;
    }
      

    private java.math.BigDecimal CNTRDISPLY_ID;
    
    public void setCNTRDISPLY_ID(java.math.BigDecimal CNTRDISPLY_ID) {
        this.CNTRDISPLY_ID = CNTRDISPLY_ID;
    }
    
    public java.math.BigDecimal getCNTRDISPLY_ID() {
        return this.CNTRDISPLY_ID;
    }
      

    private java.math.BigDecimal CONTRACT_ID;
    
    public void setCONTRACT_ID(java.math.BigDecimal CONTRACT_ID) {
        this.CONTRACT_ID = CONTRACT_ID;
    }
    
    public java.math.BigDecimal getCONTRACT_ID() {
        return this.CONTRACT_ID;
    }
      

    private java.math.BigDecimal PARTROLE_ID;
    
    public void setPARTROLE_ID(java.math.BigDecimal PARTROLE_ID) {
        this.PARTROLE_ID = PARTROLE_ID;
    }
    
    public java.math.BigDecimal getPARTROLE_ID() {
        return this.PARTROLE_ID;
    }
      

    private java.lang.String DISPLAYPAGENAME;
    
    public void setDISPLAYPAGENAME(java.lang.String DISPLAYPAGENAME) {
        this.DISPLAYPAGENAME = DISPLAYPAGENAME;
    }
    
    public java.lang.String getDISPLAYPAGENAME() {
        return this.DISPLAYPAGENAME;
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
        result.append("DEVICEFMT_ID: " + getDEVICEFMT_ID() + "||");
        result.append("CNTRDISPLY_ID: " + getCNTRDISPLY_ID() + "||");
        result.append("CONTRACT_ID: " + getCONTRACT_ID() + "||");
        result.append("PARTROLE_ID: " + getPARTROLE_ID() + "||");
        result.append("DISPLAYPAGENAME: " + getDISPLAYPAGENAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}