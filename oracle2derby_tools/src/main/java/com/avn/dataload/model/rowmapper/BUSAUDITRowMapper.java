package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BUSAUDIT;

public class BUSAUDITRowMapper<T> implements RowMapper<BUSAUDIT> {

    private static final Logger log = Logger.getLogger(BUSAUDITRowMapper.class);

	@Override
	public BUSAUDIT mapRow(ResultSet rs, int rowNum) throws SQLException {
		BUSAUDIT obj = new BUSAUDIT();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACTION(rs.getString("ACTION"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setBUSAUDIT_ID(rs.getBigDecimal("BUSAUDIT_ID"));
		obj.setFOR_USER_ID(rs.getBigDecimal("FOR_USER_ID"));
		obj.setAUDIT_TIMESTAMP(rs.getTimestamp("AUDIT_TIMESTAMP"));
		obj.setCOMMAND_NAME(rs.getString("COMMAND_NAME"));
		obj.setSEARCH_FIELD1(rs.getString("SEARCH_FIELD1"));
		obj.setSEARCH_FIELD2(rs.getString("SEARCH_FIELD2"));
		obj.setSEARCH_FIELD3(rs.getString("SEARCH_FIELD3"));
		obj.setSEARCH_FIELD4(rs.getString("SEARCH_FIELD4"));
		obj.setSEARCH_FIELD5(rs.getString("SEARCH_FIELD5"));
		obj.setSESSION_ID(rs.getBigDecimal("SESSION_ID"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setEVENT_TYPE(rs.getString("EVENT_TYPE"));
		obj.setSIGNATURE(rs.getBytes("SIGNATURE"));
		obj.setOCCURENCE(rs.getBigDecimal("OCCURENCE"));
		obj.setPARAMETERS(rs.getClob("PARAMETERS"));
		obj.setWORKSPACE(rs.getString("WORKSPACE"));
		obj.setTASKGRP(rs.getString("TASKGRP"));
		obj.setTASK(rs.getString("TASK"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
