package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLDOMNDESC;

public class FLDOMNDESCRowMapper<T> implements RowMapper<FLDOMNDESC> {

    private static final Logger log = Logger.getLogger(FLDOMNDESCRowMapper.class);

	@Override
	public FLDOMNDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLDOMNDESC obj = new FLDOMNDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFLOWDOMAIN_ID(rs.getBigDecimal("FLOWDOMAIN_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
