<?xml version="1.0" encoding="UTF-8"?>

<beans:beans xmlns="http://www.springframework.org/schema/batch"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:beans="http://www.springframework.org/schema/beans"
    xmlns:util="http://www.springframework.org/schema/util"
    xsi:schemaLocation="
    http://www.springframework.org/schema/batch http://www.springframework.org/schema/batch/spring-batch.xsd
    http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd ">
    
    <beans:import resource="oracle-ds-config.xml" />
    <beans:import resource="derby-ds-config.xml" />
    
    <beans:import resource="batch/*.xml"/>
    
    <job id="loadData">
        <#list tables as table>
        <step id="load-${table.current}">
            <tasklet>
                <chunk reader="jdbcPagingItemReader4${table.current}" writer="jdbcBatchItemWriter4${table.current}" commit-interval="100"/>
            </tasklet>
            <#if table.next?exists>
            <next on ="*" to="load-${table.next}"/>
            <next on="FAILED" to="load-${table.next}"/>
            </#if>
        </step>
        </#list>
    </job>
    
    <beans:bean id="jobLauncher" class="org.springframework.batch.core.launch.support.SimpleJobLauncher">
        <beans:property name="jobRepository" ref="jobRepository" />
    </beans:bean>
    
    <beans:bean id="jobRepository" class="org.springframework.batch.core.repository.support.MapJobRepositoryFactoryBean"/>
    
    <beans:bean id="taskExecutor" class="org.springframework.core.task.SimpleAsyncTaskExecutor"/>
    
</beans:beans>