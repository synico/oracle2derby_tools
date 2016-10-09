package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Rtndnydesc;

public class RtndnydescRowMapper<T> implements RowMapper<Rtndnydesc> {

	@Override
	public Rtndnydesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Rtndnydesc obj = new Rtndnydesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
