package com.avn.dataload.model;

public class ATCHAST {


    private java.math.BigDecimal ATCHAST_ID;
    
    public void setATCHAST_ID(java.math.BigDecimal ATCHAST_ID) {
        this.ATCHAST_ID = ATCHAST_ID;
    }
    
    public java.math.BigDecimal getATCHAST_ID() {
        return this.ATCHAST_ID;
    }
      

    private java.math.BigDecimal STOREENT_ID;
    
    public void setSTOREENT_ID(java.math.BigDecimal STOREENT_ID) {
        this.STOREENT_ID = STOREENT_ID;
    }
    
    public java.math.BigDecimal getSTOREENT_ID() {
        return this.STOREENT_ID;
    }
      

    private java.math.BigDecimal ATCHTGT_ID;
    
    public void setATCHTGT_ID(java.math.BigDecimal ATCHTGT_ID) {
        this.ATCHTGT_ID = ATCHTGT_ID;
    }
    
    public java.math.BigDecimal getATCHTGT_ID() {
        return this.ATCHTGT_ID;
    }
      

    private java.lang.String ATCHASTPATH;
    
    public void setATCHASTPATH(java.lang.String ATCHASTPATH) {
        this.ATCHASTPATH = ATCHASTPATH;
    }
    
    public java.lang.String getATCHASTPATH() {
        return this.ATCHASTPATH;
    }
      

    private java.lang.String DIRECTORYPATH;
    
    public void setDIRECTORYPATH(java.lang.String DIRECTORYPATH) {
        this.DIRECTORYPATH = DIRECTORYPATH;
    }
    
    public java.lang.String getDIRECTORYPATH() {
        return this.DIRECTORYPATH;
    }
      

    private java.lang.String MIMETYPE;
    
    public void setMIMETYPE(java.lang.String MIMETYPE) {
        this.MIMETYPE = MIMETYPE;
    }
    
    public java.lang.String getMIMETYPE() {
        return this.MIMETYPE;
    }
      

    private java.lang.String MIMETYPEENCODING;
    
    public void setMIMETYPEENCODING(java.lang.String MIMETYPEENCODING) {
        this.MIMETYPEENCODING = MIMETYPEENCODING;
    }
    
    public java.lang.String getMIMETYPEENCODING() {
        return this.MIMETYPEENCODING;
    }
      

    private java.sql.Timestamp TIMECREATED;
    
    public void setTIMECREATED(java.sql.Timestamp TIMECREATED) {
        this.TIMECREATED = TIMECREATED;
    }
    
    public java.sql.Timestamp getTIMECREATED() {
        return this.TIMECREATED;
    }
      

    private java.sql.Timestamp TIMEUPDATED;
    
    public void setTIMEUPDATED(java.sql.Timestamp TIMEUPDATED) {
        this.TIMEUPDATED = TIMEUPDATED;
    }
    
    public java.sql.Timestamp getTIMEUPDATED() {
        return this.TIMEUPDATED;
    }
      

    private java.lang.String IMAGE1;
    
    public void setIMAGE1(java.lang.String IMAGE1) {
        this.IMAGE1 = IMAGE1;
    }
    
    public java.lang.String getIMAGE1() {
        return this.IMAGE1;
    }
      

    private java.lang.String IMAGE2;
    
    public void setIMAGE2(java.lang.String IMAGE2) {
        this.IMAGE2 = IMAGE2;
    }
    
    public java.lang.String getIMAGE2() {
        return this.IMAGE2;
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
        result.append("ATCHAST_ID: " + getATCHAST_ID() + "||");
        result.append("STOREENT_ID: " + getSTOREENT_ID() + "||");
        result.append("ATCHTGT_ID: " + getATCHTGT_ID() + "||");
        result.append("ATCHASTPATH: " + getATCHASTPATH() + "||");
        result.append("DIRECTORYPATH: " + getDIRECTORYPATH() + "||");
        result.append("MIMETYPE: " + getMIMETYPE() + "||");
        result.append("MIMETYPEENCODING: " + getMIMETYPEENCODING() + "||");
        result.append("TIMECREATED: " + getTIMECREATED() + "||");
        result.append("TIMEUPDATED: " + getTIMEUPDATED() + "||");
        result.append("IMAGE1: " + getIMAGE1() + "||");
        result.append("IMAGE2: " + getIMAGE2() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        return result.toString();
    }
    
}