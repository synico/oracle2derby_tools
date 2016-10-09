package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcreldescKey;

public class AcreldescKeyRowMapper<T> implements RowMapper<AcreldescKey> {

	@Override
	public AcreldescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcreldescKey obj = new AcreldescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setAcrelationId(rs.getBigDecimal("ACRELATION_ID"));
		
		return obj;
	}

}
