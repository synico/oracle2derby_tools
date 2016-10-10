package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RTNDNYDESC;

public class RTNDNYDESCRowMapper<T> implements RowMapper<RTNDNYDESC> {

	@Override
	public RTNDNYDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		RTNDNYDESC obj = new RTNDNYDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setRTNDNYRSN_ID(rs.getBigDecimal("RTNDNYRSN_ID"));
		
		return obj;
	}

}
