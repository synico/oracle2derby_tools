package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.BaseitmdscKey;

public class BaseitmdscKeyRowMapper<T> implements RowMapper<BaseitmdscKey> {

	@Override
	public BaseitmdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		BaseitmdscKey obj = new BaseitmdscKey();
		
		obj.setBaseitemId(rs.getBigDecimal("BASEITEM_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
