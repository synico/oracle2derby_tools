package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StorelangKey;

public class StorelangKeyRowMapper<T> implements RowMapper<StorelangKey> {

	@Override
	public StorelangKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StorelangKey obj = new StorelangKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
