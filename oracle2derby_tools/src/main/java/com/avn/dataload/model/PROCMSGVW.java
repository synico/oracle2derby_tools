package com.avn.dataload.model;

public class PROCMSGVW {


    private java.math.BigDecimal ORGENTITY_ID;
    
    public void setORGENTITY_ID(java.math.BigDecimal ORGENTITY_ID) {
        this.ORGENTITY_ID = ORGENTITY_ID;
    }
    
    public java.math.BigDecimal getORGENTITY_ID() {
        return this.ORGENTITY_ID;
    }
      

    private java.lang.String MSGNAME;
    
    public void setMSGNAME(java.lang.String MSGNAME) {
        this.MSGNAME = MSGNAME;
    }
    
    public java.lang.String getMSGNAME() {
        return this.MSGNAME;
    }
      

    private java.lang.String VIEWNAME;
    
    public void setVIEWNAME(java.lang.String VIEWNAME) {
        this.VIEWNAME = VIEWNAME;
    }
    
    public java.lang.String getVIEWNAME() {
        return this.VIEWNAME;
    }
      

    private java.math.BigDecimal PROCPROTCL_ID;
    
    public void setPROCPROTCL_ID(java.math.BigDecimal PROCPROTCL_ID) {
        this.PROCPROTCL_ID = PROCPROTCL_ID;
    }
    
    public java.math.BigDecimal getPROCPROTCL_ID() {
        return this.PROCPROTCL_ID;
    }
      

    private java.lang.String ERRORVIEW;
    
    public void setERRORVIEW(java.lang.String ERRORVIEW) {
        this.ERRORVIEW = ERRORVIEW;
    }
    
    public java.lang.String getERRORVIEW() {
        return this.ERRORVIEW;
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
        result.append("ORGENTITY_ID: " + getORGENTITY_ID() + "||");
        result.append("MSGNAME: " + getMSGNAME() + "||");
        result.append("VIEWNAME: " + getVIEWNAME() + "||");
        result.append("PROCPROTCL_ID: " + getPROCPROTCL_ID() + "||");
        result.append("ERRORVIEW: " + getERRORVIEW() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}