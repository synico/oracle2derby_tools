package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Prelementattr;

public class PrelementattrRowMapper<T> implements RowMapper<Prelementattr> {

	@Override
	public Prelementattr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Prelementattr obj = new Prelementattr();
		
		obj.setProperties(rs.getString("PROPERTIES"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
