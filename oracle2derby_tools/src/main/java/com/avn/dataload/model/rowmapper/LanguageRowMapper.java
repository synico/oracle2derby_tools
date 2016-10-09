package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Language;

public class LanguageRowMapper<T> implements RowMapper<Language> {

	@Override
	public Language mapRow(ResultSet rs, int rowNum) throws SQLException {
		Language obj = new Language();
		
		obj.setEncoding(rs.getString("ENCODING"));
		obj.setMimecharset(rs.getString("MIMECHAR"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCountry(rs.getString("COUNTRY"));
		obj.setLocalename(rs.getString("LOCALENAME"));
		obj.setLanguage(rs.getString("LANGUAGE"));
		obj.setVariant(rs.getString("VARIANT"));
		
		return obj;
	}

}
