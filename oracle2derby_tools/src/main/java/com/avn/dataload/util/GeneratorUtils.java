package com.avn.dataload.util;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.avn.dataload.core.BatchStepEntity;
import com.avn.dataload.core.ColumnEntity;
import com.avn.dataload.core.StepEntity;

import freemarker.template.Configuration;
import freemarker.template.Template;

//@SuppressWarnings("all")
public class GeneratorUtils {
    
    private static final Logger log = Logger.getLogger(GeneratorUtils.class);
    
    private static final String CREATE_MODELS_SQL = "select table_name, num_rows from all_tables where tablespace_name='USERS' and table_name not like 'TI%' and table_name not like '%_TMP' and table_name not like '%_BACKUP' and num_rows>0 order by num_rows desc";
    
    private static final String TABLE_MORETHAN_1M_SQL = "select table_name, num_rows from all_tables where tablespace_name='USERS' and table_name not like 'TI%' and table_name not like '%_TMP' and table_name not like '%_BACKUP' and num_rows>=1000000 order by num_rows desc";
    
    private static final String TABLE_LESSTHAN_1M_SQL = "select table_name, num_rows from all_tables where tablespace_name='USERS' and table_name not like 'TI%' and table_name not like '%_TMP' and table_name not like '%_BACKUP' and num_rows>0 and num_rows<1000000 order by num_rows desc";
    
    private static final String FTL_DIR = "E:\\scm\\git\\oracle2derby_tools\\oracle2derby_tools\\src\\main\\resources\\freemarker\\";
    
    private static final String SCHEMA_ORACLE_SQL = "select table_name from all_tables where tablespace_name='USERS' and num_rows>1 and table_name not like 'TI_%' and table_name not like '%_TMP' and table_name not like '%_BACKUP' and num_rows>0 order by num_rows desc";
    
    private static final String SCHEMA_DERBY_SQL = "select tablename from sys.systables where tabletype='T' order by tablename asc";

    private static ApplicationContext ctx;
    
    //Step1 generate mybatis generator configuration files
    /**
     * @deprecated
     */
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
    
    //Step2 generate RowMappers
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
    
    /**
     * @deprecated
     * @return
     */
    private static Map<String, List<String>> createConfigEntries() {
    	Map<String, List<String>> result = new HashMap<String, List<String>>();
    	List<String> tableNames = readTableInfo(CREATE_MODELS_SQL);
    	List<String> configEntries = new ArrayList<String>(tableNames.size());
    	for (String tableName : tableNames) {
    		String temp = "<table schema=\"EMDI\" tableName=\""+ tableName + "\" enableSelectByExample=\"false\" enableUpdateByPrimaryKey=\"false\" enableDeleteByPrimaryKey=\"false\" enableDeleteByExample=\"false\" enableCountByExample=\"false\"   enableUpdateByExample=\"false\" selectByPrimaryKeyQueryId=\"false\" selectByExampleQueryId=\"false\" />";
    		configEntries.add(temp);
    	}
    	result.put("tables", configEntries);
    	return result;
    }
    
