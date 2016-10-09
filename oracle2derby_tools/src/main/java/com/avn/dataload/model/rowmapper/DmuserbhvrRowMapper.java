package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmuserbhvr;

public class DmuserbhvrRowMapper<T> implements RowMapper<Dmuserbhvr> {

	@Override
	public Dmuserbhvr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmuserbhvr obj = new Dmuserbhvr();
		
		obj.setLastupdated(rs.getDate("LASTUPDATED"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
