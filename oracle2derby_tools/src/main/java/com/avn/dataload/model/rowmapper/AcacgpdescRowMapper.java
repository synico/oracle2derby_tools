package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acacgpdesc;

public class AcacgpdescRowMapper<T> implements RowMapper<Acacgpdesc> {

	@Override
	public Acacgpdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acacgpdesc obj = new Acacgpdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
