package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.SchbrdcstKey;

public class SchbrdcstKeyRowMapper<T> implements RowMapper<SchbrdcstKey> {

	@Override
	public SchbrdcstKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		SchbrdcstKey obj = new SchbrdcstKey();
		
		obj.setJobrefnum(rs.getBigDecimal("JOBREFNUM"));
		obj.setCloneid(rs.getString("CLONEID"));
		
		return obj;
	}

}
