package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RTNDNYRSN;

public class RTNDNYRSNRowMapper<T> implements RowMapper<RTNDNYRSN> {

    private static final Logger log = Logger.getLogger(RTNDNYRSNRowMapper.class);

	@Override
	public RTNDNYRSN mapRow(ResultSet rs, int rowNum) throws SQLException {
		RTNDNYRSN obj = new RTNDNYRSN();
		
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCODE(rs.getString("CODE"));
		obj.setRTNDNYRSN_ID(rs.getBigDecimal("RTNDNYRSN_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
