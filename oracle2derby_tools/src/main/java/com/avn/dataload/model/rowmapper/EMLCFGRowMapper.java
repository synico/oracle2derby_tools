package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLCFG;

public class EMLCFGRowMapper<T> implements RowMapper<EMLCFG> {

    private static final Logger log = Logger.getLogger(EMLCFGRowMapper.class);

	@Override
	public EMLCFG mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLCFG obj = new EMLCFG();
		
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setACCOUNT(rs.getString("ACCOUNT"));
		obj.setEMLCFG_ID(rs.getBigDecimal("EMLCFG_ID"));
		obj.setHOST(rs.getString("HOST"));
		obj.setTIME(rs.getBigDecimal("TIME"));
		obj.setEMLSERVER(rs.getString("EMLSERVER"));
		obj.setPORT(rs.getBigDecimal("PORT"));
		obj.setPASSWORD(rs.getBytes("PASSWORD"));
		obj.setADDRESS(rs.getString("ADDRESS"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
