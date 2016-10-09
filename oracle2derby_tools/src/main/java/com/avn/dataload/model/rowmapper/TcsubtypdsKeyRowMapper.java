package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.TcsubtypdsKey;

public class TcsubtypdsKeyRowMapper<T> implements RowMapper<TcsubtypdsKey> {

	@Override
	public TcsubtypdsKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		TcsubtypdsKey obj = new TcsubtypdsKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setTcsubtypeId(rs.getString("TCSUBTYPE_ID"));
		
		return obj;
	}

}
