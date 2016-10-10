package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SHIPMODE;

public class SHIPMODERowMapper<T> implements RowMapper<SHIPMODE> {

	@Override
	public SHIPMODE mapRow(ResultSet rs, int rowNum) throws SQLException {
		SHIPMODE obj = new SHIPMODE();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setCODE(rs.getString("CODE"));
		obj.setSHIPMODE_ID(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setTRACKINGNAME(rs.getString("TRACKINGNAME"));
		obj.setTRACKINGURL(rs.getString("TRACKINGURL"));
		obj.setTRACKINGHOST(rs.getString("TRACKINGHOST"));
		obj.setTRACKINGPORT(rs.getBigDecimal("TRACKINGPORT"));
		obj.setTRACKINGICON(rs.getString("TRACKINGICON"));
		obj.setTRACKINGTYPE(rs.getString("TRACKINGTYPE"));
		obj.setCARRIER(rs.getString("CARRIER"));
		
		return obj;
	}

}
