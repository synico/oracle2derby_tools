package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Busaudit;

public class BusauditRowMapper<T> implements RowMapper<Busaudit> {

	@Override
	public Busaudit mapRow(ResultSet rs, int rowNum) throws SQLException {
		Busaudit obj = new Busaudit();
		
		obj.setAuditTimestamp(rs.getDate("AUDIT_TIMESTAMP"));
		obj.setCommandName(rs.getString("COMMAND_NAME"));
		obj.setSearchField1(rs.getString("SEARCH_FIELD1"));
		obj.setSearchField2(rs.getString("SEARCH_FIELD2"));
		obj.setSearchField3(rs.getString("SEARCH_FIELD3"));
		obj.setSearchField4(rs.getString("SEARCH_FIELD4"));
		obj.setSearchField5(rs.getString("SEARCH_FIELD5"));
		obj.setBusauditId(rs.getBigDecimal("BUSAUDIT_ID"));
		obj.setSessionId(rs.getBigDecimal("SESSION_ID"));
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setForUserId(rs.getBigDecimal("FOR_USER_ID"));
		obj.setEventType(rs.getString("EVENT_TYPE"));
		obj.setOccurence(rs.getBigDecimal("OCCURENCE"));
		obj.setWorkspace(rs.getString("WORKSPACE"));
		obj.setTaskgrp(rs.getString("TASKGRP"));
		obj.setTask(rs.getString("TASK"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAction(rs.getString("ACTION"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
