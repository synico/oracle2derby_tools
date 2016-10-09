package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storetrans;

public class StoretransRowMapper<T> implements RowMapper<Storetrans> {

	@Override
	public Storetrans mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storetrans obj = new Storetrans();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setActive(rs.getBigDecimal("ACTIVE"));
		
		return obj;
	}

}
