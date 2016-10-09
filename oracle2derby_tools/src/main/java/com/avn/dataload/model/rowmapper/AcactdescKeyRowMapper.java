package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcactdescKey;

public class AcactdescKeyRowMapper<T> implements RowMapper<AcactdescKey> {

	@Override
	public AcactdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcactdescKey obj = new AcactdescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setAcactionId(rs.getBigDecimal("ACACTION_ID"));
		
		return obj;
	}

}
