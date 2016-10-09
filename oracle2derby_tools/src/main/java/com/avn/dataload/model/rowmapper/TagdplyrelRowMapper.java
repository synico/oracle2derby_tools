package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Tagdplyrel;

public class TagdplyrelRowMapper<T> implements RowMapper<Tagdplyrel> {

	@Override
	public Tagdplyrel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tagdplyrel obj = new Tagdplyrel();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
