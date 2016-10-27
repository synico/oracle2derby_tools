package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMFTASK;

public class CMFTASKRowMapper<T> implements RowMapper<CMFTASK> {

    private static final Logger log = Logger.getLogger(CMFTASKRowMapper.class);

	@Override
	public CMFTASK mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMFTASK obj = new CMFTASK();
		
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setUSAGE(rs.getBigDecimal("USAGE"));
		obj.setCMFTASK_ID(rs.getBigDecimal("CMFTASK_ID"));
		obj.setDUEDATE(rs.getTimestamp("DUEDATE"));
		obj.setCOMPLETEDATE(rs.getTimestamp("COMPLETEDATE"));
		obj.setTEMPLATETYPE(rs.getBigDecimal("TEMPLATETYPE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
