package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acactdesc;

public class AcactdescRowMapper<T> implements RowMapper<Acactdesc> {

	@Override
	public Acactdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acactdesc obj = new Acactdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
