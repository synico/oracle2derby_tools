package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acresgpres;

public class AcresgpresRowMapper<T> implements RowMapper<Acresgpres> {

	@Override
	public Acresgpres mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acresgpres obj = new Acresgpres();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		
		return obj;
	}

}
