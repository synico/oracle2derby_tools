package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.LangpairKey;

public class LangpairKeyRowMapper<T> implements RowMapper<LangpairKey> {

	@Override
	public LangpairKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		LangpairKey obj = new LangpairKey();
		
		obj.setLanguageIdAlt(rs.getBigDecimal("LANGUAGE_ID_ALT"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
