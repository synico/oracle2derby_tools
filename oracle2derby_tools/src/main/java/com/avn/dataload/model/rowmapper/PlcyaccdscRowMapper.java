package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plcyaccdsc;

public class PlcyaccdscRowMapper<T> implements RowMapper<Plcyaccdsc> {

	@Override
	public Plcyaccdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plcyaccdsc obj = new Plcyaccdsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
