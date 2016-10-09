package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.FlstgpdscKey;

public class FlstgpdscKeyRowMapper<T> implements RowMapper<FlstgpdscKey> {

	@Override
	public FlstgpdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		FlstgpdscKey obj = new FlstgpdscKey();
		
		obj.setFlstategpId(rs.getBigDecimal("FLSTATEGP_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
