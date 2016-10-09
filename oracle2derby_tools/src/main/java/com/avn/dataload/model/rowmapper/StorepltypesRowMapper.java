package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storepltypes;

public class StorepltypesRowMapper<T> implements RowMapper<Storepltypes> {

	@Override
	public Storepltypes mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storepltypes obj = new Storepltypes();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setViewname(rs.getString("VIEWNAME"));
		
		return obj;
	}

}
