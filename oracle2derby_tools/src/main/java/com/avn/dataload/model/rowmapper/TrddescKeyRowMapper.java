package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.TrddescKey;

public class TrddescKeyRowMapper<T> implements RowMapper<TrddescKey> {

	@Override
	public TrddescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		TrddescKey obj = new TrddescKey();
		
		obj.setTradingId(rs.getBigDecimal("TRADING_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
