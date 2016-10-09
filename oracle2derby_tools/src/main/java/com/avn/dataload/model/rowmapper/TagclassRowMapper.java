package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Tagclass;

public class TagclassRowMapper<T> implements RowMapper<Tagclass> {

	@Override
	public Tagclass mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tagclass obj = new Tagclass();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setTagclassname(rs.getString("TAGCLASSNAME"));
		obj.setTagname(rs.getString("TAGNAME"));
		
		return obj;
	}

}
