package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.OfferdescKey;

public class OfferdescKeyRowMapper<T> implements RowMapper<OfferdescKey> {

	@Override
	public OfferdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		OfferdescKey obj = new OfferdescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setOfferId(rs.getBigDecimal("OFFER_ID"));
		
		return obj;
	}

}
