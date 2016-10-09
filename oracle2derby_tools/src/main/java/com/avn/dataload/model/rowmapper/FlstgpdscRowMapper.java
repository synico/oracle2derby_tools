package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Flstgpdsc;

public class FlstgpdscRowMapper<T> implements RowMapper<Flstgpdsc> {

	@Override
	public Flstgpdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Flstgpdsc obj = new Flstgpdsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
