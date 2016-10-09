package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Crulescale;

public class CrulescaleRowMapper<T> implements RowMapper<Crulescale> {

	@Override
	public Crulescale mapRow(ResultSet rs, int rowNum) throws SQLException {
		Crulescale obj = new Crulescale();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
