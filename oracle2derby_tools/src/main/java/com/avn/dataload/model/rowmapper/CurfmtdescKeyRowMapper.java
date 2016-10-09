package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CurfmtdescKey;

public class CurfmtdescKeyRowMapper<T> implements RowMapper<CurfmtdescKey> {

	@Override
	public CurfmtdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CurfmtdescKey obj = new CurfmtdescKey();
		
		obj.setSetccurr(rs.getString("SETCCURR"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setNumbrusgId(rs.getBigDecimal("NUMBRUSG_ID"));
		
		return obj;
	}

}
