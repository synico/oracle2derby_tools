package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TRADING;

public class TRADINGRowMapper<T> implements RowMapper<TRADING> {

	@Override
	public TRADING mapRow(ResultSet rs, int rowNum) throws SQLException {
		TRADING obj = new TRADING();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACCOUNT_ID(rs.getBigDecimal("ACCOUNT_ID"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTRADING_ID(rs.getBigDecimal("TRADING_ID"));
		obj.setSTARTTIME(rs.getTimestamp("STARTTIME"));
		obj.setENDTIME(rs.getTimestamp("ENDTIME"));
		obj.setREFERENCECOUNT(rs.getBigDecimal("REFERENCECOUNT"));
		obj.setCREDITALLOWED(rs.getBigDecimal("CREDITALLOWED"));
		obj.setREFTRADING_ID(rs.getBigDecimal("REFTRADING_ID"));
		obj.setTRDTYPE_ID(rs.getBigDecimal("TRDTYPE_ID"));
		
		return obj;
	}

}
