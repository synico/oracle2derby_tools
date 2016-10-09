package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XpcatentdescKey;

public class XpcatentdescKeyRowMapper<T> implements RowMapper<XpcatentdescKey> {

	@Override
	public XpcatentdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XpcatentdescKey obj = new XpcatentdescKey();
		
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
