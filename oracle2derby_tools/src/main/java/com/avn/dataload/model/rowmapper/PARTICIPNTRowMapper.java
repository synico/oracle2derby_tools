package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PARTICIPNT;

public class PARTICIPNTRowMapper<T> implements RowMapper<PARTICIPNT> {

	@Override
	public PARTICIPNT mapRow(ResultSet rs, int rowNum) throws SQLException {
		PARTICIPNT obj = new PARTICIPNT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setTRADING_ID(rs.getBigDecimal("TRADING_ID"));
		obj.setPARTROLE_ID(rs.getBigDecimal("PARTROLE_ID"));
		obj.setPARTICIPNT_ID(rs.getBigDecimal("PARTICIPNT_ID"));
		obj.setINFORMATION(rs.getString("INFORMATION"));
		obj.setTERMCOND_ID(rs.getBigDecimal("TERMCOND_ID"));
		
		return obj;
	}

}
