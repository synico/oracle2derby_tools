package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Gretdesc;

public class GretdescRowMapper<T> implements RowMapper<Gretdesc> {

	@Override
	public Gretdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Gretdesc obj = new Gretdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
