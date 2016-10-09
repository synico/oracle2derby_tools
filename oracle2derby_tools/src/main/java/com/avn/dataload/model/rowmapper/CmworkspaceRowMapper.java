package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmworkspace;

public class CmworkspaceRowMapper<T> implements RowMapper<Cmworkspace> {

	@Override
	public Cmworkspace mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmworkspace obj = new Cmworkspace();
		
		obj.setWorkspace(rs.getString("WORKSPACE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLockingPolicy(rs.getString("LOCKING_POLICY"));
		
		return obj;
	}

}
