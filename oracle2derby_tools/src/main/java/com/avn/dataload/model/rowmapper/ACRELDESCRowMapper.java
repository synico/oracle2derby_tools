package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRELDESC;

public class ACRELDESCRowMapper<T> implements RowMapper<ACRELDESC> {

    private static final Logger log = Logger.getLogger(ACRELDESCRowMapper.class);

	@Override
	public ACRELDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRELDESC obj = new ACRELDESC();
		
		obj.setACRELATION_ID(rs.getBigDecimal("ACRELATION_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
