package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.SrchattrdescKey;

public class SrchattrdescKeyRowMapper<T> implements RowMapper<SrchattrdescKey> {

	@Override
	public SrchattrdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		SrchattrdescKey obj = new SrchattrdescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSrchattrId(rs.getBigDecimal("SRCHATTR_ID"));
		
		return obj;
	}

}
