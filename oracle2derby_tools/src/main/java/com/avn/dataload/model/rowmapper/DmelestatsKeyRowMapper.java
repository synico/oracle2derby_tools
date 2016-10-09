package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DmelestatsKey;

public class DmelestatsKeyRowMapper<T> implements RowMapper<DmelestatsKey> {

	@Override
	public DmelestatsKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		DmelestatsKey obj = new DmelestatsKey();
		
		obj.setDmelementId(rs.getBigDecimal("DMELEMENT_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
