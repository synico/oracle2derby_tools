package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SEOURLKEYWORD;

public class SEOURLKEYWORDRowMapper<T> implements RowMapper<SEOURLKEYWORD> {

    private static final Logger log = Logger.getLogger(SEOURLKEYWORDRowMapper.class);

	@Override
	public SEOURLKEYWORD mapRow(ResultSet rs, int rowNum) throws SQLException {
		SEOURLKEYWORD obj = new SEOURLKEYWORD();
		
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSEOURL_ID(rs.getBigDecimal("SEOURL_ID"));
		obj.setURLKEYWORD(rs.getString("URLKEYWORD"));
		obj.setSEOURLKEYWORD_ID(rs.getBigDecimal("SEOURLKEYWORD_ID"));
		obj.setMOBILEURLKEYWORD(rs.getString("MOBILEURLKEYWORD"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
