package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plcytypdsc;

public class PlcytypdscRowMapper<T> implements RowMapper<Plcytypdsc> {

	@Override
	public Plcytypdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plcytypdsc obj = new Plcytypdsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
