package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CatgpenrelKey;

public class CatgpenrelKeyRowMapper<T> implements RowMapper<CatgpenrelKey> {

	@Override
	public CatgpenrelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CatgpenrelKey obj = new CatgpenrelKey();
		
		obj.setCatalogId(rs.getBigDecimal("CATALOG_ID"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setCatgroupId(rs.getBigDecimal("CATGROUP_ID"));
		
		return obj;
	}

}
