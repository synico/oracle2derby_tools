package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Prsetcerel;

public class PrsetcerelRowMapper<T> implements RowMapper<Prsetcerel> {

	@Override
	public Prsetcerel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Prsetcerel obj = new Prsetcerel();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
