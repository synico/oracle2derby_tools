package com.avn.dataload.util;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import freemarker.template.Configuration;
import freemarker.template.Template;

//@SuppressWarnings("all")
public class GeneratorUtils {
    
    private static final Logger log = Logger.getLogger(GeneratorUtils.class);
    
    private static final String SQL = "select table_name, num_rows from all_tables where tablespace_name='USERS' and table_name not like 'TI%' and num_rows>0 order by num_rows desc";

    private static ApplicationContext ctx;
    
    //Step1 generate mybatis generator configuration files
    public static void buildGeneratorConfig() {
        String dir = "E:\\scm\\git\\oracle2derby_tools\\oracle2derby_tools\\src\\main\\resources\\freemarker\\";
        Configuration cfg = new Configuration();
        try {
            cfg.setDirectoryForTemplateLoading(new File(dir));
            Template template = cfg.getTemplate("generator-config.ftl");
            Map props = readTableInfo();
            props.put("project_name", "oracle2derby_tools");
            File generatorCfg = new File("./src/main/resources/generator-config.xml");
            Writer cfgWriter = new FileWriter(generatorCfg);
            template.process(props, cfgWriter);
            cfgWriter.flush();
            cfgWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static Map<String, List<String>> readTableInfo() {
        Map<String, List<String>> result = new HashMap<String, List<String>>();
        List<String> tables = new ArrayList<String>();
        ctx = new ClassPathXmlApplicationContext("classpath:oracle-ds-config.xml");
        DriverManagerDataSource ds = (DriverManagerDataSource) ctx.getBean("oracleDS");
        Connection conn = null;
        try {
            conn = ds.getConnection();
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String temp = "<table schema=\"EMDI\" tableName=\""+ rs.getString("TABLE_NAME") + "\" enableSelectByExample=\"false\" enableUpdateByPrimaryKey=\"false\" enableDeleteByPrimaryKey=\"false\" enableDeleteByExample=\"false\" enableCountByExample=\"false\"   enableUpdateByExample=\"false\" selectByPrimaryKeyQueryId=\"false\" selectByExampleQueryId=\"false\" />";
                log.info(temp);
                tables.add(temp);
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
        result.put("tables", tables);
        return result;
    }

    public static void main(String[] args) {
        buildGeneratorConfig();
    }

}
