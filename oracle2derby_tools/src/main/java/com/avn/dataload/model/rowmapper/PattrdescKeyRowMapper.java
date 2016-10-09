package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PattrdescKey;

public class PattrdescKeyRowMapper<T> implements RowMapper<PattrdescKey> {

	@Override
	public PattrdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PattrdescKey obj = new PattrdescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPattributeId(rs.getBigDecimal("PATTRIBUTE_ID"));
		
		return obj;
	}

}
