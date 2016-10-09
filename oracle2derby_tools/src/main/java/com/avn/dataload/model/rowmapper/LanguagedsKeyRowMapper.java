package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.LanguagedsKey;

public class LanguagedsKeyRowMapper<T> implements RowMapper<LanguagedsKey> {

	@Override
	public LanguagedsKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		LanguagedsKey obj = new LanguagedsKey();
		
		obj.setLanguageIdDesc(rs.getBigDecimal("LANGUAGE_ID_DESC"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
