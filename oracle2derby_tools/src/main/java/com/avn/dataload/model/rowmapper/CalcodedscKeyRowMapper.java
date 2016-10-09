package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CalcodedscKey;

public class CalcodedscKeyRowMapper<T> implements RowMapper<CalcodedscKey> {

	@Override
	public CalcodedscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CalcodedscKey obj = new CalcodedscKey();
		
		obj.setCalcodeId(rs.getBigDecimal("CALCODE_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
