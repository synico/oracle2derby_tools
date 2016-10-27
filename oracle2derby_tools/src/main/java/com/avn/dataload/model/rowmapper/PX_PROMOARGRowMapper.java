package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_PROMOARG;

public class PX_PROMOARGRowMapper<T> implements RowMapper<PX_PROMOARG> {

    private static final Logger log = Logger.getLogger(PX_PROMOARGRowMapper.class);

	@Override
	public PX_PROMOARG mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_PROMOARG obj = new PX_PROMOARG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDETAIL(rs.getClob("DETAIL"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
