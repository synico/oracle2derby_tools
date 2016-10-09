package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Offerdesc;

public class OfferdescRowMapper<T> implements RowMapper<Offerdesc> {

	@Override
	public Offerdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Offerdesc obj = new Offerdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
