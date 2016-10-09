package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Paymthdsup;

public class PaymthdsupRowMapper<T> implements RowMapper<Paymthdsup> {

	@Override
	public Paymthdsup mapRow(ResultSet rs, int rowNum) throws SQLException {
		Paymthdsup obj = new Paymthdsup();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		
		return obj;
	}

}
