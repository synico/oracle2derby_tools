package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.SrchconfKey;

public class SrchconfKeyRowMapper<T> implements RowMapper<SrchconfKey> {

	@Override
	public SrchconfKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		SrchconfKey obj = new SrchconfKey();
		
		obj.setIndexscope(rs.getString("INDEXSCOPE"));
		obj.setIndextype(rs.getString("INDEXTYPE"));
		
		return obj;
	}

}
