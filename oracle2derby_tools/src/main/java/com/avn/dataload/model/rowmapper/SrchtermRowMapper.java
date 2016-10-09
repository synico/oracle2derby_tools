package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Srchterm;

public class SrchtermRowMapper<T> implements RowMapper<Srchterm> {

	@Override
	public Srchterm mapRow(ResultSet rs, int rowNum) throws SQLException {
		Srchterm obj = new Srchterm();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
