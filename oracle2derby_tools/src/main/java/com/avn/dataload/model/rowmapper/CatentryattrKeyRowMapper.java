package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CatentryattrKey;

public class CatentryattrKeyRowMapper<T> implements RowMapper<CatentryattrKey> {

	@Override
	public CatentryattrKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CatentryattrKey obj = new CatentryattrKey();
		
		obj.setAttrId(rs.getBigDecimal("ATTR_ID"));
		obj.setAttrvalId(rs.getBigDecimal("ATTRVAL_ID"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		
		return obj;
	}

}
