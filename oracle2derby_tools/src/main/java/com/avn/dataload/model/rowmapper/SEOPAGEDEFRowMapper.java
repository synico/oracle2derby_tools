package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SEOPAGEDEF;

public class SEOPAGEDEFRowMapper<T> implements RowMapper<SEOPAGEDEF> {

    private static final Logger log = Logger.getLogger(SEOPAGEDEFRowMapper.class);

	@Override
	public SEOPAGEDEF mapRow(ResultSet rs, int rowNum) throws SQLException {
		SEOPAGEDEF obj = new SEOPAGEDEF();
		
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPAGENAME(rs.getString("PAGENAME"));
		obj.setSEOPAGEDEF_ID(rs.getBigDecimal("SEOPAGEDEF_ID"));
		obj.setCREATEDTIME(rs.getTimestamp("CREATEDTIME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
