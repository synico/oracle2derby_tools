package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.FacetdescKey;

public class FacetdescKeyRowMapper<T> implements RowMapper<FacetdescKey> {

	@Override
	public FacetdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		FacetdescKey obj = new FacetdescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setFacetId(rs.getBigDecimal("FACET_ID"));
		
		return obj;
	}

}
