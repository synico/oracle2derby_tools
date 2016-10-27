package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STQOTCFG;

public class STQOTCFGRowMapper<T> implements RowMapper<STQOTCFG> {

    private static final Logger log = Logger.getLogger(STQOTCFGRowMapper.class);

	@Override
	public STQOTCFG mapRow(ResultSet rs, int rowNum) throws SQLException {
		STQOTCFG obj = new STQOTCFG();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setRETIREFLAG(rs.getBigDecimal("RETIREFLAG"));
		obj.setCSREXPIREPERIOD(rs.getBigDecimal("CSREXPIREPERIOD"));
		obj.setCSSEXPIREPERIOD(rs.getBigDecimal("CSSEXPIREPERIOD"));
		obj.setEXPIREPERIOD(rs.getBigDecimal("EXPIREPERIOD"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
