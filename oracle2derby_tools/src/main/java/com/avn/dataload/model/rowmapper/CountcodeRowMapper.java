package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Countcode;

public class CountcodeRowMapper<T> implements RowMapper<Countcode> {

	@Override
	public Countcode mapRow(ResultSet rs, int rowNum) throws SQLException {
		Countcode obj = new Countcode();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCountrycode(rs.getString("COUNTRYCODE"));
		
		return obj;
	}

}
