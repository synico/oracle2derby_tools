package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLINSTANCE;

public class FLINSTANCERowMapper<T> implements RowMapper<FLINSTANCE> {

    private static final Logger log = Logger.getLogger(FLINSTANCERowMapper.class);

	@Override
	public FLINSTANCE mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLINSTANCE obj = new FLINSTANCE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFLOWTYPE_ID(rs.getBigDecimal("FLOWTYPE_ID"));
		obj.setCURSTATEIDENTIFIER(rs.getBigDecimal("CURSTATEIDENTIFIER"));
		obj.setCURRSTAGEINDEX(rs.getBigDecimal("CURRSTAGEINDEX"));
		obj.setLASTUPDATETIME(rs.getTimestamp("LASTUPDATETIME"));
		obj.setFLOWCONTEXT(rs.getString("FLOWCONTEXT"));
		obj.setFLOW_ID(rs.getBigDecimal("FLOW_ID"));
		obj.setENTITY_ID(rs.getBigDecimal("ENTITY_ID"));
		obj.setFLOWSTAGES(rs.getString("FLOWSTAGES"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
