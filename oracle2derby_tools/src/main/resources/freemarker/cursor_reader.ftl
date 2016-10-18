<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="
    http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd 
    http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd ">
    
    <context:annotation-config/>
    
    <bean id="jdbcCursorItemReader4${step.tableName?cap_first}" class="org.springframework.batch.item.database.JdbcCursorItemReader" scope="step">
    	<property name="dataSource" ref="${step.inDataSource}" />
    	<#assign columnList><#list step.columnList as column>${column},</#list></#assign>
    	<property name="sql" value="SELECT ${columnList?substring(0, (columnList?length-1))} FROM EMDI.${step.tableName}" />
    	<property name="rowMapper">
			<bean class="com.avn.dataload.model.rowmapper.${step.tableName}RowMapper" />
		</property>
		<property name="fetchSize" value="1000"/>
    </bean>
    
    <bean id="jdbcBatchItemWriter4${step.tableName}" class="org.springframework.batch.item.database.JdbcBatchItemWriter">
    	<property name="dataSource" ref="${step.outDataSource}" />
    	<property name="itemSqlParameterSourceProvider">
    		<bean class="org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider" />
    	</property>
    	<#assign columnList4insert><#list step.columnList as column>:${column},</#list></#assign>
    	<property name="sql">
    		<value>
    			<![CDATA[
    				INSERT INTO ${step.tableName}(${columnList?substring(0, (columnList?length-1))})
    				values (${columnList4insert?substring(0, (columnList4insert?length-1))}) 
    			]]>
    		</value>
    	</property>
    </bean>    
    
</beans>