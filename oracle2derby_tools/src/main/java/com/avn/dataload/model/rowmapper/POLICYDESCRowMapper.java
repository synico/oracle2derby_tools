package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.POLICYDESC;

public class POLICYDESCRowMapper<T> implements RowMapper<POLICYDESC> {

    private static final Logger log = Logger.getLogger(POLICYDESCRowMapper.class);

	@Override
	public POLICYDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		POLICYDESC obj = new POLICYDESC();
		
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPOLICY_ID(rs.getBigDecimal("POLICY_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
