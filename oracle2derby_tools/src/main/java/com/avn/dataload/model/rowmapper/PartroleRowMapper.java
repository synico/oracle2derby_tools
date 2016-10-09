package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Partrole;

public class PartroleRowMapper<T> implements RowMapper<Partrole> {

	@Override
	public Partrole mapRow(ResultSet rs, int rowNum) throws SQLException {
		Partrole obj = new Partrole();
		
		obj.setPartroleId(rs.getBigDecimal("PARTROLE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
