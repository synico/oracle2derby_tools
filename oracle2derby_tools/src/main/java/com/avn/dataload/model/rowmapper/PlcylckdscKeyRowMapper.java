package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PlcylckdscKey;

public class PlcylckdscKeyRowMapper<T> implements RowMapper<PlcylckdscKey> {

	@Override
	public PlcylckdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PlcylckdscKey obj = new PlcylckdscKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPlcyacclckId(rs.getBigDecimal("PLCYACCLCK_ID"));
		
		return obj;
	}

}
