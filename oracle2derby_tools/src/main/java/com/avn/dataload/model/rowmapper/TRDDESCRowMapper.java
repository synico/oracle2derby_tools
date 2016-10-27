package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TRDDESC;

public class TRDDESCRowMapper<T> implements RowMapper<TRDDESC> {

    private static final Logger log = Logger.getLogger(TRDDESCRowMapper.class);

	@Override
	public TRDDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		TRDDESC obj = new TRDDESC();
		
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTRADING_ID(rs.getBigDecimal("TRADING_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
