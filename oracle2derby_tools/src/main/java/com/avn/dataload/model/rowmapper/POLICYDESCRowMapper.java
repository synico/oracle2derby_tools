package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.POLICYDESC;

public class POLICYDESCRowMapper<T> implements RowMapper<POLICYDESC> {

	@Override
	public POLICYDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		POLICYDESC obj = new POLICYDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setPOLICY_ID(rs.getBigDecimal("POLICY_ID"));
		
		return obj;
	}

}
