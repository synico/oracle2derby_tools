package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Statecode;

public class StatecodeRowMapper<T> implements RowMapper<Statecode> {

	@Override
	public Statecode mapRow(ResultSet rs, int rowNum) throws SQLException {
		Statecode obj = new Statecode();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStateprovcode(rs.getString("STATEPROVCODE"));
		
		return obj;
	}

}
