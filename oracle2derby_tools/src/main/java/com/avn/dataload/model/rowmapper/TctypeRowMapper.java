package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Tctype;

public class TctypeRowMapper<T> implements RowMapper<Tctype> {

	@Override
	public Tctype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tctype obj = new Tctype();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTctypeId(rs.getString("TCTYPE_ID"));
		
		return obj;
	}

}
