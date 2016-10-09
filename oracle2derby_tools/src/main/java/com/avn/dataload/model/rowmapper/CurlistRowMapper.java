package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Curlist;

public class CurlistRowMapper<T> implements RowMapper<Curlist> {

	@Override
	public Curlist mapRow(ResultSet rs, int rowNum) throws SQLException {
		Curlist obj = new Curlist();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
