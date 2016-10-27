package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATENCALCD;

public class CATENCALCDRowMapper<T> implements RowMapper<CATENCALCD> {

    private static final Logger log = Logger.getLogger(CATENCALCDRowMapper.class);

	@Override
	public CATENCALCD mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATENCALCD obj = new CATENCALCD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setTRADING_ID(rs.getBigDecimal("TRADING_ID"));
		obj.setCALFLAGS(rs.getBigDecimal("CALFLAGS"));
		obj.setCALCODE_ID(rs.getBigDecimal("CALCODE_ID"));
		obj.setCATENCALCD_ID(rs.getBigDecimal("CATENCALCD_ID"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
