package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PPCPAYTRAN;

public class PPCPAYTRANRowMapper<T> implements RowMapper<PPCPAYTRAN> {

	@Override
	public PPCPAYTRAN mapRow(ResultSet rs, int rowNum) throws SQLException {
		PPCPAYTRAN obj = new PPCPAYTRAN();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setTRACKINGID(rs.getString("TRACKINGID"));
		obj.setREASONCODE(rs.getString("REASONCODE"));
		obj.setPPCPAYTRAN_ID(rs.getBigDecimal("PPCPAYTRAN_ID"));
		obj.setPPCBATCH_ID(rs.getBigDecimal("PPCBATCH_ID"));
		obj.setPPCPAYMENT_ID(rs.getBigDecimal("PPCPAYMENT_ID"));
		obj.setPPCCREDIT_ID(rs.getBigDecimal("PPCCREDIT_ID"));
		obj.setTRANSACTIONTYPE(rs.getBigDecimal("TRANSACTIONTYPE"));
		obj.setREQUESTEDAMOUNT(rs.getBigDecimal("REQUESTEDAMOUNT"));
		obj.setPROCESSEDAMOUNT(rs.getBigDecimal("PROCESSEDAMOUNT"));
		obj.setRESPONSECODE(rs.getString("RESPONSECODE"));
		obj.setREFERENCENUMBER(rs.getString("REFERENCENUMBER"));
		
		return obj;
	}

}
