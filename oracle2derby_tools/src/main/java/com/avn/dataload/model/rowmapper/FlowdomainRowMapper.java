package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Flowdomain;

public class FlowdomainRowMapper<T> implements RowMapper<Flowdomain> {

	@Override
	public Flowdomain mapRow(ResultSet rs, int rowNum) throws SQLException {
		Flowdomain obj = new Flowdomain();
		
		obj.setPriority(rs.getBigDecimal("PRIORITY"));
		obj.setFlowdomainId(rs.getBigDecimal("FLOWDOMAIN_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		
		return obj;
	}

}
