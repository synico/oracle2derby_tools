package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.FlowdescKey;

public class FlowdescKeyRowMapper<T> implements RowMapper<FlowdescKey> {

	@Override
	public FlowdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		FlowdescKey obj = new FlowdescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setFlowId(rs.getBigDecimal("FLOW_ID"));
		
		return obj;
	}

}
