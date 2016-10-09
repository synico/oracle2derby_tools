package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.ColldescKey;

public class ColldescKeyRowMapper<T> implements RowMapper<ColldescKey> {

	@Override
	public ColldescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		ColldescKey obj = new ColldescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCollateralId(rs.getBigDecimal("COLLATERAL_ID"));
		
		return obj;
	}

}
