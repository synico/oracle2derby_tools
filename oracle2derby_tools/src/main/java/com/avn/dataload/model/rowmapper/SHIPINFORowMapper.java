package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SHIPINFO;

public class SHIPINFORowMapper<T> implements RowMapper<SHIPINFO> {

    private static final Logger log = Logger.getLogger(SHIPINFORowMapper.class);

	@Override
	public SHIPINFO mapRow(ResultSet rs, int rowNum) throws SQLException {
		SHIPINFO obj = new SHIPINFO();
		
		obj.setADDRESS_ID(rs.getBigDecimal("ADDRESS_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSHIPMODE_ID(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setPOLICY_ID(rs.getBigDecimal("POLICY_ID"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setSHIPINFO_ID(rs.getBigDecimal("SHIPINFO_ID"));
		obj.setCARRIERACCNTNUM(rs.getString("CARRIERACCNTNUM"));
		obj.setINSTRUCTIONS(rs.getString("INSTRUCTIONS"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
