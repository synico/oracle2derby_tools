package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Buschndesc;

public class BuschndescRowMapper<T> implements RowMapper<Buschndesc> {

	@Override
	public Buschndesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Buschndesc obj = new Buschndesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
