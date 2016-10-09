package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Tcsubtype;

public class TcsubtypeRowMapper<T> implements RowMapper<Tcsubtype> {

	@Override
	public Tcsubtype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tcsubtype obj = new Tcsubtype();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAccessbeanname(rs.getString("ACCESSBEANNAME"));
		obj.setTcsubtypeId(rs.getString("TCSUBTYPE_ID"));
		obj.setDeploycommand(rs.getString("DEPLOYCOMMAND"));
		obj.setTctypeId(rs.getString("TCTYPE_ID"));
		
		return obj;
	}

}
