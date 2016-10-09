package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Paysynch;

public class PaysynchRowMapper<T> implements RowMapper<Paysynch> {

	@Override
	public Paysynch mapRow(ResultSet rs, int rowNum) throws SQLException {
		Paysynch obj = new Paysynch();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPaysrfnbr(rs.getBigDecimal("PAYSRFNBR"));
		obj.setPaysstmp1(rs.getDate("PAYSSTMP1"));
		obj.setPaysstmp2(rs.getDate("PAYSSTMP2"));
		obj.setPaysstmp3(rs.getDate("PAYSSTMP3"));
		
		return obj;
	}

}
