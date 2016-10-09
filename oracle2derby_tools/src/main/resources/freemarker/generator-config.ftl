<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN" "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">
<generatorConfiguration>
    <classPathEntry location="E:\maven\repository\com\oracle\ojdbc6\11.2.0\ojdbc6-11.2.0.jar"/>
    <context id="context1">
        <jdbcConnection connectionURL="jdbc:oracle:thin:@//172.25.73.172:1521/avdsh" driverClass="oracle.jdbc.driver.OracleDriver" userId="emdi" password="Avnet001" />
        
        <javaModelGenerator targetPackage="com.dataload.model" targetProject="${project_name}" >
          <property name="enableSubPackages" value="true"/>
          <property name="trimStrings" value="true"/>
        </javaModelGenerator>
        
        <!-- <sqlMapGenerator targetPackage="com.dataload.mapper" targetProject="${project_name}" >
          <property name="enableSubPackages" value="true"/>
        </sqlMapGenerator> -->
        
        <!-- <javaClientGenerator targetPackage="com.dataload.mapper" targetProject="${project_name}" type="XMLMAPPER" >
          <property name="enableSubPackages" value="true"/>
        </javaClientGenerator> -->
        
        <#list tables as table_info>
            ${table_info}
        </#list>
        
    </context>
</generatorConfiguration>