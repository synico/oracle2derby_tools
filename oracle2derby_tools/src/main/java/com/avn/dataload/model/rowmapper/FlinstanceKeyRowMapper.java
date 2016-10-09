package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.FlinstanceKey;

public class FlinstanceKeyRowMapper<T> implements RowMapper<FlinstanceKey> {

	@Override
	public FlinstanceKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		FlinstanceKey obj = new FlinstanceKey();
		
		obj.setFlowtypeId(rs.getBigDecimal("FLOWTYPE_ID"));
		obj.setEntityId(rs.getBigDecimal("ENTITY_ID"));
		
		return obj;
	}

}
