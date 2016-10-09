package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CurformatKey;

public class CurformatKeyRowMapper<T> implements RowMapper<CurformatKey> {

	@Override
	public CurformatKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CurformatKey obj = new CurformatKey();
		
		obj.setSetccurr(rs.getString("SETCCURR"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setNumbrusgId(rs.getBigDecimal("NUMBRUSG_ID"));
		
		return obj;
	}

}
