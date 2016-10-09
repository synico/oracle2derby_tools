package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PartroledsKey;

public class PartroledsKeyRowMapper<T> implements RowMapper<PartroledsKey> {

	@Override
	public PartroledsKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PartroledsKey obj = new PartroledsKey();
		
		obj.setPartroleId(rs.getBigDecimal("PARTROLE_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
