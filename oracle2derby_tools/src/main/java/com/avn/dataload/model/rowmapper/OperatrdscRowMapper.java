package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Operatrdsc;

public class OperatrdscRowMapper<T> implements RowMapper<Operatrdsc> {

	@Override
	public Operatrdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Operatrdsc obj = new Operatrdsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
