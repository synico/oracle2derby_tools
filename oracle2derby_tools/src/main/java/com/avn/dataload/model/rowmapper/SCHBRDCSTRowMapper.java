package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SCHBRDCST;

public class SCHBRDCSTRowMapper<T> implements RowMapper<SCHBRDCST> {

	@Override
	public SCHBRDCST mapRow(ResultSet rs, int rowNum) throws SQLException {
		SCHBRDCST obj = new SCHBRDCST();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setENDTIME(rs.getTimestamp("ENDTIME"));
		obj.setPREFSTARTTIME(rs.getTimestamp("PREFSTARTTIME"));
		obj.setACTLSTARTTIME(rs.getTimestamp("ACTLSTARTTIME"));
		obj.setEXCEPTIONCODE(rs.getString("EXCEPTIONCODE"));
		obj.setJOBREFNUM(rs.getBigDecimal("JOBREFNUM"));
		obj.setJOBSTATE(rs.getString("JOBSTATE"));
		obj.setRESULT(rs.getString("RESULT"));
		obj.setCLONEID(rs.getString("CLONEID"));
		
		return obj;
	}

}
