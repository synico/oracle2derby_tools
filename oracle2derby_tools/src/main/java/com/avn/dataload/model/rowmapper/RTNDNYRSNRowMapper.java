package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RTNDNYRSN;

public class RTNDNYRSNRowMapper<T> implements RowMapper<RTNDNYRSN> {

	@Override
	public RTNDNYRSN mapRow(ResultSet rs, int rowNum) throws SQLException {
		RTNDNYRSN obj = new RTNDNYRSN();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setCODE(rs.getString("CODE"));
		obj.setRTNDNYRSN_ID(rs.getBigDecimal("RTNDNYRSN_ID"));
		
		return obj;
	}

}
