package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StorecentKey;

public class StorecentKeyRowMapper<T> implements RowMapper<StorecentKey> {

	@Override
	public StorecentKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StorecentKey obj = new StorecentKey();
		
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
