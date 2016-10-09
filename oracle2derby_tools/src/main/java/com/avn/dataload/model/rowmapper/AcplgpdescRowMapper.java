package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acplgpdesc;

public class AcplgpdescRowMapper<T> implements RowMapper<Acplgpdesc> {

	@Override
	public Acplgpdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acplgpdesc obj = new Acplgpdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
