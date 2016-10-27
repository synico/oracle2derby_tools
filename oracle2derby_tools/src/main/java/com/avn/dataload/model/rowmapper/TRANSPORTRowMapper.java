package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TRANSPORT;

public class TRANSPORTRowMapper<T> implements RowMapper<TRANSPORT> {

    private static final Logger log = Logger.getLogger(TRANSPORTRowMapper.class);

	@Override
	public TRANSPORT mapRow(ResultSet rs, int rowNum) throws SQLException {
		TRANSPORT obj = new TRANSPORT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setIMPLEMENTED(rs.getString("IMPLEMENTED"));
		obj.setADDRESSABLE(rs.getString("ADDRESSABLE"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setCODE(rs.getString("CODE"));
		obj.setTRANSPORT_ID(rs.getBigDecimal("TRANSPORT_ID"));
		obj.setTIMEOUT(rs.getBigDecimal("TIMEOUT"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
