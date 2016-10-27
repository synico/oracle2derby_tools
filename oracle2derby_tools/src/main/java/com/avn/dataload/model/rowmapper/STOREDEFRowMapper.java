package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STOREDEF;

public class STOREDEFRowMapper<T> implements RowMapper<STOREDEF> {

    private static final Logger log = Logger.getLogger(STOREDEFRowMapper.class);

	@Override
	public STOREDEF mapRow(ResultSet rs, int rowNum) throws SQLException {
		STOREDEF obj = new STOREDEF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setSHIPMODE_ID(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setCONTRACT_ID(rs.getBigDecimal("CONTRACT_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
