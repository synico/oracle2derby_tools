package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PlcytypdscKey;

public class PlcytypdscKeyRowMapper<T> implements RowMapper<PlcytypdscKey> {

	@Override
	public PlcytypdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PlcytypdscKey obj = new PlcytypdscKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPolicytypeId(rs.getString("POLICYTYPE_ID"));
		
		return obj;
	}

}
