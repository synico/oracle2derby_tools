package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DmuserbhvrKey;

public class DmuserbhvrKeyRowMapper<T> implements RowMapper<DmuserbhvrKey> {

	@Override
	public DmuserbhvrKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		DmuserbhvrKey obj = new DmuserbhvrKey();
		
		obj.setPersonalizationid(rs.getString("PERSONALIZATIONID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
