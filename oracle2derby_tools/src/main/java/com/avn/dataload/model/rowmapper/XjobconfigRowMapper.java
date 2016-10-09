package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xjobconfig;

public class XjobconfigRowMapper<T> implements RowMapper<Xjobconfig> {

	@Override
	public Xjobconfig mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xjobconfig obj = new Xjobconfig();
		
		obj.setStringvalue(rs.getString("STRINGVALUE"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setDatevalue(rs.getDate("DATEVALUE"));
		obj.setConfigname(rs.getString("CONFIGNAME"));
		obj.setJobidentifier(rs.getString("JOBIDENTIFIER"));
		
		return obj;
	}

}
