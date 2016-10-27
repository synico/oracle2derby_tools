package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TRADING;

public class TRADINGRowMapper<T> implements RowMapper<TRADING> {

    private static final Logger log = Logger.getLogger(TRADINGRowMapper.class);

	@Override
	public TRADING mapRow(ResultSet rs, int rowNum) throws SQLException {
		TRADING obj = new TRADING();
		
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACCOUNT_ID(rs.getBigDecimal("ACCOUNT_ID"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setREFERENCECOUNT(rs.getBigDecimal("REFERENCECOUNT"));
		obj.setCREDITALLOWED(rs.getBigDecimal("CREDITALLOWED"));
		obj.setREFTRADING_ID(rs.getBigDecimal("REFTRADING_ID"));
		obj.setTRADING_ID(rs.getBigDecimal("TRADING_ID"));
		obj.setSTARTTIME(rs.getTimestamp("STARTTIME"));
		obj.setENDTIME(rs.getTimestamp("ENDTIME"));
		obj.setTRDTYPE_ID(rs.getBigDecimal("TRDTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
