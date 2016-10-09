package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CurlistKey;

public class CurlistKeyRowMapper<T> implements RowMapper<CurlistKey> {

	@Override
	public CurlistKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CurlistKey obj = new CurlistKey();
		
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setCurrstr(rs.getString("CURRSTR"));
		
		return obj;
	}

}
