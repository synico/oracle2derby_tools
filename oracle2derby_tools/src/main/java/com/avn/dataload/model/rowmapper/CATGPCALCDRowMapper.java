package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATGPCALCD;

public class CATGPCALCDRowMapper<T> implements RowMapper<CATGPCALCD> {

    private static final Logger log = Logger.getLogger(CATGPCALCDRowMapper.class);

	@Override
	public CATGPCALCD mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATGPCALCD obj = new CATGPCALCD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setTRADING_ID(rs.getBigDecimal("TRADING_ID"));
		obj.setCALFLAGS(rs.getBigDecimal("CALFLAGS"));
		obj.setCALCODE_ID(rs.getBigDecimal("CALCODE_ID"));
		obj.setCATGPCALCD_ID(rs.getBigDecimal("CATGPCALCD_ID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
