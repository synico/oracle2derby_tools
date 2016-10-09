package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.FlstdctdscKey;

public class FlstdctdscKeyRowMapper<T> implements RowMapper<FlstdctdscKey> {

	@Override
	public FlstdctdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		FlstdctdscKey obj = new FlstdctdscKey();
		
		obj.setFlstatedctId(rs.getBigDecimal("FLSTATEDCT_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
