package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RTNDNYDESC;

public class RTNDNYDESCRowMapper<T> implements RowMapper<RTNDNYDESC> {

    private static final Logger log = Logger.getLogger(RTNDNYDESCRowMapper.class);

	@Override
	public RTNDNYDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		RTNDNYDESC obj = new RTNDNYDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setRTNDNYRSN_ID(rs.getBigDecimal("RTNDNYRSN_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
