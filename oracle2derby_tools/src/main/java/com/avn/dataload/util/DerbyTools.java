package com.avn.dataload.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DerbyTools {
    
    private static final Logger log = Logger.getLogger(DerbyTools.class);
    
    private static final String GET_TABLE_NAME_SQL = "select tablename from sys.systables where tabletype='T' order by tablename asc";
    
    private static List<String> getTableNames() {
        List<String> tableNames = new LinkedList<String>();
        
        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("classpath:derby-ds-config.xml");
        DriverManagerDataSource ds1 = (DriverManagerDataSource) ctx1.getBean("derbyDS");
        Connection conn1 = null;
        try {
            conn1 = ds1.getConnection();
            PreparedStatement ps1 = conn1.prepareStatement(GET_TABLE_NAME_SQL);
            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next()) {
                tableNames.add(rs1.getString("TABLENAME"));
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(conn1 != null) {
                try {
                    conn1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return tableNames;
    }
    
    private static void dropIdxTempTable() {
        List<String> tableNames= getTableNames();
        
        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("classpath:derby-ds-config.xml");
        DriverManagerDataSource ds1 = (DriverManagerDataSource) ctx1.getBean("derbyDS");
        Connection conn1 = null;
        
        try{
            conn1 = ds1.getConnection();
            for(String tableName : tableNames) {
                if(tableName.startsWith("TI_") || tableName.startsWith("AV_TI_")) {
                    String dropSQL = "DROP TABLE " + tableName;
                    log.info("Table " + tableName + " will be droped");
                    PreparedStatement ps1 = conn1.prepareStatement(dropSQL);
                    ps1.execute();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(conn1 != null) {
                try {
                    conn1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    private static void compressTables() {
        List<String> tables2Compress = getTableNames();
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:derby-ds-config.xml");
        DriverManagerDataSource ds = (DriverManagerDataSource) ctx.getBean("derbyDS");
        Connection conn = null;
        
        try {
            conn = ds.getConnection();
            for(String tableName : tables2Compress) {
                CallableStatement cs = conn.prepareCall("CALL SYSCS_UTIL.SYSCS_COMPRESS_TABLE(?, ?, ?)");
                cs.setString(1, "APP");
                cs.setString(2, tableName);
                cs.setShort(3, (short)1);
                cs.execute();
                log.info("Table " + tableName + " compress is completed");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
    }

    public static void main(String[] args) {
        dropIdxTempTable();
//        compressTables();
    }

}
