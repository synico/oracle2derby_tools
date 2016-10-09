package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Stateprov;

public class StateprovRowMapper<T> implements RowMapper<Stateprov> {

	@Override
	public Stateprov mapRow(ResultSet rs, int rowNum) throws SQLException {
		Stateprov obj = new Stateprov();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCountryabbr(rs.getString("COUNTRYABBR"));
		
		return obj;
	}

}
