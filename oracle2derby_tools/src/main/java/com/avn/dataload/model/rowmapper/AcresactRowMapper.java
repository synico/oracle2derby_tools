package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acresact;

public class AcresactRowMapper<T> implements RowMapper<Acresact> {

	@Override
	public Acresact mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acresact obj = new Acresact();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
