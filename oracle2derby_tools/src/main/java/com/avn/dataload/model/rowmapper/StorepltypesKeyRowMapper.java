package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StorepltypesKey;

public class StorepltypesKeyRowMapper<T> implements RowMapper<StorepltypesKey> {

	@Override
	public StorepltypesKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StorepltypesKey obj = new StorepltypesKey();
		
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setPagelayouttypeId(rs.getString("PAGELAYOUTTYPE_ID"));
		
		return obj;
	}

}
