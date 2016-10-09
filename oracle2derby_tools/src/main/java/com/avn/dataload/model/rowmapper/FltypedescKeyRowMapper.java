package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.FltypedescKey;

public class FltypedescKeyRowMapper<T> implements RowMapper<FltypedescKey> {

	@Override
	public FltypedescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		FltypedescKey obj = new FltypedescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setFlowtypeId(rs.getBigDecimal("FLOWTYPE_ID"));
		
		return obj;
	}

}
