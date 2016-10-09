package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Flow;

public class FlowRowMapper<T> implements RowMapper<Flow> {

	@Override
	public Flow mapRow(ResultSet rs, int rowNum) throws SQLException {
		Flow obj = new Flow();
		
		obj.setPriority(rs.getBigDecimal("PRIORITY"));
		obj.setAttribute(rs.getString("ATTRIBUTE"));
		obj.setCompositeflow(rs.getBigDecimal("COMPOSITEFLOW"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setFlowId(rs.getBigDecimal("FLOW_ID"));
		obj.setFlowtypeId(rs.getBigDecimal("FLOWTYPE_ID"));
		
		return obj;
	}

}
