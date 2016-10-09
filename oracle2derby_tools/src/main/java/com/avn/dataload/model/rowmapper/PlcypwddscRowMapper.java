package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plcypwddsc;

public class PlcypwddscRowMapper<T> implements RowMapper<Plcypwddsc> {

	@Override
	public Plcypwddsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plcypwddsc obj = new Plcypwddsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
