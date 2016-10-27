package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDPAYINFO;

public class ORDPAYINFORowMapper<T> implements RowMapper<ORDPAYINFO> {

    private static final Logger log = Logger.getLogger(ORDPAYINFORowMapper.class);

	@Override
	public ORDPAYINFO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDPAYINFO obj = new ORDPAYINFO();
		
		obj.setORDPAYINFO_ID(rs.getBigDecimal("ORDPAYINFO_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setVALUE(rs.getString("VALUE"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
