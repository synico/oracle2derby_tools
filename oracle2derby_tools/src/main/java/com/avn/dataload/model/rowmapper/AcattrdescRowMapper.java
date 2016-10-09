package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acattrdesc;

public class AcattrdescRowMapper<T> implements RowMapper<Acattrdesc> {

	@Override
	public Acattrdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acattrdesc obj = new Acattrdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
