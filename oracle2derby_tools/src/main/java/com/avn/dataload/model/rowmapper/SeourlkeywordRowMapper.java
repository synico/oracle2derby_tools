package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Seourlkeyword;

public class SeourlkeywordRowMapper<T> implements RowMapper<Seourlkeyword> {

	@Override
	public Seourlkeyword mapRow(ResultSet rs, int rowNum) throws SQLException {
		Seourlkeyword obj = new Seourlkeyword();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setSeourlkeywordId(rs.getBigDecimal("SEOURLKEYWORD_ID"));
		obj.setMobileurlkeyword(rs.getString("MOBILEURLKEYWORD"));
		obj.setSeourlId(rs.getBigDecimal("SEOURL_ID"));
		obj.setUrlkeyword(rs.getString("URLKEYWORD"));
		
		return obj;
	}

}
