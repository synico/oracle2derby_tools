package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STQOTCFG;

public class STQOTCFGRowMapper<T> implements RowMapper<STQOTCFG> {

	@Override
	public STQOTCFG mapRow(ResultSet rs, int rowNum) throws SQLException {
		STQOTCFG obj = new STQOTCFG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setCSREXPIREPERIOD(rs.getBigDecimal("CSREXPIREPERIOD"));
		obj.setCSSEXPIREPERIOD(rs.getBigDecimal("CSSEXPIREPERIOD"));
		obj.setEXPIREPERIOD(rs.getBigDecimal("EXPIREPERIOD"));
		obj.setRETIREFLAG(rs.getBigDecimal("RETIREFLAG"));
		
		return obj;
	}

}
