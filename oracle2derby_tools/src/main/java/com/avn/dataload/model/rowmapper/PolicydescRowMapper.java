package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Policydesc;

public class PolicydescRowMapper<T> implements RowMapper<Policydesc> {

	@Override
	public Policydesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Policydesc obj = new Policydesc();
		
		obj.setLongdescription(rs.getString("LONGDESCRIPTION"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setTimecreated(rs.getDate("TIMECREATED"));
		obj.setTimeupdated(rs.getDate("TIMEUPDATED"));
		
		return obj;
	}

}
