package com.avn.dataload.util;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
    
    private static final String FTL_DIR = "E:\\scm\\git\\oracle2derby_tools\\oracle2derby_tools\\src\\main\\resources\\freemarker\\";

    private static ApplicationContext ctx;
    
    //Step1 generate mybatis generator configuration files
    public static void buildGeneratorConfig() {
        Configuration cfg = new Configuration();
        try {
            cfg.setDirectoryForTemplateLoading(new File(FTL_DIR));
            Template template = cfg.getTemplate("generator-config.ftl");
            Map props = createConfigEntries();
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
    
    public static void generateRowMappers() {
    	Configuration cfg = new Configuration();
        try {
            Map<String, List<String>> rowMappers = createRowMapperEntries();
            for (Entry<String, List<String>> rowMapper : rowMappers.entrySet()) {
            	 cfg.setDirectoryForTemplateLoading(new File(FTL_DIR));
                 Template template = cfg.getTemplate("RowMapper.ftl");
                 
                 String clsName = rowMapper.getKey();
                 
                 Map props = new HashMap();
                 props.put("rowMapper", rowMapper.getValue());
                 props.put("table_name", rowMapper.getKey());
                 File generatorCfg = new File("./src/main/java/com/avn/dataload/model/rowmapper/" + clsName + "RowMapper.java");
                 Writer cfgWriter = new FileWriter(generatorCfg);
                 template.process(props, cfgWriter);
                 cfgWriter.flush();
                 cfgWriter.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static Map<String, List<String>> createConfigEntries() {
    	Map<String, List<String>> result = new HashMap<String, List<String>>();
    	List<String> tableNames = readTableInfo();
    	List<String> configEntries = new ArrayList<String>(tableNames.size());
    	for (String tableName : tableNames) {
    		String temp = "<table schema=\"EMDI\" tableName=\""+ tableName + "\" enableSelectByExample=\"false\" enableUpdateByPrimaryKey=\"false\" enableDeleteByPrimaryKey=\"false\" enableDeleteByExample=\"false\" enableCountByExample=\"false\"   enableUpdateByExample=\"false\" selectByPrimaryKeyQueryId=\"false\" selectByExampleQueryId=\"false\" />";
    		configEntries.add(temp);
    	}
    	result.put("tables", configEntries);
    	return result;
    }
    
    private static List<String> readTableInfo() {
        List<String> tableNames = new ArrayList<String>();
        //Oracle
        ctx = new ClassPathXmlApplicationContext("classpath:oracle-ds-config.xml");
        DriverManagerDataSource ds = (DriverManagerDataSource) ctx.getBean("oracleDS");
        Connection conn = null;
        try {
            conn = ds.getConnection();
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                tableNames.add(rs.getString("TABLE_NAME"));
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
        return tableNames;
    }
    
    private static Map<String, List<String>> createRowMapperEntries() {
    	String regex = "([a-z])([A-Z]+)";
        String replacement = "$1_$2";
    	File dir = new File("./src/main/java/com/avn/dataload/model/emdi");
    	File clsFiles[] = dir.listFiles();
    	Map<String, List<String>> result = new HashMap<String, List<String>>();
    	List<String> setMethods = null;
    	for (File clsFile : clsFiles) {
    		String clsName = clsFile.getName().replace(".java", "");
    		try {
    			Class cls = Class.forName("com.avn.dataload.model.emdi." + clsName);
    			Object obj = cls.newInstance();
    			Method methods[] = obj.getClass().getDeclaredMethods();
    			setMethods = new ArrayList<String>();
    			for (Method m : methods) {
    				if(m.getName().startsWith("set")) {
    					String colName = m.getName().replace("set", "").replaceAll(regex, replacement).toUpperCase();
    					String tmp = "obj." + m.getName() + "(rs.get" + m.getParameterTypes()[0].getSimpleName() + "(\"" + colName + "\"))";
    					setMethods.add(tmp);
    				}
    			}
    		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e ) {
    			e.printStackTrace();
    		}
    		result.put(clsName, setMethods);
    	}
    	return result;
    }
    

    public static void main(String[] args) {
//        buildGeneratorConfig();
    	generateRowMappers();
    }

}
