package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Mbrrole;

public class MbrroleRowMapper<T> implements RowMapper<Mbrrole> {

	@Override
	public Mbrrole mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mbrrole obj = new Mbrrole();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
