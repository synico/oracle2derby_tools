package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Procsys;

public class ProcsysRowMapper<T> implements RowMapper<Procsys> {

	@Override
	public Procsys mapRow(ResultSet rs, int rowNum) throws SQLException {
		Procsys obj = new Procsys();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setProcsysname(rs.getString("PROCSYSNAME"));
		
		return obj;
	}

}
