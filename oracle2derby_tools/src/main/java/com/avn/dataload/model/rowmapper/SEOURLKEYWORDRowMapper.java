package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SEOURLKEYWORD;

public class SEOURLKEYWORDRowMapper<T> implements RowMapper<SEOURLKEYWORD> {

	@Override
	public SEOURLKEYWORD mapRow(ResultSet rs, int rowNum) throws SQLException {
		SEOURLKEYWORD obj = new SEOURLKEYWORD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSEOURLKEYWORD_ID(rs.getBigDecimal("SEOURLKEYWORD_ID"));
		obj.setMOBILEURLKEYWORD(rs.getString("MOBILEURLKEYWORD"));
		obj.setSEOURL_ID(rs.getBigDecimal("SEOURL_ID"));
		obj.setURLKEYWORD(rs.getString("URLKEYWORD"));
		
		return obj;
	}

}