    private static List<String> readTableInfo(String sql) {
        List<String> tableNames = new LinkedList<String>();
        //Oracle
        ctx = new ClassPathXmlApplicationContext("classpath:oracle-ds-config.xml");
        DriverManagerDataSource ds = (DriverManagerDataSource) ctx.getBean("oracleDS");
        Connection conn = null;
        try {
            conn = ds.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
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
    	File dir = new File("./src/main/java/com/avn/dataload/model");
    	File clsFiles[] = dir.listFiles();
    	Map<String, List<String>> result = new HashMap<String, List<String>>();
    	List<String> setMethods = null;
    	for (File clsFile : clsFiles) {
    	    if(clsFile.isFile()) {
    	        String clsName = clsFile.getName().replace(".java", "");
                try {
                    Class cls = Class.forName("com.avn.dataload.model." + clsName);
                    Object obj = cls.newInstance();
                    Method methods[] = obj.getClass().getDeclaredMethods();
                    setMethods = new ArrayList<String>();
                    for (Method m : methods) {
                        if(m.getName().startsWith("set")) {
                            String colName = m.getName().replace("set", "").replaceAll(regex, replacement).toUpperCase();
                            String tmp = "obj." + m.getName() + "(rs.get" + m.getParameterTypes()[0].getSimpleName() + "(\"" + colName + "\"))";
                            //exceptions
                            if ("TIMESTAMP".equals(m.getParameterTypes()[0].getSimpleName())) {
                                tmp = "obj." + m.getName() + "(rs.getTimestamp(\"" + colName + "\"))";
                            }
                            if ("byte[]".equals(m.getParameterTypes()[0].getSimpleName())) {
                                tmp = "obj." + m.getName() + "(rs.getBytes(\"" + colName + "\"))";
                            }
                            if ("CLOB".equals(m.getParameterTypes()[0].getSimpleName())) {
                                tmp = "obj." + m.getName() + "(rs.getClob(\"" + colName + "\"))";
                            }
                            if ("BLOB".equals(m.getParameterTypes()[0].getSimpleName())) {
                                tmp = "obj." + m.getName() + "(rs.getBlob(\"" + colName + "\"))";
                            }
                            setMethods.add(tmp);
                        }
                    }
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e ) {
                    e.printStackTrace();
                }
                result.put(clsName, setMethods);
    	    }
    	}
    	return result;
    }
    
    private static void createModels() {
        List<String> tableNames = readTableInfo(CREATE_MODELS_SQL);
        
        ctx = new ClassPathXmlApplicationContext("classpath:oracle-ds-config.xml");
        DriverManagerDataSource ds = (DriverManagerDataSource) ctx.getBean("oracleDS");
        Connection conn = null;
        try {
            conn = ds.getConnection();
            
            Map props = new HashMap();
            for(String tableName : tableNames) {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM " + tableName + " WHERE ROWNUM < 1");
                ResultSetMetaData metaData = ps.getMetaData();
                log.info(tableName);
                List<ColumnEntity> columns = new ArrayList<ColumnEntity>();
                ColumnEntity colEntity;
                for (int i=0; i < metaData.getColumnCount(); i++) {
                    colEntity = new ColumnEntity();
                    colEntity.setName(metaData.getColumnName(i + 1));
                    colEntity.setType(metaData.getColumnClassName(i + 1));
                    //exceptions
                    if("oracle.sql.TIMESTAMP".equals(metaData.getColumnClassName(i + 1))) {
                        colEntity.setType("java.sql.Timestamp");
                    }
                    if("oracle.sql.CLOB".equals(metaData.getColumnClassName(i + 1))) {
                        colEntity.setType("java.sql.Clob");
                    }
                    if("oracle.sql.BLOB".equals(metaData.getColumnClassName(i + 1))) {
                        colEntity.setType("java.sql.Blob");
                    }
                    columns.add(colEntity);
                    log.info("column name: " + metaData.getColumnName(i + 1) + ", column type: " + metaData.getColumnClassName(i+1) + ", maxLength: " + metaData.getPrecision(i+1) + ", scale: " + metaData.getScale(i+1));
                    
                }
                props.put("table_name", tableName);
                props.put("columns", columns);
                generateFileByTemplate("model.ftl", "./src/main/java/com/avn/dataload/model/" + tableName + ".java", props);
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
    
    private static void generateFileByTemplate(String templateName, String targetFile, Map props) {
        Configuration cfg = new Configuration();
        try {
            cfg.setDirectoryForTemplateLoading(new File(FTL_DIR));
            Template template = cfg.getTemplate(templateName);
            File generatedFile = new File(targetFile);
            Writer cfgWriter = new FileWriter(generatedFile);
            template.process(props, cfgWriter);
            cfgWriter.flush();
            cfgWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void genPagingItemReaderAndWriters() {
        File dir = new File("./src/main/java/com/avn/dataload/model");
        File clsFiles[] = dir.listFiles();
        List bigTables = readTableInfo(TABLE_MORETHAN_1M_SQL);
        Map props = new HashMap();
        for (File clsFile : clsFiles) {
            if(clsFile.isFile()) {
                StepEntity entity = new StepEntity();
                String clsName = clsFile.getName().replace(".java", "");
                Class cls;
                List<String> cols = new LinkedList<String>();
                try {
                    cls = Class.forName("com.avn.dataload.model." + clsName);
                    Object obj = cls.newInstance();
                    Field[] fields = obj.getClass().getDeclaredFields();
                    for(Field field : fields) {
                        cols.add(field.getName());
                    }
                    entity.setColumnList(cols);
                    entity.setInDataSource("oracleDS");
                    entity.setOutDataSource("derbyDS");
                    entity.setTableName(clsName);
                    entity.setSortKey(fields[0].getName());
                    if(bigTables.contains(clsName)) {
                        entity.setTableNickName("DERBY_" + clsName);
                    } else {
                        entity.setTableNickName(clsName);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                props.put("step", entity);
                generateFileByTemplate("paging_reader.ftl", "./src/main/resources/paging_reader/" + clsName.toLowerCase() + "-batch.xml", props);
            }
        }
    }
    
    public static void genCursorItemReaderAndWriters() {
        File dir = new File("./src/main/java/com/avn/dataload/model");
        File clsFiles[] = dir.listFiles();
        List bigTables = readTableInfo(TABLE_MORETHAN_1M_SQL);
        Map props = new HashMap();
        for (File clsFile : clsFiles) {
            if(clsFile.isFile()) {
                StepEntity entity = new StepEntity();
                String clsName = clsFile.getName().replace(".java", "");
                Class cls;
                List<String> cols = new LinkedList<String>();
                try {
                    cls = Class.forName("com.avn.dataload.model." + clsName);
                    Object obj = cls.newInstance();
                    Field[] fields = obj.getClass().getDeclaredFields();
                    entity.setFetchSize("1000");
                    for(Field field : fields) {
                        cols.add(field.getName());
                        if(field.getType().getSimpleName().contains("lob")) {
                            entity.setFetchSize("100");
                        }
                    }
                    entity.setColumnList(cols);
                    entity.setInDataSource("oracleDS");
                    entity.setOutDataSource("derbyDS");
                    entity.setTableName(clsName);
                    entity.setSortKey(fields[0].getName());
                    if(bigTables.contains(clsName)) {
                        entity.setTableNickName("DERBY_" + clsName);
                    } else {
                        entity.setTableNickName(clsName);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                props.put("step", entity);
                generateFileByTemplate("cursor_reader.ftl", "./src/main/resources/cursor_reader/" + clsName.toLowerCase() + "-batch.xml", props);
            }
        }
    }
    
    public static void buildBatchJobConfig(String type) {
        List<String> tableNames = readTableInfo(SCHEMA_ORACLE_SQL);
        List<String> unselectedTables = new ArrayList<String>();
        unselectedTables.add("SEOURLKEYWORD");
        unselectedTables.add("SEOURL");
        unselectedTables.add("CACHEIVL");
        unselectedTables.add("SEOREDIRECT");
        unselectedTables.add("X_FCST_QTY_CALC");
        unselectedTables.add("XFCSTQTYDETAILS");
        unselectedTables.add("X_SAP_SALESDOC_SCHED_LN");
        unselectedTables.add("X_ZFC_UPLOAD_LOG");
        unselectedTables.add("X_SAP_SALESDOC_ITEM");
        unselectedTables.add("DSR_SALES_ORDER_SUBSET1");
        unselectedTables.add("ATCHREL");
        unselectedTables.add("ATCHRELDSC");
        unselectedTables.add("TMP_CATENTRYIDS");
        tableNames.removeAll(unselectedTables);
        
        tableNames.add(null);
        BatchStepEntity entity = null;
        List<BatchStepEntity> steps = new LinkedList<BatchStepEntity>();
        for(int i=0; i < (tableNames.size() - 1); i++) {
            entity = new BatchStepEntity();
            entity.setCurrent(tableNames.get(i));
            entity.setNext(tableNames.get(i+1));
            if("paging".equalsIgnoreCase(type)) {
                entity.setReaderType("Paging");
            } else {
                entity.setReaderType("Cursor");
            }
            steps.add(entity);
        }
        Map props = new HashMap();
        props.put("tables", steps);
        props.put("type", type);
        generateFileByTemplate("batch-job.ftl", "./src/main/resources/" + type + "-job.xml", props);
    }
    
    public static void compareSchemas() {
        List<String> oracleTables = new LinkedList<String>();
        //Oracle
        ctx = new ClassPathXmlApplicationContext("classpath:oracle-ds-config.xml");
        DriverManagerDataSource ds = (DriverManagerDataSource) ctx.getBean("oracleDS");
        Connection conn = null;
        try {
            conn = ds.getConnection();
            PreparedStatement ps = conn.prepareStatement(SCHEMA_ORACLE_SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                oracleTables.add(rs.getString("TABLE_NAME"));
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
        
        List<String> derbyTables = new LinkedList<String>();
        //Derby
        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("classpath:derby-ds-config.xml");
        DriverManagerDataSource ds1 = (DriverManagerDataSource) ctx1.getBean("derbyDS");
        Connection conn1 = null;
        try {
            conn1 = ds1.getConnection();
            PreparedStatement ps1 = conn1.prepareStatement(SCHEMA_DERBY_SQL);
            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next()) {
                derbyTables.add(rs1.getString("TABLENAME"));
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
        
        for(String derbyTable : derbyTables) {
            oracleTables.remove(derbyTable);
        }
        
        for(String table : oracleTables) {
            log.info("table name: " + table);
        }
        log.info("xxx" + oracleTables.size());
    }
    

    public static void main(String[] args) {
//        buildGeneratorConfig();
//        createModels();
//        generateRowMappers();
//        genPagingItemReaderAndWriters();
//        genCursorItemReaderAndWriters();
        buildBatchJobConfig("cursor");
//        compareSchemas();
    }

}
