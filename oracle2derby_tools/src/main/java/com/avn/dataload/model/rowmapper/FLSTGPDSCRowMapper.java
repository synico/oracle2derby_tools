package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLSTGPDSC;

public class FLSTGPDSCRowMapper<T> implements RowMapper<FLSTGPDSC> {

    private static final Logger log = Logger.getLogger(FLSTGPDSCRowMapper.class);

	@Override
	public FLSTGPDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLSTGPDSC obj = new FLSTGPDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFLSTATEGP_ID(rs.getBigDecimal("FLSTATEGP_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
