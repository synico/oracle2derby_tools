package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CTXMGMT;

public class CTXMGMTRowMapper<T> implements RowMapper<CTXMGMT> {

    private static final Logger log = Logger.getLogger(CTXMGMTRowMapper.class);

	@Override
	public CTXMGMT mapRow(ResultSet rs, int rowNum) throws SQLException {
		CTXMGMT obj = new CTXMGMT();
		
		obj.setSTATUS(rs.getString("STATUS"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setACTIVITY_ID(rs.getBigDecimal("ACTIVITY_ID"));
		obj.setLASTACCESSTIME(rs.getTimestamp("LASTACCESSTIME"));
		obj.setCALLER_ID(rs.getBigDecimal("CALLER_ID"));
		obj.setSTARTTIME(rs.getTimestamp("STARTTIME"));
		obj.setENDTIME(rs.getTimestamp("ENDTIME"));
		obj.setRUNAS_ID(rs.getBigDecimal("RUNAS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
