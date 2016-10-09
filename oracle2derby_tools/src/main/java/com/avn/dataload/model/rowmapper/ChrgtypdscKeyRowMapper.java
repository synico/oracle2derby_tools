package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.ChrgtypdscKey;

public class ChrgtypdscKeyRowMapper<T> implements RowMapper<ChrgtypdscKey> {

	@Override
	public ChrgtypdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		ChrgtypdscKey obj = new ChrgtypdscKey();
		
		obj.setChargetypeId(rs.getBigDecimal("CHARGETYPE_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
