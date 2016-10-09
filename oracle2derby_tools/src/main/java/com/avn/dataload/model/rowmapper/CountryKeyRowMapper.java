package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CountryKey;

public class CountryKeyRowMapper<T> implements RowMapper<CountryKey> {

	@Override
	public CountryKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CountryKey obj = new CountryKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCountryabbr(rs.getString("COUNTRYABBR"));
		
		return obj;
	}

}
