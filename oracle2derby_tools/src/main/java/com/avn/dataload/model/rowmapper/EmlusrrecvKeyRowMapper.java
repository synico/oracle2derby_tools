package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.EmlusrrecvKey;

public class EmlusrrecvKeyRowMapper<T> implements RowMapper<EmlusrrecvKey> {

	@Override
	public EmlusrrecvKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmlusrrecvKey obj = new EmlusrrecvKey();
		
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
