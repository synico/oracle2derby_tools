package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StoreconfKey;

public class StoreconfKeyRowMapper<T> implements RowMapper<StoreconfKey> {

	@Override
	public StoreconfKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StoreconfKey obj = new StoreconfKey();
		
		obj.setName(rs.getString("NAME"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
