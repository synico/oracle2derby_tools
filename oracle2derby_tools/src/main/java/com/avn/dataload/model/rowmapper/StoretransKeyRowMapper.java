package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StoretransKey;

public class StoretransKeyRowMapper<T> implements RowMapper<StoretransKey> {

	@Override
	public StoretransKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StoretransKey obj = new StoretransKey();
		
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setTransportId(rs.getBigDecimal("TRANSPORT_ID"));
		
		return obj;
	}

}
