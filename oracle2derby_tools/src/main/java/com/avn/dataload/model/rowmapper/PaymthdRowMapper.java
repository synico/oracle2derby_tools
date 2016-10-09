package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Paymthd;

public class PaymthdRowMapper<T> implements RowMapper<Paymthd> {

	@Override
	public Paymthd mapRow(ResultSet rs, int rowNum) throws SQLException {
		Paymthd obj = new Paymthd();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setProfilename(rs.getString("PROFILENAME"));
		obj.setPaymthdId(rs.getBigDecimal("PAYMTHD_ID"));
		
		return obj;
	}

}
