package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acpoldesc;

public class AcpoldescRowMapper<T> implements RowMapper<Acpoldesc> {

	@Override
	public Acpoldesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acpoldesc obj = new Acpoldesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
