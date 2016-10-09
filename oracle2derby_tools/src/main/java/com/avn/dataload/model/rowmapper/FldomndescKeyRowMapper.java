package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.FldomndescKey;

public class FldomndescKeyRowMapper<T> implements RowMapper<FldomndescKey> {

	@Override
	public FldomndescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		FldomndescKey obj = new FldomndescKey();
		
		obj.setFlowdomainId(rs.getBigDecimal("FLOWDOMAIN_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
