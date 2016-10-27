package com.avn.dataload.model;

public class X_WKNBR_DATE {


    private java.lang.String WEEK_NBR;
    
    public void setWEEK_NBR(java.lang.String WEEK_NBR) {
        this.WEEK_NBR = WEEK_NBR;
    }
    
    public java.lang.String getWEEK_NBR() {
        return this.WEEK_NBR;
    }
      

    private java.sql.Timestamp WEEK_BEGIN_DATE;
    
    public void setWEEK_BEGIN_DATE(java.sql.Timestamp WEEK_BEGIN_DATE) {
        this.WEEK_BEGIN_DATE = WEEK_BEGIN_DATE;
    }
    
    public java.sql.Timestamp getWEEK_BEGIN_DATE() {
        return this.WEEK_BEGIN_DATE;
    }
      

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("WEEK_NBR: " + getWEEK_NBR() + "||");
        result.append("WEEK_BEGIN_DATE: " + getWEEK_BEGIN_DATE() + "||");
        return result.toString();
    }
    
}