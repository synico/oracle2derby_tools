package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmactattr;

public class DmactattrRowMapper<T> implements RowMapper<Dmactattr> {

	@Override
	public Dmactattr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmactattr obj = new Dmactattr();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setProcessed(rs.getDate("PROCESSED"));
		
		return obj;
	}

}
