package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PPCPAYTRAN;

public class PPCPAYTRANRowMapper<T> implements RowMapper<PPCPAYTRAN> {

    private static final Logger log = Logger.getLogger(PPCPAYTRANRowMapper.class);

	@Override
	public PPCPAYTRAN mapRow(ResultSet rs, int rowNum) throws SQLException {
		PPCPAYTRAN obj = new PPCPAYTRAN();
		
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setPPCBATCH_ID(rs.getBigDecimal("PPCBATCH_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setPPCPAYTRAN_ID(rs.getBigDecimal("PPCPAYTRAN_ID"));
		obj.setPPCPAYMENT_ID(rs.getBigDecimal("PPCPAYMENT_ID"));
		obj.setPPCCREDIT_ID(rs.getBigDecimal("PPCCREDIT_ID"));
		obj.setTRANSACTIONTYPE(rs.getBigDecimal("TRANSACTIONTYPE"));
		obj.setREQUESTEDAMOUNT(rs.getBigDecimal("REQUESTEDAMOUNT"));
		obj.setPROCESSEDAMOUNT(rs.getBigDecimal("PROCESSEDAMOUNT"));
		obj.setRESPONSECODE(rs.getString("RESPONSECODE"));
		obj.setREFERENCENUMBER(rs.getString("REFERENCENUMBER"));
		obj.setTRACKINGID(rs.getString("TRACKINGID"));
		obj.setREASONCODE(rs.getString("REASONCODE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
