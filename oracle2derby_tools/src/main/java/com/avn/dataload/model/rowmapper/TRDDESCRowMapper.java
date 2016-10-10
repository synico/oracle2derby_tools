package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TRDDESC;

public class TRDDESCRowMapper<T> implements RowMapper<TRDDESC> {

	@Override
	public TRDDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		TRDDESC obj = new TRDDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setTRADING_ID(rs.getBigDecimal("TRADING_ID"));
		
		return obj;
	}

}
