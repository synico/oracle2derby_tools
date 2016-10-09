package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.FltransdscKey;

public class FltransdscKeyRowMapper<T> implements RowMapper<FltransdscKey> {

	@Override
	public FltransdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		FltransdscKey obj = new FltransdscKey();
		
		obj.setFltransitnId(rs.getBigDecimal("FLTRANSITN_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
