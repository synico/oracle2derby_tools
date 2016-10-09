package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.NumbrusgdsKey;

public class NumbrusgdsKeyRowMapper<T> implements RowMapper<NumbrusgdsKey> {

	@Override
	public NumbrusgdsKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		NumbrusgdsKey obj = new NumbrusgdsKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setNumbrusgId(rs.getBigDecimal("NUMBRUSG_ID"));
		
		return obj;
	}

}
