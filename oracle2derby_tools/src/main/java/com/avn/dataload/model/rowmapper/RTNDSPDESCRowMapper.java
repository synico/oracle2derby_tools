package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RTNDSPDESC;

public class RTNDSPDESCRowMapper<T> implements RowMapper<RTNDSPDESC> {

    private static final Logger log = Logger.getLogger(RTNDSPDESCRowMapper.class);

	@Override
	public RTNDSPDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		RTNDSPDESC obj = new RTNDSPDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setRTNDSPCODE_ID(rs.getBigDecimal("RTNDSPCODE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
