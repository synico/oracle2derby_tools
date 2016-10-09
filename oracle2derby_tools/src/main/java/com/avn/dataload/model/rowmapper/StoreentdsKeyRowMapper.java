package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StoreentdsKey;

public class StoreentdsKeyRowMapper<T> implements RowMapper<StoreentdsKey> {

	@Override
	public StoreentdsKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StoreentdsKey obj = new StoreentdsKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
