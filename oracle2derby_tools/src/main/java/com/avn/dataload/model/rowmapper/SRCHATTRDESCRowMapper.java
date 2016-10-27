package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SRCHATTRDESC;

public class SRCHATTRDESCRowMapper<T> implements RowMapper<SRCHATTRDESC> {

    private static final Logger log = Logger.getLogger(SRCHATTRDESCRowMapper.class);

	@Override
	public SRCHATTRDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		SRCHATTRDESC obj = new SRCHATTRDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSRCHATTR_ID(rs.getBigDecimal("SRCHATTR_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
