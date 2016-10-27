package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BZSRVCFG;

public class BZSRVCFGRowMapper<T> implements RowMapper<BZSRVCFG> {

    private static final Logger log = Logger.getLogger(BZSRVCFGRowMapper.class);

	@Override
	public BZSRVCFG mapRow(ResultSet rs, int rowNum) throws SQLException {
		BZSRVCFG obj = new BZSRVCFG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setBZSRVCFG_ID(rs.getBigDecimal("BZSRVCFG_ID"));
		obj.setSERVERNAME(rs.getString("SERVERNAME"));
		obj.setENABLED(rs.getBigDecimal("ENABLED"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
