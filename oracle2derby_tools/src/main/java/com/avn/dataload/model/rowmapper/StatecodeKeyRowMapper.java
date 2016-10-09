package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StatecodeKey;

public class StatecodeKeyRowMapper<T> implements RowMapper<StatecodeKey> {

	@Override
	public StatecodeKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StatecodeKey obj = new StatecodeKey();
		
		obj.setStateprovabbr(rs.getString("STATEPROVABBR"));
		obj.setProductvendor(rs.getString("PRODUCTVENDOR"));
		
		return obj;
	}

}
