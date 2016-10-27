package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDPROMOCD;

public class ORDPROMOCDRowMapper<T> implements RowMapper<ORDPROMOCD> {

    private static final Logger log = Logger.getLogger(ORDPROMOCDRowMapper.class);

	@Override
	public ORDPROMOCD mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDPROMOCD obj = new ORDPROMOCD();
		
		obj.setID(rs.getBigDecimal("ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCODE(rs.getString("CODE"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
