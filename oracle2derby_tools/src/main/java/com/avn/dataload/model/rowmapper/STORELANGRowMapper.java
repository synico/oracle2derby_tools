package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORELANG;

public class STORELANGRowMapper<T> implements RowMapper<STORELANG> {

    private static final Logger log = Logger.getLogger(STORELANGRowMapper.class);

	@Override
	public STORELANG mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORELANG obj = new STORELANG();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
