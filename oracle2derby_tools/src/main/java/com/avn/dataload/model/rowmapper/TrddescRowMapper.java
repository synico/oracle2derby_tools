package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Trddesc;

public class TrddescRowMapper<T> implements RowMapper<Trddesc> {

	@Override
	public Trddesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Trddesc obj = new Trddesc();
		
		obj.setLongdescription(rs.getString("LONGDESCRIPTION"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setTimecreated(rs.getDate("TIMECREATED"));
		obj.setTimeupdated(rs.getDate("TIMEUPDATED"));
		
		return obj;
	}

}
