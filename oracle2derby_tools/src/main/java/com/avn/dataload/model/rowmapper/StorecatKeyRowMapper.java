package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StorecatKey;

public class StorecatKeyRowMapper<T> implements RowMapper<StorecatKey> {

	@Override
	public StorecatKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StorecatKey obj = new StorecatKey();
		
		obj.setCatalogId(rs.getBigDecimal("CATALOG_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
