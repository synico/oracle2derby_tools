package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CatentrelKey;

public class CatentrelKeyRowMapper<T> implements RowMapper<CatentrelKey> {

	@Override
	public CatentrelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CatentrelKey obj = new CatentrelKey();
		
		obj.setCatentryIdParent(rs.getBigDecimal("CATENTRY_ID_PARENT"));
		obj.setCatentryIdChild(rs.getBigDecimal("CATENTRY_ID_CHILD"));
		obj.setCatreltypeId(rs.getString("CATRELTYPE_ID"));
		
		return obj;
	}

}
