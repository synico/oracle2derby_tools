package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CALCODEDSC;

public class CALCODEDSCRowMapper<T> implements RowMapper<CALCODEDSC> {

    private static final Logger log = Logger.getLogger(CALCODEDSCRowMapper.class);

	@Override
	public CALCODEDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CALCODEDSC obj = new CALCODEDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setCALCODE_ID(rs.getBigDecimal("CALCODE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
