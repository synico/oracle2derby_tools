package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Pattrdesc;

public class PattrdescRowMapper<T> implements RowMapper<Pattrdesc> {

	@Override
	public Pattrdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pattrdesc obj = new Pattrdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
