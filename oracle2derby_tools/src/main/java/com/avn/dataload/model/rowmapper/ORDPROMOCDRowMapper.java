package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDPROMOCD;

public class ORDPROMOCDRowMapper<T> implements RowMapper<ORDPROMOCD> {

	@Override
	public ORDPROMOCD mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDPROMOCD obj = new ORDPROMOCD();
		
		obj.setID(rs.getBigDecimal("ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCODE(rs.getString("CODE"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		return obj;
	}

}
