package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLPROMO;

public class EMLPROMORowMapper<T> implements RowMapper<EMLPROMO> {

    private static final Logger log = Logger.getLogger(EMLPROMORowMapper.class);

	@Override
	public EMLPROMO mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLPROMO obj = new EMLPROMO();
		
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setEMLMSG_ID(rs.getBigDecimal("EMLMSG_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setMODIFIEDBY(rs.getString("MODIFIEDBY"));
		obj.setMODDATE(rs.getTimestamp("MODDATE"));
		obj.setREPLYTO(rs.getString("REPLYTO"));
		obj.setEMLPROMO_ID(rs.getBigDecimal("EMLPROMO_ID"));
		obj.setSCCJOBREFNUM(rs.getBigDecimal("SCCJOBREFNUM"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
