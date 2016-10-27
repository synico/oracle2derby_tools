package com.avn.dataload.model;

public class CMFILE {


    private java.math.BigDecimal CMFILE_ID;
    
    public void setCMFILE_ID(java.math.BigDecimal CMFILE_ID) {
        this.CMFILE_ID = CMFILE_ID;
    }
    
    public java.math.BigDecimal getCMFILE_ID() {
        return this.CMFILE_ID;
    }
      

    private java.lang.String CMFILEPATH;
    
    public void setCMFILEPATH(java.lang.String CMFILEPATH) {
        this.CMFILEPATH = CMFILEPATH;
    }
    
    public java.lang.String getCMFILEPATH() {
        return this.CMFILEPATH;
    }
      

    private java.math.BigDecimal PROMOTE_FS;
    
    public void setPROMOTE_FS(java.math.BigDecimal PROMOTE_FS) {
        this.PROMOTE_FS = PROMOTE_FS;
    }
    
    public java.math.BigDecimal getPROMOTE_FS() {
        return this.PROMOTE_FS;
    }
      

    private java.sql.Timestamp UPLOAD_TIMESTAMP;
    
    public void setUPLOAD_TIMESTAMP(java.sql.Timestamp UPLOAD_TIMESTAMP) {
        this.UPLOAD_TIMESTAMP = UPLOAD_TIMESTAMP;
    }
    
    public java.sql.Timestamp getUPLOAD_TIMESTAMP() {
        return this.UPLOAD_TIMESTAMP;
    }
      

    private java.sql.Timestamp PROMOTE_TIMESTAMP;
    
    public void setPROMOTE_TIMESTAMP(java.sql.Timestamp PROMOTE_TIMESTAMP) {
        this.PROMOTE_TIMESTAMP = PROMOTE_TIMESTAMP;
    }
    
    public java.sql.Timestamp getPROMOTE_TIMESTAMP() {
        return this.PROMOTE_TIMESTAMP;
    }
      

    private java.math.BigDecimal ASSOCIATED;
    
    public void setASSOCIATED(java.math.BigDecimal ASSOCIATED) {
        this.ASSOCIATED = ASSOCIATED;
    }
    
    public java.math.BigDecimal getASSOCIATED() {
        return this.ASSOCIATED;
    }
      

    private java.math.BigDecimal STORAGE_TYPE;
    
    public void setSTORAGE_TYPE(java.math.BigDecimal STORAGE_TYPE) {
        this.STORAGE_TYPE = STORAGE_TYPE;
    }
    
    public java.math.BigDecimal getSTORAGE_TYPE() {
        return this.STORAGE_TYPE;
    }
      

    private java.math.BigDecimal OPTCOUNTER;
    
    public void setOPTCOUNTER(java.math.BigDecimal OPTCOUNTER) {
        this.OPTCOUNTER = OPTCOUNTER;
    }
    
    public java.math.BigDecimal getOPTCOUNTER() {
        return this.OPTCOUNTER;
    }
      

    private java.math.BigDecimal CMFILEDIR_ID;
    
    public void setCMFILEDIR_ID(java.math.BigDecimal CMFILEDIR_ID) {
        this.CMFILEDIR_ID = CMFILEDIR_ID;
    }
    
    public java.math.BigDecimal getCMFILEDIR_ID() {
        return this.CMFILEDIR_ID;
    }
      

    private java.math.BigDecimal FILESIZE;
    
    public void setFILESIZE(java.math.BigDecimal FILESIZE) {
        this.FILESIZE = FILESIZE;
    }
    
    public java.math.BigDecimal getFILESIZE() {
        return this.FILESIZE;
    }
      

    private java.math.BigDecimal PUBLISHED;
    
    public void setPUBLISHED(java.math.BigDecimal PUBLISHED) {
        this.PUBLISHED = PUBLISHED;
    }
    
    public java.math.BigDecimal getPUBLISHED() {
        return this.PUBLISHED;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("CMFILE_ID: " + getCMFILE_ID() + "||");
        result.append("CMFILEPATH: " + getCMFILEPATH() + "||");
        result.append("PROMOTE_FS: " + getPROMOTE_FS() + "||");
        result.append("UPLOAD_TIMESTAMP: " + getUPLOAD_TIMESTAMP() + "||");
        result.append("PROMOTE_TIMESTAMP: " + getPROMOTE_TIMESTAMP() + "||");
        result.append("ASSOCIATED: " + getASSOCIATED() + "||");
        result.append("STORAGE_TYPE: " + getSTORAGE_TYPE() + "||");
        result.append("OPTCOUNTER: " + getOPTCOUNTER() + "||");
        result.append("CMFILEDIR_ID: " + getCMFILEDIR_ID() + "||");
        result.append("FILESIZE: " + getFILESIZE() + "||");
        result.append("PUBLISHED: " + getPUBLISHED() + "||");
        return result.toString();
    }
    
}