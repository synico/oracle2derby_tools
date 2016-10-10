package com.avn.dataload.core;

import java.util.List;

public class StepEntity {
    
    private String inDataSource;
    
    private String outDataSource;
    
    private String tableName;
    
    private List<String> columnList;
    
    private String sortKey;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<String> columnList) {
        this.columnList = columnList;
    }

    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public String getInDataSource() {
        return inDataSource;
    }

    public void setInDataSource(String inDataSource) {
        this.inDataSource = inDataSource;
    }

    public String getOutDataSource() {
        return outDataSource;
    }

    public void setOutDataSource(String outDataSource) {
        this.outDataSource = outDataSource;
    }
    
}
