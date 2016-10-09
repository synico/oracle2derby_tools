package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acactactgp;

public class AcactactgpRowMapper<T> implements RowMapper<Acactactgp> {

	@Override
	public Acactactgp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acactactgp obj = new Acactactgp();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		
		return obj;
	}

}
