package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_PROMOARG;

public class PX_PROMOARGRowMapper<T> implements RowMapper<PX_PROMOARG> {

	@Override
	public PX_PROMOARG mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_PROMOARG obj = new PX_PROMOARG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setDETAIL(rs.getClob("DETAIL"));
		
		return obj;
	}

}
