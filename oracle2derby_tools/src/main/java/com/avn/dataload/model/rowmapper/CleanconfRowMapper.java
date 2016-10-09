package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cleanconf;

public class CleanconfRowMapper<T> implements RowMapper<Cleanconf> {

	@Override
	public Cleanconf mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cleanconf obj = new Cleanconf();
		
		obj.setStatementtype(rs.getString("STATEMENTTYPE"));
		obj.setStatement(rs.getString("STATEMENT"));
		obj.setNamearg(rs.getString("NAMEARG"));
		obj.setDaysarg(rs.getString("DAYSARG"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
