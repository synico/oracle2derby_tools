package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.InventoryKey;

public class InventoryKeyRowMapper<T> implements RowMapper<InventoryKey> {

	@Override
	public InventoryKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		InventoryKey obj = new InventoryKey();
		
		obj.setFfmcenterId(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		
		return obj;
	}

}
