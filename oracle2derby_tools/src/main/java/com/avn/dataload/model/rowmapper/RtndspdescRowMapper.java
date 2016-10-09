package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Rtndspdesc;

public class RtndspdescRowMapper<T> implements RowMapper<Rtndspdesc> {

	@Override
	public Rtndspdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Rtndspdesc obj = new Rtndspdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
