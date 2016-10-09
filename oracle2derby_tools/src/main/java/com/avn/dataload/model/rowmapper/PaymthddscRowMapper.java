package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Paymthddsc;

public class PaymthddscRowMapper<T> implements RowMapper<Paymthddsc> {

	@Override
	public Paymthddsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Paymthddsc obj = new Paymthddsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
