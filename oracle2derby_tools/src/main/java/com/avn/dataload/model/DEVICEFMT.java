package com.avn.dataload.model;

public class DEVICEFMT {


    private java.lang.String DEVICETYPE_ID;
    
    public void setDEVICETYPE_ID(java.lang.String DEVICETYPE_ID) {
        this.DEVICETYPE_ID = DEVICETYPE_ID;
    }
    
    public java.lang.String getDEVICETYPE_ID() {
        return this.DEVICETYPE_ID;
    }
      

    private java.math.BigDecimal DEVICEFMT_ID;
    
    public void setDEVICEFMT_ID(java.math.BigDecimal DEVICEFMT_ID) {
        this.DEVICEFMT_ID = DEVICEFMT_ID;
    }
    
    public java.math.BigDecimal getDEVICEFMT_ID() {
        return this.DEVICEFMT_ID;
    }
      

    private java.lang.String DISPLAYNAME;
    
    public void setDISPLAYNAME(java.lang.String DISPLAYNAME) {
        this.DISPLAYNAME = DISPLAYNAME;
    }
    
    public java.lang.String getDISPLAYNAME() {
        return this.DISPLAYNAME;
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
        result.append("DEVICETYPE_ID: " + getDEVICETYPE_ID() + "||");
        result.append("DEVICEFMT_ID: " + getDEVICEFMT_ID() + "||");
        result.append("DISPLAYNAME: " + getDISPLAYNAME() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}