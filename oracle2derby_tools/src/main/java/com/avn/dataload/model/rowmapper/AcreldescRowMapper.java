package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acreldesc;

public class AcreldescRowMapper<T> implements RowMapper<Acreldesc> {

	@Override
	public Acreldesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acreldesc obj = new Acreldesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
