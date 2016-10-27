package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMFWKSPC;

public class CMFWKSPCRowMapper<T> implements RowMapper<CMFWKSPC> {

    private static final Logger log = Logger.getLogger(CMFWKSPCRowMapper.class);

	@Override
	public CMFWKSPC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMFWKSPC obj = new CMFWKSPC();
		
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setPERSISTENTYPE(rs.getBigDecimal("PERSISTENTYPE"));
		obj.setCMFWKSPC_ID(rs.getBigDecimal("CMFWKSPC_ID"));
		obj.setLOCKINGPOLICY(rs.getBigDecimal("LOCKINGPOLICY"));
		obj.setPROMOTIONPOLICY(rs.getBigDecimal("PROMOTIONPOLICY"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
