package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Jurstgprel;

public class JurstgprelRowMapper<T> implements RowMapper<Jurstgprel> {

	@Override
	public Jurstgprel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Jurstgprel obj = new Jurstgprel();
		
		obj.setSubclass(rs.getBigDecimal("SUBCLASS"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
