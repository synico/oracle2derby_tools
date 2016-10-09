package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Mbrrel;

public class MbrrelRowMapper<T> implements RowMapper<Mbrrel> {

	@Override
	public Mbrrel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mbrrel obj = new Mbrrel();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
