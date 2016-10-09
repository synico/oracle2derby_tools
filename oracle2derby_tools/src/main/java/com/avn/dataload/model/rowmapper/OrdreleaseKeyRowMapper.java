package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.OrdreleaseKey;

public class OrdreleaseKeyRowMapper<T> implements RowMapper<OrdreleaseKey> {

	@Override
	public OrdreleaseKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrdreleaseKey obj = new OrdreleaseKey();
		
		obj.setOrdreleasenum(rs.getBigDecimal("ORDRELEASENUM"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		
		return obj;
	}

}
