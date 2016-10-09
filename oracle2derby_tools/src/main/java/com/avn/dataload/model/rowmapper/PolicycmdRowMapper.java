package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Policycmd;

public class PolicycmdRowMapper<T> implements RowMapper<Policycmd> {

	@Override
	public Policycmd mapRow(ResultSet rs, int rowNum) throws SQLException {
		Policycmd obj = new Policycmd();
		
		obj.setProperties(rs.getString("PROPERTIES"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
