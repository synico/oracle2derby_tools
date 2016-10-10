package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PPCPAYMENT;

public class PPCPAYMENTRowMapper<T> implements RowMapper<PPCPAYMENT> {

	@Override
	public PPCPAYMENT mapRow(ResultSet rs, int rowNum) throws SQLException {
		PPCPAYMENT obj = new PPCPAYMENT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setPPCPAYINST_ID(rs.getBigDecimal("PPCPAYINST_ID"));
		obj.setPPCPAYTRAN_ID(rs.getBigDecimal("PPCPAYTRAN_ID"));
		obj.setAPPROVINGAMOUNT(rs.getBigDecimal("APPROVINGAMOUNT"));
		obj.setAPPROVEDAMOUNT(rs.getBigDecimal("APPROVEDAMOUNT"));
		obj.setCREDITINGAMOUNT(rs.getBigDecimal("CREDITINGAMOUNT"));
		obj.setCREDITEDAMOUNT(rs.getBigDecimal("CREDITEDAMOUNT"));
		obj.setDEPOSITINGAMOUNT(rs.getBigDecimal("DEPOSITINGAMOUNT"));
		obj.setDEPOSITEDAMOUNT(rs.getBigDecimal("DEPOSITEDAMOUNT"));
		obj.setRVRSNGAPRVEDAMNT(rs.getBigDecimal("RVRSNGAPRVEDAMNT"));
		obj.setRVRSNGDPSTEDAMNT(rs.getBigDecimal("RVRSNGDPSTEDAMNT"));
		obj.setRVRSNGCRDTEDAMNT(rs.getBigDecimal("RVRSNGCRDTEDAMNT"));
		obj.setPPCPAYMENT_ID(rs.getBigDecimal("PPCPAYMENT_ID"));
		obj.setAVSCOMMONCODE(rs.getBigDecimal("AVSCOMMONCODE"));
		obj.setEXPECTEDAMOUNT(rs.getBigDecimal("EXPECTEDAMOUNT"));
		obj.setTIMEEXPIRED(rs.getTimestamp("TIMEEXPIRED"));
		
		return obj;
	}

}
