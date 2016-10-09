package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storetpc;

public class StoretpcRowMapper<T> implements RowMapper<Storetpc> {

	@Override
	public Storetpc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storetpc obj = new Storetpc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
