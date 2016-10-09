package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ordpromocd;

public class OrdpromocdRowMapper<T> implements RowMapper<Ordpromocd> {

	@Override
	public Ordpromocd mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ordpromocd obj = new Ordpromocd();
		
		obj.setCode(rs.getString("CODE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setId(rs.getBigDecimal("ID"));
		
		return obj;
	}

}
