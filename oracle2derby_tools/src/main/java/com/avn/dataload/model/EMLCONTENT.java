package com.avn.dataload.model;

import java.math.BigDecimal;
import java.util.Date;

public class EMLCONTENT {
    

    private java.math.BigDecimal EMLCONTENT_ID;
    
    public void setEMLCONTENT_ID(java.math.BigDecimal EMLCONTENT_ID) {
        this.EMLCONTENT_ID = EMLCONTENT_ID;
    }
    
    public java.math.BigDecimal getEMLCONTENT_ID() {
        return this.EMLCONTENT_ID;
    }
      

    private java.sql.Timestamp LASTMODIFY;
    
    public void setLASTMODIFY(java.sql.Timestamp LASTMODIFY) {
        this.LASTMODIFY = LASTMODIFY;
    }
    
    public java.sql.Timestamp getLASTMODIFY() {
        return this.LASTMODIFY;
    }
      

    private java.math.BigDecimal RECORDOPEN;
    
    public void setRECORDOPEN(java.math.BigDecimal RECORDOPEN) {
        this.RECORDOPEN = RECORDOPEN;
    }
    
    public java.math.BigDecimal getRECORDOPEN() {
        return this.RECORDOPEN;
    }
      

    private java.lang.String EMLSUBJECT;
    
    public void setEMLSUBJECT(java.lang.String EMLSUBJECT) {
        this.EMLSUBJECT = EMLSUBJECT;
    }
    
    public java.lang.String getEMLSUBJECT() {
        return this.EMLSUBJECT;
    }
      

    private java.sql.Clob EMLBODY;
    
    public void setEMLBODY(java.sql.Clob EMLBODY) {
        this.EMLBODY = EMLBODY;
    }
    
    public java.sql.Clob getEMLBODY() {
        return this.EMLBODY;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      
    
}