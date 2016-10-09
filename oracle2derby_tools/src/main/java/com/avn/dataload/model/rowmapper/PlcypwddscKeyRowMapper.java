package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PlcypwddscKey;

public class PlcypwddscKeyRowMapper<T> implements RowMapper<PlcypwddscKey> {

	@Override
	public PlcypwddscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PlcypwddscKey obj = new PlcypwddscKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPlcypasswdId(rs.getBigDecimal("PLCYPASSWD_ID"));
		
		return obj;
	}

}
