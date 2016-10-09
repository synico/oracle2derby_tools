package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.BuschndescKey;

public class BuschndescKeyRowMapper<T> implements RowMapper<BuschndescKey> {

	@Override
	public BuschndescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		BuschndescKey obj = new BuschndescKey();
		
		obj.setBuschnId(rs.getBigDecimal("BUSCHN_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
