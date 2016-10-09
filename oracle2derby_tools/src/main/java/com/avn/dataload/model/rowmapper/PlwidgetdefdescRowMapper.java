package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plwidgetdefdesc;

public class PlwidgetdefdescRowMapper<T> implements RowMapper<Plwidgetdefdesc> {

	@Override
	public Plwidgetdefdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plwidgetdefdesc obj = new Plwidgetdefdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
