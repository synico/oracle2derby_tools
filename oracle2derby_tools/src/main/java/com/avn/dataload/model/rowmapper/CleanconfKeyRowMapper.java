package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CleanconfKey;

public class CleanconfKeyRowMapper<T> implements RowMapper<CleanconfKey> {

	@Override
	public CleanconfKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CleanconfKey obj = new CleanconfKey();
		
		obj.setObjectname(rs.getString("OBJECTNAME"));
		obj.setType(rs.getString("TYPE"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
