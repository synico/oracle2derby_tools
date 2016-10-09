package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Fltypedesc;

public class FltypedescRowMapper<T> implements RowMapper<Fltypedesc> {

	@Override
	public Fltypedesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Fltypedesc obj = new Fltypedesc();
		
		obj.setLongdescription(rs.getString("LONGDESCRIPTION"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
