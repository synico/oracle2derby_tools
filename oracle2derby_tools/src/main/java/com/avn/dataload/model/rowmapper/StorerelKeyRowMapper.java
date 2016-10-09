package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StorerelKey;

public class StorerelKeyRowMapper<T> implements RowMapper<StorerelKey> {

	@Override
	public StorerelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StorerelKey obj = new StorerelKey();
		
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setRelatedstoreId(rs.getBigDecimal("RELATEDSTORE_ID"));
		obj.setStreltypId(rs.getBigDecimal("STRELTYP_ID"));
		
		return obj;
	}

}
