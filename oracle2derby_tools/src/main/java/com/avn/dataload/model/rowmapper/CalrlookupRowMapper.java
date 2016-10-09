package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Calrlookup;

public class CalrlookupRowMapper<T> implements RowMapper<Calrlookup> {

	@Override
	public Calrlookup mapRow(ResultSet rs, int rowNum) throws SQLException {
		Calrlookup obj = new Calrlookup();
		
		obj.setValue(rs.getBigDecimal("VALUE"));
		obj.setSetccurr(rs.getString("SETCCURR"));
		obj.setCalrangeId(rs.getBigDecimal("CALRANGE_ID"));
		obj.setCalrlookupId(rs.getBigDecimal("CALRLOOKUP_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
