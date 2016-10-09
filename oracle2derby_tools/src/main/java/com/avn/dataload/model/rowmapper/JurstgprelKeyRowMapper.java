package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.JurstgprelKey;

public class JurstgprelKeyRowMapper<T> implements RowMapper<JurstgprelKey> {

	@Override
	public JurstgprelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		JurstgprelKey obj = new JurstgprelKey();
		
		obj.setJurstgroupId(rs.getBigDecimal("JURSTGROUP_ID"));
		obj.setJurstId(rs.getBigDecimal("JURST_ID"));
		
		return obj;
	}

}
