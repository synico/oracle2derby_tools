package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AttrdescKey;

public class AttrdescKeyRowMapper<T> implements RowMapper<AttrdescKey> {

	@Override
	public AttrdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AttrdescKey obj = new AttrdescKey();
		
		obj.setAttrId(rs.getBigDecimal("ATTR_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
