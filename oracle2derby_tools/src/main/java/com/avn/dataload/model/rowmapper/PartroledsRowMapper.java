package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Partroleds;

public class PartroledsRowMapper<T> implements RowMapper<Partroleds> {

	@Override
	public Partroleds mapRow(ResultSet rs, int rowNum) throws SQLException {
		Partroleds obj = new Partroleds();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
