package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PlcyaccdscKey;

public class PlcyaccdscKeyRowMapper<T> implements RowMapper<PlcyaccdscKey> {

	@Override
	public PlcyaccdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PlcyaccdscKey obj = new PlcyaccdscKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPlcyacctId(rs.getBigDecimal("PLCYACCT_ID"));
		
		return obj;
	}

}
