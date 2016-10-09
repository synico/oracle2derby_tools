package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CtxdataKey;

public class CtxdataKeyRowMapper<T> implements RowMapper<CtxdataKey> {

	@Override
	public CtxdataKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CtxdataKey obj = new CtxdataKey();
		
		obj.setName(rs.getString("NAME"));
		obj.setActivityId(rs.getBigDecimal("ACTIVITY_ID"));
		
		return obj;
	}

}
