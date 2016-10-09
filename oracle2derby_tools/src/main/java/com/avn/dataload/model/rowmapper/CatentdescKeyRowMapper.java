package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CatentdescKey;

public class CatentdescKeyRowMapper<T> implements RowMapper<CatentdescKey> {

	@Override
	public CatentdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CatentdescKey obj = new CatentdescKey();
		
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
