package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.RoledescKey;

public class RoledescKeyRowMapper<T> implements RowMapper<RoledescKey> {

	@Override
	public RoledescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		RoledescKey obj = new RoledescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setRoleId(rs.getBigDecimal("ROLE_ID"));
		
		return obj;
	}

}
