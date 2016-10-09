package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CattogrpKey;

public class CattogrpKeyRowMapper<T> implements RowMapper<CattogrpKey> {

	@Override
	public CattogrpKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CattogrpKey obj = new CattogrpKey();
		
		obj.setCatalogId(rs.getBigDecimal("CATALOG_ID"));
		obj.setCatgroupId(rs.getBigDecimal("CATGROUP_ID"));
		
		return obj;
	}

}
