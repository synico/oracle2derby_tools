package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Setcurrdsc;

public class SetcurrdscRowMapper<T> implements RowMapper<Setcurrdsc> {

	@Override
	public Setcurrdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Setcurrdsc obj = new Setcurrdsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
