package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.GretdescKey;

public class GretdescKeyRowMapper<T> implements RowMapper<GretdescKey> {

	@Override
	public GretdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		GretdescKey obj = new GretdescKey();
		
		obj.setEventtypeId(rs.getBigDecimal("EVENTTYPE_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
