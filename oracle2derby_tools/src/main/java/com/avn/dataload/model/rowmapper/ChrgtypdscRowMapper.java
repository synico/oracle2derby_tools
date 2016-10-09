package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Chrgtypdsc;

public class ChrgtypdscRowMapper<T> implements RowMapper<Chrgtypdsc> {

	@Override
	public Chrgtypdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Chrgtypdsc obj = new Chrgtypdsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
