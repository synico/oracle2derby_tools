package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acresgpdes;

public class AcresgpdesRowMapper<T> implements RowMapper<Acresgpdes> {

	@Override
	public Acresgpdes mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acresgpdes obj = new Acresgpdes();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
