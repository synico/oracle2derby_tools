package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDPAYINFO;

public class ORDPAYINFORowMapper<T> implements RowMapper<ORDPAYINFO> {

	@Override
	public ORDPAYINFO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDPAYINFO obj = new ORDPAYINFO();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setVALUE(rs.getString("VALUE"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setORDPAYINFO_ID(rs.getBigDecimal("ORDPAYINFO_ID"));
		
		return obj;
	}

}
