<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="
    http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd 
    http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd ">
    
    <context:annotation-config/>
    
    <import resource="oracle-ds-config.xml" />
    <import resource="derby-ds-config.xml" />
    
    <bean id="jdbcPagingItemReader4Category" class="org.springframework.batch.item.database.JdbcPagingItemReader" scope="step">
    	<property name="dataSource" ref="${step.dataSource}" />
    	<property name="rowMapper">
			<bean class="com.avn.dataload.rowmapper.${step.tableName}RowMapper" />
		</property>
		<property name="queryProvider">
			<bean class="org.springframework.batch.item.database.support.SqlPagingQueryProviderFactoryBean">
				<property name="dataSource" ref="${step.dataSource}" />
				<property name="selectClause" value="SELECT ${step.columnList}" />
		    	<property name="fromClause" value="FROM EMDI.${step.tableName}" />
		    	<property name="sortKeys">
		    		<map>
		    			<entry key="${step.sortKey}" value="DESCENDING" />
		    		</map>
		    	</property>
			</bean>
		</property>
    	<property name="pageSize" value="1000"/>
    </bean>
    
    <bean id="jdbcBatchItemWriter4Category" class="org.springframework.batch.item.database.JdbcBatchItemWriter">
    	<property name="dataSource" ref="derbyDS" />
    	<property name="itemSqlParameterSourceProvider">
    		<bean class="org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider" />
    	</property>
    	<property name="sql">
    		<value>
    			<![CDATA[
    				INSERT INTO CATENTRY(CATENTRY_ID,MEMBER_ID,ITEMSPC_ID,CATENTTYPE_ID,PARTNUMBER,MFPARTNUMBER,MFNAME,MARKFORDELETE,URL,FIELD1,FIELD2,LASTUPDATE,FIELD3,ONSPECIAL,ONAUCTION,FIELD4,FIELD5,BUYABLE,OID,BASEITEM_ID,STATE,STARTDATE,ENDDATE,RANK,OPTCOUNTER,AVAILABILITYDATE,LASTORDERDATE,ENDOFSERVICEDATE,DISCONTINUEDATE)
    				values (:catentryId,:memberId,:itemspcId,:catenttypeId,:partnumber,:mfpartnumber,:mfname,:markfordelete,:url,:field1,:field2,:lastupdate,:field3,:onSpecial,:onAuction,:field4,:field5,:buyable,:oid,:baseitemId,:state,:startDate,:endDate,:rank,:optcounter,:availabilityDate,:lastOrderDate,:endOfServiceDate,:discontinueDate) 
    			]]>
    		</value>
    	</property>
    </bean>    
    
</beans>