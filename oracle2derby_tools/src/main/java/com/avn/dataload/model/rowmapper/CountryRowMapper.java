package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Country;

public class CountryRowMapper<T> implements RowMapper<Country> {

	@Override
	public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
		Country obj = new Country();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCallingcode(rs.getString("CALLINGCODE"));
		
		return obj;
	}

}
