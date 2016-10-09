package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.FfmcentdsKey;

public class FfmcentdsKeyRowMapper<T> implements RowMapper<FfmcentdsKey> {

	@Override
	public FfmcentdsKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		FfmcentdsKey obj = new FfmcentdsKey();
		
		obj.setFfmcenterId(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
