package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SHIPMODE;

public class SHIPMODERowMapper<T> implements RowMapper<SHIPMODE> {

    private static final Logger log = Logger.getLogger(SHIPMODERowMapper.class);

	@Override
	public SHIPMODE mapRow(ResultSet rs, int rowNum) throws SQLException {
		SHIPMODE obj = new SHIPMODE();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setSHIPMODE_ID(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setCODE(rs.getString("CODE"));
		obj.setCARRIER(rs.getString("CARRIER"));
		obj.setTRACKINGNAME(rs.getString("TRACKINGNAME"));
		obj.setTRACKINGURL(rs.getString("TRACKINGURL"));
		obj.setTRACKINGHOST(rs.getString("TRACKINGHOST"));
		obj.setTRACKINGPORT(rs.getBigDecimal("TRACKINGPORT"));
		obj.setTRACKINGICON(rs.getString("TRACKINGICON"));
		obj.setTRACKINGTYPE(rs.getString("TRACKINGTYPE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
