package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmelestats;

public class DmelestatsRowMapper<T> implements RowMapper<Dmelestats> {

	@Override
	public Dmelestats mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmelestats obj = new Dmelestats();
		
		obj.setField4(rs.getString("FIELD4"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getBigDecimal("FIELD3"));
		obj.setCounter(rs.getBigDecimal("COUNTER"));
		
		return obj;
	}

}
