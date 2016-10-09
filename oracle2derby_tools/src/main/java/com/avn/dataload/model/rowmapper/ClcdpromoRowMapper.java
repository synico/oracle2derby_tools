package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Clcdpromo;

public class ClcdpromoRowMapper<T> implements RowMapper<Clcdpromo> {

	@Override
	public Clcdpromo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Clcdpromo obj = new Clcdpromo();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
