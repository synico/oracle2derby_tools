package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Preqentrytype;

public class PreqentrytypeRowMapper<T> implements RowMapper<Preqentrytype> {

	@Override
	public Preqentrytype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Preqentrytype obj = new Preqentrytype();
		
		obj.setProperties(rs.getString("PROPERTIES"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setPreqentrytypeId(rs.getBigDecimal("PREQENTRYTYPE_ID"));
		
		return obj;
	}

}
