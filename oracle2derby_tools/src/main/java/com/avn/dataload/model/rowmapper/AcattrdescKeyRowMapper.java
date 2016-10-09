package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcattrdescKey;

public class AcattrdescKeyRowMapper<T> implements RowMapper<AcattrdescKey> {

	@Override
	public AcattrdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcattrdescKey obj = new AcattrdescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setAcattrId(rs.getBigDecimal("ACATTR_ID"));
		
		return obj;
	}

}
