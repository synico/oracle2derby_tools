package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.SeopagedefdescKey;

public class SeopagedefdescKeyRowMapper<T> implements RowMapper<SeopagedefdescKey> {

	@Override
	public SeopagedefdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		SeopagedefdescKey obj = new SeopagedefdescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSeopagedefId(rs.getBigDecimal("SEOPAGEDEF_ID"));
		
		return obj;
	}

}
