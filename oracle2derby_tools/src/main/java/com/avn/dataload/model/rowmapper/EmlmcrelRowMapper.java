package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Emlmcrel;

public class EmlmcrelRowMapper<T> implements RowMapper<Emlmcrel> {

	@Override
	public Emlmcrel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emlmcrel obj = new Emlmcrel();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
