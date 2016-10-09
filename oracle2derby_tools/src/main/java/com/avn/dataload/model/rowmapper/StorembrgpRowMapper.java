package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storembrgp;

public class StorembrgpRowMapper<T> implements RowMapper<Storembrgp> {

	@Override
	public Storembrgp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storembrgp obj = new Storembrgp();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
