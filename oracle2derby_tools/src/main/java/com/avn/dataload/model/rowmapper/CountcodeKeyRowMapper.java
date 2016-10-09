package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CountcodeKey;

public class CountcodeKeyRowMapper<T> implements RowMapper<CountcodeKey> {

	@Override
	public CountcodeKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CountcodeKey obj = new CountcodeKey();
		
		obj.setProductvendor(rs.getString("PRODUCTVENDOR"));
		obj.setCountryabbr(rs.getString("COUNTRYABBR"));
		
		return obj;
	}

}
