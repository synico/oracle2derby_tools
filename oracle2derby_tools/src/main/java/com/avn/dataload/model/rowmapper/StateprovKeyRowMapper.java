package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StateprovKey;

public class StateprovKeyRowMapper<T> implements RowMapper<StateprovKey> {

	@Override
	public StateprovKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StateprovKey obj = new StateprovKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setStateprovabbr(rs.getString("STATEPROVABBR"));
		
		return obj;
	}

}
