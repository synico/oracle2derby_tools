package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DmuserbhvrWithBLOBs;

public class DmuserbhvrWithBLOBsRowMapper<T> implements RowMapper<DmuserbhvrWithBLOBs> {

	@Override
	public DmuserbhvrWithBLOBs mapRow(ResultSet rs, int rowNum) throws SQLException {
		DmuserbhvrWithBLOBs obj = new DmuserbhvrWithBLOBs();
		
		obj.setBehavior(rs.getString("BEHAVIOR"));
		obj.setAction(rs.getString("ACTION"));
		obj.setEvent(rs.getString("EVENT"));
		
		return obj;
	}

}
