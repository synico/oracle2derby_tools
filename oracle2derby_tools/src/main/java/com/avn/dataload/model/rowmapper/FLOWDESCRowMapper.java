package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLOWDESC;

public class FLOWDESCRowMapper<T> implements RowMapper<FLOWDESC> {

    private static final Logger log = Logger.getLogger(FLOWDESCRowMapper.class);

	@Override
	public FLOWDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLOWDESC obj = new FLOWDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setFLOW_ID(rs.getBigDecimal("FLOW_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
