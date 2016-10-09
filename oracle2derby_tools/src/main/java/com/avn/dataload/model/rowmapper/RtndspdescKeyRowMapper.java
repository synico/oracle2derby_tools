package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.RtndspdescKey;

public class RtndspdescKeyRowMapper<T> implements RowMapper<RtndspdescKey> {

	@Override
	public RtndspdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		RtndspdescKey obj = new RtndspdescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setRtndspcodeId(rs.getBigDecimal("RTNDSPCODE_ID"));
		
		return obj;
	}

}
