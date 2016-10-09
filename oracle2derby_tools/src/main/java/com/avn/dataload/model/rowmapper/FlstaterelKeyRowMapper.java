package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.FlstaterelKey;

public class FlstaterelKeyRowMapper<T> implements RowMapper<FlstaterelKey> {

	@Override
	public FlstaterelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		FlstaterelKey obj = new FlstaterelKey();
		
		obj.setFlstatedctId(rs.getBigDecimal("FLSTATEDCT_ID"));
		obj.setFlowId(rs.getBigDecimal("FLOW_ID"));
		
		return obj;
	}

}
